package com.ezen.java.board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 자바 텍스트 게시판 작동 ==");
        System.out.print("명령) ");
        String cmd = sc.nextLine();

        System.out.println("입력받은 명령어 : " + cmd);
        System.out.println("== 자바 텍스트 게시판 종료 ==");
    }
}