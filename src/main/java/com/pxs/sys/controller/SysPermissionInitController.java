package com.pxs.sys.controller;

import com.pxs.sys.core.ret.RetResponse;
import com.pxs.sys.core.ret.RetResult;
import com.pxs.sys.core.utils.ApplicationUtils;
import com.pxs.sys.model.SysPermissionInit;
import com.pxs.sys.service.SysPermissionInitService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: SysPermissionInitController类
* @author 张瑶
* @date 2018/05/18 14:37
*/
@RestController
@RequestMapping("/sysPermissionInit")
public class SysPermissionInitController {

    @Resource
    private SysPermissionInitService sysPermissionInitService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(SysPermissionInit sysPermissionInit) throws Exception{
		sysPermissionInit.setId(ApplicationUtils.getUUID());
    	Integer state = sysPermissionInitService.insert(sysPermissionInit);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = sysPermissionInitService.deleteById(id);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/update")
    public RetResult<Integer> update(SysPermissionInit sysPermissionInit) throws Exception {
        Integer state = sysPermissionInitService.update(sysPermissionInit);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/selectById")
    public RetResult<SysPermissionInit> selectById(@RequestParam String id) throws Exception {
        SysPermissionInit sysPermissionInit = sysPermissionInitService.selectById(id);
        return RetResponse.makeOKRsp(sysPermissionInit);
    }

    /**
	* @Description: 分页查询
	* @param page 页码
	* @param size 每页条数
	* @Reutrn RetResult<PageInfo<SysPermissionInit>>
	*/
    @PostMapping("/list")
    public RetResult<PageInfo<SysPermissionInit>> list(@RequestParam(defaultValue = "0") Integer page,
					@RequestParam(defaultValue = "0") Integer size) throws Exception {
        PageHelper.startPage(page, size);
        List<SysPermissionInit> list = sysPermissionInitService.selectAll();
        PageInfo<SysPermissionInit> pageInfo = new PageInfo<SysPermissionInit>(list);
        return RetResponse.makeOKRsp(pageInfo);
    }
}