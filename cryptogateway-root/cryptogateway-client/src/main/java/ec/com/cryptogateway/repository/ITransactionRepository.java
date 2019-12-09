package ec.com.cryptogateway.repository;

import java.util.Collection;

import cryptogateway.vo.request.TransactionsVO;
import ec.com.cryptogateway.base.IQueryDslBaseRepository;
import ec.com.cryptogateway.entity.TransactionEntity;

/**
 * TransactionRepository Repository
 * 	
 * @author Christian
 *
 */
public interface ITransactionRepository extends  IQueryDslBaseRepository<TransactionEntity> {

	/**
	 * Find all transactions
	 * 
	 * @return
	 */
	Collection<TransactionsVO> findAllTransactions();
	
}
