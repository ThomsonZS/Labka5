package lab4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String groupId;
    private List<Double> grades = new ArrayList<>();
    
    public Student(String firstName, String lastName,String emailAdress) {
        super(firstName, lastName, emailAdress);

    }
    
    public Student(String firstName, String lastName) {
        super(firstName, lastName, "");
    }
    

    public String getStudent() {
       return super.getFirstName() +" "+ super.getLastName();
    }
    
    public String getGroupId() {
        return groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    public List<Double> getGrades() {
        return grades;
    }
    public void addGrade(double grade) {
        grades.add(grade);
    }
    
    public double getGradesAverage() { // zadanie 3
        double average = 0; 
        for(double grade : grades) { 
            average += grade; 
        }
        return average/grades.size(); 
    }
}

