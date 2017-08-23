package com.oojunzi.app.web.service;

import java.util.List;

import com.oojunzi.app.core.generic.GenericService;
import com.oojunzi.app.web.model.Role;
import com.oojunzi.app.web.model.RoleExample;

/**
 * 角色 业务接口
 * 
 * @author michael
 * @since 2016年6月10日 下午4:15:01
 **/
public interface RoleService extends GenericService<Role, Long> {
    /**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);

	List<Role> selectByExample(RoleExample rxExample);
}
