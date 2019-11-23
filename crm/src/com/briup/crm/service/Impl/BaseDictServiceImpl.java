package com.briup.crm.service.Impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.briup.crm.dao.BaseDictDao;
import com.briup.crm.domain.BaseDict;
import com.briup.crm.service.BaseDictService;
@Transactional
public class BaseDictServiceImpl implements BaseDictService{
	private BaseDictDao baseDictDao;
	public void setBaseDictDao(BaseDictDao baseDictDao) {
		this.baseDictDao = baseDictDao;
	}
	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		return baseDictDao.findByTypeCode(dict_type_code);
		
	}
	
}
