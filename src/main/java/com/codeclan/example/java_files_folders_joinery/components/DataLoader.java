package com.codeclan.example.java_files_folders_joinery.components;


import com.codeclan.example.java_files_folders_joinery.models.File;
import com.codeclan.example.java_files_folders_joinery.models.Folder;
import com.codeclan.example.java_files_folders_joinery.models.User;
import com.codeclan.example.java_files_folders_joinery.repository.FileRepository;
import com.codeclan.example.java_files_folders_joinery.repository.FolderRepository;
import com.codeclan.example.java_files_folders_joinery.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    UserRepository userRepository;


    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Dave");
        userRepository.save(user1);
        User user2 = new User("Davelena");
        userRepository.save(user2);

        Folder folder1 = new Folder("notPom", user1);
        Folder folder2 = new Folder("cars", user2);
        Folder folder3= new Folder("wallpapers", user1);

        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);

        File file1 = new File("untitled","jpg", 1000, folder1);
        File file2 = new File("untitled2","jpg", 1000, folder1);
        File file3 = new File("untitled3","txt", 1000, folder1);
        File file4 = new File("bugatti","txt", 1000, folder2);
        File file5 = new File("porsche","jpg", 1000, folder2);
        File file6 = new File("ferrari","jpg", 1000, folder2);
        File file7 = new File("yosemite","jpg", 1000, folder3);
        File file8 = new File("glencoe","jpg", 1000, folder3);
        File file9 = new File("firewatch","jpg", 1000, folder3);
        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
        fileRepository.save(file6);
        fileRepository.save(file7);
        fileRepository.save(file8);
        fileRepository.save(file9);

    }
}
