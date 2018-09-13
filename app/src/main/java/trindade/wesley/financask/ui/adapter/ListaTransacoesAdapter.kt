package trindade.wesley.financask.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.transacao_item.view.*
import trindade.wesley.financask.R
import trindade.wesley.financask.ui.model.Transacao
import java.math.BigDecimal


class ListaTransacoesAdapter(transacoes : List<Transacao>,
                             context : Context) : BaseAdapter(){

    private val transacoes = transacoes
    private val contexto   = context

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var    viewCriada = LayoutInflater.from(contexto).inflate(R.layout.transacao_item, parent, false)
        var transacao = transacoes[position]
        viewCriada.transacao_valor.setText(transacao.valor.toString())
        return viewCriada
    }

    override fun getItem(position: Int): Transacao {
        return this.transacoes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return this.transacoes.size
    }

}