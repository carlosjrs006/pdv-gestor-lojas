package  pdv.com.br.pdvgestao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import  pdv.com.br.pdvgestao.model.PessoaJuridica;
import  pdv.com.br.pdvgestao.repository.PesssoaRepository;
import  pdv.com.br.pdvgestao.service.PessoaUserService;
import junit.framework.TestCase;

@Profile("test")
@SpringBootTest(classes = PdvGestaoApplication.class)
public class TestePessoaUsuario extends TestCase {
	
	
	@Autowired
	private PessoaUserService pessoaUserService;
	
	@Autowired
	private PesssoaRepository pesssoaRepository;
	
	
	@Test
	public void testCadPessoaFisica() {
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setCnpj("865545598956556");
		pessoaJuridica.setNome("Carlos Junio");
		pessoaJuridica.setEmail("carlosjrs06.cj@gmail.com");
		pessoaJuridica.setTelefone("45999795800");
		pessoaJuridica.setInscEstadual("65556565656665");
		pessoaJuridica.setInscMunicipal("55554565656565");
		pessoaJuridica.setNomeFantasia("54556565665");
		pessoaJuridica.setRazaoSocial("4656656566");
		
		pesssoaRepository.save(pessoaJuridica);
		
		/*
		PessoaFisica pessoaFisica = new PessoaFisica();
		
		pessoaFisica.setCpf("0597975788");
		pessoaFisica.setNome("Alex fernando");
		pessoaFisica.setEmail("alex.fernando.egidio@gmail.com");
		pessoaFisica.setTelefone("45999795800");
		pessoaFisica.setEmpresa(pessoaFisica);*/
		
	}

}
