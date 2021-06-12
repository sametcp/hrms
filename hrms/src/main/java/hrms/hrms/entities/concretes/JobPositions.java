package hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobpositions")
public class JobPositions {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "job_title")
	private String position;
	
	@Column(name = "created_date")
	private String createdDate;
	
	@Column(name = "is_active" , columnDefinition = "boolean default true")
	private String isActive;
	
	@Column(name = "is_deleted" , columnDefinition = "boolean default false")
	private String isDeleted;
}
