package com.codeclan.example.java_files_folders_joinery;

import com.codeclan.example.java_files_folders_joinery.models.File;
import com.codeclan.example.java_files_folders_joinery.models.Folder;
import com.codeclan.example.java_files_folders_joinery.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclan.example.java_files_folders_joinery.repository.FileRepository;
import com.codeclan.example.java_files_folders_joinery.repository.FolderRepository;
import com.codeclan.example.java_files_folders_joinery.repository.UserRepository;

@SpringBootTest
public class JavaFilesFoldersJoineryApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Autowired
	UserRepository userRepository;


	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void canCreateUserAndSave() {
		User user = new User("Dave");
		userRepository.save(user);
	}

	@Test
	void canCreateUserAndFolderAndSave() {
		User user = new User("Dave");
		userRepository.save(user);
		Folder folder = new Folder("pom", user);

		folderRepository.save(folder);
	}

	@Test
	void canCreateUserAndFolderAndFileAndSave() {
		User user = new User("Dave");
		userRepository.save(user);

		Folder folder = new Folder("pom", user);
		folderRepository.save(folder);

		File file  = new File("notpom", "jpg", 1000, folder);
		fileRepository.save(file);
	}


}
