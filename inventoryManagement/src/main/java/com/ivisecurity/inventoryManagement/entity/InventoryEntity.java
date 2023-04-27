package com.ivisecurity.inventoryManagement.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="inventory_modified")
public class InventoryEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productID")
	private Integer productID;
	
	@Column(length = 50, name="productSerialNo")
	private String productSerialNo;
	
	
	@Column(length = 200, name="productName")
	private String productName;
	
	@Column(length =200, name="ProductBrand")
	private String productBrand;
	
	@Column(length = 20, name="productCat")
	private String productCat;
	
	
	
	//@Column(name="createdBy")
	//private Integer createdBy;
	
	@Column(name="productDetails")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime productDetails;
	
	@Column(length = 20, name="siteDetails")
		private String siteDetails;
	
	//@Column(name="modifiedBy")
	//private Integer modifiedBy;
	
	//@Column(name="modifiedTime")
	//@JsonFormat(pattern = "yyyy-MM-dd")
	//private LocalDateTime modifiedTime;
	
	@Column(length = 1000, name="status")
	private String status;
	
	
}
