import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    List<Order> orderList;

    public OrderManager() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order){
        orderList.add(order);
    }
    public void removeOrder(int orderId){
        for (Order order:orderList){
            if(orderId==order.getId()){
                orderList.remove(order);
                break;
            }

        }
    }
    public void viewAllOrders(){
        for (Order order:orderList){
            System.out.println(order);
        }
    }


}
