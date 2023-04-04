package com.Spring.Admission.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.Admission.Model.Admission;
@Repository
public interface AdmissionRepository extends JpaRepository<Admission, Integer> {

}
