package com.pxs.sys.service.impl;

import com.pxs.sys.dao.db1.RolePermMapper;
import com.pxs.sys.model.RolePerm;
import com.pxs.sys.service.RolePermService;
import com.pxs.sys.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: RolePermService接口实现类
* @author 张瑶
* @date 2018/05/26 00:35
*/
@Service
public class RolePermServiceImpl extends AbstractService<RolePerm> implements RolePermService {

    @Resource
    private RolePermMapper rolePermMapper;

    public List<String> getPermsByUserId(String userId){
        return rolePermMapper.getPermsByUserId(userId);
    }

}