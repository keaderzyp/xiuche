package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.Permission;

/**
 * 权限 业务接口
 * 
 * @author michael
 * @since 2016年6月10日 下午12:02:39
 **/
public interface PermissionService extends GenericService<Permission, Long> {

    /**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);

}
