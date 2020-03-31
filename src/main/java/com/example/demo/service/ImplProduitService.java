package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.entity.Produit;

@Service
public class ImplProduitService implements IProduitService{
	
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
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		
		produits.add(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit=new Produit();
		produit.setId(id);
		produits.remove(produit);
		
	}

}
