package cl.samf.invidivual8_mod6.presentacion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import cl.samf.individual5_mod6.R
import cl.samf.individual5_mod6.databinding.FragmentListaRazasBinding
import cl.samf.individual5_mod6.databinding.ItemrazasBinding
import cl.samf.invidivual8_mod6.data.local.RazaDao
import cl.samf.invidivual8_mod6.data.local.RazaEntity

class AdapterRazas : RecyclerView.Adapter<AdapterRazas.ItemRazasViewHolder>() {

        lateinit var binding: ItemrazasBinding
        private var listItemRazas = mutableListOf<RazaEntity>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterRazas.ItemRazasViewHolder {
        binding = ItemrazasBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ItemRazasViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdapterRazas.ItemRazasViewHolder, position: Int) {
        val raza = listItemRazas[position]
        holder.bind(raza)
    }

    override fun getItemCount(): Int {
        return listItemRazas.size
    }
    fun setData(raza: List<RazaEntity>){
        this.listItemRazas.clear()
        this.listItemRazas.addAll(raza)
        notifyDataSetChanged()
    }

    class ItemRazasViewHolder(val razaVistas: ItemrazasBinding): RecyclerView.ViewHolder(razaVistas.root) {
        fun bind(raza: RazaEntity){


            razaVistas.textviewItemNombre.text = raza.raza
            razaVistas.cardViewid.setOnClickListener{
                val bundle = Bundle()
                bundle.putString("id", raza.raza)
                Navigation.findNavController(razaVistas.root).navigate(R.id.action_listaRazasFragment_to_detalleRazaFragment, bundle)
            }

        }
    }

}