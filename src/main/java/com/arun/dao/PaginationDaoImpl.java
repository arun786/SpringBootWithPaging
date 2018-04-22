package com.arun.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Adwiti on 4/22/2018.
 */
@Repository
public class PaginationDaoImpl implements PaginationDao {
    @Override
    public List<String> getAllEmployee(Pageable pageable, String name) {
        return null;
    }
}
