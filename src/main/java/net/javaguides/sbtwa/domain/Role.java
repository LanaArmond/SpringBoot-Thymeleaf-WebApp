package net.javaguides.sbtwa.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ROLES")
public class Role extends AbstractEntity<Long> {

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @ManyToOne
    @JoinColumn(name = "departament_id_fk")
    private Department department;

    // Listagem de Funcionários no Cargo
    @OneToMany(mappedBy = "role")
    private List<Worker> workers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Get e Set dos Funcioários

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
