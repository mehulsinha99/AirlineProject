package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Transaction;

@RestController
public class TransactionController {
	
	List<Transaction> TransactionList = new ArrayList<Transaction>();
	
	public TransactionController() {
		
		Transaction t1 = new Transaction(221,13000,"Credit Card",'C',"Succeded");
		TransactionList.add(t1);
    }

	 @RequestMapping(path="/hello") // localhost:8080/hello
	 public String helloMessage() {
		 System.out.println("hello world!");
		 return "Welcome To The World Of Spring Web MVC";
	 }
	 
	 @RequestMapping(path="/getAllTran") //localhost:8080/getAllTran
	 public List<Transaction> getAllTransactions(){
		 System.out.println("Getting all Transactions");
		 return TransactionList;
	 }
}
