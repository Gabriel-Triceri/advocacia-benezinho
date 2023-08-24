package br.com.fiap;
import javax.swing.*;
import jakarta.persistence.*;

import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");

        EntityManager manager = factory.createEntityManager();

        manager.close();
        factory.close();


        private static void ConsultarProcesso (EntityManager manager){
            List<Processo> processo = manager.createQuery("FROM Processo ").getResultList();

            Processo solicitante = (Processo) JOptionPane.showInputDialog(
                    null,
                    "Solicitante",
                    "Selecione",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    processo.toArray(),
                    processo.get(0)
            );
        }
        }
    }

