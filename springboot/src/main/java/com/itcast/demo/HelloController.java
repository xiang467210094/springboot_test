package com.itcast.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;


/**
 * Created by abner-lv on 2019/2/25.
 */
@Controller
public class HelloController {
  /*  @Value("${name}")
    private String name;

    @Value("${age}")
    private  Integer age;

    @RequestMapping(value = "/hello")
    public String hello(){
        return name + age;
    }*/

   @RequestMapping("/hello")
   public String hello(Model m){
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
       return "hello";
   }
}
