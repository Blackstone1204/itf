package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ParamInfoMapper;
import com.model.ParamInfo;
import com.service.IParamInfoService;
@Service
public class ParamInfoService implements IParamInfoService{

	@Autowired
	ParamInfoMapper pm;
	@Override
	public void addParamInfo(ParamInfo info) {
		// TODO Auto-generated method stub
		pm.insert(info);
		
	}

	@Override
	public void delParamInfoById(String id) {
		// TODO Auto-generated method stub
		pm.deleteByPrimaryKey(id);
		
	}

	@Override
	public void updateParamInfoById(ParamInfo info) {
		// TODO Auto-generated method stub
		
		pm.updateByPrimaryKey(info);
		
	}

	@Override
	public List<ParamInfo> queryParamInfoById(String id) {
		// TODO Auto-generated method stub
		
		return pm.selectByPrimaryKey(id);
		
		
	}

	@Override
	public List<ParamInfo> queryParamInfoByTargetId(String targetId) {
		// TODO Auto-generated method stub
		return pm.selectByTargetId(targetId);
	}

}
