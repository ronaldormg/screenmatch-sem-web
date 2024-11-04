package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //função de tipo genérico que retorna um objeto de tipo
    // especificado no parâmetro
    <T> T obterDados(String json, Class<T> classe);
}
