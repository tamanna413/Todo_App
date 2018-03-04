package com.example.kanchanpanda.todoapp;


public class TodoItem  {
    public String Title;
    public String Description;
    public int Id;

    //setter,getter

    public int getId(){
        return Id;
    }
    public void setId(int id){
        Id=id;
    }

    public String getTitle() {

        return Title;
    }

    public void setTitle(String title) {

        Title = title;
    }


    public String getDescription() {

        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
