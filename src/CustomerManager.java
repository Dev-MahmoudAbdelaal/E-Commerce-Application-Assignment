import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private final List<Customer>customerList;

    public CustomerManager() {
        this.customerList = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void removeCustomer(int customerId){
        for (Customer customer:customerList){
            if (customerId==customer.getId()){
                customerList.remove(customer);
                break;
            }
        }
    }
    public void viewAllCutomers(){
        for (Customer customer:customerList){
            System.out.println(customer);
        }
    }
    public List<Customer> getAllCustomers(){
        return customerList;
    }
}
