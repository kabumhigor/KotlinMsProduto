package com.produto.kotlinmsprodutoapp.repository


import org.springframework.data.jpa.repository.JpaRepository
import com.produto.kotlinmsprodutoapp.model.Produto
import org.springframework.stereotype.Repository

@Repository
interface ProdutoRepository : JpaRepository<Produto, Long>{
}