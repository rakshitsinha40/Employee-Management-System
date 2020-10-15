package com.barclays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.sql.SQLException;


@Controller
public class EmployeeController {

    //static final Logger logger  = LogManager.getLogger(EmployeeController.class.getName());

   // @Autowired
    //private Service employeeService;
    @Autowired
    private DataSQL employeeService;


    // displaying employee by id
    @GetMapping("/employees/{id}")
    public Emp getEmployee(@PathVariable String id) throws SQLException {
        return employeeService.read(id);
    }

    // inserting employee
    @PostMapping("/employees")
    public void addEmployees(@PathVariable String id,@RequestBody Emp employee){
        employeeService.add(id,employee);
    }

    //updating employee by id
    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable String id,@RequestBody Emp employee) throws SQLException {
        employeeService.update(id,employee);
    }



    // deleting employee by id
    @DeleteMapping("employees/{id}")
    public void deleteEmployeeByID( @PathVariable String id) throws SQLException {
        employeeService.delete(id);
    }


}