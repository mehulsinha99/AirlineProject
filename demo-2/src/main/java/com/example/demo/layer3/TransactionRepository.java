package com.example.demo.layer3;

import java.util.List;
import com.example.demo.layer2.model.AirTransaction;

public interface TransactionRepository {
	void insertTransaction(AirTransaction tRef);
	AirTransaction selectTransactionbyid(int tid);
	List<AirTransaction> selectAllTransacion();
	void updateTransaction(AirTransaction tRef);
	void deleteTransaction(int tid);
}
