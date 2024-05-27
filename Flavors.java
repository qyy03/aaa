public class Flavors {

// reads data on file

  private String monday;     //monday flavors
  private String tuesday;     //tuesday flavors
  private String wednesday;     //wednesday flavors
  private String thursday;     //thursday flavors
  private String friday;     //friday flavors

//Constructor to initialize a Flavors object.
  public Flavors(String monday, String tuesday, String wednesday, String thursday, 
  String friday){
  this.monday=monday; 
  this.tuesday=tuesday;
  this.wednesday=wednesday; 
  this.thursday= thursday; 
  this.friday=friday; 
  }

  //public getter and setter methods

  public String getMonday(){
  return monday;
   } 
  public void monday(String monday){
  this.monday=monday;
   }
//repeating for the rest of the arrays i want to do 

  public String getTuesday(){
  return tuesday;
   } 
  public void tuesday(String tuesday){
  this.tuesday=tuesday;
   }
//tuesday's flavors 

  public String getWednesday(){
  return wednesday;
   } 
  public void wednesday(String wednesday){
  this.wednesday=wednesday;
   }
//wednesday's flavors

  public String getThursday(){
  return thursday;
   } 
  public void thursday(String thursday){
  this.thursday=thursday;
  }
  // thursday's flavors

  public String getFriday(){
  return friday;
   } 
  public void friday(String friday){
  this.friday=friday;
   }

//friday's flavor

 //toString method to represent the object as a string
 public String toString() {
  return 
  "Monday's flavors" + monday + "\n" +
  "Tuesday's flavors " + tuesday + "\n" +
  "Wednesday's flavors: " + wednesday + "\n" +
  "Thursday's flavors" + thursday + "\n" +
   "Friday's flavors" + friday + "\n";
    }
}