package com.gupaoedu.dengxinlei.pattern.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate<T> {
    private DataSource dataSource;
    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<T> executeQuery(String sql, Object[] args, RowMapper<T> rowMapper) throws Exception{
        // 获取数据库连接
        Connection conn = getConnection();
        // 创建执行sql的语句
        PreparedStatement statement = createPreproStatment(conn, sql);
        // 执行语句返回结果集
        ResultSet resultSet = executeQuery(statement, args);
        // 解析结果集
        List<T> arrays = parseResultSet(resultSet, rowMapper);
        // 关闭结果集
        closeResultSet(resultSet);
        // 关闭语句
        closeStatement(statement);
        // 关闭连接
        closeConnect(conn);
        return arrays;
    }

    private void closeResultSet(ResultSet resultSet) throws Exception{
        if(resultSet != null) {
            resultSet.close();
        }
    }

    private void closeStatement(Statement statement) throws Exception{
        if(statement != null) {
            statement.close();
        }
    }

    private void closeConnect(Connection conn) throws Exception{
        if (conn != null) {
            conn.close();
        }
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws Exception {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }
    private PreparedStatement createPreproStatment(Connection conn, String sql) throws Exception {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws Exception{
        return this.dataSource.getConnection();
    }

    public List<T> parseResultSet(ResultSet resultSet, RowMapper<T> mapperRow) throws Exception{
        List<T> results = new ArrayList<T>();
        int index = 1;
        while(resultSet.next()) {
            results.add(mapperRow.mapRow(resultSet, index++));
        }
        return results;
    }
}
