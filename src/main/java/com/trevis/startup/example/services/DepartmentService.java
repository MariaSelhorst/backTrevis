package com.trevis.startup.example.services;

import java.util.List;

import com.trevis.startup.example.model.DepartmentData;

public interface DepartmentService {
    List<DepartmentData> getAll();
    DepartmentData getById(Long id);
}
