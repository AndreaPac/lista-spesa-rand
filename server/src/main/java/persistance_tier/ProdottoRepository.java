package persistance_tier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model_tier.copy.Prodotto;



@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long>{

	
	
}
