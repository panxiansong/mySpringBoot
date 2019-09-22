package com.pxs.sys.dao.db1;

import com.pxs.sys.core.universal.Mapper;
import com.pxs.sys.model.RolePerm;

import java.util.List;

public interface RolePermMapper extends Mapper<RolePerm> {

    List<String> getPermsByUserId(String userId);
}