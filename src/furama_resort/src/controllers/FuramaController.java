package src.controllers;

import src.models.person.Employee;
import src.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {

    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static Scanner sc = new Scanner(System.in);
    static int choice;

    public void disPlayMainMenu() {
        System.out.println(
                "   1.Employee Management\n" +
                        "   2.Customer Management\n" +
                        "   3.Facility Management\n" +
                        "   4.Booking Management\n" +
                        "   5.Promotion Management\n" +
                        "   6.Exit\n" + "Enter your choice");
        choose();
    }

    public void choose() {
        choice = Integer.parseInt(sc.nextLine());
        while (choice < 1 || 6 < choice) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                employeeManagement();
                break;
            case 2:
                customerManagement();
                break;
            case 3:
                facilityManagement();
                break;
            case 4:
                bookKingManagement();
                break;
            case 5:
                promotionManagement();
                break;
            case 6:
                System.out.println("exist");
                break;
            default:
                break;
        }
    }

    public void employeeManagement() {
        System.out.println(
                        "1.Display list employees\n" +
                        "2.Add new employee\n" +
                        "3.Delete employee\n" +
                        "4.Edit employee\n" +
                        "5.Return main menu");
        choice = Integer.parseInt(sc.nextLine());
        while (choice < 0 || choice > 5) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                disPlayListEmployees();
                break;
            case 2:
                addNewEmployees();
                break;
            case 3:
                removeEmployees();
                break;
            case 4:
                editEmployees();
                break;
            case 5:
                disPlayMainMenu();
                break;
        }
    }

    public void disPlayListEmployees() {
        employeeService.disPlayEmployee();
    }
    public void addNewEmployees() {
        System.out.println("Enter code: ");
        String code = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter day of birth: ");
        String dayOfBirth = sc.nextLine();
        System.out.println("Enter gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter level: ");
        String level = sc.nextLine();
        System.out.println("Enter position: ");
        String position = sc.nextLine();
        System.out.println("Enter wage: ");
        int wage = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(code,name,dayOfBirth,gender,id,phoneNumber,email,level,position,wage);
        employeeService.add(employee);
    }

    public void removeEmployees() {
        System.out.println("Enter index remove: ");
        int indexRemove = Integer.parseInt(sc.nextLine());
        employeeService.remove(indexRemove);
    }

    public void editEmployees() {
        System.out.println("Enter index edit: ");
        int indexEdit = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new code: ");
        String code = sc.nextLine();
        System.out.println("Enter new name: ");
        String name = sc.nextLine();
        System.out.println("Enter new day of birth: ");
        String dayOfBirth = sc.nextLine();
        System.out.println("Enter new gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter new id: ");
        String id = sc.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter new email: ");
        String email = sc.nextLine();
        System.out.println("Enter new level: ");
        String level = sc.nextLine();
        System.out.println("Enter new position: ");
        String position = sc.nextLine();
        System.out.println("Enter new wage: ");
        int wage = Integer.parseInt(sc.nextLine());
        employeeService.edit(indexEdit,code,name,dayOfBirth,gender,id,phoneNumber,email,level,position,wage);
    }

    public void customerManagement() {
        System.out.println(
                "1.Display list customers\n" +
                "2.Add new customer\n" +
                "3.Edit customer\n" +
                "4.Return main menu");
        choice = Integer.parseInt(sc.nextLine());
        while (choice < 1 || choice > 4) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                displayListCustomers();
                break;
            case 2:
                addNewCustomer();
                break;
            case 3:
                editCustomer();
                break;
            case 4:
                disPlayMainMenu();
                break;
        }
    }

    public void displayListCustomers() {
        System.out.println("displayListCustomers()");
    }

    public void addNewCustomer() {
        System.out.println("addNewCustomer()");
    }

    public void editCustomer() {
        System.out.println("editCustomer()");
    }

    public void facilityManagement() {
        System.out.println(
                "1.Display list facility\n" +
                "2.Add new facility\n" +
                "3.Display list facility maintenance\n" +
                "4.Return main menu");
        choice = Integer.parseInt(sc.nextLine());
        while (choice < 0 || choice > 4) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                displayListFacility();
                break;
            case 2:
                addNewFacility();
                break;
            case 3:
                displayListFacilityMaintenance();
                break;
            case 4:
                disPlayMainMenu();
                break;
        }
    }

    public void displayListFacility() {
    }

    public void addNewFacility() {
    }

    public void displayListFacilityMaintenance() {

    }

    public void bookKingManagement() {
        System.out.println("1.Add new booking\n" +
                "2.Display list booking\n");
        choice = Integer.parseInt(sc.nextLine());
        while (choice < 1 || choice > 2) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                addNewBooking();
                break;
            case 2:
               displayListBooking();
                break;
        }

    }

    public void addNewBooking() {
    }

    public void displayListBooking() {
    }

    public void promotionManagement() {
        System.out.println(
                "1.Display list customers use service\n" +
                        "2.Display list customers get voucher\n" +
                        "3.Return main menu");
        choice = Integer.parseInt(sc.nextLine());
        while (choice < 1 || choice > 3) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                disPlayListCustomersUseService();
                break;
            case 2:
                disPlayListCustomersGetVoucher();
                break;
            case 3:
                disPlayMainMenu();
                break;
        }
    }

    public void disPlayListCustomersUseService() {
    }

    public void disPlayListCustomersGetVoucher() {
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.disPlayMainMenu();
    }
}
