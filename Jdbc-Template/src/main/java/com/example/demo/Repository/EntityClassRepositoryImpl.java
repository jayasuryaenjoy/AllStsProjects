package com.example.demo.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Entity_Class;

@Service
public class EntityClassRepositoryImpl implements JdbcRep {

	private static final String INSERT_ENTITYCLASS_QUERY = "INSERT INTO Entity_Class(id,firstname,lastname,email) values(:id,:firstname,:lastname,:email)";
	private static final String update_BY_ID_ENTITYCLASS_QUERY = "UPDATE Entity_Class SET firstname=? WHERE ID=? ";
	private static final String GET_BY_ID_ENTITYCLASS_QUERY = "SELECT * FROM Entity_Class WHERE ID=:id";
	private static final String Detete_BY_ID_ENTITYCLASS_QUERY = "DELETE FROM Entity_Class WHERE id=:id";
	private static final String GET_ALLRECODERS_ENTITYCLASS_QUERY = "SELECT * FROM Entity_Class";

	@Autowired
	private JdbcTemplate jt;
	@Autowired
	private NamedParameterJdbcTemplate named;

	@Override
	public Entity_Class saveEntityClass(Entity_Class entityclass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity_Class updateEntityClass(Entity_Class entityclass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity_Class getById(Entity_Class entityclass) {
		SqlParameterSource parameter = new MapSqlParameterSource("id", entityclass.getId());
		return (Entity_Class) named.queryForObject(GET_BY_ID_ENTITYCLASS_QUERY, parameter, new EntityMapper());
	}

	@Override
	public List<Entity_Class> allEntityClasss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity_Class deleteById(Entity_Class entityclass) {
		SqlParameterSource parameter = new MapSqlParameterSource("id", entityclass.getId());
		named.update(Detete_BY_ID_ENTITYCLASS_QUERY, parameter);
		return entityclass;
	}

	class EntityMapper implements RowMapper<Entity_Class> {

		@Override
		public Entity_Class mapRow(ResultSet rs, int rowNum) throws SQLException {
			Entity_Class user = new Entity_Class();
			user.setId(rs.getInt("id"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setEmail(rs.getString("email"));
			return user;
		}

	}

}
