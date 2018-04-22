package com.arun.service;

import com.arun.dao.PaginationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Adwiti on 4/22/2018.
 */
public class PaginationServiceImpl implements PaginationService {
    @Autowired
    private PaginationDao paginationDao;
    @Override
    public List<String> getAllEmployee(Pageable pageable, String name) {
        return null;
    }
}
