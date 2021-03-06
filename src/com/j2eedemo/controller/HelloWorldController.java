package com.j2eedemo.controller;


import com.j2eedemo.auth.AuthPassport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/5/3.
 */
@Controller
@RequestMapping()
public class HelloWorldController  {

    @RequestMapping(value ="/index",method = {RequestMethod.GET})
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello World!");
        modelAndView.setViewName("start");
        return modelAndView;
    }

    @RequestMapping(value ="/detail/{id}",method = {RequestMethod.GET})
    public ModelAndView getDetail(@PathVariable(value = "id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", String.valueOf(id));
        modelAndView.setViewName("start");
        return modelAndView;
    }

    @AuthPassport
    @RequestMapping(value="/*", method = {RequestMethod.GET})
    public ModelAndView urlTest(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Uncatch");
        modelAndView.setViewName("start");
        return modelAndView;
    }

//    @RequestParam(value="username", required=true, defaultValue="AAA")。
    @RequestMapping(value="/param", params="param", method = {RequestMethod.GET})
    public ModelAndView paramsTest(HttpServletRequest request, @RequestParam("param") String param){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", param+" "+ ServletRequestUtils.getStringParameter(request, "param", null));
        modelAndView.setViewName("start");
        return modelAndView;
    }

    @RequestMapping(value = "/response",method = {RequestMethod.GET})
    public ModelAndView httpResponse(HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write("中文乱码");
        return  null;
    }

    @RequestMapping(value="/cookiebind", method = {RequestMethod.GET})
    public ModelAndView Cookie(HttpServletRequest request, @CookieValue(value="JSESSIONID", defaultValue="") String jsessionId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", jsessionId);
        modelAndView.setViewName("start");
        return modelAndView;
    }
}
