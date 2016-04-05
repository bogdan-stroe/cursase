package com.oracle.shopping.service;

import java.util.HashMap;
import java.util.Map;

import com.oracle.shopping.model.Item;

public class ShoppingCartServiceImpl implements ShoppingCartService {

	HashMap<Item, Integer> myCart = new HashMap<Item, Integer>();
	
	@Override
	public void addItem(Item newItem, int quantity) {
		myCart.put(newItem, Integer.valueOf(quantity));
	}

	@Override
	public void updateItem(Item item, int quantity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeItem(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public int computePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<Item, Integer> getShoppingCart() {
		// TODO Auto-generated method stub
		return null;
	}

}
