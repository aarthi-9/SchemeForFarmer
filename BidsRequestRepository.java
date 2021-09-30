package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.BidsRequest;

@Repository
public interface BidsRequestRepository {
	void insertBidsRequest(BidsRequest Brref);
	BidsRequest selectBidsRequestByID(int requestno);
    List<BidsRequest> selectAllBidsRequest();
    void updateSingleBidsRequest(BidsRequest Brref);
    void deleteSingleBidsRequest(int requestno);
}
