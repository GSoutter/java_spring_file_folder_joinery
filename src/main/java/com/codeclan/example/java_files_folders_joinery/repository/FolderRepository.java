package com.codeclan.example.java_files_folders_joinery.repository;

import com.codeclan.example.java_files_folders_joinery.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
