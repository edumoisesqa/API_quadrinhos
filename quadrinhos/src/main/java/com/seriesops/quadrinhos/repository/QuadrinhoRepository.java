package com.seriesops.quadrinhos.repository;

import com.seriesops.quadrinhos.model.Quadrinho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuadrinhoRepository extends JpaRepository <Quadrinho, Long>{
    List<Quadrinho> findByEditora(String editora);

    List<Quadrinho> findByTitulo(String titulo);
}
