package com.yhl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhl.dao.ClothesDao;

@Service
public class ClothesOperate implements ClothesSelect{
	@Autowired
	private ClothesDao clothesDao;
	
	
}
