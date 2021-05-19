package co.ass.medical.Med.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;

import co.ass.medical.Med.dto.OrderDTO;
import co.ass.medical.Med.dto.OrderResponse;
import co.ass.medical.Med.model.MedicinRow;
import co.ass.medical.Med.model.Medicine;
import co.ass.medical.Med.model.Order;
import co.ass.medical.Med.service.MedicineService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/master")
public class MasterDataController extends ParentController{

	@Autowired
	private MedicineService service;
	
	@PostMapping("uploadCSV")
    public ResponseEntity<?> uploadFile(@RequestParam(value = "file") MultipartFile file) throws IOException
    {
		
		List<MedicinRow> data = Poiji.fromExcel(file.getInputStream(),PoijiExcelType.XLSX, MedicinRow.class);
		//CsvUtils.read(MedicinRow.class, file.getInputStream())
		List<Medicine> medicines = new ArrayList<>();
		for(MedicinRow row:data) {
			medicines.add(row.toMedicin());
		}
		service.addMedicines(medicines);
		
		return getResponse(""+service.countMedicines());
        
    }
	
	@GetMapping("searchMedicine")
	 public ResponseEntity<?>  searchByName(@RequestParam("q") String cname){
		return getListResponse(service.searchNameByName(cname),"result for "+cname);
	}
	
	@GetMapping("getMedicineDetails")
	 public ResponseEntity<?>  searchByCode(@RequestParam("id") String c_unique_id){
		return getResponse(service.getMedicine(c_unique_id));
	}
	@PostMapping("placeorder")
	public ResponseEntity<?>  placeorder(@RequestBody OrderDTO dto){
		Medicine medicine = service.getMedicine(dto.getC_unique_id());
		
		Order order = service.order(medicine, dto.getQuntity());
		
		OrderResponse response = new OrderResponse();
		response.setId(order.getId());
		return getResponse(response);
		
	}
}
