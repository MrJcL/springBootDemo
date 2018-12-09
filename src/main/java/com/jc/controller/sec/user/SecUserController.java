package com.jc.controller.sec.user;

import com.jc.iservice.sec.user.ISecUserService;
import com.jc.model.sec.user.SecUserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springBootDemo
 * @Date: 2018/12/7 15:02
 * @Author: LiJc
 * @Description:
 */
@RestController //等同于同时加上了@Controller和@ResponseBody
@RequestMapping(value = "/secUser")
public class SecUserController {

    @Autowired
    private ISecUserService secUserService;

    /**
     * 创建用户
     *
     * @param SecUserModel
     * @return
     */
    @PostMapping("/createUser")
    public boolean createUser(SecUserModel SecUserModel) {
        return this.secUserService.crateUser(SecUserModel);
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @GetMapping("/queryAllUser")
    public List<SecUserModel> queryAllUser() {
        return this.secUserService.queryAllUser();
    }

    /**
     * 根据用户ID获取用户信息
     *
     * @return
     */
    @GetMapping("/getSecUserModel")
    public SecUserModel getSecUserModel(String userId) {
        return this.secUserService.getSecUserModel(userId);
    }

    @RequestMapping(value = {"/hello1"}, method = RequestMethod.GET)
    public String say() {
        return "hi you!!!";
    }

    @GetMapping
    public String hi() {
        return "hi you!!!";
    }
}
