package org.example.model;

public class DVD {
    private String title;

    public DVD(String title){
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
        DVD that = (DVD)o;
        return title.equals(that.getTitle());
    }
}
