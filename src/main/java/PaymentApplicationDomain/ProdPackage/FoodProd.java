package PaymentApplicationDomain.ProdPackage;

/**
 * Created by Samkele on 4/8/2016.
 */
public class FoodProd extends Product{
    @Override
    public String cashierProcess(int request){
        if(request > 500 & request < 750){
            return "Food Product";
        }
        else{
            if (nextProduct != null){
                return nextProduct.cashierProcess(request);
            }
            return "No Product";
        }
    }
}
