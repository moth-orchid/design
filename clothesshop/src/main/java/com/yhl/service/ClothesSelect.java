package com.yhl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yhl.entity.Clothes;
import com.yhl.entity.RealShopCart;
import com.yhl.entity.Seller;
import com.yhl.entity.Sort;

@Service
public interface ClothesSelect {

	List<Sort> selectAllSort();

	void addSort(Sort sort);

	void sortDelete(Sort sort);

	List<Seller> selectSeller(Seller seller);

	List<Clothes> selectAllClothes(Seller seller);

	List<Clothes> selectAllClothesIndex();

	List<Clothes> showDuanXiu(Sort sort);

	List<Clothes> showFengYi(Sort sort);

	List<Clothes> showMianYi(Sort sort);

	List<Clothes> showKuZi(Sort sort);

	Clothes queryClothesById(Integer clothesId);

	Seller querySellerById(Seller sellerId);

	Sort querySortById(Sort sortId);

	void addCart(Integer clothesId, Integer consumerId, Integer count);

	List<RealShopCart> sellectShopCart(Integer consumerId);

	
}
