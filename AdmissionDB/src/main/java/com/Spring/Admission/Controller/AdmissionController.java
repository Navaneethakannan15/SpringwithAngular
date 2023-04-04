package com.Spring.Admission.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Admission.Exception.AdmissionException;
import com.Spring.Admission.Model.Admission;
import com.Spring.Admission.Repository.AdmissionRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class AdmissionController {
	@Autowired
	private AdmissionRepository adminRepo;
	
	@GetMapping("/AdmissionDetails")
	public List<Admission> getDetails(){
		
		return adminRepo.findAll();
	}
	@PostMapping("/AdmissionDetails")
	public Admission createAdmission(@RequestBody Admission admission) {
		return adminRepo.save(admission);
	}
	@GetMapping("/admission/{id}")
	public ResponseEntity<Admission> getAdmissionById(@PathVariable int id){
		Admission admission=adminRepo.findById(id).orElseThrow(()-> new AdmissionException("There is no record in this id: "+id));
		return ResponseEntity.ok(admission);
		
	}
	@PutMapping("/admission/{id}")
	public ResponseEntity<Admission> updateAdmission(@PathVariable int id, @RequestBody Admission admissionDetails){
		Admission admission=adminRepo.findById(id).orElseThrow(()->new AdmissionException("There is no record in this id: "+id));
		admission.setName(admissionDetails.getName());
		admission.setSurname(admissionDetails.getSurname());
		admission.setCity(admissionDetails.getCity());
		admission.setCellNo(admissionDetails.getCellNo());
		admission.setMark(admissionDetails.getMark());
		admission.setEmail(admissionDetails.getEmail());
		Admission updateAdmission=adminRepo.save(admission);
		return ResponseEntity.ok(updateAdmission);
	}
	
	@DeleteMapping("/Admission/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteAdmission(@PathVariable int id)
	{
		Admission admission=adminRepo.findById(id).orElseThrow(()->new AdmissionException("There is no record in this id: "+id));
		adminRepo.delete(admission);
		Map<String,Boolean> response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

}
