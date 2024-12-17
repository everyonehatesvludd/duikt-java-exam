import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vregi, 12/17/2024
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private int id;
    private String description;
    private boolean isComplete = false;

    public void markComplete() {
        this.isComplete = true;
    }

    @Override
    public String toString() {
        return "Task \"T" + id +
                "\"\nDescription = \"" + description +
                "\"\nisComplete = \"" + isComplete + "\n";
    }
}
