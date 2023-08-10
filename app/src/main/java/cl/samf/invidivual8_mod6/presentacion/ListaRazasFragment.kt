package cl.samf.invidivual8_mod6.presentacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cl.samf.individual5_mod6.R
import cl.samf.individual5_mod6.databinding.FragmentListaRazasBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class ListaRazasFragment : Fragment() {

    lateinit var binding: FragmentListaRazasBinding
    private val razaViewModel: RazaViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaRazasBinding.inflate(layoutInflater, container, false)
        initAdapter()
        razaViewModel.getRaza()
        return binding.root
    }

    private fun initAdapter() {
        val adapter = AdapterRazas()
        binding.recyclerListRazas.adapter = adapter
        razaViewModel.razaLiveData().observe(viewLifecycleOwner) {
            adapter.setData(it)

        }
    }


}
