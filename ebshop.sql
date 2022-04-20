DROP DATABASE IF EXISTS ebshop;
CREATE DATABASE IF NOT EXISTS ebshop;
USE ebshop;
/*
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
    id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(255),
    `password` VARCHAR(255),
    `role` ENUM('ADMIN','USER')
);
*/

DROP TABLE IF EXISTS author;
CREATE TABLE IF NOT EXISTS author (
    author_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    author_name VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS publisher;
CREATE TABLE IF NOT EXISTS publisher (
    publisher_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    publisher_name VARCHAR(255)
);

DROP TABLE IF EXISTS category;
CREATE TABLE IF NOT EXISTS category (
    category_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(255) DEFAULT NULL
);


DROP TABLE IF EXISTS book;
CREATE TABLE IF NOT EXISTS book (
    book_id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL,
    unit_price DECIMAL(13,2) NOT NULL,
    units_in_stock INT NOT NULL,
    `status` BOOLEAN DEFAULT 1,
    author_id INT UNSIGNED,
    category_id INT UNSIGNED,
    publisher_id INT UNSIGNED,
    FOREIGN KEY (author_id) REFERENCES author(author_id),
    FOREIGN KEY (category_id) REFERENCES category(category_id),
    FOREIGN KEY (publisher_id) REFERENCES publisher(publisher_id)
);


DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer (
    customer_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `name` VARCHAR(255),
    email VARCHAR(255) NOT NULL UNIQUE KEY,
    address VARCHAR(255),
    phone VARCHAR(24)
);

DROP TABLE IF EXISTS orders;
CREATE TABLE IF NOT EXISTS orders (
    order_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	customer_id INT UNSIGNED,
    order_date DATETIME,
    `status` VARCHAR(10),
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);


DROP TABLE IF EXISTS order_details;
CREATE TABLE IF NOT EXISTS order_details (
    order_details_id BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    order_id INT UNSIGNED,
	book_id BIGINT UNSIGNED NOT NULL,
    unit_price DECIMAL(20,2) NOT NULL,
    quantity  INT UNSIGNED NOT NULL,
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (order_id) REFERENCES orders(order_id)
);





