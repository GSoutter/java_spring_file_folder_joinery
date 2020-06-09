package com.codeclan.example.java_files_folders_joinery.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    @JsonIgnoreProperties("user")
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
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
