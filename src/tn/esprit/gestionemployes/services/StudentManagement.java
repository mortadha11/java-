package tn.esprit.gestionemployes.services;

import tn.esprit.gestionemployes.entities.Student;
import tn.esprit.gestionemployes.interfaces.Management;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {
        for (Student s : students) {
            con.accept(s);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Student> students,
                                        Predicate<Student> pre,
                                        Consumer<Student> con) {
        for (Student s : students) {
            if (pre.test(s)) {
                con.accept(s);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Student> students,
                                      Function<Student, String> fun) {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(fun.apply(s)).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return sup.get();
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students,
                                          Comparator<Student> com) {
        students.sort(com);
        return students;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return students.stream();
    }
}
