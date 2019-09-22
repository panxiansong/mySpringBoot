package com.pxs.sys.service.impl;

import com.pxs.sys.dao.db1.SysPermMapper;
import com.pxs.sys.model.SysPerm;
import com.pxs.sys.service.SysPermService;
import com.pxs.sys.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: SysPermService接口实现类
* @author 张瑶
* @date 2018/05/26 00:30
*/
@Service
public class SysPermServiceImpl extends AbstractService<SysPerm> implements SysPermService {

    @Resource
    private SysPermMapper sysPermMapper;

}