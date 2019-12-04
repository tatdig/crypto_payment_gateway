package ec.com.cryptogateway.repository;

import java.util.Collection;

import org.springframework.transaction.annotation.Transactional;

import ec.com.cryptogateway.base.IQueryDslBaseRepository;
import ec.com.cryptogateway.entity.CryptoCurrencyEntity;

/**
 * CryptoCurrency Repository
 *  
 * @author Christian
 *
 */

@Transactional(readOnly = true) 
public interface ICryptoCurrencyRepository extends IQueryDslBaseRepository<CryptoCurrencyEntity>  {
	
	/**
	 * Find all cryptocurrencys for id
	 * 
	 * @param coins
	 * @return
	 */
	Collection<CryptoCurrencyEntity> findCryptoCurrencys(Collection<String>  coins);
}
