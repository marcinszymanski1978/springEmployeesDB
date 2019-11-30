package hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainHibernate {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        Employees employee = new Employees("Test", "Test", "Test", "Test", 1000, 18 , new Date(), 1);
        employeeDao.saveEmployee(employee);
        List<Employees> employeesList = employeeDao.getEmployees();

        Employees employeeToUpdate = employeesList.get(0);
        employeeToUpdate.setSalary(1111);
        employeeDao.updateEmployees(employeeToUpdate);

        employeesList.forEach(System.out::println);

        PhoneDao phoneDao = new PhoneDao();
        Phones phones = new Phones("Sony", "Xperia 10", employee);
        phoneDao.savePhones(phones);
        Set<Phones> phonesList = new HashSet<>();
        phonesList.add(phones);
        employee.setPhones(phonesList);
        employeeDao.updateEmployees(employee);

        CarsDao carsDao = new CarsDao();
        Cars cars = new Cars();
        phoneDao.savePhones(phones);
        Set<Phones> phonesList = new HashSet<>();
        phonesList.add(phones);
        employee.setPhones(phonesList);
        employeeDao.updateEmployees(employee);



    }
}
