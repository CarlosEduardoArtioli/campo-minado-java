package br.com.caduartioli.campoMinado;

import br.com.caduartioli.campoMinado.modelo.Tabuleiro;
import br.com.caduartioli.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        new TabuleiroConsole(tabuleiro);
    }
}
