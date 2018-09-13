package com.service;

import java.util.List;

import com.model.ParamInfo;

public interface IParamInfoService {
	public void addParamInfo(ParamInfo info);
	public void delParamInfoById(String id);
	public void updateParamInfoById(ParamInfo info);
	public List<ParamInfo> queryParamInfoById(String id);

}
