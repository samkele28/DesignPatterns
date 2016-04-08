package PaymentApplicationDomain.IPackage;

import PaymentApplicationDomain.EmpPackage.Employees;

/**
 * Created by Samkele on 4/7/2016.
 */
public interface EmployeeFactory {
    Employees createEmployee(String firstName, String lastName, String employeeNumber);
}
