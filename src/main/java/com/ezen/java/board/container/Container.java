package com.ezen.java.board.container;

import com.ezen.java.board.article.ArticleController;

import java.util.Scanner;

public class Container {
    public static Scanner scanner;
    public static ArticleController articleController;

    static {
        scanner = new Scanner(System.in);

        articleController = new ArticleController();
    }
}
