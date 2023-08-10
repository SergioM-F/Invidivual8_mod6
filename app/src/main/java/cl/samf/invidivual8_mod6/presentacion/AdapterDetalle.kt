package cl.samf.invidivual8_mod6.presentacion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.samf.individual5_mod6.databinding.ItemDetalleBinding
import cl.samf.invidivual8_mod6.data.local.DetalleRazaEntity
import coil.load

class AdapterDetalle: RecyclerView.Adapter<AdapterDetalle.DetallePerroViewHolder>() {

    lateinit var binding: ItemDetalleBinding
    private val listDetalleRazas = mutableListOf<DetalleRazaEntity>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetallePerroViewHolder {
        binding = ItemDetalleBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DetallePerroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDetalleRazas.size
    }

    override fun onBindViewHolder(holder: DetallePerroViewHolder, position: Int) {
        val perro = listDetalleRazas[position]
        holder.bind(perro)

    }
    fun setDataDetalle(detalle: List<DetalleRazaEntity>){
        this.listDetalleRazas.clear()
        this.listDetalleRazas.addAll(detalle)
        notifyDataSetChanged()
    }


    class DetallePerroViewHolder (val perrovista: ItemDetalleBinding): RecyclerView.ViewHolder(perrovista.root) {
        fun bind(detalle: DetalleRazaEntity) {
            perrovista.imageView.load(detalle.url)

        }

    }
}