package main.java;
public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.setId(101);
        s.setName("Rahim");
        s.setEmail("rahim@gmail.com");

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Email: " + s.getEmail());
    }
}
