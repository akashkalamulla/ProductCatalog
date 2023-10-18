package com.Product.Catalog.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;
    @Column(name = "productname")
    private String ProductName;
    @Column(name = "description")
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
    private int Weight;
    @Column(name = "dimension")
    private String Dimensions;
    @Column(name = "stockquantity")
    private int Stock_Quantity;
    @Column(name = "supplier")
    private String Supplier;
    @Column(name = "imgurls")
    private String ImgUrls;
    @Column(name = "feature")
    private String Features;
    @Column(name = "tags")
    private String Tags;
    @Column(name = "reviewrate")
    private float ReviewRate;
    @Column(name = "numreview")
    private int NumReviews;

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getProduct_Id() {
        return ProductId;
    }

    public void setProduct_Id(int product_Id) {
        ProductId = product_Id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String getDimensions() {
        return Dimensions;
    }

    public void setDimensions(String dimensions) {
        Dimensions = dimensions;
    }

    public int getStock_Quantity() {
        return Stock_Quantity;
    }

    public void setStock_Quantity(int stock_Quantity) {
        Stock_Quantity = stock_Quantity;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String supplier) {
        Supplier = supplier;
    }

    public String getImgUrls() {
        return ImgUrls;
    }

    public void setImgUrls(String imgUrls) {
        ImgUrls = imgUrls;
    }

    public String getFeatures() {
        return Features;
    }

    public void setFeatures(String features) {
        Features = features;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public float getReviewRate() {
        return ReviewRate;
    }

    public void setReviewRate(float reviewRate) {
        ReviewRate = reviewRate;
    }

    public int getNumReviews() {
        return NumReviews;
    }

    public void setNumReviews(int numReviews) {
        NumReviews = numReviews;
    }
}
