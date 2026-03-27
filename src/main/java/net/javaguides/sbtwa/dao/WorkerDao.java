package net.javaguides.sbtwa.dao;

import net.javaguides.sbtwa.domain.Worker;
import java.util.List;

public interface WorkerDao {

    void save(Worker worker);

    void update(Worker worker);

    void delete(Long id);

    Worker findById(Long id);

    List<Worker> findAll();
}
