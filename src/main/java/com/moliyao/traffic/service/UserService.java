package com.moliyao.traffic.service;/**
 * author:ChenYao
 * Date:2018/9/17
 * Time:10:57
 * File Introduction:
 **/

import com.moliyao.traffic.dao.UserMapper;
import com.moliyao.traffic.model.User;
import com.moliyao.traffic.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@program: Traffic
 *@description: 用户
 *@author: Chen Yao
 *@create: 2018-09-17 10:57
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     *
     * @Description: 通过ID获取
     * @param @param id
     * @param @return
     * @return User
     * @throws
     * @author BJC
     * @date 2016年7月13日
     *
     */

    public List<User> getList(){
        return userMapper.selectByExample(null);
    }

    public User findByName(String username){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(username);
        List<User> result = userMapper.selectByExample(userExample);
        if(result==null||result.size()==0){
            return null;
        }
        return result.get(0);
    }


}
