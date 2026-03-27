package net.javaguides.sbtwa.service;

import net.javaguides.sbtwa.domain.Department;
import java.util.List;

public interface DepartmentService {

    void save(Department department);

    void edit(Department department);

    void delete(Long id);

    Department searchById(Long id);

    List<Department> searchAll();
}
