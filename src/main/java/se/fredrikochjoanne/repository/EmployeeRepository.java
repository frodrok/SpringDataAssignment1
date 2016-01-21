package se.fredrikochjoanne.repository;

import org.springframework.data.repository.CrudRepository;
import se.fredrikochjoanne.model.Employee;

/**
 * Created by joanne on 21/01/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long>{}
