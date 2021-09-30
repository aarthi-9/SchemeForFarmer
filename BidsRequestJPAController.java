package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer5.NotFoundException;
import com.example.demo.layer2.BidsRequest;
import com.example.demo.layer3.BidsRequestRepository;
import com.example.demo.layer4.BidsRequestService;


@CrossOrigin(origins = "", value = "")
@RestController
public class BidsRequestJPAController {

	@Autowired
	BidsRequestService bidsRequestService;

	//@Autowired 
	//FarmerRepository farmerRepo;
	
	public BidsRequestJPAController() {
		System.out.println("BidsRequestJPAController...");
	}

	@GetMapping
	@RequestMapping(path="/getJPABidsRequest/") //localhost:8080/getJPABidsMade
	public List<BidsRequest> getAllBidsRequest() {
		System.out.println("getAllBidsRequest");
		return bidsRequestService.findAllBidsRequestService();
	}
	
	/*@GetMapping
	@RequestMapping(path="/getJPAFarmers/") //localhost:8080/getFarmers/
	public List<Farmer> getAllFarmers() {
		System.out.println("getAllFarmers");
		return farmerRepo.selectAllFarmers();
	}*/
	
	@GetMapping
	@RequestMapping(path="/getJPABidsRequest/{requestno}") // localhost:8080/getJPAFarmer/101
	public BidsRequest getSingleBidsRequest(@PathVariable("requestno") int requestnoToFind) throws NotFoundException 
	{
		System.out.println("getbidsRequest : "+requestnoToFind);
		BidsRequest foundbidsrequest = null;
		foundbidsrequest = bidsRequestService.findBidsRequestByIDService(requestnoToFind);
	
		if(foundbidsrequest == null) {
			NotFoundException b = new NotFoundException("BiddingID Not Found "+ requestnoToFind);
		}
		return foundbidsrequest;
	}
}
	