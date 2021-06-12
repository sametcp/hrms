package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.JobPositionsService;
import hrms.hrms.entities.concretes.JobPositions;

@RestController  // controller olduğunu belirttim
@RequestMapping("/api/jobpositions")  // istek alacağım domain
public class JobPositionsController {  // api

	private JobPositionsService jobPositionsService;  // manager'a(business) istekleri göndericem

	@Autowired  // JobPositionsService'i kim implemente etmiş buluyor. ona eş değer class'ı arka planda instance ediyor. o instance class'ı da buraya aldım.
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	
	@GetMapping("/getall")
	public List<JobPositions> getall(){
		
		return this.jobPositionsService.getAll();
		
	}
	
}
