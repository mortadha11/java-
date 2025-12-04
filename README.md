👨‍🎓 Prosit 12 : API Stream et Interfaces Fonctionnelles (Étudiant) ⚙️
Ce projet se concentre sur la gestion des étudiants en utilisant l'API Stream et les Interfaces Fonctionnelles de Java.

Entité Étudiant :
Un étudiant est caractérisé par:

Un id (int)

Un nom (String)

Un age (int)

La classe Etudiant possède :

2 constructeurs, dont un sans paramètre.

Les méthodes Getters & Setters.

Redéfinition de toString.

Interface Management :
L'interface définit plusieurs méthodes basées sur les interfaces fonctionnelles:

void displayStudents(List<Student> students, Consumer<Student> con);

void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con);

String returnStudentsNames(List<Student> students, Function<Student, String> fun);

Student createStudent(Supplier<Student> sup);

List<Student> sortStudentsById(List<Student> students, Comparator<Student> com);

Stream<Student> convertToStream(List<Student> students);

Instruction Principale :
Créer la classe StudentManagement qui implémente l'interface Management et implémente toutes ses méthodes.

Si vous souhaitez plus de détails sur l'une de ces instructions ou l'implémentation de l'une des classes, n'hésitez pas à me le demander !
