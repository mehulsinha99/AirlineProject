package com.example.demo.layer4;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.layer2.model.AirCancellation;


@Service
public interface CancellationService {
	List<AirCancellation> findAllCancellationService();
	AirCancellation findCancellationByIdService(int crefid);
	void insertCancellationService(AirCancellation cRef);
	void updateCancellationService(AirCancellation cRef);
	void deleteCancellationService(int crefid);
}
