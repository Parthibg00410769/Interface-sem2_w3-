package ie.atu.productv5;

import java.text.NumberFormat;

public class Animals implements Productable{
    private String type;
    private int age;
    private String breed;
    private double price;

    public Animals() {
        this.type = "";
        this.age = 0;
        this.breed = "";
        this.price = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }

    public  String getPriceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }


}