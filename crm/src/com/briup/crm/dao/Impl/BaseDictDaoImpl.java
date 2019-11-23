package com.briup.crm.dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.briup.crm.dao.BaseDictDao;
import com.briup.crm.domain.BaseDict;

public class BaseDictDaoImpl extends HibernateDaoSupport implements BaseDictDao{

	@Override
	public List<BaseDict> findByTypeCode(String dict_type_code) {
		//根据类型编码查询字典数据
		return (List<BaseDict>) this.getHibernateTemplate().find("from BaseDict where dict_type_code=?",dict_type_code);
	}

}
