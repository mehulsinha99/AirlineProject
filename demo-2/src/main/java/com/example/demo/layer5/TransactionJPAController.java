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
import com.example.demo.layer2.model.AirTransaction;
import com.example.demo.layer4.TransactionService;

@CrossOrigin(origins = "*", value = "*")
@RestController
public class TransactionJPAController {
	
	@Autowired
	TransactionService transServ;
	
	public TransactionJPAController(){
		System.out.println("TransactionJPAController running..");
	}
	
	@GetMapping
	@RequestMapping(path="/getAllTrans") //localhost:8080/getAllTrans
	public List<AirTransaction> getAllTransactions(){
		return transServ.findAllTransactionService();
	}
	
	@GetMapping
	@RequestMapping(path="/getTransID/{tid}") //localhost:8080/getTransID/221
	public AirTransaction getTransactionById(@PathVariable("tid") int transToFind) throws TransactionNotFoundException{
		
		AirTransaction foundTran = null;
		foundTran = transServ.findTransactionByIdService(transToFind);
	
		if(foundTran == null) {
			TransactionNotFoundException t = new TransactionNotFoundException("Not Found "+transToFind);
		}
		return foundTran;	
	}
	
	@PostMapping
	@RequestMapping(path="/addTrans") //localhost:8080/addTrans
	public void addTransaction(@RequestBody AirTransaction transToInsert) throws TransactionNotFoundException{
		AirTransaction newTran = new AirTransaction();
		newTran.setTransactionAmount(transToInsert.getTransactionAmount());
		newTran.setTransactionMode(transToInsert.getTransactionMode());
		newTran.setTransactionType(transToInsert.getTransactionType());
		newTran.setTransactionStatus(transToInsert.getTransactionStatus());
		transServ.insertTransactionService(newTran);
	}
	
	@PostMapping
	@RequestMapping(path="/modifyTran") //localhost:8080/modifyTran
	public void modifyTransaction(@RequestBody AirTransaction transToModify) throws TransactionNotFoundException{
		
		boolean found=false;
		transServ.updateTransactionService(transToModify);
		found = true;
		if(found) {
			System.out.println("Record modified...");
			
		} else {
			System.out.println("Not found");
			TransactionNotFoundException NotFoundEx = new TransactionNotFoundException("Number Not Found");
			throw NotFoundEx;
		}
		
	}
	
	@PostMapping
	@RequestMapping(path="/deleteTran") //localhost:8080/deleteTran
	public void deleteTransaction(@RequestBody AirTransaction transToDelete) throws TransactionNotFoundException{
		boolean found=false;
		transServ.deleteTransactionService(transToDelete.getTransactionId());
		found = true;
		if(found) {
			System.out.println("Record deleted...");
			
		} else {
			System.out.println("Not found");
			TransactionNotFoundException NotFoundEx = new TransactionNotFoundException("Number Not Found");
			throw NotFoundEx;
		}
	}
	
	
}
