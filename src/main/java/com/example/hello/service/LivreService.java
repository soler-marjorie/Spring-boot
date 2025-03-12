package com.example.hello.service;

import com.example.hello.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {

    public void add() {
        Livre livre = new Livre();
        Scanner sc = new Scanner(System.in);

        System.out.println("Titre du livre : ");
        livre.setTitre(sc.nextLine());

        System.out.println("description du livre : ");
        livre.setDescription(sc.nextLine());

        System.out.println("Date de publication du livre : ");
        livre.setDatePublication(sc.nextLine());

        System.out.println(livre.toString());
    }

    public Livre getLivre(){
        return new Livre();
    }
}
