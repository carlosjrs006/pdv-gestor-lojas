package  pdv.com.br.pdvgestao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import  pdv.com.br.pdvgestao.model.PessoaJuridica;

@Repository
public interface PesssoaRepository extends CrudRepository<PessoaJuridica, Long> {
	
	@Query(value = "select pj from PessoaJuridica pj where pj.cnpj = ?1")
	public PessoaJuridica existeCnpjCadastrado(String cnpj);

}
