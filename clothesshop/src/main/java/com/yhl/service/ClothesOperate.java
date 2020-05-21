package com.yhl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhl.dao.ClothesDao;
import com.yhl.entity.Clothes;
import com.yhl.entity.Consumer;
import com.yhl.entity.RealShopCart;
import com.yhl.entity.Seller;
import com.yhl.entity.ShopCart;
import com.yhl.entity.ShopCartClothes;
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

	@Override
	public List<Clothes> selectAllClothesIndex() {
		List<Clothes> clothesList=clothesDao.selectAllClothesIndex();
		return clothesList;
	}

	@Override
	public List<Clothes> showDuanXiu(Sort sort) {
		List<Clothes> clothesList=clothesDao.showDuanXiu(sort);
		return clothesList;
	}

	@Override
	public List<Clothes> showFengYi(Sort sort) {
		List<Clothes> clothesList=clothesDao.showFengYi(sort);
		return clothesList;
	}

	@Override
	public List<Clothes> showMianYi(Sort sort) {
		List<Clothes> clothesList=clothesDao.showMianYi(sort);
		return clothesList;
	}

	@Override
	public List<Clothes> showKuZi(Sort sort) {
		List<Clothes> clothesList=clothesDao.showKuZi(sort);
		return clothesList;
	}

	@Override
	public Clothes queryClothesById(Integer clothesId) {
		Clothes clothes=clothesDao.queryClothesById(clothesId);
		return clothes;
	}

	@Override
	public Seller querySellerById(Seller sellerId) {
		Seller seller=clothesDao.querySellerById(sellerId);
		return seller;
	}

	@Override
	public Sort querySortById(Sort sortId) {
		Sort sort=clothesDao.querySortById(sortId);
		return sort;
	}
	
	//添加购物车
	@Override
	public void addCart(Integer clothesId, Integer consumerId, Integer count) {
		System.out.println(clothesId);
		//首先判断是否该人已经有购物车
		ShopCart shopCart=clothesDao.selectShopCart(consumerId);
		//1:没有购物车
		if(shopCart==null) {
			shopCart=new ShopCart();
			Consumer consumer=new Consumer();
			consumer.setConsumerId(consumerId);
			shopCart.setConsumerId(consumer);
			//将购物车放到数据库中
			clothesDao.insertShopCart(shopCart);
			//再次查询数据库
			ShopCart shopCart1=clothesDao.selectShopCart(consumerId);
			//将服装放入购物车中
			ShopCartClothes shopCartClothes=new ShopCartClothes();
			shopCartClothes.setCount(count);
			shopCartClothes.setShopCart(shopCart1);
			Clothes clothes=new Clothes();
			clothes.setClothesId(clothesId);
			shopCartClothes.setClothes(clothes);
			clothesDao.addClothesToShop(shopCartClothes);
		}
		//该顾客已经存在购物车
		else {
			System.out.println("jjjj");
			//直接将服装放入购物车中
			//此处判断是否购物车中是否已经有该服装
			System.out.println(consumerId+""+clothesId);
			Integer c1=clothesDao.selectClothesByClothesId(clothesId,consumerId);
			System.out.println(c1);
			if(c1==null) {
				System.out.println("kkkkk");
				ShopCartClothes shopCartClothes1=new ShopCartClothes();
				shopCartClothes1.setCount(count);
				shopCartClothes1.setShopCart(shopCart);
				Clothes clothes=new Clothes();
				clothes.setClothesId(clothesId);
				shopCartClothes1.setClothes(clothes);
				clothesDao.addClothesToShop(shopCartClothes1);
			}
			else {
				System.out.println("kkhiu");
				/* ShopCartClothes s1=clothesDao.selectCount(c1,clothesId); */
				
			}
		}
	}

	@Override
	public List<RealShopCart> sellectShopCart(Integer consumerId) {
		List<RealShopCart> list=clothesDao.sellectShopCart(consumerId) ;
		return list;
	}
	
	
}
