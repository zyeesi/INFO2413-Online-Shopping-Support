CREATE DATABASE OSSdb;
USE OSSdb;

CREATE table Users (
	UserID VARCHAR(10) NOT NULL,
    UserPassword VARCHAR(20) NOT NULL
);

CREATE TABLE Orders (
    orderID INT NOT NULL,
    trackingNum VARCHAR(25) NOT NULL,
    orderDate DATE NOT NULL,
    orderPrice DECIMAL(10 , 2 ) NOT NULL,
    orderTotalItems INT NOT NULL,
    orderCompany VARCHAR(25) NOT NULL,
    orderStatus BOOL NOT NULL,
    PRIMARY KEY (orderID)
);

CREATE TABLE Order_Items (
    orderID INT NOT NULL,
    itemID INT NOT NULL,
    itemName VARCHAR(25) NOT NULL,
    itemPrice DECIMAL(10 , 2 ) NOT NULL,
    itemQuantity INT NOT NULL,
    itemDescription VARCHAR(225),
    itemStatus BOOL NOT NULL,
    FOREIGN KEY (orderID)
		REFERENCES Orders (orderID)
		ON UPDATE CASCADE
        ON DELETE CASCADE,
    PRIMARY KEY (itemID, orderID)
);

/*DROP DATABASE OSSdb;