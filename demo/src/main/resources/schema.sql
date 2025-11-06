DROP TABLE IF EXISTS products;

CREATE TABLE products(
    productNumber VARCHAR(100) PRIMARY KEY,
    productName VARCHAR(100),
    productDescription VARCHAR(300),
    price DOUBLE NOT NULL
)