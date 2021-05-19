package co.ass.medical.Med.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ass.medical.Med.model.Medicine;
import co.ass.medical.Med.model.Order;
import co.ass.medical.Med.repository.MedicineRepository;
import co.ass.medical.Med.repository.OrderRepository;

@Service
public class MedicineService {

	@Autowired
	private MedicineRepository repository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	public void addMedicines(List<Medicine> medicines) {
		System.out.println("Saving "+medicines.size());
		for(int i=0;i<5;i++) {
			System.out.println(medicines.get(i).getcUniqueCode());
		}
		repository.saveAll(medicines);
	}
	public List<Medicine>  getAllMedicines(){
		return repository.findAll();
	}
	public long countMedicines() {
		return repository.count();
	}
	public List<Medicine> searchByName(String cname){
		return repository.findByCnameRegex(cname);
	}
	public Medicine getMedicine(String id) {
		return repository.findById(id).orElseThrow(()-> new RuntimeException("No Medicine found with unique code "+id));
	}
	public List<String> searchNameByName(String name){
		List<Medicine> r = searchByName(name);
		List<String> names = new ArrayList<>();
		for(Medicine m:r) {
			names.add(m.getCname());
		}
		return names;
	}
	public Order order(Medicine medicine,int quantity) {
		Order order = new Order();
		order.setMedicine(medicine);
		order.setQuantity(quantity);
		orderRepository.save(order);
		return order;
	}
	
}
