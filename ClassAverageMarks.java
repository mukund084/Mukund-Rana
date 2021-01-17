import java.util.*;
public class ClassAverageMarks 

{


 ArrayList<StudentClass> Students; 


public int numberStudents;
public double classAvg;
public int totalCV;


public ClassAverageMarks (int numberStudents){

this.Students = new ArrayList<StudentClass>();

this.Students.add(new StudentClass("Mukund", 3));
this.Students.add(new StudentClass("Rishabh",3));
this.Students.add(new StudentClass("Mom",3));
this.Students.add(new StudentClass("Dad",3));


numberStudents = Students.size();

this.numberStudents = numberStudents;


}

public void classAvgerage (){

for (int i = 0; i < this.numberStudents; i++){

this.classAvg += this.Students.get(i).getStudentAverage();


}





}



public double getAverage () {

return this.totalCV = (int)(this.classAvg / this.numberStudents);


}











}