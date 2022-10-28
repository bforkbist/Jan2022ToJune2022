package com.employeemanagement.emp.Service;

import com.employeemanagement.emp.Model.Employee;
import com.employeemanagement.emp.Repository.EmployeeRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @InjectMocks
    EmployeeService employeeService;

    @Mock
    EmployeeRepo employeeRepo;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(1L,"aditya","adi08u@gmail.com","java","\"https://cdn.vox-cdn.com/thumbor/UswYUb9Ve-sg9EN1f0KMAkOUizE=/0x0:1280x721/1200x800/filters:focal(544x281:748x485)/cdn.vox-cdn.com/uploads/chorus_image/image/70124512/naruto.0.jpg","225dbdb0-7a95-4a43-a7f0-4fe855b41b8d");
        employeeList.add(emp1);
        Mockito.when(employeeService.findAllEmployee()).thenReturn(employeeList);
        List<Employee> empList = employeeService.findAllEmployee();
        assertEquals(1, empList.size());
        verify(employeeRepo, Mockito.times(1)).findAll();

    }


}