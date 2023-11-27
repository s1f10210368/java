package sample9.basic5;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        User user1 = new User("Enryo", "Inoue", LocalDate.of(2018, 12, 4));
        User user2 = new User("Yukichi", "Fukuzawa", LocalDate.of(1835, 1, 10));

        System.out.printf("Id : %d \n", user1.getId());
        System.out.printf("Name : %s \n", user1.getName());
        System.out.printf("Age : %d \n", user1.getAge(LocalDate.now()));

        System.out.printf("Id : %d \n", user2.getId());
        System.out.printf("Name : %s \n", user2.getName());
        System.out.printf("Age : %d \n", user2.getAge(LocalDate.now()));
    }
}