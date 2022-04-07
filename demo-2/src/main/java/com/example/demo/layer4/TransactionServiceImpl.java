package com.example.demo.layer4;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.layer2.model.AirTransaction;
import com.example.demo.layer3.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	TransactionRepository transRepo;
	
	
	public List<AirTransaction> findAllTransactionService() {
		System.out.println("findAllTransactionService() running..");
		return transRepo.selectAllTransacion();
	}

	
	public AirTransaction findTransactionByIdService(int trefid) {
		System.out.println("findTransactionByIdService running..");
		return transRepo.selectTransactionbyid(trefid);
	}

	
	public void insertTransactionService(AirTransaction tRef) {
		System.out.println("insertTransactionService running..");
		transRepo.insertTransaction(tRef);
	}

	
	public void updateTransactionService(AirTransaction tRef) {
		System.out.println("updateTransactionService running..");
		transRepo.updateTransaction(tRef);
	}

	
	public void deleteTransactionService(int trefid) {
		System.out.println("deleteTransactionService running..");
		transRepo.deleteTransaction(trefid);
	}

}
