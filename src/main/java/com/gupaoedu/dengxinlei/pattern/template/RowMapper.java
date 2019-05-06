package com.gupaoedu.dengxinlei.pattern.template;

import java.sql.ResultSet;
import java.util.List;

public interface RowMapper<T> {
    public T mapRow(ResultSet resultSet, int index);
}
