package service_tier;

import java.util.List;

import org.springframework.stereotype.Service;

import model_tier.Prodotto;

@Service
public interface ProdottoService {

	public List<Prodotto> mostraProdotti();

	public void aggiungiProdotto(Prodotto p);

	public void rimuoviProdotto(Prodotto p);

}
