SELECT o.staffNo,s.name, o.orderTime, SUM(f.unitPrice*o.quantity) AS Price
FROM Orders o
JOIN Staffs s ON o.staffNo= s.staffNo
JOIN Foods f ON o.foodID = f.foodID
WHERE o.orderTime BETWEEN '2025-02-20'AND'2025-02-20 23:59:59'
GROUP BY o.staffNo ,s.name, o.orderTime

	SELECT f.description,f.unitPrice,o.quantity,o.orderTime
	FROM Orders o
	JOIN Staffs s ON o.staffNo= s.staffNo
	JOIN Foods f ON o.foodID = f.foodID
	WHERE o.orderTime  ='2025-02-20 10:02:01.000' AND o.staffNo= 2

