package camerarentalapplication;

import java.util.*;
class Camera {
    private int cameraId;
    private String brand;
    private String model;
    private double pricePerDay;
    private String status;
    public Camera(int cameraId, String brand, String model, double pricePerDay, String status) {
        this.cameraId = cameraId;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.status = status;
    }
    public int getCameraId() {
        return cameraId;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String toString() {
        return String.format("%-10d %-12s %-14s %-10.2f %s", cameraId, brand, model, pricePerDay, status);
    }
}
