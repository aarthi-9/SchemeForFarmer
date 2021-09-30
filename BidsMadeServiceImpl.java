package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.BidsMade;
import com.example.demo.layer3.BidsMadeRepository;

@Service
public class BidsMadeServiceImpl implements BidsMadeService {

	
	@Autowired
	BidsMadeRepository BmRepo;
	
	
	public BidsMade findBidsMadeByIDService(int biddingId) {
		// TODO Auto-generated method stub
		System.out.println("BidsMade service impl....");
		if(biddingId<0) {
			RuntimeException rte = new RuntimeException("Bidding Id Cannot be Negative");
			throw rte;
		}
		return BmRepo.selectBidsMadeByID(biddingId);
	}

	
	public List<BidsMade> findAllBidsMadeService() {
		// TODO Auto-generated method stub
		return BmRepo.selectAllBidsMade();
	}
	
}