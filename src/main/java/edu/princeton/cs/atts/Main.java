package edu.princeton.cs.atts;


import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.In;

import java.io.File;

public class Main {


    public static void main(String[] args) {
        File FileLC = new File("src/main/java/edu/princeton/cs/atts/input.txt");
        In in = new In(FileLC);

        Graph grafo = new Graph(in);

        System.out.println(grafo);

        System.out.println("===================");
        grafo.Preorder(0);
        System.out.println(grafo.preorderTraversal(0));
    }
}
