package src.controllers;

import src.models.facility.Room;
import src.models.facility.Villa;
import src.models.person.Customer;
import src.models.person.Employee;
import src.services.CustomerServiceImpl;
import src.services.EmployeeServiceImpl;
import src.services.FacilityServiceImpl;
import src.utils.Regex;

import java.util.Scanner;

public class FuramaController {
   private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
   private final CustomerServiceImpl customerService = new CustomerServiceImpl();
   private final FacilityServiceImpl facilityService = new FacilityServiceImpl();
   private final Scanner sc = new Scanner(System.in);
   private int choice;

    public void displayMainMenu() {
        System.out.println(
                "------- Main menu -------\n" +
                        "   1.Employee Management\n" +
                        "   2.Customer Management\n" +
                        "   3.Facility Management\n" +
                        "   4.Booking Management\n" +
                        "   5.Promotion Management\n" +
                        "   6.Exit\n" + "Enter your choice");
        chooseOption();
    }

    public void chooseOption() {

        choice = Integer.parseInt(sc.nextLine());
        while (choice < 1 || 6 < choice) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                runSystemEmployeeManagement();
                break;
            case 2:
                runSystemCustomerManagement();
                break;
            case 3:
                runSystemFacilityManagement();
                break;
            case 4:
                runSystemBookKingManagement();
                break;
            case 5:
                runSystemPromotionManagement();
                break;
            case 6:
                System.out.println("existed");
                break;
        }
    }

    public void runSystemEmployeeManagement() {
        System.out.println(
                "------ Employee Management ------\n" +
                        "   1.Display list employees\n" +
                        "   2.Add new employee\n" +
                        "   3.Delete employee\n" +
                        "   4.Edit employee\n" +
                        "   5.Return main menu\n" + "Enter your choice!");
        choice = Integer.parseInt(sc.nextLine());
        while (choice < 0 || choice > 5) {
            System.out.println("Not have this option, please choose again!");
            choice = Integer.parseInt(sc.nextLine());
        }
        switch (choice) {
            case 1:
                displayListEmployees();
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
                displayMainMenu();
                break;
        }
    }

    public void displayListEmployees() {
        System.out.println(employeeService.getEmployee());
    }

    public void addNewEmployees() {
        System.out.println("Enter code: ");
        String code = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        String dayOfBirth = Regex.enterAndCheckBirthDay();
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
        int wage = Regex.enterNumber();
        Employee employee = new Employee(code, name, dayOfBirth, gender, id, phoneNumber, email, level, position, wage);
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
        employeeService.edit(indexEdit, code, name, dayOfBirth, gender, id, phoneNumber, email, level, position, wage);
    }

    public void runSystemCustomerManagement() {
        System.out.println(
                "------ Customer Management ------\n" +
                        "   1.Display list customers\n" +
                        "   2.Add new customer\n" +
                        "   .Edit customer\n" +
                        "   4.Return main menu");
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
                displayMainMenu();
                break;
        }
    }

    public void displayListCustomers() {
        System.out.println(customerService.getCustomer());
    }

    public void addNewCustomer() {
        System.out.println("Enter code customer: ");
        String code = sc.nextLine();
        System.out.println("Enter name customer: ");
        String name = sc.nextLine();
        System.out.println("Enter day of birth customer: ");
        String dayOfBirth = sc.nextLine();
        System.out.println("Enter gender customer: ");
        String gender = sc.nextLine();
        System.out.println("Enter id customer: ");
        String id = sc.nextLine();
        System.out.println("Enter phone number customer: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter email customer: ");
        String email = sc.nextLine();
        System.out.println("Enter type customer: ");
        String type = sc.nextLine();
        System.out.println("Enter address customer: ");
        String address = sc.nextLine();
        customerService.add(new Customer(code, name, dayOfBirth, gender, id, phoneNumber, email, type, address));
    }

    public void editCustomer() {
        System.out.println("Enter index edit: ");
        int index = Integer.parseInt(sc.nextLine());
        System.out.println("Enter new code customer: ");
        String code = sc.nextLine();
        System.out.println("Enter new name customer: ");
        String name = sc.nextLine();
        String dayOfBirth = Regex.enterAndCheckBirthDay();
        System.out.println("Enter new gender customer: ");
        String gender = sc.nextLine();
        System.out.println("Enter new id customer: ");
        String id = sc.nextLine();
        System.out.println("Enter new phone number customer: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter new email customer: ");
        String email = sc.nextLine();
        System.out.println("Enter new type customer: ");
        String type = sc.nextLine();
        System.out.println("Enter new address customer: ");
        String address = sc.nextLine();
        customerService.edit(index, code, name, dayOfBirth, gender, id, phoneNumber, email, type, address);
    }

    public void runSystemFacilityManagement() {
        System.out.println(
                "------ Facility Management ------\n" +
                        "   1. Display list facility\n" +
                        "   2. Add new facility\n" +
                        "   3. Display list facility maintenance\n" +
                        "   4. Return main menu");
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
                displayMainMenu();
                break;
        }
    }

    public void displayListFacility() {
        System.out.println(facilityService.getFacility());
    }

    public void addNewFacility() {
        facilityService.addNewFacility();
        System.out.println("Enter your choice!");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewRoom();
                break;
            case 3:
                runSystemFacilityManagement();
                break;
        }
        displayListFacility();
    }

    public void addNewVilla() {
        String code;
        String name;
        int area = 0;
        int price = 0;
        int capacity = 0;
        String rentalType;
        String promotionService;

        do {
            System.out.println("Enter code villa: ");
            code = sc.nextLine();
        } while (!Regex.checkInput(Regex.CODE_VILLA_REGEX, String.valueOf(code)));

        do {
            System.out.println("Enter name villa: ");
            name = sc.nextLine();
        } while (!Regex.checkInput(Regex.NAME_REGEX, name));

        do {
            System.out.println("Enter area villa: ");
            area = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.AREA_AND_SIZE_SWIMMING_POOL_REGEX, String.valueOf(area)));

        do {
            System.out.println("Enter price villa: ");
            price = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.PRICE_REGEX, String.valueOf(price)));

        do {
            System.out.println("Enter capacity villa: ");
            capacity = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.CAPACITY_REGEX, String.valueOf(capacity)));

        do {
            System.out.println("Enter rentalType villa: ");
            rentalType = sc.nextLine();
        } while (!Regex.checkInput(Regex.RENTAL_TYPE_REGEX, rentalType));

        System.out.println("Enter promotionService villa: ");
        promotionService = sc.nextLine();

        facilityService.addNewVilla(new Villa(code, name, area, price, capacity, rentalType, promotionService));
    }

    public void addNewRoom() {
        String code;
        String name;
        int area;
        int price;
        int capacity;
        String rentalType;
        String standard;
        int sizeSwimmingPool;
        int numberOfFloors;
        do {
            System.out.println("Enter code room: ");
            code = sc.nextLine();
        } while (!Regex.checkInput(Regex.CODE_ROOM_REGEX, code));

        do {
            System.out.println("Enter name room: ");
            name = sc.nextLine();
        } while (!Regex.checkInput(Regex.NAME_REGEX, name));

        do {
            System.out.println("Enter area room: ");
            area = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.AREA_AND_SIZE_SWIMMING_POOL_REGEX, String.valueOf(area)));

        do {
            System.out.println("Enter price room: ");
            price = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.PRICE_REGEX, String.valueOf(price)));

        do {
            System.out.println("Enter capacity room: ");
            capacity = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.CAPACITY_REGEX, String.valueOf(capacity)));

        do {
            System.out.println("Enter rentalType room: ");
            rentalType = sc.nextLine();
        } while (!Regex.checkInput(Regex.RENTAL_TYPE_REGEX, String.valueOf(rentalType)));

        System.out.println("Enter standard room: ");
        standard = sc.nextLine();

        do {
            System.out.println("Enter sizeSwimmingPool: ");
            sizeSwimmingPool = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.AREA_AND_SIZE_SWIMMING_POOL_REGEX, String.valueOf(sizeSwimmingPool)));

        do {
            System.out.println("Enter numberOfFloors: ");
            numberOfFloors = Regex.enterNumber();
        } while (!Regex.checkInput(Regex.NUMBER_OF_FLOOR_REGEX, String.valueOf(numberOfFloors)));

        facilityService.addNewRoom(new Room(code, name, area, price, capacity, rentalType, standard, sizeSwimmingPool, numberOfFloors));
    }

    public void displayListFacilityMaintenance() {
        facilityService.displayFacilityNeedMaintenance();
    }

    public void runSystemBookKingManagement() {
        System.out.println(
                "------ Booking Management ------" +
                        "   1.Add new booking\n" +
                        "   2.Display list booking\n");
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

    public void runSystemPromotionManagement() {
        System.out.println(
                "------ Promotion Management ------\n" +
                        "   1. Display list customers use service\n" +
                        "   2. Display list customers get voucher\n" +
                        "   3. Return main menu");
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
                displayMainMenu();
                break;
        }
    }

    public void disPlayListCustomersUseService() {
    }

    public void disPlayListCustomersGetVoucher() {
    }

    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
