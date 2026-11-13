package com.polytech.jeux.service;

import com.polytech.jeux.entity.Utilisateur;
import com.polytech.jeux.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import java.util.List;

@Service
@Transactional
public class UtilisateurService {
    @Autowired //baeldung
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur findUtilisateurById(int id) throws NotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findById(id).orElse(null);
        if (utilisateur == null) {
            throw new NotFoundException();
        }
        return utilisateur;
    }

    public List<Utilisateur> findAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public void updateUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    public void deleteUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.delete(utilisateur);
    }
}
