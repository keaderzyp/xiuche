package com.oojunzi.app.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.core.generic.GenericServiceImpl;
import com.oojunzi.app.web.dao.PermissionMapper;
import com.oojunzi.app.web.model.Permission;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.service.PermissionService;

/**
 * 权限Service实现类
 *
 * @author michael
 * @since 2016年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }

}
