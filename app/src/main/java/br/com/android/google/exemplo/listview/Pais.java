package br.com.android.google.exemplo.listview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jose on 7/17/2016.
 *
 */
public class Pais {

    //***Responsabilidades do tipo sabe da classe***
    public String nome;
    public int img;

    //***Responsabilidades do tipo faz da classe***
    /**
     * Vai ser chamado no ListViewActivity
     * @param nome
     * @param img
     */
    public Pais(String nome, int img) {
        this.nome = nome;
        this.img = img;
    }

    /**
     * Método que retorna uma lista de paises com o nome e a bandeira
     * @return
     */
    public static List<Pais> getPais(){
        List<Pais> paises = new ArrayList<>();

        paises.add(new Pais("Austrália", R.drawable.ic_australia));
        paises.add(new Pais("Brasil", R.drawable.ic_brasil));
        paises.add(new Pais("Camarões", R.drawable.ic_camaroes));
        paises.add(new Pais("Chile", R.drawable.ic_chile));
        paises.add(new Pais("Colômbia", R.drawable.ic_colombia));
        paises.add(new Pais("Consta do Marfim", R.drawable.ic_costa_do_marfim));
        paises.add(new Pais("Croácia", R.drawable.ic_croacia));
        paises.add(new Pais("Espanha", R.drawable.ic_espanha));
        paises.add(new Pais("Grécia", R.drawable.ic_grecia));
        paises.add(new Pais("Holanda", R.drawable.ic_holanda));
        paises.add(new Pais("Japão", R.drawable.ic_japao));
        paises.add(new Pais("México", R.drawable.ic_mexico));

        return paises;

    }

}
