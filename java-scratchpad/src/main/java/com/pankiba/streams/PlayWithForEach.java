package com.pankiba.streams;

import java.util.List;
import java.util.function.Consumer;

import com.pankiba.model.Employee;
import com.pankiba.util.ApplicationUtils;

public class PlayWithForEach {

	public static void main(String[] args) {

		List<Employee> employeeList = ApplicationUtils.testData();

		ApplicationUtils.logHeader("forEach - traditional");
		employeeList.stream().forEach(new EmployeeConsumer());

		ApplicationUtils.logHeader("forEach - lambda expression");
		employeeList.stream().forEach(employee -> System.out.println(employee));

		ApplicationUtils.logHeader("forEach - lambda expression with method reference");
		employeeList.stream().forEach(System.out::println);

	}
}

class EmployeeConsumer implements Consumer<Employee> {

	@Override
	public void accept(Employee employee) {
		System.out.println(employee);
	}
}