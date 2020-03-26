import lombok.Data;
import lombok.ToString;

@Data
public class Apartment extends Building{

    private String city;

    @ToString.Include(name = "m^2")
    private double area;

    @ToString.Exclude
    private double price;


    public double getFullPrice(){
        return area*price*0.95;
    }

}
