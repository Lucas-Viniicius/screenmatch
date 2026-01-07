package br.com.lucas.screenmatch.service;

public interface IConverteDados {

    // Esse T significa que o tipo é genérico, ou seja: pode ser qualquer tipo de class
    // Já que eu nao sei qual é o dado que o usuário quer, se é dados da série, do episódio...
   <T> T obterDados(String json, Class<T> classe);
}
