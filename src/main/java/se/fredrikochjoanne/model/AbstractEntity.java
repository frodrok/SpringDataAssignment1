package se.fredrikochjoanne.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private Long id;

    protected AbstractEntity() {}

    public Long getId() {
        return id;
    }
}
