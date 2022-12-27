package br.com.klsites.employee.repositories;

import br.com.klsites.employee.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}