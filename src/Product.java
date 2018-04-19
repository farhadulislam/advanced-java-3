public class Product {

    private int productId;
    private final String productName;
    private static int numberOfProducts = 0;

    public Product(int productId, String productName){

        this.productId = productId;
        this.productName = productName;
        numberOfProducts++;
    }

 public int getProductId() {
        return productId;
    }

   public void setProductId(int productId) {
        if(productId > 0) {
            this.productId = productId;
        }
   }

   public String getProductName() {
       return productName;
   }

   public void setProductName(String productName) {
       //this.productName = productName;
    }
}
