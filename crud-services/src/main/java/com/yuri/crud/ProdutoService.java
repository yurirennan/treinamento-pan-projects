package com.yuri.crud;

import org.springframework.stereotype.Service;

import java.util.Collection;

public interface ProdutoService {

    void createProduto(Produto produto);
    void deleteProduto(String id);
    Collection<Produto> getProdutos();
}
