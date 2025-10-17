package com.alperenavci.controller;

import com.alperenavci.dto.DtoEmployee;
import com.alperenavci.model.RootEntity;

public interface RestEmployeeController {
	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
