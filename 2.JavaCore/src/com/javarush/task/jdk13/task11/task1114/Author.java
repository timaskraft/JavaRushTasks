package com.javarush.task.jdk13.task11.task1114;

public class Author {
    private final String name;
    private Article article;

    public Author(String name) {
        this.name = name;
        //this.article = new Article(title, text, this);
    }

    public String getName() {
        return name;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Article getArticle() {
        return article;
    }
}
