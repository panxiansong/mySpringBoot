package com.pxs.sys.dao.db1;

import com.pxs.sys.core.universal.Mapper;
import com.pxs.sys.model.SysPermissionInit;

import java.util.List;

public interface SysPermissionInitMapper extends Mapper<SysPermissionInit> {

    List<SysPermissionInit> selectAllOrderBySort();
}