import java.util.ArrayList;
import java.util.List;

public class ProductManager {
   private List<Product> productList;
    public ProductManager(){
        this.productList=new ArrayList<>();
    }
    public void addProduct(Product product){

        boolean exists = false;
        for (Product prod : productList) {
            if (prod.getId() == product.getId()) {
                updateStock(product.getId(), product.getStockQuantity());
                exists = true;
                break;
            }
        }
        if (!exists) {
            productList.add(product);
        }
    }

    public void removeProduct(int productId){
        for (Product product:productList){
            if (productId==product.getId()){
                productList.remove(product);
                break;
            }
        }
    }

    public void viewAllProducts(){
        for (Product product:productList){
            System.out.println(product);
        }
    }
    public void updateStock(int productId, int newStock) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                product.setStockQuantity(newStock);

                break;
            }
        }
    }
    public List<Product> getAllProducts(){
        return productList;
    }




}
