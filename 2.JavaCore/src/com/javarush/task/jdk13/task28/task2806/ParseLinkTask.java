package com.javarush.task.jdk13.task28.task2806;

import java.util.concurrent.Callable;

public class ParseLinkTask implements Callable<Link> {

    private String line;
    //private Link link = new Link();

    public ParseLinkTask(String line) {
        this.line = line;
    }

   // public Link getLink() {
   //     return link;
   // }

    @Override
    public Link call() throws Exception {

        Link link = new Link();
        int colonIndex = line.indexOf(":");
        link.protocol = line.substring(0, colonIndex);

        int queryMarkIndex = line.indexOf("?");
        if (queryMarkIndex != -1) {
            link.address = line.substring(colonIndex + 3, queryMarkIndex);

            String[] parameters = line.substring(queryMarkIndex + 1).split("&");
            for (String parameter : parameters) {
                String[] param = parameter.split("=");
                link.parameters.put(param[0], param[1]);
            }
        } else {
            link.address = line.substring(colonIndex + 3);
        }

        return link;
    }


}
