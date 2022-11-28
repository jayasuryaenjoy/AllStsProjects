package com.Email.Multiple.Config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Email.Multiple.Entity.OrdersDTO;
import com.Email.Multiple.Service.OrderWriter;
import com.Email.Multiple.Service.Orderprocessor;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	DataSource dataSource;

	@Bean
	public Job emailSenderJob() {
		return jobBuilderFactory.get("emailSenderJob").start(emailSenderStep()).build();
	}

	@Bean
	public Step emailSenderStep() {
		return stepBuilderFactory.get("emailSenderStep").<OrdersDTO, OrdersDTO>chunk(3).reader(orderItemReader())
				.processor(orderProcessor()).writer(orderWriter()).build();
	}

	@Bean
	public ItemProcessor<OrdersDTO, OrdersDTO> orderProcessor() {
		return new Orderprocessor();
	}

	@Bean
	public ItemWriter<OrdersDTO> orderWriter() {
		return new OrderWriter();
	}

	@Bean
	public ItemReader<OrdersDTO> orderItemReader() {
		String sql = "SELECT * FROM ORDERDTO";
		return new JdbcCursorItemReaderBuilder<OrdersDTO>().name("activeOrderReader").sql(sql).dataSource(dataSource)
				.rowMapper((rs, rowNum) -> new OrdersDTO(rs.getString("email"))).build();
	}

}
