package se.fredrikochjoanne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.fredrikochjoanne.model.Department;
import se.fredrikochjoanne.model.Employee;
import se.fredrikochjoanne.model.ParkingSpot;
import se.fredrikochjoanne.repository.DepartmentRepository;
import se.fredrikochjoanne.repository.EmployeeRepository;
import se.fredrikochjoanne.repository.ParkingSpotRepository;

public class Main {

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()){
            context.scan("se.fredrikochjoanne");
            context.refresh();

            EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
            DepartmentRepository departmentRepository = context.getBean(DepartmentRepository.class);
            ParkingSpotRepository parkingSpotRepository = context.getBean(ParkingSpotRepository.class);

            ParkingSpot parkingSpot = parkingSpotRepository.save(new ParkingSpot("10"));
            Department department = departmentRepository.save(new Department("IT"));
            Employee employee = employeeRepository.save(new Employee("joanne", "nori","1001", department, parkingSpot));

            System.out.println(employeeRepository.findOne(employee.getId()).getFirstName());
            System.out.println(employeeRepository.findOne(employee.getId()).getDepartment());


        }
    }
}
