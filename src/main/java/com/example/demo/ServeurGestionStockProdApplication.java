package com.example.demo;




import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;


@SpringBootApplication
public class ServeurGestionStockProdApplication  {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(ServeurGestionStockProdApplication.class, args);
//		
//	ProduitRepository produitRepository= ctx.getBean(ProduitRepository.class);
//		produitRepository.save(new Produit("Livre",50,20));
//		produitRepository.save(new Produit("Cahier",30,20.25f));
//		produitRepository.save(new Produit("Stylo",20,20.25f));
	}

	

}

