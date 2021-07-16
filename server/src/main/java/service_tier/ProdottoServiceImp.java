package service_tier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import model_tier.Prodotto;
import persistance_tier.ProdottoRepository;

@Transactional
public class ProdottoServiceImp implements ProdottoService {

	@Autowired
	ProdottoRepository pr;

	@Override
	public List<Prodotto> mostraProdotti() {
		return pr.findAll();
	}

	@Override
	public List<Prodotto> aggiungiProdotto(Prodotto p) {
		if (p != null) {
			pr.save(p);
		}
		return mostraProdotti();
	}

	@Override
	public List<Prodotto> rimuoviProdotto(Prodotto p) {
		if (p.getId() != null) {
			pr.deleteById(p.getId());
		}

		return mostraProdotti();
	}

}
