package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public class UserRepository{

	@Autowired 
    private NamedParameterJdbcTemplate template;

	/**
	 * Itemオブジェクトを生成するローマッパー.
	 */
	private static final RowMapper<User> USER_ROW_MAPPER = new BeanPropertyRowMapper<>(User.class);

    public User findById(String id){
		String sql="SELECT id, first_name, last_name, postal_code, city ,block ,building,profile_img ,admin_flg,email FROM users WHERE id = :id;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id",id);
		User user = template.queryForObject(sql,param,USER_ROW_MAPPER);
		return user;
	}
}
