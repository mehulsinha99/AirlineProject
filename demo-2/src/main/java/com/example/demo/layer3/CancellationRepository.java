package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.model.AirCancellation;

public interface CancellationRepository {
	void insertCancellation(AirCancellation cRef);
	AirCancellation selectCancellationbyid(int cid);
	List<AirCancellation> selectAllCancellation();
	void updatecancellation(AirCancellation cRef);
	void deleteCancellation(int cid);
}
