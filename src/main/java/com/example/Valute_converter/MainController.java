package com.example.Valute_converter;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@SpringBootApplication
@RestController
public class MainController {

    int i = 0;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/rest_test")
    public List<TreeMap<String, String>> resttest(){

        ArrayList<TreeMap<String, String>> list = new ArrayList<>();

        TreeMap<String,String> map = new TreeMap<>();
        map.put("id","555"); map.put("text","my message " + i++);
        list.add(map);
/*
        TreeMap<String,String> map1 = new TreeMap<>();
        map.put("id","000"); map.put("text","THE my message ");
        list.add(map1);
*/
        return list;
    }

    @GetMapping("/w")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

}
