package  pdv.com.br.pdvgestao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  pdv.com.br.pdvgestao.model.Acesso;
import  pdv.com.br.pdvgestao.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	
	public Acesso save(Acesso acesso) {
		
		/*Qualquer tipo de validação*/
		
		return acessoRepository.save(acesso);
	}

}
