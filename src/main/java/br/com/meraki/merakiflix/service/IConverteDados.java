package br.com.meraki.merakiflix.service;

public interface IConverteDados {

   <T> T obterdados(String json, Class<T> classe);
}
