package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.BidsMade;
import com.example.demo.layer2.BidsRequest;

@Repository
public class BidsRequestRepositoryImpl extends BaseRepository implements BidsRequestRepository {

	@Transactional
	public void insertBidsRequest(BidsRequest Brref) {
		// TODO Auto-generated method stub
		super.persist(Brref);

	}

	@Transactional
	public BidsRequest selectBidsRequestByID(int requestno) {
		// TODO Auto-generated method stub
		return super.find(BidsRequest.class, requestno);
	}

	@Transactional
	public List<BidsRequest> selectAllBidsRequest() {
		// TODO Auto-generated method stub
		return super.findAll("BidsRequest");
	}

	@Transactional
	public void updateSingleBidsRequest(BidsRequest Brref) {
		// TODO Auto-generated method stub
		super.merge(Brref);

	}

	@Transactional
	public void deleteSingleBidsRequest(int requestno) {
		// TODO Auto-generated method stub
		super.remove(BidsMade.class,requestno);

	}

}
