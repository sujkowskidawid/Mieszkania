import lombok.Data;

@Data
public abstract class Building {
    private int numberOfRooms;
    private int numberOfWindows;
    private double area;
    private boolean hasGarden;
    private boolean hasGarage;
    private boolean hasGym;


}
