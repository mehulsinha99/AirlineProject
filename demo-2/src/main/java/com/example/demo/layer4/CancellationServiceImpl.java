package com.example.demo.layer4;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.layer2.model.AirCancellation;
import com.example.demo.layer3.CancellationRepository;

@Service
public class CancellationServiceImpl implements CancellationService {

	@Autowired
	CancellationRepository canRepo;
	
	public List<AirCancellation> findAllCancellationService() {
		return canRepo.selectAllCancellation();
	}

	
	public AirCancellation findCancellationByIdService(int crefid) {
		return canRepo.selectCancellationbyid(crefid);
	}

	
	public void insertCancellationService(AirCancellation cRef) {
		canRepo.insertCancellation(cRef);
	}

	
	public void updateCancellationService(AirCancellation cRef) {
		canRepo.updatecancellation(cRef);
	}

	
	public void deleteCancellationService(int crefid) {
		canRepo.deleteCancellation(crefid);
	}

}
