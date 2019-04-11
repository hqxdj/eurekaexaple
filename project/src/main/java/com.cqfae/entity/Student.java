package com.cqfae.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;

    private String studnetNumber;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudnetNumber() {
        return studnetNumber;
    }

    public void setStudnetNumber(String studnetNumber) {
        this.studnetNumber = studnetNumber == null ? null : studnetNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}