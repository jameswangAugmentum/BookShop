package org.nxum.medicine.view.entity;
import java.sql.Date;
public class UpdateCartOfProduct {
	private  Integer	id ; 
	private  String 	description;
	private  Integer hot;
	private  Date hotTime;
	private  String   name;
	private  Double  price;
	private  String picture;
	private  Integer specialPrice;
	private  Date specialPriceTime;
	private  Integer stock;
	private   Integer bigtypeId;
	private Integer  smallTypeId;
	private Integer  productCount;
	private Double  productSubtotal;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getHot() {
		return hot;
	}
	public void setHot(Integer hot) {
		this.hot = hot;
	}
	public Date getHotTime() {
		return hotTime;
	}
	public void setHotTime(Date hotTime) {
		this.hotTime = hotTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getSpecialPrice() {
		return specialPrice;
	}
	public void setSpecialPrice(Integer specialPrice) {
		this.specialPrice = specialPrice;
	}
	public Date getSpecialPriceTime() {
		return specialPriceTime;
	}
	public void setSpecialPriceTime(Date specialPriceTime) {
		this.specialPriceTime = specialPriceTime;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getBigtypeId() {
		return bigtypeId;
	}
	public void setBigtypeId(Integer bigtypeId) {
		this.bigtypeId = bigtypeId;
	}
	public Integer getSmallTypeId() {
		return smallTypeId;
	}
	public void setSmallTypeId(Integer smallTypeId) {
		this.smallTypeId = smallTypeId;
	}
	public Integer getProductCount() {
		return productCount;
	}
	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	public Double getProductSubtotal() {
		return productSubtotal;
	}
	public void setProductSubtotal(Double productSubtotal) {
		this.productSubtotal = productSubtotal;
	}
	@Override
	public String toString() {
		return "UpdateCartOfProduct [id=" + id + ", description=" + description
				+ ", hot=" + hot + ", hotTime=" + hotTime + ", name=" + name
				+ ", price=" + price + ", picture=" + picture
				+ ", specialPrice=" + specialPrice + ", specialPriceTime="
				+ specialPriceTime + ", stock=" + stock + ", bigtypeId="
				+ bigtypeId + ", smallTypeId=" + smallTypeId
				+ ", productCount=" + productCount + ", productSubtotal="
				+ productSubtotal + "]";
	}
}
