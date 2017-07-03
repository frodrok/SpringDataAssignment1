package se.fredrikochjoanne.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

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
