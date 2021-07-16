package view_tier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model_tier.copy.Prodotto;
import service_tier.ProdottoService;

@CrossOrigin("*")
@RestController
public class ProdottoController {

	@Autowired
	ProdottoService ps;

	@RequestMapping("/get-all")
	@ResponseBody
	public List<Prodotto> getAllProdotto() {
		System.out.println("-----SIAMO DENTRO GET ALL PRODOTTO---------");
		return ps.mostraProdotti();

	}

	@RequestMapping("/remove")
	@ResponseBody
	public void rimuovi(@RequestBody Prodotto p) {
		System.out.println("-----SIAMO DENTRO REMOVE---------");
		ps.rimuoviProdotto(p);
	}

	@RequestMapping("/add")
	@ResponseBody
	public void aggiungi(@RequestBody Prodotto p) {
		System.out.println("-----SIAMO DENTRO ADD---------");
		ps.aggiungiProdotto(p);
	}
}
