package com.arun.controller;

import com.arun.service.PaginationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Adwiti on 4/22/2018.
 */
@RestController
public class PaginationController {

    @Autowired
    private PaginationService paginationService;

    @GetMapping("/v1/pagination")
    public String checkPagination(Pageable pageable, @RequestParam(value = "name") String name) {

        return null;
    }

}
