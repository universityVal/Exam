package sk.pro.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.pro.exam.model.Department;
import sk.pro.exam.service.impls.DepartmentServiceImpl;
import java.util.List;

@RestController
public class DepartrmentController {

    @Autowired
    DepartmentServiceImpl service;

    @RequestMapping("/department/list")
    List<Department> showAll(){
        return service.getAll();
    }

    @RequestMapping("/department/del/{id}")
    void del(@PathVariable(value = "id") String id){
         service.delete(id);
    }

}
