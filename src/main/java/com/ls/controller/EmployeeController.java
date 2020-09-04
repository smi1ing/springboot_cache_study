package com.ls.controller;


import com.ls.bean.Employee;
import com.ls.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    RedisTemplate<Object, Employee> employeeRedisTemplate;


    /**
     *
     * @Cacheable开启缓存，里面的参数介绍
     * cacheNames/value:指定缓存组件的名字
     * key:缓存数据使用的key,默认是使用方法参数的值
     * keyGenerator:key的生成器，可以自己指定key的生成器的组件id
     * cacheManager:指定缓存管理器
     * condition:指定符合条件的情况下才缓存
     * unless:否定缓存，当unless为true时，方法的返回值就不会被缓存
     * sync:是否使用异步模式
     * @CachePut：及调用方法，又更新缓存数据:同步更新缓存
     * @CacheEvict：清除缓存
     * key:指定要清除的数据
     * allEntries=true：指定清除缓存中所有的数据
     * beforeInvocation = false:缓存的清除是否在方法之前执行,默认是在方法执行之后执行
     * @param id
     * @return
     */
    @RequestMapping("/test")
    @ResponseBody
    @Cacheable(cacheNames = "emp",condition = "#id>0")
    public Employee getEmployee(Integer id){
        Employee employee = employeeService.getEmployee(id);
        employeeRedisTemplate.opsForValue().set("emp",employee);
        return employee;
    }

}
