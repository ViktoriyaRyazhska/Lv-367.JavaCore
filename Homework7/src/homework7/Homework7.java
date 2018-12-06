/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Taras
 */
public class Homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Exercise №1");
        Set<String> set1 = new TreeSet();
        set1.add("1");
        set1.add("2");
        set1.add("7");
        set1.add("3");
        set1.add("4");
        System.out.println(set1.size());
        Set<String> set2 = new TreeSet();
        set2.add("1");
        set2.add("6");
        set2.add("7");
        set2.add("5");
        set2.add("4");
        System.out.println(set2.size());
        Set<Object> set3 = union(set1, set2);
        System.out.println(set3.size());

        set3 = intersect(set1, set2);
        System.out.println(set3.size());

        System.out.println("Exercise №2");
        Map<String, String> persons = new HashMap<String, String>();
        persons.put("First", "Orest");
        persons.put("Second", "Ivan");
        persons.put("Third", "Olya");
        persons.put("Fourth", "Orest");
        persons.put("Fifth", "Taras");
        persons.put("Sixth", "Olya");
        persons.put("Seventh", "Vasyl");
        persons.put("Eighth", "Orest");
        persons.put("Ninth", "Kosty");
        persons.put("Tenth", "Ivan");

        persons.values().removeAll(Collections.singleton("Orest"));

        for (Iterator i = persons.entrySet().iterator(); i.hasNext();) {

            Map.Entry entry = (Map.Entry) i.next();
            System.out.printf("%10s %10s", entry.getKey(), entry.getValue() + "\r\n");
        }
        System.out.println("Exercise №3");

        List<Student> students = new ArrayList<>();
        students.add(new Student("First Orest", 2));
        students.add(new Student("Second Ivan", 1));
        students.add(new Student("Third Olya", 4));
        students.add(new Student("Fourth Orest", 3));
        students.add(new Student("Fifth Taras", 5));
        students.add(new Student("Sixth Olya", 1));
        students.add(new Student("Sixth Olya", 1));
        //list of students on course
        Student.printStudent(students, 1);

        System.out.println("list of students ordered by name.");
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("List of students ordered by course.");
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static Set<Object> union(Set set1, Set set2) {
        if (set1.getClass().getName().equals(set2.getClass().getName())) {
            Set<Object> t = new TreeSet();
            Iterator it = set1.iterator();
            while (it.hasNext()) {
                t.add(it.next());
            }
            it = set2.iterator();
            while (it.hasNext()) {
                t.add(it.next());
            }
            return t;
        } else {
            return Collections.EMPTY_SET;
        }
    }

    public static Set<Object> intersect(Set set1, Set set2) {
        if (set1.isEmpty() || set2.isEmpty()) {
            return Collections.EMPTY_SET;
        } else {
            Set<Object> t = new TreeSet();
            for (Object str : set2) {
                if (set1.contains(str)) {
                    t.add(str);
                }
            }
            return t;
        }
    }
}
