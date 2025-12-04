package tn.esprit.gestionemployes;

import tn.esprit.gestionemployes.entities.Student;
import tn.esprit.gestionemployes.services.StudentManagement;

import java.util.*;
import java.util.stream.*;

public class MainStudent {
    public static void main(String[] args) {

        StudentManagement sm = new StudentManagement();

        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Sami", 21));
        list.add(new Student(1, "Ali", 20));
        list.add(new Student(2, "Mouna", 22));

        System.out.println("📌 Affichage normal :");
        sm.displayStudents(list, s -> System.out.println(s));

        System.out.println("\n🔍 Étudiants âgés de plus de 20 ans :");
        sm.displayStudentsByFilter(list, s -> s.getAge() > 20, System.out::println);

        System.out.println("\n📜 Noms des étudiants :");
        String names = sm.returnStudentsNames(list, Student::getNom);
        System.out.println(names);

        System.out.println("\n➕ Création d'un étudiant via Supplier :");
        Student newStudent = sm.createStudent(() -> new Student(4, "Karim", 19));
        System.out.println(newStudent);

        System.out.println("\n📂 Tri des étudiants par ID :");
        sm.sortStudentsById(list, (a, b) -> a.getId() - b.getId());
        list.forEach(System.out::println);

        System.out.println("\n🌊 Conversion en Stream :");
        Stream<Student> st = sm.convertToStream(list);
        st.forEach(System.out::println);
    }
}
