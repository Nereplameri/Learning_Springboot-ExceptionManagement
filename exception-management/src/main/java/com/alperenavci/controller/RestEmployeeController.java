package com.alperenavci.controller;

import com.alperenavci.dto.DtoEmployee;

public interface RestEmployeeController {
	public DtoEmployee findEmployeeById(Long id);
}
