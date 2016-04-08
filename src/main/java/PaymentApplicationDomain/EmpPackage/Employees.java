package PaymentApplicationDomain.EmpPackage;

import java.io.Serializable;

/**
 * Created by Samkele on 4/7/2016.
 */
public class Employees implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private String firstName;
    private String lastName;
    private String employeeNumber;

    public String getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmployeeNumber(){
        return employeeNumber;
    }

    private Employees() {

    }

    private Employees(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employeeNumber = builder.employeeNumber;
    }

    public static class Builder {
        private String id;
        private String firstName;
        private String lastName;
        private String employeeNumber;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder firstName(String value) {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this;
        }

        public Builder employeeNumber(String value) {
            this.employeeNumber = value;
            return this;
        }

        public Builder copy(Employees value) {
            this.id = value.id;
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            this.employeeNumber = value.employeeNumber;
            return this;
        }

        public Employees build() {
            return new Employees (this);
        }
    }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Employees))
                return false;

            Employees employee = (Employees) o;

            if (getId() != null ? !getId().equals(employee.getId()) : employee.getId() != null)
                return false;
            if (getFirstName() != null ? !getFirstName().equals(employee.getFirstName()) : employee.getFirstName() != null)
                return false;
            if (getLastName() != null ? !getLastName().equals(employee.getLastName()) : employee.getLastName() != null)
                return false;
            return !(getEmployeeNumber() != null ? !getEmployeeNumber().equals(employee.getEmployeeNumber()) : employee.getEmployeeNumber() != null);

        }

        @Override
        public int hashCode() {
            int result = getId() != null ? getId().hashCode() : 0;
            result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
            result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
            result = 31 * result + (getEmployeeNumber() != null ? getEmployeeNumber().hashCode() : 0);
            return result;
        }


        //@Override
        /*public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Employees employee = (Employees) o;

            if (!id.equals(employee.id)) {
                return false;
            }
            return true;
        }*/

       // @Override
        /*public int hashCode(){
            return id.hashCode();
        }*/

}
