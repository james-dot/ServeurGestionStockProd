package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.entity.Produit;
import com.example.demo.service.ICrudService;

@Service
public class ImplProduitService implements ICrudService<Produit, Long>{
	
	private List<Produit> produits;
	//constructeur par defaut
	public ImplProduitService() {
		produits =new ArrayList<Produit>();
		//creation trois produits
		produits.add(new Produit("Livre",50,20));
		produits.add(new Produit("Cahier",30,20.25f));
		produits.add(new Produit("Stylo",20,20.25f));
	}
	
	@Override
	public List<Produit> getAll() {
		return produits;
	}

	@Override
	public void add(Produit produit) {
		
		produits.add(produit);
	}

	@Override
	public void update(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void delete(Long id) {
		Produit produit=new Produit();
		produit.setId(id);
		produits.remove(produit);
		
	}

	@Override
	public void saveAll(Iterable<Produit> iterable) {//pour enregistrer le contenu du fichier ligne par ligne 
		Iterator<Produit> iterator = iterable.iterator();
		if(iterator.hasNext()) {
			produits.add(iterator.next());
		}
		
		
	}

}
