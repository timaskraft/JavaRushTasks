package com.javarush.task.jdk13.task21.task2101;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;
/* 
Equals and HashCode
*/

/**
 *  это какая то хард задача.
 */

public class Solution {
    private final String first;
    private final String last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Solution)) {
            return false;
        }

        Solution solution = (Solution) o;

        if (!Objects.equals(first, solution.first)) {
            return false;
        }
        return Objects.equals(last, solution.last);
    }

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
