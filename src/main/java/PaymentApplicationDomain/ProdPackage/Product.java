package PaymentApplicationDomain.ProdPackage;

/**
 * Created by Samkele on 4/8/2016.
 */
public abstract class Product{
    Product nextProduct;

    public void setNextProduct(Product nextProduct){
        this.nextProduct = nextProduct;
    }

    public abstract String cashierProcess(int request);
}
