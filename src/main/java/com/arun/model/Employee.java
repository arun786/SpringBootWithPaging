package com.arun.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Pageable;

/**
 * Created by Adwiti on 4/22/2018.
 */
@Getter
@Setter
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Pageable pageable;
}
