package com.pxs.sys.service;

import com.pxs.sys.core.universal.Service;
import com.pxs.sys.model.UserInfo;

import java.util.List;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:56
 */
public interface UserInfoService extends Service<UserInfo>{

    List<UserInfo> selectAlla(int pageNum, int pageSize);

}
