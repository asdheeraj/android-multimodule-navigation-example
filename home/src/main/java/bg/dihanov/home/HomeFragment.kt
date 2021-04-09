package bg.dihanov.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import bg.dihanov.navigation.NavigationFlow
import bg.dihanov.navigation.ToFlowNavigatable
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    val args: HomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        to_next_fragment_btn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToNextFragment())
        }

        to_dashboard_flow.setOnClickListener {
            (requireActivity() as ToFlowNavigatable).navigateToFlow(NavigationFlow.DashboardFlow())
        }

        args.sample.let {
            Toast.makeText(activity, "$it", Toast.LENGTH_LONG).show()
        }
    }
}