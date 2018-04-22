package com.arun.service;

import com.arun.dao.PaginationDao;
import com.arun.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Adwiti on 4/22/2018.
 */
@Service
public class PaginationServiceImpl implements PaginationService {
    @Autowired
    private PaginationDao paginationDao;
    @Override
    public List<Employee> getAllEmployee(Pageable pageable, String name) {
        return paginationDao.getAllEmployee(pageable,name);
    }
}
