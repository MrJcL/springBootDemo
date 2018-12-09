package com.jc.service.sec.user;

import com.jc.dao.sec.user.SecUserDao;
import com.jc.iservice.sec.user.ISecUserService;
import com.jc.model.sec.user.SecUserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springBootDemo
 * @Date: 2018/12/7 14:49
 * @Author: LiJc
 * @Description:
 */
@Service
public class SecUserService implements ISecUserService {

    @Autowired
    private SecUserDao secUserDao;

    @Override
    public boolean crateUser(SecUserModel SecUserModel) {
       int i = this.secUserDao.insert(SecUserModel);
       return i > 0;
    }

    @Override
    public List<SecUserModel> queryAllUser() {
        return this.secUserDao.selectSecUserModels();
    }

    @Override
    public SecUserModel getSecUserModel(String userId) {
        SecUserModel secUserModel = this.secUserDao.getSecUserModel(userId);
        System.out.println(secUserModel.toString());
        return secUserModel;
    }


}
