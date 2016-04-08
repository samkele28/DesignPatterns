package PaymentApplicationDomain.ProdPackage;

/**
 * Created by Samkele on 4/8/2016.
 */
public class ElectricalProd extends Product{
    @Override
    public String cashierProcess(int request){
        if(request > 750 & request < 1000){
            return "Electrical Appliance";
        }
        else{
            if (nextProduct != null){
                return nextProduct.cashierProcess(request);
            }
            return "No Product";
        }
    }
}
