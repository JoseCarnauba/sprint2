package br.com.fiap.stockagil.repository;

import br.com.fiap.stockagil.entidade.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto getProdutoById(Long id);
}

