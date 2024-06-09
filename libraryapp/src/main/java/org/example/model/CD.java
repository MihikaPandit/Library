package org.example.model;

public class CD {
    private String title;

    public CD(String title){
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
        CD that = (CD)o;
        return title.equals(that.getTitle());
    }
}
