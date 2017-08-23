package com.oojunzi.app.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oojunzi.app.core.generic.GenericDao;
import com.oojunzi.app.core.generic.GenericServiceImpl;
import com.oojunzi.app.web.dao.RoleMapper;
import com.oojunzi.app.web.model.Role;
import com.oojunzi.app.web.model.RoleExample;
import com.oojunzi.app.web.model.User;
import com.oojunzi.app.web.model.UserExample;
import com.oojunzi.app.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author michael
 * @since 2016年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }
	@Override
	public List<Role> selectByExample(RoleExample rxExample) {
		
		return roleMapper.selectByExample(rxExample);
	}

}
