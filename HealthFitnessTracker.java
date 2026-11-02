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
