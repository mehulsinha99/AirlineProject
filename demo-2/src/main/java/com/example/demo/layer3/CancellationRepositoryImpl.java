package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.model.AirCancellation;
import com.example.demo.layer2.model.AirTransaction;

@Repository("cancellationrepo")
public class CancellationRepositoryImpl extends BaseRepository implements CancellationRepository {
	
	CancellationRepositoryImpl(){
		System.out.println("CancellationRepositoryImpl constuctor");
	}
	
	@Transactional
	public void insertCancellation(AirCancellation cRef) {
		super.persist(cRef);

	}

	@Transactional
	public AirCancellation selectCancellationbyid(int cid) {
		return super.find(AirCancellation.class, cid);
	}

	@Transactional
	public List<AirCancellation> selectAllCancellation() {
		return super.findAll("AirCancellation");
	}

	@Transactional
	public void updatecancellation(AirCancellation cRef) {
		super.merge(cRef);

	}

	@Transactional
	public void deleteCancellation(int cid) {
		super.remove(AirCancellation.class, cid);
	}
	
	
	

}
