package com.jc.iservice.sec.user;

import com.jc.model.sec.user.SecUserModel;

import java.util.List;

/**
 * @program: springBootDemo
 * @Date: 2018/12/7 14:44
 * @Author: LiJc
 * @Description:
 */
public interface ISecUserService {
    /**
     * 创建用户
     * @param SecUserModel
     * @return
     */
    public boolean crateUser(SecUserModel SecUserModel);

    /**
     * 查询所有用户
     * @return
     */
    public List<SecUserModel> queryAllUser();
}
