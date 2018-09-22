package com.moliyao.traffic.controller;/**
 * author:ChenYao
 * Date:2018/9/12
 * Time:23:12
 * File Introduction:
 **/

import com.moliyao.traffic.model.User;
import com.moliyao.traffic.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *@program: Traffic
 *@description: 登录控制类
 *@author: Chen Yao
 *@create: 2018-09-12 23:12
 */
@Controller
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        log.info("请求登录界面");
        return "index";
    }

    @RequestMapping("/index")
    public String index() {
        return "dashboard";
    }


    @RequestMapping("/charts.html")
    public String charts() {
        return "charts";
    }


    @RequestMapping("/files.html")
    public String file() {
        return "files";
    }

    @RequestMapping("/dashboard.html")
    public String dashboard() {
        return "dashboard";
    }


    @RequestMapping(value = "/loginpermit", method = RequestMethod.POST)
    public String loginpermit(@RequestParam String username,@RequestParam String password) {
        User tempUser = userService.findByName(username);
        log.info(username+"-------------"+password);
        if(tempUser==null){
            return "index";
        }else if(tempUser.getPassword().equals(password)){
            log.info(tempUser.toString());
            return "dashboard";
        }else{
            return "index";
        }
    }

    /***********HTTP GET method*************/
    @GetMapping("/testGetAction")
    public Object getJson() {
        JSONObject json = new JSONObject();
        json.put("username", "tester");
        json.put("pwd", "123456748");
        return json;
    }

    /**********HTTP POST method**************/
    @PostMapping(value = "/testPostAction")
    public Object postJson(@RequestBody JSONObject param) {
        System.out.println(param.toJSONString());
        param.put("action", "post");
        param.put("username", "tester");
        param.put("pwd", "123456748");
        return param;
    }

  /*  @PostMapping(value = "/postApi")
    public Object testPost() {
        String url = "http://localhost:8088/demo/testPostAction";
        JSONObject postData = new JSONObject();
        postData.put("descp", "request for post");
        return json.toJSONString();
    }*/

    @RequestMapping("/getUserByid")
    @ResponseBody
    public String getUser(int id) {
        System.out.println(id);
       //return "index";
        return ""+userService.getList().get(0).getName();
    }

}
