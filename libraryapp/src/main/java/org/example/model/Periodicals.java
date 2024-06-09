package org.example.model;

public class Periodicals {
    private String title;

    public Periodicals(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Title: " +title;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Periodicals that = (Periodicals)o;
        return title.equals(that.getTitle());
    }
}
