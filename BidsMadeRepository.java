package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.BidsMade;

@Repository
public interface BidsMadeRepository {
	void insertBidsMade(BidsMade Bmref);
    BidsMade selectBidsMadeByID(int biddingId);
    List<BidsMade> selectAllBidsMade();
    void updateSingleBidsMade(BidsMade Bmref);
    void deleteSingleBidsMade(int biddingId);
}
