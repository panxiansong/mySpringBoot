package com.pxs.sys.dao.db1;

import com.pxs.sys.core.universal.Mapper;
import com.pxs.sys.model.UserRole;

import java.util.List;


public interface UserRoleMapper extends Mapper<UserRole> {

    List<String> getRolesByUserId(String userId);
}