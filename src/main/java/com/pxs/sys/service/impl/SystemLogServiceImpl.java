package com.pxs.sys.service.impl;

import com.pxs.sys.dao.db1.SystemLogMapper;
import com.pxs.sys.model.SystemLog;
import com.pxs.sys.service.SystemLogService;
import com.pxs.sys.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SystemLogService接口实现类
* @author 张瑶
* @date 2018/04/25 15:52
*/
@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper systemLogMapper;

    @Override
    public Integer insertByBatch(List<SystemLog> list) {
        return systemLogMapper.insertByBatch(list);
    }
}