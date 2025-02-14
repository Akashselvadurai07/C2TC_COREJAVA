package com.tns.ifet.placementmanagenmentsystem.college.serivce;

public class CollegeService {
	import java.util.List;
	import java.util.Optional;

	@Service
	public class CollegeService {

	    @Autowired
	    private CollegeRepository collegeRepository;

	    // Create a new college
	    public College saveCollege(College college) {
	        return collegeRepository.save(college);
	    }

	    // Get all colleges
	    public List<College> getAllColleges() {
	        return collegeRepository.findAll();
	    }

	    // Get a college by ID
	    public Optional<College> getCollegeById(Long id) {
	        return collegeRepository.findById(id);
	    }

	    // Get a college by College Code
	    public College getCollegeByCode(String collegeCode) {
	        return collegeRepository.findByCollegeCode(collegeCode);
	    }

	    // Update College Details
	    public College updateCollege(Long id, College collegeDetails) {
	        College college = collegeRepository.findById(id).orElseThrow(() -> new RuntimeException("College not found"));
	        college.setName(collegeDetails.getName());
	        college.setCollegeCode(collegeDetails.getCollegeCode());
	        college.setAddress(collegeDetails.getAddress());
	        college.setCity(collegeDetails.getCity());
	        college.setState(collegeDetails.getState());
	        college.setPinCode(collegeDetails.getPinCode());
	        college.setEmail(collegeDetails.getEmail());
	        college.setPhoneNumber(collegeDetails.getPhoneNumber());
	        return collegeRepository.save(college);
	    }

	    // Delete a College
	    public void deleteCollege(Long id) {
	        collegeRepository.deleteById(id);
	    }
	}



}
