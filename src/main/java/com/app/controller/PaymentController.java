package com.app.controller;

import com.app.exception.ResourceNotFoundException;
import com.app.model.CreditorDetails;
import com.app.model.DebitorDetails;
import com.app.model.Payment;
import com.app.model.Response;
import com.app.model.ResponseMessage;
import com.app.model.Status;
import com.app.repository.PaymentRepository;
import com.app.repository.creditorDetailsRepo;
import com.app.repository.debitorDetailsRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/paymentsapi/initiate-payment")
public class PaymentController {


	 @Autowired
	  private PaymentRepository paymentRepository;

	 @Autowired
	  private creditorDetailsRepo creditorDetailsRepository;

	 @Autowired
	  private debitorDetailsRepo debitorDetailsRepository;
	 
	
	  @PostMapping("/paymentrequest")
	  public ResponseEntity createPayment(@Valid @RequestBody Payment paymentrequest) throws ResourceNotFoundException {

		  ResponseMessage rm = new ResponseMessage();
		  Status status = new Status();
		  Response response = new Response();

		  DebitorDetails deb = paymentrequest.getDebitorDetails();
		  debitorDetailsRepository.save(deb);

		  CreditorDetails cred = paymentrequest.getCreditorDetails();
		  creditorDetailsRepository.save(cred);

		  Payment p=paymentRepository.save(paymentrequest);
		 
		  
		  //any logic
		    if (p == null) {
				return new ResponseEntity(rm,HttpStatus.NOT_ACCEPTABLE);
		    } else {
		    	
		    	status.setSuccessFlag(0);
		    	
		    	response.setErrorReference("null_");
		    	response.setErrorDescription("null_");
		    	response.setTransactionReference((int) p.getTransactionId());
		    }
		  
		  rm.setStatus(status);
		  rm.setResponse(response);
		  return new ResponseEntity(rm,HttpStatus.OK);

  }  

	  
  @GetMapping("/payments")
  public List<Payment> getAllPayments() {
    return paymentRepository.findAll();
  }


  @GetMapping("/payments/{id}")
  public ResponseEntity<Payment> getPaymentById(@PathVariable(value = "id") Long transactionId)
      throws ResourceNotFoundException {
    Payment payment =paymentRepository.findById(transactionId).orElseThrow(() -> new ResourceNotFoundException("Payment not found on :: " + transactionId));
    return ResponseEntity.ok().body(payment);
  }
}