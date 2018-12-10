package com.jc.iservice.sec.user;

import com.github.pagehelper.PageInfo;
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
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * @return
     */
    public PageInfo<List<SecUserModel>> queryAllUser(int pageNum, int pageSize);

    /**
     * 根据用户ID获取用户信息
     * @return
     */
    public SecUserModel getSecUserModel(String userId);
}
