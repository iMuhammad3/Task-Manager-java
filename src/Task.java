import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate dateCreated;
    private String description;
    private int numOfTask = 0;

    // Constructors
    Task(){
        this.name = "Task";        
        this.dateCreated = LocalDate.now();
        this.description = "";
    }
    Task(String name){
        this.name = name;
        this.dateCreated = LocalDate.now();
        this.description = "";

    }    
    Task(String name, String description){
        this.name = name;
        this.dateCreated = LocalDate.now();
        this.description = description;
    }

    // override toString method
    @Override
    public String toString(){
        return (
            this.name + "\n" 
            + this.dateCreated + "\n" 
            + this.description + "\n" 
        );
    }

    // Getters
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Task manipulation
    public void addTask(String description){
        ++numOfTask;
        this.description += "\n" + numOfTask + ". " + description;
    }

}
