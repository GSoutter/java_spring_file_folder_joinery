package com.codeclan.example.java_files_folders_joinery.models;

public class File {

    private Long id;
    private String name;
    private String extension;
    private Long size;
    private Folder folder;

    public File(String name, String extension, Long size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}