package com.pxs.sys.service.impl;

import com.pxs.sys.dao.db1.SysPermissionInitMapper;
import com.pxs.sys.model.SysPermissionInit;
import com.pxs.sys.service.SysPermissionInitService;
import com.pxs.sys.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SysPermissionInitService接口实现类
* @author 张瑶
* @date 2018/05/18 14:37
*/
@Service
public class SysPermissionInitServiceImpl extends AbstractService<SysPermissionInit> implements SysPermissionInitService {

    @Resource
    private SysPermissionInitMapper sysPermissionInitMapper;

    @Override
    public List<SysPermissionInit> selectAllOrderBySort(){
        return sysPermissionInitMapper.selectAllOrderBySort();
    }

}