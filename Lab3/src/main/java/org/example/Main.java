package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class TaskItem {
        private int taskId;
        private String taskDescription;
        private Status taskStatus;

        public TaskItem(int taskId, String taskDescription, Status taskStatus) {
            this.taskId = taskId;
            this.taskDescription = taskDescription;
            this.taskStatus = taskStatus;
        }

        // Getters for each attribute
        public int getTaskId() {
            return taskId;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public Status getTaskStatus() {
            return taskStatus;
        }

        @Override
        public String toString() {
            return "TaskItem{" +
                    "taskId=" + taskId +
                    ", taskDescription='" + taskDescription + '\'' +
                    ", taskStatus=" + taskStatus +
                    '}';
        }
    }

    import java.util.*;
import java.util.stream.Collectors;

    public class DataStructures {
        private List<TaskItem> tasks;

        public DataStructures() {
            tasks = Arrays.asList(
                    new TaskItem(1, "Push lab code to the github", Status.TO_DO),
                    new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                    new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED)
            );
        }

        // Method to get all TaskItem objects
        public List<TaskItem> getAllTasks() {
            return tasks;
        }

        // Method to filter tasks by Status
        public List<TaskItem> getByStatus(Status status) {
            return tasks.stream()
                    .filter(task -> task.getTaskStatus() == status)
                    .collect(Collectors.toList());
        }

        // Method to find tasks with id greater than or equal to 2
        public List<TaskItem> getTasksByIdGreaterOrEqual(int id) {
            return tasks.stream()
                    .filter(task -> task.getTaskId() >= id)
                    .collect(Collectors.toList());
        }

        // Method to print the description of each task using forEach and streams
        public void printTaskDescriptions() {
            tasks.stream()
                    .forEach(task -> System.out.println(task.getTaskDescription()));
        }

        // Main method to test the functionality
        public static void main(String[] args) {
            DataStructures ds = new DataStructures();

            // Test: Get all tasks
            System.out.println("All tasks:");
            ds.getAllTasks().forEach(System.out::println);

            // Test: Get tasks by status
            System.out.println("\nTasks with status IN_PROGRESS:");
            ds.getByStatus(Status.IN_PROGRESS).forEach(System.out::println);

            // Test: Get tasks by ID >= 2
            System.out.println("\nTasks with id >= 2:");
            ds.getTasksByIdGreaterOrEqual(2).forEach(System.out::println);

            // Test: Print task descriptions
            System.out.println("\nTask descriptions:");
            ds.printTaskDescriptions();
        }
    }


    public static void main(String[] args) {



    }
}