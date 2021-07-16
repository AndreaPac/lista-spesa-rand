package service_tier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model_tier.Prodotto;
import persistance_tier.ProdottoRepository;

public class ProdottoServiceImp implements ProdottoService{

	@Autowired
	ProdottoRepository pr;
	
	@Override
	public List<Prodotto> mostraProdotti() {
		return pr.findAll();
	}

	@Override
	public void aggiungiProdotto(Prodotto p) {
		pr.save(p);
	}

	@Override
	public void rimuoviProdotto(Prodotto p) {
		pr.delete(p);
	}

}
