package com.javarush.task.jdk13.task21.task2104;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        try {
            Solution clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            return new User(age,name);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof User)) return false;

            User u = (User) o;
            if (!Objects.equals(age, u.age)) {
                return false;
            }
            return Objects.equals(name, u.name);

        }
    }

    @Override
    protected Solution clone() throws CloneNotSupportedException {

        Solution s = new Solution();

        users.entrySet().forEach(e->{

            try {
                s.users.put(e.getKey(), e.getValue().clone());
            } catch (CloneNotSupportedException ex) {
                throw new RuntimeException(ex);
            }

        });

        return s;
    }
}
