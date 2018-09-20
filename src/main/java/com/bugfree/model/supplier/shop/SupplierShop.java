package com.bugfree.model.supplier.shop;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.bugfree.model.inventory.store.Store;
import com.bugfree.model.inventory.store.StoreFeature;

@Entity
@Table(name="supplier_shop")
public class SupplierShop {
	
	@Id
	@GeneratedValue
	private int supplierShopId;
	
	private String shopName;
	private String shopContactNo;
	
	@Temporal(TemporalType.TIME)
	private Date shopOpeningTime;
	
	@Temporal(TemporalType.TIME)
	private Date shopClosingTime;
	
	private String shopTheme;
	
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	
	private boolean monday;
	private boolean tuesday;
	private boolean wednesday;
	private boolean thursday;
	private boolean friday;
	private boolean saturday;
	private boolean sunday;
	@Column(length=255)
	private String supplierNote;
	
	@OneToOne
	@JoinColumn(name="store_feature")
	private StoreFeature storeFeature;
	
	
	public String getSupplierNote() {
		return supplierNote;
	}
	public void setSupplierNote(String supplierNote) {
		this.supplierNote = supplierNote;
	}
	public int getSupplierShopId() {
		return supplierShopId;
	}
	public void setSupplierShopId(int supplierShopId) {
		this.supplierShopId = supplierShopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopContactNo() {
		return shopContactNo;
	}
	public void setShopContactNo(String shopContactNo) {
		this.shopContactNo = shopContactNo;
	}
	
	public Date getShopOpeningTime() {
		return shopOpeningTime;
	}
	public void setShopOpeningTime(Date shopOpeningTime) {
		this.shopOpeningTime = shopOpeningTime;
	}
	public Date getShopClosingTime() {
		return shopClosingTime;
	}
	public void setShopClosingTime(Date shopClosingTime) {
		this.shopClosingTime = shopClosingTime;
	}
	public boolean isMonday() {
		return monday;
	}
	public void setMonday(boolean monday) {
		this.monday = monday;
	}
	public boolean isTuesday() {
		return tuesday;
	}
	public void setTuesday(boolean tuesday) {
		this.tuesday = tuesday;
	}
	public boolean isWednesday() {
		return wednesday;
	}
	public void setWednesday(boolean wednesday) {
		this.wednesday = wednesday;
	}
	public boolean isThursday() {
		return thursday;
	}
	public void setThursday(boolean thursday) {
		this.thursday = thursday;
	}
	public boolean isFriday() {
		return friday;
	}
	public void setFriday(boolean friday) {
		this.friday = friday;
	}
	public boolean isSaturday() {
		return saturday;
	}
	public void setSaturday(boolean saturday) {
		this.saturday = saturday;
	}
	public boolean isSunday() {
		return sunday;
	}
	public void setSunday(boolean sunday) {
		this.sunday = sunday;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public StoreFeature getStoreFeature() {
		return storeFeature;
	}
	public void setStoreFeature(StoreFeature storeFeature) {
		this.storeFeature = storeFeature;
	}
	public String getShopTheme() {
		return shopTheme;
	}
	public void setShopTheme(String shopTheme) {
		this.shopTheme = shopTheme;
	}
	
	
}
