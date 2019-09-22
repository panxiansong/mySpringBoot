package com.pxs.sys.service.impl;

import com.pxs.sys.dao.db2.UserLabelMapper;
import com.pxs.sys.model.UserLabel;
import com.pxs.sys.service.UserLabelService;
import com.pxs.sys.core.universal.AbstractService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: UserLabelService接口实现类
* @author 张瑶
* @date 2018/04/29 19:09
*/
@Service
public class UserLabelServiceImpl extends AbstractService<UserLabel> implements UserLabelService {

    @Resource
    private UserLabelMapper userLabelMapper;

}