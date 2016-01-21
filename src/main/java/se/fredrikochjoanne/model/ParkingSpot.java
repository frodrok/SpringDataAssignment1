package se.fredrikochjoanne.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by joanne on 21/01/16.
 */
@Entity
public class ParkingSpot extends AbstractEntity {

    private String label;
    @OneToOne
    private Employee employee;

    protected ParkingSpot() {}

    public ParkingSpot(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
