package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobPositionsService;
import hrms.hrms.dataAccess.abstracts.JobPositionsDao;
import hrms.hrms.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService{
	
	@Autowired
	private JobPositionsDao jobPositionsDao;

	//@Autowired  // Spring, JpaRepository'i extend ettiğinden arka planda instance class oluşturuyor. Bu eklenti ile o class'ı
	// buraya enjekte etmiş oluyorum.
	/*public JobPositionsManager(JobPositionsDao jobPositionsDao) {   // direkt injection için ve birden fazla parametre varsa constructor kullanıyorum
	// birden fazla yoksa yukarıda 1 tane olduğundan direkt olarak o class'ı jobPositionsDao türü olarak atanır.
	 *
		super();
		this.jobPositionsDao = jobPositionsDao;
	}
	*/

	@Override
	public List<JobPositions> getAll() {
		
		return this.jobPositionsDao.findAll();
		
	}
	
	
	
}
