package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.BidsMade;
import com.example.demo.layer2.Farmer;

@Repository
public class BidsMadeRepositoryImpl extends BaseRepository implements BidsMadeRepository {

	@Transactional
	public void insertBidsMade(BidsMade Bmref) {
		// TODO Auto-generated method stub
		super.persist(Bmref);

	}

	@Transactional
	public BidsMade selectBidsMadeByID(int biddingId) {
		// TODO Auto-generated method stub
		return super.find(BidsMade.class, biddingId);
	}

	@Transactional
	public List<BidsMade> selectAllBidsMade() {
		// TODO Auto-generated method stub
		return super.findAll("BidsMade");
	}

	@Transactional
	public void updateSingleBidsMade(BidsMade Bmref) {
		// TODO Auto-generated method stub
		super.merge(Bmref);

	}

	@Transactional
	public void deleteSingleBidsMade(int biddingId) {
		// TODO Auto-generated method stub
		super.remove(BidsMade.class,biddingId);

	}

}
