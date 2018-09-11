public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        Course course1 = new Course("Data Structures");
        course1.addStudent("deniz");
        course1.addStudent("ahmet");
        String[] students = course1.getStudents();
        Course course2 = (Course) course1.clone();
        course2.addStudent("veli");
        System.out.println(students[1]);
    }
}
