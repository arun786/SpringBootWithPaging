package com.arun.dao;

import com.arun.model.Employee;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Adwiti on 4/22/2018.
 */
public interface PaginationDao {
    public List<Employee> getAllEmployee(Pageable pageable, String name);
}
