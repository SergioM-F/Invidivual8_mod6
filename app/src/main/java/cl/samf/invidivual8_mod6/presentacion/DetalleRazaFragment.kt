package cl.samf.invidivual8_mod6.presentacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cl.samf.individual5_mod6.R
import cl.samf.individual5_mod6.databinding.FragmentDetalleRazaBinding
import cl.samf.individual5_mod6.databinding.FragmentListaRazasBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "id"
private const val ARG_PARAM2 = "param2"


class DetalleRazaFragment : Fragment() {
    lateinit var binding: FragmentDetalleRazaBinding
    private val razaViewModel: RazaViewModel by activityViewModels()

    // TODO: Rename and change types of parameters
    private var param1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetalleRazaBinding.inflate(layoutInflater,container,false)
        initAdapter()
        razaViewModel.getDetalleRaza(param1.toString())
        return binding.root
    }

    private fun initAdapter() {
        val adapter = AdapterDetalle()
        binding.recyclerViewDetalle.adapter = adapter
        razaViewModel.detalleLiveData(param1.toString()).observe(viewLifecycleOwner){
            adapter.setDataDetalle(it)

        }

    }

    /*companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetalleRazaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetalleRazaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}