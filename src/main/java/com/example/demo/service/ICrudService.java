package com.example.demo.service;

import java.util.List;



public interface ICrudService<T, ID> {   //interface generic
	List<T> getAll();
	void add(T entity);
	void update(T entity);
	void delete(ID id);
	void saveAll(Iterable<T> iterable);    //pour enregistrer le contenu du fichier ligne par ligne 
}
