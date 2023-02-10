package org.example;
import java.util.logging.*;
import java.util.*;
import java.lang.*;
class Student implements Comparator<Student>{
    Logger l=Logger.getLogger("com.api.jar");
    String name;
    int age;
    double gpa;

     Student() {

    }
    void setDetail(String sName,int sAge,double sGPA) {
        this.name = sName;
        this.age = sAge;
        this.gpa = sGPA;
    }
    void getDetail() {
        l.log(Level.INFO,()-> "Student name is :"+name);
        l.log(Level.INFO,()-> "Student age is :"+age);
        l.log(Level.INFO,()-> "Student gpa is :"+gpa);
    }
    public int compare(Student a,Student b){
         return (int) ((int)b.gpa-a.gpa);
   }
 }
class StudentTest {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        l.info("Enter the Student Name,Age,GPA:");
        s1.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
        l.info("Enter the Student Name,Age,GPA:");
        s2.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
        l.info("Enter the Student Name,Age,GPA:");
        s3.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int length = list.size();
        int i = 0;
        l.info("UnSorted List:");
        while (i<length) {
            list.get(i).getDetail();
            i++;
        }
        i=0;
        l.info("Sorted List:");
            while (i < length) {
                Collections.sort(list, new Student());
                list.get(i).getDetail();
                i++;
            }

        }
    }

