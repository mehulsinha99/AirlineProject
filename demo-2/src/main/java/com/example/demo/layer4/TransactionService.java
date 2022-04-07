package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.layer2.model.AirTransaction;

@Service
public interface TransactionService {
	List<AirTransaction> findAllTransactionService();
	AirTransaction findTransactionByIdService(int trefid);
	void insertTransactionService(AirTransaction tRef);
	void updateTransactionService(AirTransaction tRef);
	void deleteTransactionService(int trefid);
}
