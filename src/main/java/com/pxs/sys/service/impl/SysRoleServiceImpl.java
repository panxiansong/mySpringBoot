package com.pxs.sys.service.impl;

import com.pxs.sys.dao.db1.SysRoleMapper;
import com.pxs.sys.model.SysRole;
import com.pxs.sys.service.SysRoleService;
import com.pxs.sys.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: SysRoleService接口实现类
* @author 张瑶
* @date 2018/05/25 23:01
*/
@Service
public class SysRoleServiceImpl extends AbstractService<SysRole> implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

}