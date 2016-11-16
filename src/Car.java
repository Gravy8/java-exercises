/**
 * Created by bradcolton on 11/16/16.
 */
public class Car {
    int miles;
    String make;
    String model;
    String color;
    public int getMiles(){
        return this.miles;
    }
    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public void setMiles(int miles){
        this.miles = miles;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
}
