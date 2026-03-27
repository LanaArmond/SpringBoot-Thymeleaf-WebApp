package net.javaguides.sbtwa.service;

import net.javaguides.sbtwa.domain.Worker;
import java.util.List;

public interface WorkerService {

    void save(Worker worker);

    void edit(Worker worker);

    void delete(Long id);

    Worker searchById(Long id);

    List<Worker> searchAll();
}
