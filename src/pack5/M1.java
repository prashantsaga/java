package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M1 {
	public static void main(String[] args) throws Exception
	{
		List<Employee> employees = readAllEmployees();
		readEmployees(employees);
		Employee maxSalariedEmployee = getMaxSalariedEmployee(employees);
		System.out.println("max salaried employee:" + maxSalariedEmployee);
		
		Employee minSalariedEmployee = getMinSalariedEmployee(employees);
		System.out.println("min salaried employee:" + minSalariedEmployee);
		
		Employee minAgedEmployee = getMinAgeEmployee(employees);
		System.out.println("min age employee:" + minAgedEmployee);
		
		Employee maxAgedEmployee = getMaxAgeEmployee(employees);
		System.out.println("max age employee:" + maxAgedEmployee);
	}
	static  List<Employee> readAllEmployees() throws Exception
	{
		File f1 = new File("E:\\data.csv");
		FileReader fin = new FileReader(f1);
		BufferedReader bin = new BufferedReader(fin);
		List<Employee> employees = new ArrayList<>();
		Employee employee;
		String[] data;
		String line = bin.readLine();
		line = bin.readLine();
		while(line != null)
		{
			data = line.split(",");
			employee = new Employee();
			employee.setId(Integer.parseInt(data[0].trim()));
			employee.setFirstName(data[1].trim());
			employee.setLastName(data[2].trim());
			employee.setEmail(data[3].trim());
			employee.setAge(Integer.parseInt(data[4].trim()));
			employee.setSalary(Integer.parseInt(data[5].trim()));
			employees.add(employee);
			line = bin.readLine();
		}
		return employees;
	}
	static void readEmployees(List<Employee> employees)
	{
		for(Employee emp : employees)
		{
			System.out.println(emp);
		}
	}
	static Employee getMaxSalariedEmployee(List<Employee> employees)
	{
		Collections.sort(employees, 
						(e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));
		return employees.get(employees.size() - 1);
	}
	static Employee getMinSalariedEmployee(List<Employee> employees)
	{
		Collections.sort(employees, 
						(e1, e2) -> e2.getSalary().compareTo(e1.getSalary()));
		return employees.get(employees.size() - 1);
	}
	
	static Employee getMinAgeEmployee(List<Employee> employees)
	{
		Collections.sort(employees, 
						(e1, e2) -> e1.getAge()-(e2.getAge()));
		return employees.get(0);
	}
	static Employee getMaxAgeEmployee(List<Employee> employees)
	{
		Collections.sort(employees, 
						(e1, e2) -> e2.getAge()-(e1.getAge()));
		return employees.get(0);
	}
}