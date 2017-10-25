package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String answer = "yes ";
        String quit = "yes";
        int count = 1;
        Book newBook = new Book();
        Chapters newChapters = new Chapters();
        Pages newPages = new Pages();
        ArrayList<Book> myBook = new ArrayList<>();
        ArrayList<Chapters> chapterList = new ArrayList<>();
        ArrayList<Pages> listOfPages = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("enter book  name:");
        newBook.setBookName(keyboard.nextLine());

        System.out.println("enter chapter title:");
        newChapters.setChapterTitle(keyboard.nextLine());
        System.out.println("---------------------");
        System.out.println(" " + newBook.getBookName());
        System.out.println(" " + newChapters.getChapterTitle());

        do {
            newChapters = new Chapters();
            System.out.println("Chapter Title:");
            newChapters.setChapterTitle(keyboard.nextLine());
            // newChapters.getPageTitle().add() = new ArrayList<Pages>(Pages);
            //chapterList.add(newChapters);

            System.out.println("Chapter Title:" + newChapters.getChapterTitle());

            do {
                newPages = new Pages();
                System.out.println("enter page Title:");
                newPages.setPageTitle(keyboard.nextLine());
                newChapters.getPageTitle().add(newPages);
                System.out.println("do you want to enter  page Title(yes/no)");
                answer = keyboard.nextLine();

            } while (answer.equalsIgnoreCase("yes"));
            newBook.getChapterTitle().add(newChapters);

            System.out.println("do you want to enter  chapter Title(yes/no)");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                newChapters.getChapterTitle();
            }
            else if(!answer.equalsIgnoreCase("yes"))
            {
                newPages.getPageTitle();
            }
                else{
                    System.out.println("quit");
            }

        }while(answer.equalsIgnoreCase("yes"));
            for(Book eachBook : myBook)
            {
                System.out.println(" print Book Brand:" +eachBook.getBookName());
                //System.out.println("Chapter Title:");
              count = count +1;
              for(Chapters eachChapter : chapterList)
              {
                  System.out.println(" chapter Title:" +eachChapter.getChapterTitle());
                  count = count+1;
               for(Pages eachPages : listOfPages)
               {
                   System.out.println("page Title:" +eachPages.getPageTitle());
                   System.out.println("page number:" +eachPages.getPageNumber());
                   count = count + 1;
               }
              }
            }
            System.out.println("Book Brand: " + newBook.getBookName()+ "\n " + "Chapter Title: "
                    + newChapters.getChapterTitle()+  "\n" + "Page Title: " + newPages.getPageTitle()
                    + newPages.getPageNumber());

    }
}

