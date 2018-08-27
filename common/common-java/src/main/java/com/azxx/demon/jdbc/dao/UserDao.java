package com.azxx.demon.jdbc.dao;

import com.azxx.demon.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.logging.Logger;

@Repository
public class UserDao {

    private static Logger logger = Logger.getLogger(UserDao.class.getName());

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insert(User user){
        String sql = "insert into user_info(name ,age) values (?,?)";
        int result = this.jdbcTemplate.update(sql,user.getName(),user.getAge());
        logger.info("---------------------->"+result+"");
    }
}
