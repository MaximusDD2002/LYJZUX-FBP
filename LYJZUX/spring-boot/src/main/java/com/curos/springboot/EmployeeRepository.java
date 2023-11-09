package com.curos.springboot;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.Element;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository{
	
	private List<Employee> list = new ArrayList<>( List.of(new Employee(1, "Empp1", "Desc1"),
												   new Employee(2, "Empl3", "Desc2"),
												   new Employee(3, "Empl4", "Desc3"),
												   new Employee(4, "Empl5", "Desc4"),
												   new Employee(5, "Empl6", "Desc5"),
												   new Employee(6, "Empl7", "Desc6"),
												   new Employee(7, "Empl8", "Desc7"),
												   new Employee(8, "Empl9", "Desc8"),
												   new Employee(9, "Empl10", "Desc9"),
												   new Employee(10, "Empl11", "Desc10")));
	public void save(Employee e) {
		list.add(e);
	}
	
	public List<Employee> findAll() {
		return list;
	}

	public Optional<Employee> findById(long id) {
		return list.stream().filter( x -> x.getId() == id).findFirst();
	}
	
	public void deleteById(long id) {
		list.removeIf(x -> x.getId() == id);
	}
}
