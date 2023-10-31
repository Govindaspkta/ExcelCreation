package com.ExcelCreationFinal.services;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExcelCreationFinal.Employee.Employee;
import com.ExcelCreationFinal.repo.EmployeeRepo;

import jakarta.servlet.ServletOutputStream;

import jakarta.servlet.http.HttpServletResponse;
@Service
public class EmployeeService {
	@Autowired
	   private EmployeeRepo employeeRepo;

	    public void excelcreation(HttpServletResponse response) throws IOException {
	    	   List<Employee> employees = employeeRepo.findAll();
	        HSSFWorkbook wb = new HSSFWorkbook();
	      HSSFSheet sheet =  wb.createSheet("excelcreation");
	        HSSFRow row = sheet.createRow(0);
	        row.createCell(0).setCellValue("employee_id");
	        row.createCell(1).setCellValue("first_name");
	        row.createCell(2).setCellValue("last_name");
	        row.createCell(3).setCellValue("address");

	        int dataRowIndex = 1;
	        for (Employee employeee : employees){
	            HSSFRow dataRow = sheet.createRow(dataRowIndex);
	            dataRow.createCell(0).setCellValue(employeee.getemployee_Id());
	            dataRow.createCell(1).setCellValue(employeee.getFirst_Name());
	            dataRow.createCell(2).setCellValue(employeee.getLast_Name());
	            dataRow.createCell(3).setCellValue(employeee.getAddress());
	            dataRowIndex ++;
	        }

	        ServletOutputStream outputStream = response.getOutputStream();
	        wb.write(outputStream);
	        wb.close();
	        outputStream.close();

	    }


	    }

