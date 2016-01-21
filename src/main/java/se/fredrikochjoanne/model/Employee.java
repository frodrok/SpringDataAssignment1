package se.fredrikochjoanne.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by joanne on 21/01/16.
 */
@Entity
public class Employee extends AbstractEntity{

    private String firstName;
    private String lastName;
    private String employeeNumber;
    @ManyToOne
    private Department department;
    @OneToOne
    private ParkingSpot parkingSpot;

    protected Employee() {}

    public Employee(String firstName, String lastName, String employeeNumber, Department department, ParkingSpot parkingSpot) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.parkingSpot = parkingSpot;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
