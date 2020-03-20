package com.hurusea.gmall.user.controller;

import com.hurusea.gmall.bean.UmsMember;
import com.hurusea.gmall.bean.UmsMemberName;
import com.hurusea.gmall.bean.UmsMemberReceiveAddress;
import com.hurusea.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @hurusea
 * @create2020-03-19 16:01
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses =
                userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUserName")
    @ResponseBody
    public List<UmsMemberName> getAllUserName(){
        List<UmsMemberName> umsMemberName=userService.getAllUserName();

        return umsMemberName;
    }

    @RequestMapping("getAllUsers")
    @ResponseBody
    public List<UmsMember> getAllUsers() {
        List<UmsMember> umsMembers =userService.getAllUsers();

        return umsMembers;
    }

    @RequestMapping("insertUser")
    @ResponseBody
    public String insertUser() {
        userService.insertUser();
        return "增加成功";
    }

    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser() {
        userService.deleteUser();
        return "删除成功";
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }


}
