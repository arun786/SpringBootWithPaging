package com.arun.dao;

import com.arun.mapper.EmployeeMapper;
import com.arun.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Adwiti on 4/22/2018.
 */
@Repository
public class PaginationDaoImpl implements PaginationDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    String sql = "select * from Student where name = ?";

    @Override
    public List<Employee> getAllEmployee(Pageable pageable, String name) {
        List<Employee> employees = jdbcTemplate.query(sql, new Object[]{name}, new EmployeeMapper());
        return employees;
    }
}
