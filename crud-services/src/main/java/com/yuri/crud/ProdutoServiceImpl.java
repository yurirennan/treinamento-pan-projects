package com.yuri.crud;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    private static Map<String, Produto> produtoRepository = new HashMap<>();
    static {
        Produto chocolate = new Produto();
        chocolate.setId("1");
        chocolate.setNome("chocolate");

        produtoRepository.put(chocolate.getId(), chocolate);

        Produto trunfa = new Produto();
        trunfa.setId("2");
        trunfa.setNome("trunfa");

        produtoRepository.put(trunfa.getId(), trunfa);
    }

    @Override
    public void createProduto(Produto produto) {
        produtoRepository.put(produto.getId(), produto);
    }

    @Override
    public void deleteProduto(String id) {
        produtoRepository.remove(id);
    }

    @Override
    public Collection<Produto> getProdutos() {
        return produtoRepository.values();
    }
}
