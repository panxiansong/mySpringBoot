package com.pxs.sys.service;

import com.pxs.sys.model.SystemLog;
import com.pxs.sys.core.universal.Service;

import java.util.List;

/**
* @Description: SystemLogService接口
* @author 张瑶
* @date 2018/04/25 15:52
*/
public interface SystemLogService extends Service<SystemLog> {

    Integer insertByBatch(List<SystemLog> list);

}