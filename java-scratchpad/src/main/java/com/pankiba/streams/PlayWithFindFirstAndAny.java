package com.pankiba.streams;

import java.util.List;

import com.pankiba.model.Employee;
import com.pankiba.util.ApplicationUtils;

public class PlayWithFindFirstAndAny {
	public static void main(String[] args) {

		List<Employee> employeeList = ApplicationUtils.testData();

		ApplicationUtils.logHeader("findFirst - lambda");
		Employee emp = employeeList.stream().filter(employee -> employee.getSalary() < 1500L).findFirst().orElse(null);

		System.out.println(emp);

		ApplicationUtils.logHeader("findAny - lambda");
		Employee empOne = employeeList.stream().filter(employee -> employee.getSalary() > 150000L).findAny()
				.orElse(null);

		System.out.println(empOne);
	}
}
