/**
 * @author vregi, 12/17/2024
 */

public class App {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager();

        Team team1 = new Team("Normal developers");
        Team team2 = new Team("PHP developers");

        Task task1 = new Task(1, "Fuck around", false);
        Task task2 = new Task(2, "Drink coffee", false);
        Task task3 = new Task(3, "Sleep at meetings", false);

        pm.addTaskToTeam(team1, task1);
        pm.addTaskToTeam(team1, task2);
        pm.addTaskToTeam(team2, task3);

        pm.displayTasksForTeam(team1);
        pm.displayTasksForTeam(team2);

        pm.completeTask(team1, 2);

        pm.displayTasksForTeam(team1);
    }
}
