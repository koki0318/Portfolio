package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.repository.ItemRepository;

@Service
public class TopService {

	@Autowired
	ItemRepository itemRepository;
	
	/**
	 *　商品情報取得用メソッド.
	 * @return　商品情報
	 */
	public List<Item> showTopPage(String name){
		if(name == null){
			List<Item> itemList = itemRepository.findAll();
			return itemList;
		} 
		List<Item> itemList = itemRepository.findByName(name);
		return itemList;
	}
}
