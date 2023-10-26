package com.Product.Catalog.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "catalog")
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "productname")
    private String ProductName;

    @Column(name = "Productdescription")
    private String Description;

    @Column(name = "category")
    private String Category;

    @Column(name = "brand")
    private String Brand;

    @Column(name = "price")
    private double Price;

    @Column(name = "currency")
    private String Currency;

    @Column(name = "weight")
    private float Weight;

    @Column(name = "dimension")
    private String Dimensions;

    @Column(name = "stockquantity")
    private int Stock_Quantity;
    @Column(name = "imgurl")
    private String ImgUrl;

}
