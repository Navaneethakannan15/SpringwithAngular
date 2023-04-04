package com.Spring.Admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Spring.Admission.Model.Admission;
import com.Spring.Admission.Repository.AdmissionRepository;

@SpringBootApplication
public class AdmissionDbApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AdmissionDbApplication.class, args);
	}
@Autowired
private AdmissionRepository adminRepo;

@Override
public void run(String... args) throws Exception{
	this.adminRepo.save(new Admission("Kannan","Mohan","Chengalpattu",98765432,68,"navaneethak@kmail.com"));
	this.adminRepo.save(new Admission("Jankiraman","Sundaram","Kancheepuram",88829282,88,"Janairaman@kmail.com"));
	
}
}
