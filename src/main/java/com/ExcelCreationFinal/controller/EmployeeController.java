package com.ExcelCreationFinal.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExcelCreationFinal.services.EmployeeService;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor

@RestController
public class EmployeeController {
	@Autowired
	  private EmployeeService employeeService;

	    @GetMapping("/excelcreator")
	    public void excelcreation(HttpServletResponse response) throws IOException {
	        response.setContentType("application/octet-stream");
	        String headerKey = "Content-Disposition";
	        String headerValue = "attachment; filename=employee.xlsx";
	        response.setHeader(headerKey, headerValue);
	       employeeService.excelcreation(response);
	       response.flushBuffer();


	    }
	}

