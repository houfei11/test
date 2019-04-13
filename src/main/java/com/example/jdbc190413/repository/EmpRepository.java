package com.example.jdbc190413.repository;

import com.example.jdbc190413.bo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {
    /**
     * 通过工资查询人员信息
     * @param id
     * @return
     */
//    List<Student> selectStuBySal(Integer id);
}
