package com.pxs.sys.service.impl;

import com.pxs.sys.core.ret.ServiceException;
import com.pxs.sys.core.universal.AbstractService;
import com.pxs.sys.dao.db1.UserInfoMapper;
import com.pxs.sys.model.UserInfo;
import com.pxs.sys.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:56
 */
@Service
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService{

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectById(String id){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        if(userInfo == null){
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }

    @Override
    public List<UserInfo> selectAlla(int pageNum, int pageSize) {
        return userInfoMapper.selectAll(pageNum,pageSize);
    }

}
