# ProductCatalog

---

Product catalog microservice for an e-commerce application

## Database

```mysql
create database productcatalog;
use productcatalog;

CREATE TABLE catalog(
id INT AUTO_INCREMENT,
productid INT,
productname VARCHAR(255) NOT NULL,
Productdescription VARCHAR(255) NOT NULL,
category VARCHAR(255) NOT NULL,
brand VARCHAR(255) NOT NULL,
price double NOT NULL,
currency VARCHAR(255) NOT NULL,
weight INT NOT NULL,
dimension VARCHAR(255) NOT NULL,
stockquantity INT NOT NULL,
supplier VARCHAR(255) NOT NULL,
imgurls varchar(255) NOT NULL,
tags VARCHAR(255) NOT NULL,
reviewrate float NOT NULL,
numreview INT NOT NULL,
PRIMARY KEY (id)
);
```
INSERT INTO catalog (productid ,productname, Productdescription, category, brand, price, currency, weight, dimension, stockquantity, supplier, imgurls, tags, reviewrate, numreview)
VALUES
(232506,'samsundj4', 'Description for Product 1', 'medium budjet', 'smasung', 299.99, 'USD', 20, '10x5x3', 100, 'samsundhjx', 'image_url_1',  'Tag 1, Tag 2', 4.5, 50),
(232507,'iphone14', 'Description for Product 2', 'high budjet', 'apple', 49.99, 'USD', 1, '14x10x2', 200, 'porhxy', 'image_url_2', 'Tag 2, Tag 3', 4.0, 30),
(232508,'nokia36', 'Description for Product 3', 'low budjet', 'nokia', 79.99, 'USD', 3, '8x8x8', 75, 'dearyoy', 'image_url_3','Tag 4, Tag 5', 4.2, 65);

drop table catalog
