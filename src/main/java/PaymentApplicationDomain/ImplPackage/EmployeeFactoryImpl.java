package PaymentApplicationDomain.ImplPackage;

import PaymentApplicationDomain.EmpPackage.Employees;
import PaymentApplicationDomain.IPackage.EmployeeFactory;

import java.util.UUID;

/**
 * Created by Samkele on 4/7/2016.
 */
public class EmployeeFactoryImpl implements EmployeeFactory {
    private static EmployeeFactoryImpl empFactory = null;

    private EmployeeFactoryImpl(){

    }

    public static EmployeeFactoryImpl getInstance(){
        if(empFactory == null)
            empFactory = new EmployeeFactoryImpl();
        return empFactory;
    }

    public Employees createEmployee(String firstName, String lastName, String employeeNumber){
        Employees employee = new Employees
                .Builder()
                .id(UUID.randomUUID().toString())
                .firstName(firstName)
                .lastName(lastName)
                .employeeNumber(employeeNumber)
                .build();
        return employee;
    }
}
