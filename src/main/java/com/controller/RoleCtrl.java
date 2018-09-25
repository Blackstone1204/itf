package com.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.config.WebSecurityConfig;
import com.model.Account;
import com.model.Auth;
import com.model.ParamInfo;
import com.model.Role;
import com.serviceimpl.AccountService;
import com.serviceimpl.AuthService;
import com.serviceimpl.ParamInfoService;
import com.serviceimpl.RoleService;
import com.utils.IdGenerator;
import com.utils.JwtUtil;

import entity.Response;
import entity.RoleEntity;

@RestController
public class RoleCtrl {
	
	@Autowired
	private RoleService roleService;
	@Autowired
	private AuthService authService;
	@Autowired
	private IdGenerator gen;
	
	@PostMapping("/api/role/add")
	public Response addRole(@RequestBody RoleEntity roleEntity){
		
		String id=gen.getMd5Id();
		
		Role role=new Role();
		role.setId(id);
		role.setRoleName(roleEntity.getRoleName());
		
		roleService.addRole(role);
		
		String authId=gen.getMd5Id();
		Auth auth=new Auth();
		auth.setId(authId);
		auth.setRoleId(id);
		auth.setCanAddSelf(roleEntity.getCanAddSelf());
		auth.setCanReadOther(roleEntity.getCanReadOther());
		auth.setCanReadSelf(roleEntity.getCanReadSelf());
		auth.setCanEditSelf(roleEntity.getCanEditSelf());
		auth.setCanEditOther(roleEntity.getCanEditSelf());
		auth.setCanDelSelf(roleEntity.getCanDelSelf());
		auth.setCanDelOther(roleEntity.getCanDelOther());
		authService.addAuth(auth);
		
		return new Response(1,String.format("添加角色%s成功",roleEntity.getRoleName()),id);
		
	}
	
	@GetMapping("/api/role/queryAll")
	public Response queryAll(){
		List<RoleEntity> result=new ArrayList<RoleEntity>();
		List<Role> roles=roleService.queryAll();
		for(Role role:roles){
			String roleId=role.getId();
			Auth auth=authService.queryByRoleId(roleId).get(0);
			RoleEntity et=new RoleEntity();
			
			et.setRoleId(roleId);
			et.setRoleName(role.getRoleName());
			et.setCanAddSelf(auth.getCanAddSelf());
			et.setCanReadSelf(auth.getCanReadSelf());
			et.setCanReadOther(auth.getCanReadOther());
			et.setCanEditOther(auth.getCanEditOther());
			et.setCanEditSelf(auth.getCanEditSelf());
			et.setCanDelOther(auth.getCanDelOther());
			et.setCanDelSelf(auth.getCanDelSelf());
			
			result.add(et);
		}
		
		return new Response(1,"查询所有角色相关信息",result);
		
	}
	
	
	
	@PostMapping("/api/role/update")
	public Response updateRole(@RequestBody RoleEntity roleEntity){
		Auth auth=new Auth();
		Role role=new Role();
		role.setId(roleEntity.getRoleId());
		role.setRoleName(roleEntity.getRoleName());
		roleService.updateRole(role);
		
		auth.setRoleId(roleEntity.getRoleId());
		auth.setCanAddSelf(roleEntity.getCanAddSelf());
		auth.setCanReadSelf(roleEntity.getCanReadSelf());
		auth.setCanReadOther(roleEntity.getCanReadOther());
		auth.setCanEditOther(roleEntity.getCanEditOther());
		auth.setCanEditSelf(roleEntity.getCanEditSelf());
		auth.setCanDelOther(roleEntity.getCanDelOther());
		auth.setCanDelSelf(roleEntity.getCanDelSelf());
		authService.updateAuth(auth);
		
	return null;
	}
	
	
	@PostMapping("/api/role/del")
	public Response del(String id){
		
		roleService.delRoleById(id);
		
		return new Response(1,"删除角色成功",id);
		
	}
	
	
	
	
	

}
