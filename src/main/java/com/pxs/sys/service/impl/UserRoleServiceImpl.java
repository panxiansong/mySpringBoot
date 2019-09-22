package com.pxs.sys.service.impl;

import com.pxs.sys.dao.db1.UserRoleMapper;
import com.pxs.sys.model.UserRole;
import com.pxs.sys.service.UserRoleService;
import com.pxs.sys.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: UserRoleService接口实现类
* @author 张瑶
* @date 2018/05/25 23:27
*/
@Service
public class UserRoleServiceImpl extends AbstractService<UserRole> implements UserRoleService {

    @Resource
    private UserRoleMapper userRoleMapper;

    public List<String> getRolesByUserId(String userId){
        return userRoleMapper.getRolesByUserId(userId);
    }

}