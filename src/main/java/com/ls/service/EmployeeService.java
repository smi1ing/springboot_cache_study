package com.ls.service;


import com.ls.bean.Employee;
import com.ls.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee getEmployee(Integer id){
        Employee employee = employeeMapper.getEmployee(id);
        return employee;
    }
}
