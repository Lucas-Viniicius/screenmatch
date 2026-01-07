package br.com.lucas.screenmatch.service;

import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper(); // O ObjectMapper é uma classe da biblioteca Jackson, muito usada em Java para converter objetos Java ↔ JSON.

    @Override 
    public <T> T obterDados(String json, Class<T> classe){ // usando polimorfismo para implementar uma interface que pode ser utilizada por várias classes (por isso o <T>)
        try{
            return mapper.readValue(json, classe); // readValue é um método do ObjectMapper que trasforma json em objeto java
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
