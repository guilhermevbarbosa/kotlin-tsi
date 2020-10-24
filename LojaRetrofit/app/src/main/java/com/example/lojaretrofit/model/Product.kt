package com.example.lojaretrofit.model

data class Product (
    var descontoPromocao: Double,
    var idCategoria: Int,
    var idProduto: Int,
    var qtdMinEstoque: Int,
    var precProduto: Double,
    var descProduto: String,
    var ativoProduto: Boolean,
    var nomeProduto: String
)