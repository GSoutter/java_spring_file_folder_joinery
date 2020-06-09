package com.codeclan.example.java_files_folders_joinery.models;

import java.util.ArrayList;

public class Folder {

    private long id;
    private String name;
    private List<File> files;
    private User user;

    public Folder(String name, User user) {
        this.name = name;
        this.user = user;
        this.files = new ArrayList<File>();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
