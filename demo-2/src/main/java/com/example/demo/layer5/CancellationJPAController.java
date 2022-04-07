package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.layer2.model.AirCancellation;
import com.example.demo.layer4.CancellationService;


@CrossOrigin(origins = "*", value = "*")
@RestController
public class CancellationJPAController {
	
	@Autowired
	CancellationService canServ;
	
	public CancellationJPAController() {
		System.out.println("CancellationJPAController running..");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@GetMapping
	@RequestMapping(path="/getAllCan") //localhost:8080/getAllCan
	public List<AirCancellation> getAllCancel(){
		return canServ.findAllCancellationService();
	}
	
	@GetMapping
	@RequestMapping(path="/getCanID/{cid}") //localhost:8080/getCanID/141
	public AirCancellation getCancelById(@PathVariable("cid") int canToFind) throws CancellationNotFoundException{
		
		AirCancellation found = null;
		found = canServ.findCancellationByIdService(canToFind);
	
		if(found == null) {
			CancellationNotFoundException t = new CancellationNotFoundException("Not Found ");
		}
		return found;	
	}
	
	@PostMapping
	@RequestMapping(path="/addCan") //localhost:8080/addCan
	public void addCancellation(@RequestBody AirCancellation canToInsert) throws CancellationNotFoundException{
		AirCancellation newCan = new AirCancellation();
		newCan.setCancellationDate(canToInsert.getCancellationDate());
		newCan.setCancellationReason(canToInsert.getCancellationReason());
		newCan.setCancellationStatus(canToInsert.getCancellationStatus());
		newCan.setRefundAmount(canToInsert.getRefundAmount());
		
		canServ.insertCancellationService(newCan);
	}
	
	@PostMapping
	@RequestMapping(path="/modifyCan") //localhost:8080/modifyCan
	public void modifyCancellation(@RequestBody AirCancellation canToModify) throws CancellationNotFoundException{
		
		boolean found=false;
		canServ.updateCancellationService(canToModify);
		found = true;
		if(found) {
			System.out.println("Record modified...");
			
		} else {
			System.out.println("Not found");
			CancellationNotFoundException NotFoundEx = new CancellationNotFoundException("Number Not Found");
			throw NotFoundEx;
		}	
	}
	
	@PostMapping
	@RequestMapping(path="/deleteCan") //localhost:8080/deleteCan
	public void deleteCancellation(@RequestBody AirCancellation canToDelete) throws CancellationNotFoundException{
		boolean found=false;
		canServ.deleteCancellationService(canToDelete.getCancellationId());
		found = true;
		if(found) {
			System.out.println("Record deleted...");
			
		} else {
			System.out.println("Not found");
			CancellationNotFoundException NotFoundEx = new CancellationNotFoundException("Number Not Found");
			throw NotFoundEx;
		}
	}
}
