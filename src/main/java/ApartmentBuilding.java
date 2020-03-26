import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class ApartmentBuilding extends Building {
    private int numberOfApartments;
    private int numberOfFloors;
}
