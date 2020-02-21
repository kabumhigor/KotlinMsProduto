package com.produto.kotlinmsprodutoapp.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity(name = "kb_produtos")
data class Produto(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val codigo : Long = 0,
                   @get: NotBlank @SerializedName("produto_nome") val produtoNome : String = "",
                   @get: NotBlank val disponibilidade : Int = 0,
                    @get: NotBlank val preco : Double): Serializable