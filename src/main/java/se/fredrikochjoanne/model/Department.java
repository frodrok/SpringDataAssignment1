package se.fredrikochjoanne.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by joanne on 21/01/16.
 */
@Entity
public class Department extends AbstractEntity {

    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "department")
    private Collection<Employee> employees;

    protected Department(){}

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }
}
