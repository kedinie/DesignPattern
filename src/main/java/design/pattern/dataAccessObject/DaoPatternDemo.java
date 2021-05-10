package design.pattern.dataAccessObject;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        // 输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        // 更新学生
        Student student = studentDao.getStudent(0);
        student.setName("Micheal");
        studentDao.updateStudent(student);

        // 获取学生
        student = studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
