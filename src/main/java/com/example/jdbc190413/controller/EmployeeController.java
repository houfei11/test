package com.example.jdbc190413.controller;

import com.example.jdbc190413.bo.Employee;
import com.example.jdbc190413.repository.EmpRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("employee/")
public class EmployeeController {

    private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmpRepository empRepository;

    /**
     *  查询所有方法
     * @return
     */
    @RequestMapping(value = "list")
    public List<Employee> studentList(){
        logger.info("studentList");
        return empRepository.findAll();
    }

    /**
     *  新增方法
     * @param employee
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "addEmp")
    public Employee addEmp(@Valid Employee employee, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return null;
        }
        employee.setEname(employee.getEname());
        employee.setSalary(employee.getSalary());
        return empRepository.save(employee);
    }

    /**
     *  删除方法
     * @param id
     */
    @RequestMapping(value = "delete")
    public void delGirl(Integer id){
        empRepository.delete(id);
    }

    /**
     *  修改方法
     * @param id
     * @param ename
     * @param salary
     * @return
     */
    @RequestMapping(value = "update")
    public Employee updateEmployee(@RequestParam("id") Integer id ,@RequestParam("ename") String ename,@RequestParam("salary") Integer salary){
        Employee employee = new Employee();
        employee.setId(id);
        employee.setEname(ename);
        employee.setSalary(salary);
        return empRepository.save(employee);
    }
}
