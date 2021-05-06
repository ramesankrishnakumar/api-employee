package home.krishna.employee.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import home.krishna.employee.domain.Employee;


@RestController
@RequestMapping("/v1/company/{companyId}/employee-details")
public class EmployeeInfoController {
	
	@GetMapping
	public ResponseEntity<Employee> getEmployeeInfo(@PathVariable String companyId) {
		Employee employee = new Employee();
		employee.setActiveEmployee(1000);
		employee.setContractors(100);
		System.out.println(employee);
		return ResponseEntity.ok(employee);
	}
}
