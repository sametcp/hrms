package hrms.hrms.business.abstracts;

import java.util.List;

import hrms.hrms.entities.concretes.JobPositions;

public interface JobPositionsService {
	
	List<JobPositions> getAll();
	
}
