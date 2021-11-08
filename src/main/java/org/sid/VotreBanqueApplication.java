package org.sid;


import java.util.Date;

import org.sid.dao.ClientRepository;
import org.sid.dao.CompteRepository;
import org.sid.dao.OperationRepository;
import org.sid.entities.Client;
import org.sid.entities.Compte;
import org.sid.entities.CompteCourant;
import org.sid.entities.CompteEpargne;
import org.sid.entities.Retrait;
import org.sid.entities.Versement;
import org.sid.metier.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VotreBanqueApplication implements CommandLineRunner{

	    @Autowired
	    private ClientRepository clientRepository;
	    @Autowired
	    private CompteRepository compteRepository;
	    @Autowired
	    private OperationRepository operationRepository;
	    @Autowired
	    private IBanqueMetier banqueMetier;
	    public static void main(String[] args) {
		SpringApplication.run(VotreBanqueApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Client c1=clientRepository.save(new Client("Ibrahim","diarrai@gmail.com"));
		Client c2=clientRepository.save(new Client("Amadou","amadou@gmail.com"));
		Client c3=clientRepository.save(new Client("Fatoumata","fatou@gmail.com"));
		
		Compte cp1=compteRepository.save(new CompteCourant("c1", new Date(), 1000000, c1, 250000));
		Compte cp2=compteRepository.save(new CompteEpargne("c2", new Date(), 600000, c2, 5.5));
		
		operationRepository.save(new Versement(new Date(), 50000,cp1));
		operationRepository.save(new Versement(new Date(), 60000,cp1));
		operationRepository.save(new Versement(new Date(), 25000,cp1));
		operationRepository.save(new Retrait(new Date(), 45000,cp1));
		
		operationRepository.save(new Versement(new Date(), 150000,cp2));
		operationRepository.save(new Versement(new Date(), 160000,cp2));
		operationRepository.save(new Versement(new Date(), 251000,cp2));
		operationRepository.save(new Retrait(new Date(), 145000,cp2));
		
		banqueMetier.verser("c1", 100);
		*/
		
	}

}
