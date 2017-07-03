package se.fredrikochjoanne.repository;

import org.springframework.data.repository.CrudRepository;
import se.fredrikochjoanne.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {}
