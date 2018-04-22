package com.arun.service;

import com.arun.model.Employee;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Adwiti on 4/22/2018.
 */
public interface PaginationService {

    public List<Employee> getAllEmployee(Pageable pageable, String name);
}
