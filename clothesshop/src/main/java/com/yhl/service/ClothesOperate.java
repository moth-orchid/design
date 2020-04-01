package com.yhl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhl.dao.ClothesDao;
import com.yhl.entity.Clothes;
import com.yhl.entity.Seller;
import com.yhl.entity.Sort;

@Service
public class ClothesOperate implements ClothesSelect{
	@Autowired
	private ClothesDao clothesDao;

	@Override
	public List<Sort> selectAllSort() {
		List<Sort> sortList=clothesDao.selectAllSort();
		return sortList;
	}

	@Override
	public void addSort(Sort sort) {
		clothesDao.addSort(sort);
		
	}

	@Override
	public void sortDelete(Sort sort) {
		clothesDao.sortDelete(sort);
		
	}

	@Override
	public List<Seller> selectSeller(Seller seller) {
		return clothesDao.selectSeller(seller);
	}

	@Override
	public List<Clothes> selectAllClothes(Seller seller) {
		List<Clothes> clothesList=clothesDao.selectAllClothes(seller);
		return clothesList;
	}
	
	
}
