package com.tcs.week3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.week3.model.Transactions;

@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Integer> {

}
