package hibernate;

import hibernate.DAO.EmployeeDAO;
import hibernate.DAO.EmplyeeDAOImpl;

import java.util.List;

public class Application {
    public static void printList(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmplyeeDAOImpl();
        printList(employeeDAO.getAllEmployees());
        Employee employee = new Employee("Fedorova","Sveta", "female",19,1);
        int id = employeeDAO.addEmployee(employee);
        printList(employeeDAO.getAllEmployees());
        Employee employee2 = new Employee(id, "Sokolov", "Vasa", "male", 27, 2);
        employeeDAO.updateEmployee(employee2);
        printList(employeeDAO.getAllEmployees());
        System.out.println("UPDATED Employee with ID "+id+"  "+employeeDAO.getEmployeeByID(id));
        employeeDAO.deleteEmployee(employee2);
        printList(employeeDAO.getAllEmployees());
    }
}
