CREATE DATABASE FoodOrderingManagementSystem

CREATE TABLE Staffs (
	staffNo int PRIMARY KEY ,
	name VARCHAR(100) NOT NULL,
	telNo VARCHAR(12) NOT NULL,
	position VARCHAR(7) DEFAULT 'STAFF' CHECK (position IN('STAFF','MANAGER')),
	username VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL
);

CREATE TABLE Foods(
	foodID int PRIMARY KEY,
	description VARCHAR(100) ,
	category VARCHAR(100),
	image_path VARCHAR(1000),
	unitPrice DECIMAL(6,2) NOT NULL
);

CREATE TABLE Orders(
	OrderID int IDENTITY(1,1) PRIMARY KEY , 
	staffNo int,
	foodID int ,
	quantity int NOT NULL,
	tableNo int ,
	orderTime DateTime,
	FOREIGN KEY (staffNo) REFERENCES Staffs (staffNo)ON DELETE SET NULL ON UPDATE CASCADE,
	FOREIGN KEY (foodID) REFERENCES Foods (foodID) ON DELETE SET NULL ON UPDATE CASCADE
);
INSERT INTO Orders (staffNo, foodID, quantity, tableNo, orderTime) 
VALUES (1, 2, 3, 4, GETDATE());

Drop table Orders;
Drop table Foods;

