<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product API Test</title>
</head>
<body>
    <h2>Product REST API Test</h2>
    
    <h3>API:</h3>
    <ul>
        <li>GET /api/products - Get all products</li>
        <li>GET /api/products/{id} - Get product by ID</li>
        <li>POST /api/products - Create new product</li>
        <li>PUT /api/products/{id} - Update product</li>
        <li>DELETE /api/products/{id} - Delete product</li>
    </ul>
    
    <p>Use Postman</p>
    <p>Sample JSON for POST/PUT:</p>
    <pre>
{
    "id": 4,
    "name": "Headphones",
    "price": 2000
}
    </pre>
</body>
</html>