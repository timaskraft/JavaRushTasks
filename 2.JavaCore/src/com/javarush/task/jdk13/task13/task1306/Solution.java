package com.javarush.task.jdk13.task13.task1306;

/* 
Будущий управленец
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws Exception {

        System.out.println( LocalDate.now().format( DateTimeFormatter.ofPattern("MM-dd-yy") ) );
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends Person, HasManagementPotential {
    }

    class Manager implements  Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
