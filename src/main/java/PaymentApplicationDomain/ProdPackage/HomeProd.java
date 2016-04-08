package PaymentApplicationDomain.ProdPackage;

/**
 * Created by Samkele on 4/8/2016.
 */
public class HomeProd extends Product{
    @Override
    public String cashierProcess(int request){
        if(request > 1000){
            return "Home Product";
        }
        else{
            if (nextProduct != null){
                return nextProduct.cashierProcess(request);
            }
            return "No Product";
        }
    }
}
