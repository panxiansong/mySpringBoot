package com.pxs.sys.dao.db1;

import com.pxs.sys.core.universal.Mapper;
import com.pxs.sys.model.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 张瑶
 * @Description:
 * @time 2018/4/18 11:54
 */
public interface UserInfoMapper extends Mapper<UserInfo>{

    List<UserInfo> selectAll(@Param("pageNumKey") int pageNum,
                                  @Param("pageSizeKey") int pageSize);
}
