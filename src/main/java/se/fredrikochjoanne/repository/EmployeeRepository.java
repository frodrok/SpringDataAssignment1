package se.fredrikochjoanne.repository;

import org.springframework.data.repository.CrudRepository;
import se.fredrikochjoanne.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{}
