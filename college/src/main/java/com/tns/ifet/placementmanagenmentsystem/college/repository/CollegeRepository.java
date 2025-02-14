package com.tns.ifet.placementmanagenmentsystem.college.repository;

public class CollegeRepository {
	import com.example.placementmanagement.model.College;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface CollegeRepository extends JpaRepository<College, Long> {
	    College findByCollegeCode(String collegeCode);
	}


}
