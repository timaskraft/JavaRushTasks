package com.javarush.task.jdk13.task14.task1405;

/* 
Пора покушать
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.onSelect();
        food.onEat();
    }

    public static void callSelectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }

        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}
