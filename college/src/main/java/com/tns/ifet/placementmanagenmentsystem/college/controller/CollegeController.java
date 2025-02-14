package com.tns.ifet.placementmanagenmentsystem.college.controller;

public class CollegeController {
	import com.example.placementmanagement.model.College;
	import com.example.placementmanagement.service.CollegeService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;
	import java.util.Optional;

	@RestController
	@RequestMapping("/colleges")
	public class CollegeController {

	    @Autowired
	    private CollegeService collegeService;

	    // Create College
	    @PostMapping
	    public ResponseEntity<College> createCollege(@RequestBody College college) {
	        return ResponseEntity.ok(collegeService.saveCollege(college));
	    }

	    // Get all Colleges
	    @GetMapping
	    public List<College> getAllColleges() {
	        return collegeService.getAllColleges();
	    }

	    // Get College by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<College> getCollegeById(@PathVariable Long id) {
	        Optional<College> college = collegeService.getCollegeById(id);
	        return college.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }

	    // Get College by Code
	    @GetMapping("/code/{collegeCode}")
	    public ResponseEntity<College> getCollegeByCode(@PathVariable String collegeCode) {
	        College college = collegeService.getCollegeByCode(collegeCode);
	        return (college != null) ? ResponseEntity.ok(college) : ResponseEntity.notFound().build();
	    }

	    // Update College
	    @PutMapping("/{id}")
	    public ResponseEntity<College> updateCollege(@PathVariable Long id, @RequestBody College collegeDetails) {
	        return ResponseEntity.ok(collegeService.updateCollege(id, collegeDetails));
	    }

	    // Delete College
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCollege(@PathVariable Long id) {
	        collegeService.deleteCollege(id);
	        return ResponseEntity.noContent().build();
	    }
	}





}
