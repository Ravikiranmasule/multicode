package com.hms.api.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.api.dao.TransactionDao;
import com.hms.api.entity.TransactionDetails;

@Repository
public class TransactionDaoIMPL implements TransactionDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public int generateSalaryForUser(TransactionDetails transactionDetails) {
		return 0;
	}

	@Override
	public TransactionDetails getTransactionDetails(String transactionId) {
		return null;

	}

	
	@Override
	public List<TransactionDetails> getTransactionDetails(String username, int from, int to) {
		return null;
	}

}
