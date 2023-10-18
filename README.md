# ProductCatalog
Aasesment 4 product catalog

#database 
create database catalog;
#use database 
use catalog;

#Query
CREATE TABLE product (
    productid INT AUTO_INCREMENT,
    productname VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    brand VARCHAR(255) NOT NULL,
    price double NOT NULL,
    currency VARCHAR(255) NOT NULL,
    weight INT NOT NULL,
    dimension VARCHAR(255) NOT NULL,
    stockquantity INT NOT NULL,
    supplier VARCHAR(255) NOT NULL,
    imgurls varchar(255) NOT NULL,
    features VARCHAR(255) NOT NULL,
    tags VARCHAR(255) NOT NULL,
    reviewrate float NOT NULL,
    numreview INT NOT NULL,
    PRIMARY KEY ( productid)
);

#insert dummy data
INSERT INTO product (productname, description, category, brand, price, currency, weight, dimension, stockquantity, supplier, imgurls, features, tags, reviewrate, numreview)
VALUES
    ('Product 1', 'Description for Product 1', 'Electronics', 'Brand A', 299.99, 'USD', 2, '10x5x3', 100, 'Supplier X', 'image_url_1', 'Feature 1, Feature 2', 'Tag 1, Tag 2', 4.5, 50),
    ('Product 2', 'Description for Product 2', 'Clothing', 'Brand B', 49.99, 'USD', 1, '14x10x2', 200, 'Supplier Y', 'image_url_2', 'Feature 3, Feature 4', 'Tag 2, Tag 3', 4.0, 30),
    ('Product 3', 'Description for Product 3', 'Home Decor', 'Brand C', 79.99, 'USD', 3, '8x8x8', 75, 'Supplier Z', 'image_url_3', 'Feature 5, Feature 6', 'Tag 4, Tag 5', 4.2, 65);

