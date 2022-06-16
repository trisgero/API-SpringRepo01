package it.triexercise.APISpringRepo01.entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private int serialNumber;
    @Column
    private long currentPrice;

    public Car(int id, String modelName, int serialNumber, long currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(long currentPrice) {
        this.currentPrice = currentPrice;
    }
}
