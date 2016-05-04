package com.j2eedemo.controller;


import com.j2eedemo.model.AccountModel;
import com.j2eedemo.model.SessionModel;
import com.sun.tracing.dtrace.ModuleAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2016/5/4.
 */
@Controller
@RequestMapping()
@SessionAttributes(value = {"sessionaccountmodel","accountmodel"},types={AccountModel.class, AccountModel.class})
public class DataBindController {

    @ModelAttribute("sessionaccountmodel")
    public AccountModel initModel(){
        return  new AccountModel();
    }

    @ModelAttribute("accountmodel")
    public AccountModel intiModel2(){
        return new AccountModel();
    }

    @RequestMapping(value="/sessioninput", method = {RequestMethod.GET})
    public String userNameBind(Model model){
        return "sessioninput";

//        //重定向到密码绑定测试
//        return "redirect:passwordbind";
    }

    @RequestMapping(value="/sessioninput", method = {RequestMethod.POST})
    public String userNameBind( @ModelAttribute("sessionaccountmodel") AccountModel accountModel, SessionStatus status){
        //销毁@SessionAttributes存储的对象
        status.setComplete();
        //显示绑定结果
        return "sessionout";
    }


    //@RequestBody Test
    @RequestMapping(value="/requestbodybind", method = {RequestMethod.GET})
    public String requestBodyBind(Model model){
        model.addAttribute("accountmodel", new AccountModel());
        return "requestbody";
    }

    @RequestMapping(value="/requestbodybind", method = {RequestMethod.POST})
    public @ResponseBody AccountModel requestBodyBind(@RequestBody AccountModel accountModel){
        return accountModel;
    }
}
