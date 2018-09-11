package com.denizsalman;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student("deniz", "büyükmahal", "5468130758", "ddenizsalman@gmail.com",
                Student.JUNIOR);
        System.out.println(student);

        Employee employee = new Employee("erdi", "ankara", "5353223333", "erdi@hotmail.com",
                "muhendislik fakültesi", 3000);
        System.out.println(employee);

        Faculty faculty = new Faculty("ahmet", "izmir", "5333332266", "ahmet@gmail.com", "su ürünleri",
                2750, "8 - 17", "Öğretmen");
        System.out.println(faculty);

        Staff staff = new Staff("mahir", "istanbul", "5364328321", "mahir@gmail.com", "tıp fakültesi",
                7000, "Temizlikçi");
        System.out.println(staff);
    }
}
