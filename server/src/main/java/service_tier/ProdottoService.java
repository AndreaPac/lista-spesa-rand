package service_tier;

import java.util.List;



import org.springframework.stereotype.Service;

import model_tier.Prodotto;

@Service

public interface ProdottoService {

	public List<Prodotto> mostraProdotti();

	public List<Prodotto> aggiungiProdotto(Prodotto p);

	public List<Prodotto> rimuoviProdotto(Prodotto p);

}
