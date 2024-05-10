package com.javarush.task.pro.task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        //напишите тут ваш код

        return values.listIterator();
    }

    @Override
    public int size() {
        //напишите тут ваш код
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        //напишите тут ваш код
        values.add(o);
        return true;
    }

    @Override
    public String poll() {
        //напишите тут ваш код

        String element = null;
        if (values.size()!=0)
        {
            element = values.get(0);
            values.remove(0);
        }
        return element;
    }

    @Override
    public String peek() {
        String element = null;
        if (values.size()!=0)
        {
            element = values.get(0);
        }
        return element;
    }
}
