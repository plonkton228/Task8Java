package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<User>> userMap = new HashMap<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введите имя пользователя " + i);
            String name = scanner.nextLine();

            System.out.println("Введите возраст пользователя " + i);
            int age = scanner.nextInt();
            scanner.nextLine();

            User user = new User(name, age);
            userMap.computeIfAbsent(age, k -> new ArrayList<>()).add(user);
        }

        System.out.println("Введите требуемый возраст");
        int requiredAge = scanner.nextInt();

        if (userMap.containsKey(requiredAge)) {
            List<User> usersWithAge = userMap.get(requiredAge);
            usersWithAge.sort(Comparator.comparing(User::getName));
            for (User user : usersWithAge) {
                System.out.println(user);
            }
        } else {
            System.out.println("Пользователь с возрастом '" + requiredAge + "' не найден");
        }
    }
}