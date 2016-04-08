package PaymentApplicationDomain.ImplPackage;

/**
 * Created by Samkele on 4/8/2016.
 */
import PaymentApplicationDomain.ProdPackage.Product;
import PaymentApplicationDomain.ProdPackage.HomeProd;
import PaymentApplicationDomain.ProdPackage.ElectricalProd;
import PaymentApplicationDomain.ProdPackage.FoodProd;

public class ProductFactory{

    public static String getProduct(int value){
        Product prodChain = setUpChain();
        return prodChain.cashierProcess(value);
    }

    public static Product setUpChain(){
        Product home =  new HomeProd();
        Product elect = new ElectricalProd();
        Product food = new FoodProd();
        home.setNextProduct(elect);
        elect.setNextProduct(food);
        return home;
    }

}
