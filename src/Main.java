import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        CustomerManager customerManager = new CustomerManager();
        OrderManager orderManager = new OrderManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add a new product");
            System.out.println("2. Remove a product");
            System.out.println("3. View all products");
            System.out.println("4. Add a new customer");
            System.out.println("5. Remove a customer");
            System.out.println("6. View all customers");
            System.out.println("7. Create a new order");
            System.out.println("8. View all orders");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addNewProduct(scanner, productManager);
                    break;
                case 2:
                    removeProduct(scanner, productManager);
                    break;
                case 3:
                    productManager.viewAllProducts();
                    break;
                case 4:
                    addNewCustomer(scanner, customerManager);
                    break;
                case 5:
                    removeCustomer(scanner, customerManager);
                    break;
                case 6:
                    customerManager.viewAllCutomers();
                    break;
                case 7:
                    createNewOrder(scanner, orderManager, customerManager, productManager);
                    break;
                case 8:
                    orderManager.viewAllOrders();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);
        scanner.close();
    }


    private static void addNewProduct(Scanner scanner, ProductManager productManager) {
        System.out.println("Enter product details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Stock Quantity: ");
        int stockQuantity = scanner.nextInt();

        Product product = new Product(id, name, description, price, stockQuantity);
        productManager.addProduct(product);
        System.out.println("Product added successfully!");
    }

    private static void removeProduct(Scanner scanner, ProductManager productManager) {
        System.out.print("Enter the ID of the product to remove: ");
        int productId = scanner.nextInt();
        productManager.removeProduct(productId);
        System.out.println("Product removed successfully!");
    }

    private static void addNewCustomer(Scanner scanner, CustomerManager customerManager) {
        System.out.println("Enter customer details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, email, address);
        customerManager.addCustomer(customer);
        System.out.println("Customer added successfully!");
    }

    private static void removeCustomer(Scanner scanner, CustomerManager customerManager) {
        System.out.print("Enter the ID of the customer to remove: ");
        int customerId = scanner.nextInt();
        customerManager.removeCustomer(customerId);
        System.out.println("Customer removed successfully!");
    }

    private static void createNewOrder(Scanner scanner, OrderManager orderManager, CustomerManager customerManager, ProductManager productManager) {
        System.out.println("Enter order details:");
        System.out.print("Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        Customer customer = findCustomer(customerManager, customerId);
        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        List<Product> products = selectProducts(scanner, productManager);
        Order order = new Order(orderId, customer, products);
        orderManager.addOrder(order);
        System.out.println("Order created successfully!");
    }


    private static Customer findCustomer(CustomerManager customerManager, int customerId) {
        List<Customer> customers = customerManager.getAllCustomers();
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    private static List<Product> selectProducts(Scanner scanner, ProductManager productManager) {
        List<Product> products = new ArrayList<>();
        System.out.println("Select products (enter product IDs, -1 to finish):");
        while (true) {
            System.out.print("Product ID: ");
            int productId = scanner.nextInt();
            if (productId == -1) {
                break;
            }
            Product product = getProductById(productManager, productId);
            if (product != null) {
                products.add(product);
            } else {
                System.out.println("Product not found!");
            }
        }
        return products;
    }


    private static Product getProductById(ProductManager productManager, int productId) {
        List<Product> products = productManager.getAllProducts();
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }


}