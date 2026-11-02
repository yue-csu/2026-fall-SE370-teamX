//CLASSES
public class Workout {
    // Attributes
    private int ID;
    private int userID;
    private String date;
    private String notes

    //Constructor
    public Workout(int ID, int userID, String date, String notes){
        this.ID = ID;
        this.userID = userID;
        this.date = date;
        this.notes = notes;
    }
    //Getters and setters
    public int getID(){
        return ID;
    }   

    public int getUserID(){
        return userID;
    }

    public String getDate(){
        return date;
    }

    public int getNotes(){
        return notes;
    }

    public void setWorkoutID(int ID){
        this.ID = ID;
    }

    public void setUserID(int userID){
        this.userID = userID;
    }

    public void setDate(String date){
        this.date = date;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }
    
}


public class goal {
    // Attributes
    private int ID;
    private int userID;
    private int targetValue;
    private int currentValue;
    private String targetDate;
    private String type;
    private String status;

    //Constructor
    public Workout(int ID, int userID, int targetValue, int currentValue, String targetDate, String type, String status){
        this.ID = ID;
        this.userID = userID;
        this.targetValue = targetValue;
        this.currentValue = currentValue;
        this.targetDate = targetDate
        this.type = type;
        this.status = status;
    }
    //Getters and setters
     public int getID() {
        return ID;
    }

    public int getUserID() {
        return userID;
    }

    public int getTargetValue() {
        return targetValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setTargetValue(int targetValue) {
        this.targetValue = targetValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

public class exercise {

    // Attributes
    private int ID;
    private int sets;
    private int reps;
    private int weight;
    private String name;

    // Constructor
    public exercise(int ID, int sets, int reps, int weight, String name) {
        this.ID = ID;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.name = name;
    }

    // Getters and setters
    public int getID() {
        return ID;
    }

    public int getSets() {
        return sets;
    }

    public int getReps() {
        return reps;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
