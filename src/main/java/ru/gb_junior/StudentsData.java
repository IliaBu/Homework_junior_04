package ru.gb_junior;

import java.util.ArrayList;
import java.util.List;

public class StudentsData {
    static List<Student> student = new ArrayList<>();

    private static void addStudent(String fio, String birth, String phone, Gender gender) {
        customer.add(new Student(fio, birth, phone, gender, null));
    }

    public static List<Student> StudentsList() {
        addStudent("Иванов Иван Иванович", "10.05.1987",  "89787412589", Gender.male);
        addStudent("Иванова Ольга Николаевна", "20.06.1999", "89142562358", Gender.female);
        addStudent("Малых Сергей Олегович", "10.08.2000", "89451245632", Gender.male);
        addStudent("Кузьминых Наталья Николаевна", "30.02.1988", "89222111333", Gender.female);
        addStudent("Рыбак Андрей Владимирович", "10.06.1977", "89555222444", Gender.male );
        addStudent("Тимофеев Илья Сергеевич", "02.08.1976", "89222111333", Gender.male);
        addStudent("Тимофеева Анна Владимировна", "01.01.1970", "89555222444", Gender.female);
        addStudent("Малых Степан Олегович", "31.12.1978", "89748526525", Gender.male);
        return student;
    }
}
