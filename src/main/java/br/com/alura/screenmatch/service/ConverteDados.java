package br.com.alura.screenmatch.service;

import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T convertendo(String json, Class<T> tipoClasse) {
       try{
           return mapper.readValue(json, tipoClasse);
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }
}
