package com.yhl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yhl.entity.Clothes;
import com.yhl.entity.RealShopCart;
import com.yhl.entity.Seller;
import com.yhl.entity.ShopCart;
import com.yhl.entity.ShopCartClothes;
import com.yhl.entity.Sort;

public interface ClothesDao {

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


	ShopCart selectShopCart(Integer consumerId);


	void insertShopCart(ShopCart shopCart);


	void addClothesToShop(ShopCartClothes shopCartClothes);


	List<RealShopCart> sellectShopCart(Integer consumerId);


	Integer selectClothesByClothesId(@Param("clothesId")Integer clothesId,@Param("consumerId")Integer consumerId);


	void updateCount(Integer count1, Integer clothesId, Integer shopCartId);


	
}
