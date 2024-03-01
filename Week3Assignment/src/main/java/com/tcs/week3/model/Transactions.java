package com.tcs.week3.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TransactionsB")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String timestamp;
	private String status;
	private String spentType;
	private double spentAmount;
	private int invID;
	private enum instrumentType{
		bond,share,others
	}
	
}
