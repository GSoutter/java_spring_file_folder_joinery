package com.codeclan.example.java_files_folders_joinery.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id

    private String name;
    private List<Folder> folders;

    public User(String name) {
        this.name = name;

        this.folders = new ArrayList<Folder>();
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public void addFolders(Folder folder) {
        this.folders.add(folder);
    }

}
