package com.fileDownload.demoDownloadFile;

import com.fileDownload.demoDownloadFile.controller.FileUploadController;
import com.fileDownload.demoDownloadFile.storage.StorageProperties;
import com.fileDownload.demoDownloadFile.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)

public class DemoDownloadFileApplication {

	public static void main(String[] args) {
//		new File(FileUploadController.uploadDir).mkdirs();

		SpringApplication.run(DemoDownloadFileApplication.class, args);
	}


	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
//			storageService.deleteAll();
			storageService.init();
		};
	}
}
