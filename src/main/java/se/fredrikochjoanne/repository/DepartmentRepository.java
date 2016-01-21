package se.fredrikochjoanne.repository;

import org.springframework.data.repository.CrudRepository;
import se.fredrikochjoanne.model.Department;

/**
 * Created by joanne on 21/01/16.
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {}
