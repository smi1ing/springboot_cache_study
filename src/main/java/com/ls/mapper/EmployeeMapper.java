package com.ls.mapper;


import com.ls.bean.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    Employee getEmployee(Integer id);

}
