package com.yhl.dao;

import java.util.List;

import com.yhl.entity.Clothes;
import com.yhl.entity.Seller;
import com.yhl.entity.Sort;

public interface ClothesDao {

	List<Sort> selectAllSort();


	void addSort(Sort sort);


	void sortDelete(Sort sort);


	List<Seller> selectSeller(Seller seller);


	List<Clothes> selectAllClothes(Seller seller);
	
}