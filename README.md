# ProductCatalog

---

Product catalog microservice for an e-commerce application

## Database

```mysql
create database productcatalog;
use productcatalog;

CREATE TABLE catalog
(
    id                 INT AUTO_INCREMENT,
    productname        VARCHAR(50) NOT NULL,
    Productdescription VARCHAR(255) NOT NULL,
    category           VARCHAR(10) NOT NULL,
    brand              VARCHAR(30) NOT NULL,
    price              double       NOT NULL,
    currency           VARCHAR(3) NOT NULL,
    weight             FLOAT          NOT NULL,
    dimension          VARCHAR(20) NOT NULL,
    stockquantity      INT          NOT NULL,
    imgurl            varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO catalog (productname, Productdescription, category, brand, price, currency, weight, dimension,
                     stockquantity, imgurl)
VALUES (232506, 'samsundj4', 'Description for Product 1', 'medium budjet', 'smasung', 299.99, 'USD', 20, '10x5x3', 100,
        'samsundhjx', 'image_url_1', 'Tag 1, Tag 2', 4.5, 50),
       (232507, 'iphone14', 'Description for Product 2', 'high budjet', 'apple', 49.99, 'USD', 1, '14x10x2', 200,
        'porhxy', 'image_url_2', 'Tag 2, Tag 3', 4.0, 30),
       (232508, 'nokia36', 'Description for Product 3', 'low budjet', 'nokia', 79.99, 'USD', 3, '8x8x8', 75, 'dearyoy',
        'image_url_3', 'Tag 4, Tag 5', 4.2, 65);
```
