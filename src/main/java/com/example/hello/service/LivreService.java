package com.example.hello.service;

import com.example.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class LivreService {

    //ATTRIBUT
    private List<Livre> livreList;

    //CONSTRUCTEUR
    public LivreService() {
        livreList = new ArrayList<Livre>();
    }

    //GETTERS SETTERS
    public List<Livre> getLivreList() {
        return livreList;
    }

    public void setLivreList(List<Livre> livreList) {
        this.livreList = livreList;
    }

    //METHODS
    public void add() {
        Livre livre = new Livre();
        Scanner sc = new Scanner(System.in);

        System.out.println("Titre du livre : ");
        livre.setTitre(sc.nextLine());

        System.out.println("description du livre : ");
        livre.setDescription(sc.nextLine());

        System.out.println("Date de publication du livre : ");
        livre.setDatePublication(sc.nextLine());

        System.out.println("Genre du livre : ");
        livre.setGenre(sc.nextLine());

        livreList.add(livre);
    }

    public void remove() {
        System.out.println("Quel titre voulez vous supprimer ?");
        Scanner sc = new Scanner(System.in);
        String titre = sc.nextLine();
        for (Livre livre : livreList) {
            if (livre.getTitre().equals(titre)) {
                livreList.remove(livre);
                break;
            }
        }
    }

    public void findAll() {
        for (Livre livre : livreList) {
            System.out.println(livre);
        }
    }

    public Livre getLivre(){
        return new Livre();
    }
}
