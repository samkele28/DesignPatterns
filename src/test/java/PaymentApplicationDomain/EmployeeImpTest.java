package PaymentApplicationDomain;

import PaymentApplicationDomain.EmpPackage.Employees;
import PaymentApplicationDomain.IPackage.EmployeeFactory;
import PaymentApplicationDomain.ImplPackage.EmployeeFactoryImpl;
import junit.framework.Assert;
/**
 * Created by Samkele on 4/7/2016.
 */
public class EmployeeImpTest {
    private EmployeeFactory empFactory;

    @BeforeMethod
    public void setup() throws Exception {
        empFactory = EmployeeFactoryImpl.getInstance();
    }

    @Test
    public void testEmployeeCreation() throws Exception {
        Employees employee = empFactory.createEmployee("Lusindiso", "Besiti", "CPUT600216");
        Assert.assertEquals(employee.getEmployeeNumber(), "CPUT600216");
        Assert.assertEquals(employee.getLastName(), "Best");
        Assert.assertEquals(employee.getFirstName(), "Lusindiso");
        Assert.assertNotNull(employee.getId());
    }

    @Test
    public void testEmployeeUpdate() throws Exception {
        Employees employee = empFactory.createEmployee("Lusindiso", "Besiti", "CPUT600216");
        Assert.assertEquals(employee.getEmployeeNumber(), "CPUT600216");
        Assert.assertEquals(employee.getLastName(), "Best");
        Assert.assertEquals(employee.getFirstName(), "Lusindiso");
        Assert.assertNotNull(employee.getId());

        //Update LastName

        Employees updateEmployee = new Employees.Builder()
                .copy(employee)
                .lastName("Best")
                .build();

        Assert.assertEquals(updateEmployee.getLastName(), "Best");
        Assert.assertEquals(employee.getEmployeeNumber(), updateEmployee.getEmployeeNumber());
        Assert.assertEquals(employee.getFirstName(), updateEmployee.getFirstName());
        Assert.assertEquals(employee.getId(), updateEmployee.getId());
    }


}
