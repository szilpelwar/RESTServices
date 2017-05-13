package com.bank.interest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.interest.dto.Hello;
import com.bank.interest.dto.InterestRequest;
import com.bank.interest.dto.InterestReturnsResponse;
import com.bank.interest.service.InterestCalculatorService;

@RestController
public class BankReturnsController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    InterestCalculatorService interestCalculatorService;

    @RequestMapping("/hello")
    public Hello helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
        return new Hello(counter.incrementAndGet(),String.format(template, name));
    }
    
    @RequestMapping(value="/calculateReturn",method=RequestMethod.POST) 
    public InterestReturnsResponse calcSimpleIntReturns(@RequestBody InterestRequest request){
    	System.out.println(request.toString());
    	InterestReturnsResponse response = null;
    	if("SIMPLE".equals(request.getInterestType())){
    		Float simpleInterest = interestCalculatorService.calculateSimpleInterest(request);
    		response = new InterestReturnsResponse(simpleInterest, simpleInterest/65); // get the FX rate from JPA or a map
    	}
    	
    	else if("COMPOUND".equals(request.getInterestType())){
    		Float simpleInterest = interestCalculatorService.calculateCompoundInterest(request);
    		response = new InterestReturnsResponse(simpleInterest, simpleInterest/65); // get the FX rate from JPA or a map
    	}
    	return response;   	
    }
}