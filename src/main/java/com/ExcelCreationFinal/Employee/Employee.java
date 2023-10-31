package com.ExcelCreationFinal.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="employeee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    private String first_Name;
    private String last_Name;
    private String address;
    
   

    public Employee( int employee_id,String firstName, String lastName, String address) {
      
    }



	public Integer getemployee_Id() {
		return employee_id;
	}



	public void setemployee_Id(Integer id) {
		this.employee_id = id;
	}



	public String getFirst_Name() {
		return first_Name;
	}



	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}



	public String getLast_Name() {
		return last_Name;
	}



	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", address=" + address
				+ "]";
	}
    
}

