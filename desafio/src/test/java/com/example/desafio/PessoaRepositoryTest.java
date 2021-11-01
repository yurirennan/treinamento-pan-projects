package com.example.desafio;

import com.example.desafio.domain.Pessoa;
import org.junit.Before;
import org.junit.Rule;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.validation.ConstraintViolationException;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PessoaRepositoryTest {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Pessoa pessoa;

    @Before
    public void start() {
        pessoa = new Pessoa("999.999.999-99", "Pessoa nome", "pessoa@email.com", 23);
    }

    @Test
    public void saveComNomeNuloDeveLancarException() {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O nome deve ser preenchido");

        pessoa.setNome(null);
        pessoaRepository.save(pessoa);
    }

    @Test
    public void saveComEmailNuloDeveLancarException() {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O email deve ser preenchido");

        pessoa.setEmail(null);
        pessoaRepository.save(pessoa);
    }

    @Test
    public void saveComCpfNuloDeveLancarException() {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O cpf deve ser preenchido");

        pessoa.setCpf(null);
        pessoaRepository.save(pessoa);
    }

    @Test
    public void saveComIdadeNuloDeveLancarException() {
        expectedException.expect(ConstraintViolationException.class);
        expectedException.expectMessage("O idade deve ser preenchido");

        pessoa.setIdade(null);
        pessoaRepository.save(pessoa);
    }

}
