import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author vregi, 12/17/2024
 */

public class ProjectManager {
    private Map<Team, List<Task>> taskMap = new HashMap<>();

    public void addTaskToTeam(Team team, Task task){
        taskMap.computeIfAbsent(team, k -> new ArrayList<>()).add(task);
    }

    public void displayTasksForTeam(Team team){
        List<Task> tasks = taskMap.get(team);

        if (tasks != null && !tasks.isEmpty()){
            System.out.println("Tasks for team : " + team.getName() + "\n");
            tasks.forEach(System.out::println);
        } else
            System.out.println("No tasks found for team : " + team.getName() + "\n");
    }

    public void completeTask(Team team, int taskId){
        List<Task> tasks = taskMap.get(team);

        if (tasks != null){
            for (Task task : tasks){
                if (task.getId() == taskId){
                    task.markComplete();
                    System.out.println("Task T" + taskId + " marked as complete for team: " + team.getName() + "\n");
                    return;
                }
            }
        }

        System.out.println("Task with ID T" + taskId + " not found for team : " + team.getName() + "\n");
    }
}
