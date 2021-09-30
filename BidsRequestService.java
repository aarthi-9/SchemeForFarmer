package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.BidsRequest;
import com.example.demo.layer2.Farmer;

@Service
public interface BidsRequestService {
	BidsRequest findBidsRequestByIDService(int requestno);
	List<BidsRequest> findAllBidsRequestService();
}