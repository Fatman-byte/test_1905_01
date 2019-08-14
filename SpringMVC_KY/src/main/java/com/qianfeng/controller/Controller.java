package com.qianfeng.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * author:刘强
 * date:2019/8/1311:13
 * description:
 */
@org.springframework.stereotype.Controller
@RequestMapping("/test02")
public class Controller {
    @CrossOrigin("http://localhost:8989")
    @RequestMapping("/test022")
    public String test02(HttpSession session){
        System.out.println("test2");
        System.out.println(session.getAttribute("name"));
        return "index";
    }
    @CrossOrigin("http://localhost:8989")
    @RequestMapping("/test02")
    public String test2(HttpSession session){
        System.out.println("test2");
        session.setAttribute("name","王五");
        return "index";
    }
}
