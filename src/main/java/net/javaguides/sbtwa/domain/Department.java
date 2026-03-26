package net.javaguides.sbtwa.domain;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTMENTS")
public class Department extends AbstractEntity<Long> {

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    // Estabelecendo que o atributo forte da relação é o Departamento (Cargo usa FK do ID do Dep.)
    // Listagem de Cargos do Departamento
    @OneToMany(mappedBy = "department")
    private List<Role> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Get e Set de Cargos

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
