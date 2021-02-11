package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-detail-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest httpServletRequest, Model model) {
//
//        //Считываем из передаваемой странички данные
//        String empName = httpServletRequest.getParameter("employeeName");
//        empName = "name: " + empName;
//        String empSurname = httpServletRequest.getParameter("employeeSurname");
//        empSurname = "surname: " + empSurname;
//
//
//        // добавляем в модель (Модель - это просто контейнер для хранения данных)
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("surnameAttribute", empSurname);
//        model.addAttribute("description", "Programmer");
//
//        //возвращаем view
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = " mr " + empName + "!!!";

        // добавляем в модель(хранилище) для последуюещго использования для view
        model.addAttribute("nameAttribute", empName);

        //возвращаем view
        return "show-emp-details-view";
    }
}
