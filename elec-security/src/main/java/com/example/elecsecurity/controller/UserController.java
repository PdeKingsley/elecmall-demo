package com.example.elecsecurity.controller;

import com.example.elecsecurity.common.entity.JsonResult;
import com.example.elecsecurity.common.utils.ResultTool;
import com.example.elecsecurity.entity.UserAccount;
import com.example.elecsecurity.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserAccountService userAccountService;

    @GetMapping("/getUser")
    public JsonResult getUser() {
        List<UserAccount> users = userAccountService.queryAllByLimit(0, 100);
        return ResultTool.success(users);
    }
    @GetMapping("/test")
    public JsonResult test() {
        return ResultTool.success("hello world");
    }
}
