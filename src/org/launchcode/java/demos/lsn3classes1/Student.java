package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
     public String getName() {return this.name;}
     public void setName(String aName) {
        this.name = aName;
    }
     public int getStudentId() {return this.studentId;}
     public void setStudentId(int aStudentId) {this.studentId = aStudentId;}
     public int getNumberOfCredits() {
        return this.numberOfCredits;
    }
     public void setNumberOfCredits( int aNumberOfCredits){this.numberOfCredits = aNumberOfCredits;}
     public double getGpa() {
        return this.gpa;
     }
     public void setGpa(double aGpa) {
         this.gpa = aGpa;
     }

     public String getGradeLevel(){
         if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            return "Freshman";
         }
         if(this.numberOfCredits >= 30 && this.numberOfCredits <=59){
             return "Sophomore";
         }
         if(this.numberOfCredits >= 60 && this.numberOfCredits<=89 ){
             return "Junior";
         }
         if(this.numberOfCredits >=90 ){
             return "Senior";
         }
          else {
              return null;
         }
     }

     public void addGrade(int courseCredits, double grade){

     }
}