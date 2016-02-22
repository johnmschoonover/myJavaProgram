package edu.wgu.project;

import com.example.constructors.Roster;
import com.example.constructors.Student;

  public class Main {
    public static void main(String[] args) {


      //<editor-fold desc="Physical Table -> ArrayList instantiation">
      int[] student1Grades = new int[]{88, 79, 59};
      Student.createStudent("1", "John", "Smith", "John1989@gmail.com", (byte) 20, student1Grades);

      int[] student2Grades = new int[]{91, 72, 85};
      Student.createStudent("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", (byte) 19, student2Grades);

      int[] student3Grades = new int[]{85, 84, 87};
      Student.createStudent("3", "Jack", "Napoli", "The_lawyer99yahoo.com", (byte) 19, student3Grades);

      int[] student4Grades = new int[]{91, 98, 82};
      Student.createStudent("4", "Erin", "Black", "Erin.black@comcast.net", (byte) 22, student4Grades);

      int[] student5Grades = new int[]{91, 85, 91};
      Student.createStudent("5", "John", "Schoonover", "jschoo8@wgu.edu", (byte) 28, student5Grades);
      //</editor-fold>


      Roster.print_all();
      Roster.print_invalid_emails();
      for (int individual = 1 ; individual < Student.studentList.size() + 1 ; individual ++ ) {
          Roster.print_average_grade(Integer.toString(individual));
      }
      System.out.println("\n");
      Roster.remove("3");
      Roster.remove("3");

  }
}
