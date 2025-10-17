package com.alperenavci.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alperenavci.controller.RestEmployeeController;
import com.alperenavci.dto.DtoEmployee;
import com.alperenavci.model.RootEntity;
import com.alperenavci.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerImpl extends RestBaseController implements RestEmployeeController{

	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}
}
