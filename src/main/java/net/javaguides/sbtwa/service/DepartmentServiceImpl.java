package net.javaguides.sbtwa.service;

import net.javaguides.sbtwa.dao.DepartmentDao;
import net.javaguides.sbtwa.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao dao;

    @Transactional(readOnly = false)
    @Override
    public void save(Department department) {
        dao.save(department);
    }

    @Transactional(readOnly = false)
    @Override
    public void edit(Department department) {
        dao.update(department);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Department searchById(Long id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Department> searchAll() {
        return dao.findAll();
    }
}
