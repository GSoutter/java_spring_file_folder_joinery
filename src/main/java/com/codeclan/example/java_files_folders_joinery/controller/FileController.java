package com.codeclan.example.java_files_folders_joinery.controller;

import com.codeclan.example.java_files_folders_joinery.models.File;
import com.codeclan.example.java_files_folders_joinery.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {


    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllUsers(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getOneUser(@PathVariable Long id){
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> postUser(@RequestBody File folder){
        fileRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
