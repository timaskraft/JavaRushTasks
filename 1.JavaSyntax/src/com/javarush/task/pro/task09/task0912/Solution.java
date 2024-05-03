package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        if (url.indexOf("https:")==0 |url.indexOf("http:")==0 )
        {
            return url.substring(0,url.indexOf(":"));
        }else
          return "неизвестный" ;
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        if (url.lastIndexOf(".com") > 0 | url.lastIndexOf(".net") > 0 | url.lastIndexOf(".org") > 0 | url.lastIndexOf(".ru") > 0) {
            return url.substring(url.lastIndexOf(".") + 1);
        }else
         return  "неизвестный";

    }
}
