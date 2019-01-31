package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	//Even though empty this supports creating new instances, updating, deleting, several forms of searching
}
