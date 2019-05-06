package com.gupaoedu.dengxinlei.pattern.template;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 通过使用父类模板方法模式实现对jdbc的封装
 */
public class UserMapper extends JdbcTemplate<User> {

    public UserMapper(DataSource dataSource) {
        super(dataSource);
    }

    public List<User> queryAll() {
        String sql = "select * from user";
        try {
            return super.executeQuery(sql, null, new RowMapper<User>() {
                public User mapRow(ResultSet resultSet, int index) {
                    User user = new User();
                    try {
                        user.setId(resultSet.getLong("id"));
                        user.setAge(resultSet.getInt("age"));
                        user.setGander(resultSet.getInt("gander"));
                        user.setName(resultSet.getString("name"));
                        return user;
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
