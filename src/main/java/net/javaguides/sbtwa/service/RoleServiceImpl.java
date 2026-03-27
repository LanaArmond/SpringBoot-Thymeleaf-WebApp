package net.javaguides.sbtwa.service;

import net.javaguides.sbtwa.dao.RoleDao;
import net.javaguides.sbtwa.domain.Role;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

import java.util.List;

@Service @Transactional(readOnly = false)
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao dao;

    @Override
    public void save(Role role) {
        dao.save(role);
    }

    @Override
    public void edit(Role role) {
        dao.update(role);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override @Transactional(readOnly = true)
    public Role searchById(Long id) {
        return dao.findById(id);
    }

    @Override @Transactional(readOnly = true)
    public List<Role> searchAll() {
        return dao.findAll();
    }
}
