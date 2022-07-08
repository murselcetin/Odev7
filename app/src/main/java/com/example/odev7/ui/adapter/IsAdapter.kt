package com.example.odev7.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.odev7.R
import com.example.odev7.data.entity.Yapilacaklar
import com.example.odev7.databinding.CardTasarimBinding
import com.example.odev7.ui.fragment.AnasayfaFragmentDirections
import com.example.odev7.ui.viewmodel.AnasayfaFragmentViewModel
import com.example.odev7.util.gecisYap
import com.google.android.material.snackbar.Snackbar

class IsAdapter(
    var mContext: Context,
    var yapilacaklarListesi: List<Yapilacaklar>,
    var viewModel: AnasayfaFragmentViewModel
) : RecyclerView.Adapter<IsAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(binding: CardTasarimBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: CardTasarimBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding: CardTasarimBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.card_tasarim, parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val yapilacakIs = yapilacaklarListesi[position]
        val t = holder.binding
        t.isNesnesi = yapilacakIs

        t.imageViewSilResim.setOnClickListener {
            Snackbar.make(it, "${yapilacakIs.yapilacak_is} silinsin mi?", Snackbar.LENGTH_LONG)
                .setAction("EVET") {
                    viewModel.sil(yapilacakIs.yapilacak_id)
                }.show()
        }
        t.satirCard.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(yapilacakIs = yapilacakIs)
            Navigation.gecisYap(it, gecis)
        }
    }

    override fun getItemCount(): Int {
        return yapilacaklarListesi.size
    }
}