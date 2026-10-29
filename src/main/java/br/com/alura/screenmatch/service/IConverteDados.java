package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T convertendo(String json, Class<T> tipoClasse);
}
