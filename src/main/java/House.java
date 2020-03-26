import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class House extends Building {
    private boolean isOneStorey;
}
