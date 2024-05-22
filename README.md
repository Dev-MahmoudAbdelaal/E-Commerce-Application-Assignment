<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>🛒 E-Commerce Application Assignment 🛒</h1>
    <p><strong>📋 Objective:</strong></p>
    <p>Develop a simple eCommerce application using Object-Oriented Programming (OOP) principles in Java. The application should allow users to manage products, customers, and orders.</p>   
    <h2>🔧 Requirements:</h2>
    <h3>🏗️ Classes and Relationships:</h3>
    <ul>
        <li>
            <strong>🛍️ Product</strong>
            <ul>
                <li>Attributes: id, name, description, price, stockQuantity</li>
                <li>Methods: Constructors, getters, setters, toString()</li>
            </ul>
        </li>
        <li>
            <strong>👤 Customer</strong>
            <ul>
                <li>Attributes: id, name, email, address</li>
                <li>Methods: Constructors, getters, setters, toString()</li>
            </ul>
        </li>
        <li>
            <strong>📝 Order</strong>
            <ul>
                <li>Attributes: id, customer, productList (List of Product), totalAmount</li>
                <li>Methods: Constructors, getters, setters, calculateTotalAmount(), toString()</li>
            </ul>
        </li>
        <li>
            <strong>📦 OrderManager</strong>
            <ul>
                <li>Attributes: orderList (List of Order)</li>
                <li>Methods: addOrder(Order order), removeOrder(int orderId), viewAllOrders()</li>
            </ul>
        </li>
        <li>
            <strong>👥 CustomerManager</strong>
            <ul>
                <li>Attributes: customerList (List of Customer)</li>
                <li>Methods: addCustomer(Customer customer), removeCustomer(int customerId), viewAllCustomers()</li>
            </ul>
        </li>
        <li>
            <strong>🏷️ ProductManager</strong>
            <ul>
                <li>Attributes: productList (List of Product)</li>
                <li>Methods: addProduct(Product product), removeProduct(int productId), viewAllProducts(), updateStock(int productId, int newStock)</li>
            </ul>
        </li>
    </ul>
    <h2>🚀 Main Application:</h2>
    <p>Create a Main class with a main method to interact with the user. Implement a simple text-based menu to perform the following actions:</p>
    <ul>
        <li>➕ Add a new product</li>
        <li>❌ Remove a product</li>
        <li>📃 View all products</li>
        <li>➕ Add a new customer</li>
        <li>❌ Remove a customer</li>
        <li>📃 View all customers</li>
        <li>🆕 Create a new order</li>
        <li>📃 View all orders</li>
    </ul>
    <h2>📂 Project Structure:</h2>
    <p>The project should be organized into packages to separate different concerns:</p>
    <ul>
        <li><strong>model:</strong> Contains the Product, Customer, and Order classes.</li>
        <li><strong>manager:</strong> Contains the OrderManager, CustomerManager, and ProductManager classes.</li>
        <li><strong>main:</strong> Contains the Main class with the main method.</li>
    </ul>


</body>
</html>
