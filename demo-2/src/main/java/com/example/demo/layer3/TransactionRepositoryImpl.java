package com.example.demo.layer3;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.model.AirTransaction;

@Repository("transactionrepo")
public class TransactionRepositoryImpl extends BaseRepository implements TransactionRepository {
	
	TransactionRepositoryImpl(){
		System.out.println("TransactionRepoImpl");
	}
	@Transactional
	public void insertTransaction(AirTransaction tRef) {
		super.persist(tRef);

	}

	@Transactional
	public AirTransaction selectTransactionbyid(int tid) {
		return super.find(AirTransaction.class, tid);
	}

	@Transactional
	public List<AirTransaction> selectAllTransacion() {
		return super.findAll("AirTransaction");
	}
	
	@Transactional
	public List<AirTransaction> selectbyTransactionMode(String tMode) {
		return super.findAll("AirTransaction t where TRANSACTION_MODE= '"+tMode+"'");
	}

	@Transactional
	public void updateTransaction(AirTransaction tRef) {
		super.merge(tRef);
	}

	@Transactional
	public void deleteTransaction(int tid) {
		super.remove(AirTransaction.class, tid);
	}

}
