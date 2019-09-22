package com.pxs.sys.dao.db1;

import com.pxs.sys.core.universal.Mapper;
import com.pxs.sys.model.SystemLog;

import java.util.List;

public interface SystemLogMapper extends Mapper<SystemLog> {

    Integer insertByBatch(List<SystemLog> list);
}