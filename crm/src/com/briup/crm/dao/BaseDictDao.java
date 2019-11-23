package com.briup.crm.dao;

import java.util.List;

import com.briup.crm.domain.BaseDict;

/**
 * 字典的dao的接口
 * @author Administrator
 *
 */
public interface BaseDictDao {

	List<BaseDict> findByTypeCode(String dict_type_code);
	
}
