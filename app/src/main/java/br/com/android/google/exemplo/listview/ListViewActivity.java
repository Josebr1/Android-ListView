package br.com.android.google.exemplo.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.android.google.exemplo.listview.Adapter.PaisAdapter;

/**
 * NOTA
 *
 * A classe android.widget.ListView representa uma lista
 *
 * Quem fornece os dados para preencher o ListView é um Adapter, que é uma classe que implementa a interface
 * android.widget.ListAdapter. Opcionalmente podemos estender a classe android.widget.BaseAdapter que já implementa essa interface.
 *
 * Para cada item da lista e criada uma nova view (um elemento na tela é uma view)
 *
 * Para setar um adapter no listView: setAdapter(adapter)
 * A lista terá a quantidade de linhas que o método getCount() retorna (esse método está na classe que estende de BaseAdapter)
 * Para pegar o item que foi clicado usa-se o método setOnItemClickListener que implementa a interface OnItemClickListener
 *
 */

public class ListViewActivity extends AppCompatActivity {

    //***Responsabilidades do tipo sabe da classe***
    private List<Pais> paises;

    //***Responsabilidades do tipo faz da classe***
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        /**
         * Criando a lista que vai ser passada para o
         * construtor do adapter contendo uma lista de paises
         */
        paises = Pais.getPais();

        //Criando o listView que vai receber o adapter criado (PaisAdapter)
        ListView listaPais = (ListView) findViewById(R.id.listView);
        listaPais.setAdapter(new PaisAdapter(this, paises));
        listaPais.setOnItemClickListener(lista);
    }

    /**
     * Método que recupera o item que foi clicado
     */
    private AdapterView.OnItemClickListener lista = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            toast("Nome: " + paises.get(position).nome + "\nPosição:" + position);
        }
    };

    /**
     * Método que exibi um toast
     *
     * @param msg
     */
    private void toast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
