package com.example.domain;

public class Item {

	/** id */
	private Integer id;
	/** 商品名 */
	private String name;
	/** 価格 */
	private Integer price;
	/** 画像リンク */
	private String img;

	public Item(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", img=" + img + "]";
	}
}
