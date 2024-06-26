package com.javarush.task.jdk13.task14.task1408;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Article {

    private final String name;
    private final List<LikeStatus> likes;

    public Article(String name) {
        this.name = name;
        this.likes = LikeStatus.generateMassActivity();
    }

    public String getName() {
        return name;
    }

    public int getLikesCount() {

        return likes.stream().collect(Collectors.summingInt(e->getOriginalLikeValue(e)));
    }

    private static int getOriginalLikeValue(LikeStatus likeStatus) {
        return switch (likeStatus) {
            case LIKE, FOLLOW, FAVORITE, HELPFUL, ARTICLE -> 1;
            case HOT, SOLUTION, OSCAR -> 2;
            case DISLIKE, SPAM, OFFTOPIC, DUPLICATE, WRONG -> -1;
            case AWFUL -> -2;
            default -> 0;
        };
    }
}
