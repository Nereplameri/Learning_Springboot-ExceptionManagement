package com.alperenavci.service.Impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alperenavci.dto.DtoDepartment;
import com.alperenavci.dto.DtoEmployee;
import com.alperenavci.model.Department;
import com.alperenavci.model.Employee;
import com.alperenavci.repository.EmployeeRepository;
import com.alperenavci.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if (optional.isEmpty()) {
			return null;
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		
		BeanUtils.copyProperties(department, dtoDepartment);
		BeanUtils.copyProperties(employee, dtoEmployee);
		dtoEmployee.setDepartment(dtoDepartment);
		
		return dtoEmployee;
	}
	
	
}
