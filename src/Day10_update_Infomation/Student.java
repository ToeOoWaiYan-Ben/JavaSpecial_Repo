package Day10_update_Infomation;

public class Student {
    public static final int MAX_STUDENTS = 10000;
    private String name;
    private int age;
    private String phone;
    public static int totalStudentCount = 0;
    private static Student[] students = new Student[MAX_STUDENTS];
    public Student(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;

    }

    public static Student[] getStudents() {
        return students;
    }

    public static void setStudents(Student[] students) {
        Student.students = students;
    }
    public static void addStudent(Student student) {
        Student.students[totalStudentCount] = student;
        totalStudentCount++;
    }

    public static void deleteStudent(Student student) {
        for (int i = 0; i < totalStudentCount; i++) {
            if (students[i] == student) {
                for (int j = i; j < totalStudentCount-1; j++) { //replace all student to delete place
                    students[j] = students[j+1];
                }
                students[totalStudentCount-1] = null; // for clear the last place
                totalStudentCount--;
                break;
            }
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Student getStudentByName(String studentName) {
        for (int i = 0; i < totalStudentCount; i++) {
            if (students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Age:" + age + " Phone:" + phone;
    }


}