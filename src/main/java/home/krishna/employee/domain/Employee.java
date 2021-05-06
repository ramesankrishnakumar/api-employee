package home.krishna.employee.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString
public class Employee {
	
	private Integer activeEmployee;
	private Integer contractors;
}
