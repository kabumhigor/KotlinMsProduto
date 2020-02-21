package com.produto.kotlinmsprodutoapp.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import com.produto.kotlinmsprodutoapp.repository.ProdutoRepository
import org.springframework.web.bind.annotation.GetMapping
import com.produto.kotlinmsprodutoapp.model.Produto
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.http.ResponseEntity

@RestController
@RequestMapping("/api")

class ProdutoController(@Autowired private val produtoRepository: ProdutoRepository) {

    @GetMapping("/produtos")
    fun getAllProducts(): List<Produto> = produtoRepository.findAll()

    @GetMapping("/produtos/{codigo}")
    fun getProductById(@PathVariable codigo: Long) : ResponseEntity<Produto> =
            produtoRepository.findById(codigo).map {
                ResponseEntity.ok(it)
            }.orElse(ResponseEntity.notFound().build())
}