package br.com.android.google.exemplo.listview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.android.google.exemplo.listview.Pais;
import br.com.android.google.exemplo.listview.R;

/**
 * Created by jose on 7/17/2016.
 *
 */
public class PaisAdapter extends BaseAdapter {

    //***Responsabilidades do tipo sabe da classe***
    private Context context;
    private List<Pais> pais;


    //***Responsabilidades do tipo faz da classe***
    //O context é necessário para criar a view
    public PaisAdapter(Context context, List<Pais> pais ) {
        super();
        this.context = context;
        this.pais = pais;
    }

    /**
     * Método que retorna o tamanho da lista por base do seu conteúdo
     * @return
     */
    @Override
    public int getCount() {
        return pais != null ? pais.size() : 0;
    }

    /**
     * Recupera a posição da view (elemento) da listview
     * @param position
     * @return
     */
    @Override
    public Object getItem(int position) {
        return pais.get(position);
    }

    /**
     * Recupera o Id do item da lista
     * @param position
     * @return
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * Infla a view em cada posição
     * será chamado para desenhar cada elemento que existe na listview
     * @param position
     * @param view
     * @param viewGroup
     * @return
     */
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View inflater = LayoutInflater.from(context).inflate(R.layout.pais_adapter, viewGroup, false);

        //Faz findViewById das views que precisa atualizar
        TextView nome = (TextView) inflater.findViewById(R.id.nomePais);
        ImageView bandeira = (ImageView) inflater.findViewById(R.id.bandeiraPais);

        //Atualiza os valores das view
        Pais planeta = pais.get(position);
        nome.setText(planeta.nome);
        bandeira.setImageResource(planeta.img);

        //Retorna a view deste planeta
        return inflater;
    }
}
