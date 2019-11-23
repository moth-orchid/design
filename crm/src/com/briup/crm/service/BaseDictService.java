package com.briup.crm.service;

import java.util.List;

import com.briup.crm.domain.BaseDict;

public interface BaseDictService {

	List<BaseDict> findByTypeCode(String dict_type_code);

}
