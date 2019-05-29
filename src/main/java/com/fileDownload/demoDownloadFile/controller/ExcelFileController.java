package com.fileDownload.demoDownloadFile.controller;

import com.fileDownload.demoDownloadFile.storage.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ExcelFileController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getList")
    public String getList(Model model){

        List empList= employeeService.getEmpList();
        model.addAttribute("emplist",empList);

        return "Employee List";
    }

    @GetMapping(value = "/export")
    public ModelAndView getExcel() {
        List empList =employeeService.getEmpList();
        return new ModelAndView("Employee Excel", "empList", empList);
    }

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/hi")
    public String hi(@RequestParam("name") String name, Model model) {
        String message = "Hi " + name + "!";
        model.addAttribute("message", message);
        return "hi";
    }

}
