package Logic;

import Logic.Cards.System;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int metalStock;
    private int wealthStock;
    private int stockLimit = 3; // muda para 5 se IntersteallarBanking

    private int miliraryForce;
    private int miliraryLimit = 3; // muda para 5 se ...

    private List<System> nearSystems = new ArrayList<>();
    private List<System> distantSystems = new ArrayList<>();

    public Game() {
        System homeWorld = new System(); // Sistema Inicial

        // separar as cartas
        List<System> sistemas = this.startSystemCards();
        Collections.shuffle(sistemas);

        for (int i = 0; i < 10; i++) {
            System s = sistemas.get(i);

            if (i < 5)
                this.nearSystems.add(s);

            else
                this.distantSystems.add(s);
        }

        // Baralhar cada baralho
        Collections.shuffle(this.nearSystems);
        Collections.shuffle(this.distantSystems);

        // colocar as fichas a 0
        this.metalStock = 0;
        this.wealthStock = 0;
        this.miliraryForce = 0;

        // colocar fichas do HomeWorld

        // Baralhar cartas
    }

    public void start() {
    }

    private List<System> startSystemCards() {
        List<System> sistemas = new ArrayList<>();

        // Cartas que estao no pdf
        sistemas.add(new System("Wolf 359", 5, 1, 0, 1));
        sistemas.add(new System("Proxima", 6, 1, 0, 1));
        sistemas.add(new System("Epsilon Eridani", 8, 0, 0, 1));
        sistemas.add(new System("Cygnus", 5, 0, 1, 1));
        sistemas.add(new System("Tau Ceti", 4, 0, 0, 1));
        sistemas.add(new System("Procyon", 7, 0, 1, 1));
        sistemas.add(new System("Canopus", 9, 0, 1, 2));
        sistemas.add(new System("Polaris", 9, 1, 0, 2));
        sistemas.add(new System("Galaxy's Edge", 10, 0, 0, 3));
        sistemas.add(new System("Sirius", 6, 0, 0, 1));

        return sistemas;
    }
}