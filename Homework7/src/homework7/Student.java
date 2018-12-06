/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Taras
 */
public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudent(List<Student> student, int corses) {
        Iterator it = student.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            if (s.getCourse() == corses) {
                System.out.println(s.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", course=" + course + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.name.hashCode();
        hash = 67 * hash + this.course;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.course != other.course) {
            return false;
        }
        if (!this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    
}
