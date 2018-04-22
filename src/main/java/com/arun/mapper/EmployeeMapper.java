package com.arun.mapper;

import com.arun.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Adwiti on 4/22/2018.
 */
public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee emp = new Employee();
        emp.setId(rs.getInt(1));
        emp.setName(rs.getString(2));
        emp.setAge(rs.getInt(3));
        emp.setAddress(rs.getString(4));
        return emp;
    }
}
