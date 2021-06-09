package com.lxx.templatepattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lixiaoxiang
 */
@RequestMapping("/api")
@Controller
public class MyApiController extends AbstractTemplate {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Result execute() {
        return super.execute();
    }

    @Override
    public void parseRequestParameters() {
        System.out.println("*****解析参数*****");
    }

    @Override
    public void checkRequestParameters() {
        System.out.println("*****校验参数*****");
    }

    @Override
    public Object doBusiness() {
        System.out.println("*****处理业务*****");
        // TODO: 调用service处理业务
        User user = new User();
        user.setName("小田哥");
        user.setId(1);
        user.setAge(20);
        user.setSex("man");
        return user;
    }

    @Override
    public Result assembleResponseParameters(Object object) {
        System.out.println("*****返回参数*****");
        Result result = new Result("200", "处理成功");
        result.setData(object);
        return result;
    }
}