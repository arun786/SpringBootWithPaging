package com.arun.dao;

import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Adwiti on 4/22/2018.
 */
public interface PaginationDao {
    public List<String> getAllEmployee(Pageable pageable, String name);
}