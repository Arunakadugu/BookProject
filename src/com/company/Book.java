package com.company;

import java.util.ArrayList;

public class Book {
    private String bookName;

    public ArrayList<Chapters> getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(ArrayList<Chapters> chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public ArrayList<Chapters> chapterTitle;

    public Book() {
        chapterTitle = new ArrayList<Chapters>();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
