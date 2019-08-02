package sk.pro.exam.service.interfaces;

import sk.pro.exam.model.Department;

import java.util.List;

public interface IDepartmentService {
    void delete(String id);
    List<Department> getAll();

}
