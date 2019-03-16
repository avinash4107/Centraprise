package com.centraprise.hrmodule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.centraprise.hrmodule.exception.DatabaseException;
import com.centraprise.hrmodule.model.EmployeeDetails;
import com.centraprise.hrmodule.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDetails> getEmployeesList() {
		List<EmployeeDetails> employeeDetails = null;
		try {
			employeeDetails = employeeRepository.findAll();
		} catch (Exception e) {

			throw new DatabaseException("Datebase is Down");
		}
		return employeeDetails;
	}

}
