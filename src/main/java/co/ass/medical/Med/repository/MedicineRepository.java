package co.ass.medical.Med.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.ass.medical.Med.model.Medicine;

public interface MedicineRepository extends MongoRepository<Medicine,String>{
	
	List<Medicine> findByCnameRegex(String cname);

}
