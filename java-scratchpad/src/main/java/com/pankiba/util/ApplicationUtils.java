package com.pankiba.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;

import com.pankiba.model.Employee;
import com.pankiba.model.Grade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApplicationUtils {

	private ApplicationUtils() {
	}

	public static List<Employee> testData() {

		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			employeeList.add(new Employee(677509L, "John", "Rambo", "M", "john.rambo@users.noreply.github.com",
					DateUtils.parseDate("3/29/1987", "MM/dd/yyyy"), DateUtils.parseDate("11/24/2003", "MM/dd/yyyy"),
					Grade.Developer, 168251L));

			employeeList.add(new Employee(940761L, "John", "McLane", "M", "john.mclane@users.noreply.github.com",
					DateUtils.parseDate("7/31/1970", "MM/dd/yyyy"), DateUtils.parseDate("7/27/2008", "MM/dd/yyyy"),
					Grade.Developer, 51063L));

			employeeList.add(new Employee(499687L, "Ethan", "Hunt", "M", "ethan.hunt@yahoo.com",
					DateUtils.parseDate("9/27/1982", "MM/dd/yyyy"), DateUtils.parseDate("7/22/2005", "MM/dd/yyyy"),
					Grade.Lead, 72305L));

			employeeList.add(new Employee(539712L, "Jery", "Maguire", "M", "jery.maguire@yahoo.com",
					DateUtils.parseDate("6/9/1959", "MM/dd/yyyy"), DateUtils.parseDate("4/27/1994", "MM/dd/yyyy"),
					Grade.Lead, 121587L));

			employeeList.add(new Employee(408351L, "Cersei", "Lanister", "F",
					"cersei.lanister@users.noreply.github.com", DateUtils.parseDate("12/4/1977", "MM/dd/yyyy"),
					DateUtils.parseDate("4/16/1999", "MM/dd/yyyy"), Grade.Developer, 180294L));

			employeeList.add(new Employee(333476L, "Daenerys", "Targaryen", "F",
					"daenerys.targaryen@users.noreply.github.com", DateUtils.parseDate("12/1/1967", "MM/dd/yyyy"),
					DateUtils.parseDate("12/22/1991", "MM/dd/yyyy"), Grade.Developer, 109394L));

			employeeList.add(new Employee(528673L, "Brann", "Stark", "M", "brann.stark@users.noreply.github.com",
					DateUtils.parseDate("3/9/1959", "MM/dd/yyyy"), DateUtils.parseDate("6/26/1995", "MM/dd/yyyy"),
					Grade.Architect, 145235L));

		} catch (ParseException parseException) {
			log.error(" error while parsing date {} ", parseException);
		}

		return employeeList;
	}

	public static void logHeader(String logMessage) {
		String tempStr = "##########################################################################################################################################################";
		StringBuffer buf = new StringBuffer(tempStr);

		int start = 10;
		System.out.println("\n" + buf.replace(start, start + logMessage.length(), " " + logMessage + " ") + "\n");

	}

}
