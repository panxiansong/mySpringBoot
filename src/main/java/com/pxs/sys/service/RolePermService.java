package com.pxs.sys.service;

import com.pxs.sys.model.RolePerm;
import com.pxs.sys.core.universal.Service;

import java.util.List;

/**
* @Description: RolePermService接口
* @author 张瑶
* @date 2018/05/26 00:35
*/
public interface RolePermService extends Service<RolePerm> {

    List<String> getPermsByUserId(String userId);

}