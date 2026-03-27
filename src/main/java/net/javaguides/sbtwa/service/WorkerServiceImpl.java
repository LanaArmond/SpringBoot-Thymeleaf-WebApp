package net.javaguides.sbtwa.service;

import net.javaguides.sbtwa.dao.WorkerDao;
import net.javaguides.sbtwa.domain.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired // Notação de injeção de dependências
    private WorkerDao dao;

    @Transactional(readOnly = false)
    @Override
    public void save(Worker worker) {
        dao.save(worker);
    }

    @Transactional(readOnly = false)
    @Override
    public void edit(Worker worker) {
        dao.update(worker);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Worker searchById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Worker> searchAll() {
        return dao.findAll();
    }
}
