package camerarentalapplication;
import java.util.*;
public class mycamera {
    private List<Camera> cameraList;
    private double walletBalance;
    private Scanner sc;
    public mycamera() {
        cameraList = new ArrayList<>();
        walletBalance = 0.0;
        sc = new Scanner(System.in);
    }
    private void rentCamera() {
        System.out.println("RENT A CAMERA");
        System.out.println("==============================================");
        if (cameraList.isEmpty()) {
            System.out.println("No cameras available for rent");
            return;
        }
        System.out.printf("%-10s %-12s %-14s %-10s %s\n", "CAMERA ID", "BRAND", "MODEL", "PRICE (PER DAY)", "STATUS");
        for (Camera camera : cameraList) {
            System.out.println(camera);
        }
        System.out.print("Enter the camera ID you want to rent: ");
        int cameraId = sc.nextInt();
        sc.nextLine();
        Camera selectedCamera = null;
        for (Camera camera : cameraList) {
            if (camera.getCameraId() == cameraId) {
                selectedCamera = camera;
                break;
            }
        }
        if (selectedCamera == null) {
            System.out.println("Invalid camera ID");
            return;
        }
        if (selectedCamera.getStatus().equals("Rented")) {
            System.out.println("Camera is already rented");
            return;
        }
        double rentAmount = selectedCamera.getPricePerDay();
        if (walletBalance < rentAmount) {
            System.out.println("Transaction failed due to insufficient wallet balance. Please deposit the amount to your wallet");
            return;
        }
        selectedCamera.setStatus("Rented");
        walletBalance -= rentAmount;
        System.out.printf("Your transaction for camera %s %s with rent INR %.2f has been successfully completed.\n",
                selectedCamera.getBrand(), selectedCamera.getModel(), rentAmount);
    }
    private void viewAllCameras() {
        System.out.println("VIEW ALL CAMERAS");
        System.out.println("==============================================");
        if (cameraList.isEmpty()) {
            System.out.println("No cameras available at the moment.");
            return;
        }
        System.out.printf("%-10s %-12s %-14s %-10s %s\n", "CAMERA ID", "BRAND", "MODEL", "PRICE (PER DAY)", "STATUS");
        for (Camera camera : cameraList) {
            System.out.println(camera);
        }
    }
    private void showMyWalletMenu() {
        System.out.println("MY WALLET");
        System.out.println("==============================================");
        System.out.printf("Your current wallet balance is INR %.2f\n", walletBalance);
        System.out.println("Do you want to deposit more amount to your wallet?");
        System.out.print("1. YES\n2. NO\n> ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Enter the amount to deposit:  ");
            double amount = sc.nextDouble();
            sc.nextLine();

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value");
                return;
            }

            walletBalance += amount;
            System.out.printf("Amount INR %.2f deposited to your wallet. Current wallet balance: INR %.2f\n",
                    amount, walletBalance);
        }
    }
    private void showMyCameraMenu() {
        System.out.println("MY CAMERA");
        System.out.println("==============================================");
//        System.out.printf("%-10s %-12s %-14s %-10s %s\n", "CAMERA ID", "BRAND", "MODEL", "PRICE (PER DAY)", "STATUS");
        for (Camera camera : cameraList) {
            System.out.println(camera);
        }
        System.out.println();
        System.out.println("OPTIONS TO BE DISPLAYED:");
        System.out.println("1. Add Camera");
        System.out.println("2. Remove Camera");
        System.out.println("3. View My Cameras");
        System.out.println("4. Go Back to Previous Menu");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        switch (choice) {
            case 1:
                addCamera();
                break;
            case 2:
                removeCamera();
                break;
            case 3:
                viewAllCameras();
                break;
            case 4:
                System.out.println("Going back to the previous menu...");
                break;
            default:
                System.out.println("INVALID CHOICE PLEASE TRY AGAIN");
                break;
        }
    }
    private void addCamera() {
        System.out.println("ADD CAMERA");
        System.out.println("==============================================");
        System.out.print("Enter Camera ID: ");
        int cameraId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Price Per Day: ");
        double perDayPrice = sc.nextDouble();
        sc.nextLine();
        Camera camera = new Camera(cameraId, brand, model, perDayPrice, "Available");
        cameraList.add(camera);
        System.out.println("Camera added successfully.");
    }
    private void removeCamera() {
        System.out.println("REMOVE CAMERA");
        System.out.println("==============================================");
        System.out.print("Enter Camera ID to remove: ");
        int cameraId = sc.nextInt();
        sc.nextLine();
        boolean removed = false;
        for (Camera camera : cameraList) {
            if (camera.getCameraId() == cameraId) {
                cameraList.remove(camera);
                removed = true;
                System.out.println("Camera removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Camera not found.");
        }
    }
    public void run() {
        System.out.println("WELCOME TO CAMERA RENTAL APP");
        System.out.println("==============================================");
        System.out.println("PLEASE LOGIN TO CONTINUE");
        System.out.print("USERNAME: ");
        String username = sc.nextLine();
        System.out.print("PASSWORD: ");
        String password = sc.nextLine();

        if (!username.equals("Tejaswini") || !password.equals("Teju123")) {
            System.out.println("INVALID CREDENTIALS. ACCESS DENIED.");
            return;
        }
        int choice;
        do {
            System.out.println("OPTIONS TO BE DISPLAYED:");
            System.out.println("1. MY CAMERA");
            System.out.println("2. RENT A CAMERA");
            System.out.println("3. VIEW ALL CAMERAS");
            System.out.println("4. MY WALLET");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    showMyCameraMenu();
                    break;
                case 2:
                    rentCamera();
                    break;
                case 3:
                    viewAllCameras();
                    break;
                case 4:
                	showMyWalletMenu();
                    break;
                case 5:
                    System.out.println("THANK YOU FOR USING CAMERA RENTAL APP,HAVE A NICE DAY....VISIT AGAIN");
                    break;
                default:
                    System.out.println("INVALID CHOICE. PLEASE TRY AGAIN.");
                    break;
            }
            System.out.println();
        } while (choice != 5);
    }
}