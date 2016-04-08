package PaymentApplicationDomain.ImplPackage;

import PaymentApplicationDomain.IPackage.Payable;

/**
 * Created by Samkele on 4/7/2016.
 */
public class InvoiceFactory implements Payable {

    private static InvoiceFactory invFactory = null;

    private InvoiceFactory(){

    }

    public static InvoiceFactory getInstance(){
        if(invFactory == null)
            invFactory = new InvoiceFactory();
        return invFactory;
    }

    public double getPaymentAmount() {
        double nje = 0;
        return nje;
    }

}
