package com.pankiba.model;

import java.util.Date;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 *
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Employee {

	private Long employeeId;

	private String firstName;

	private String lastName;

	private String gender;

	private String email;

	private Date birthDate;

	private Date joiningDate;

	private Grade grade;

	private Long salary;

	@Override
	public int hashCode() {

		log.info(" in hashCode method ");

		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(employeeId);
		result = prime * result + Objects.hashCode(firstName);
		result = prime * result + Objects.hashCode(lastName);
		result = prime * result + Objects.hashCode(gender);
		result = prime * result + Objects.hashCode(email);
		result = prime * result + Objects.hashCode(birthDate);
		result = prime * result + Objects.hashCode(joiningDate);
		result = prime * result + Objects.hashCode(grade);
		result = prime * result + Objects.hashCode(salary);

		log.info(" executing hashcode and returning {} ", result);

		return result;
	}

	@Override
	public boolean equals(Object object) {

		log.info(" in equals method ");
		// self check
		if (this == object) {
			return true;
		}

		// null check
		if (object == null) {
			return false;
		}

		// type check. we can do instanceOf check instead but it will pass for subclass too
		if (getClass() != object.getClass()) {
			return false;
		}

		// case
		Employee employee = (Employee) object;
		boolean isEquals = Objects.equals(employeeId, employee.getEmployeeId())
				&& Objects.equals(firstName, employee.getFirstName())
				&& Objects.equals(lastName, employee.getLastName()) && Objects.equals(gender, employee.getGender())
				&& Objects.equals(email, employee.getEmail()) && Objects.equals(birthDate, employee.getBirthDate())
				&& Objects.equals(joiningDate, employee.getJoiningDate()) && Objects.equals(grade, employee.getGrade())
				&& Objects.equals(salary, employee.getSalary());

		log.info(" executing equals and retuning {} ", isEquals);
		return isEquals;
	}

}
