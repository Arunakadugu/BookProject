package com.company;

import java.util.ArrayList;

public class Chapters {
    private String chapterTitle;
    private ArrayList<Pages> pageTitle;

    public ArrayList<Pages> getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(ArrayList<Pages> pageTitle) {
        this.pageTitle = pageTitle;
    }

    public   Chapters(){
        pageTitle= new ArrayList<Pages>();
}


    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

}
