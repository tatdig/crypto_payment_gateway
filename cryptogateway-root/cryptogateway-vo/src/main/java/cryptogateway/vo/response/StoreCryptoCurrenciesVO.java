package cryptogateway.vo.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Send information about cryptocurrency 
 * accepted for the store
 * 
 * @author Christian
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreCryptoCurrenciesVO {

	private String cryptoCurrencyLogo;
	private String cryptoCurrencyName;
	private BigDecimal cryptoCurrencyPrice;
	private BigDecimal cryptoCurrencyConversion;
	private BigDecimal totalPayment;	
	private String coinId;
	Integer blockchainId;
	String blockchainName;
	String javaClass;
	private Integer idCoin;
	private Integer idStore;
	private Integer timeoutMinuts;
}
