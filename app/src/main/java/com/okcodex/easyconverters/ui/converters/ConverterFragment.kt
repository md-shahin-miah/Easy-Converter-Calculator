package com.okcodex.easyconverters.ui.converters

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.okcodex.easyconverters.R
import com.okcodex.easyconverters.ui.converters.activity.*
import kotlinx.android.synthetic.main.fragment_converter.*

class ConverterFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_converter, container, false)


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        weightCalculator.setOnClickListener { openAllConvertersActivity(R.array.weight_array) }
        lengthCalculator.setOnClickListener { openAllConvertersActivity(R.array.length_array) }
        speedCalculator.setOnClickListener { openAllConvertersActivity(R.array.speed_array) }
        pressureCalculator.setOnClickListener { openAllConvertersActivity(R.array.pressure_array) }
        volumeCalculator.setOnClickListener { openAllConvertersActivity(R.array.volume_array) }
        angleCalculator.setOnClickListener { openAllConvertersActivity(R.array.angle_array) }
        fuelCalculator.setOnClickListener { openAllConvertersActivity(R.array.fuel_array) }
        temperatureCalculator.setOnClickListener { openAllConvertersActivity(R.array.temperature_array) }
        areaCalculator.setOnClickListener { openAllConvertersActivity(R.array.area_array) }
        cookingCalculator.setOnClickListener { openAllConvertersActivity(R.array.cooking_array) }
        dataStorageCalculator.setOnClickListener { openAllConvertersActivity(R.array.data_storage_array) }
        timeCalculator.setOnClickListener { openAllConvertersActivity(R.array.time_array) }
        energyCalculator.setOnClickListener { openAllConvertersActivity(R.array.energy_array) }

        frequencyCalculator.setOnClickListener {
            Toast.makeText(requireContext(), "Coming soon", Toast.LENGTH_SHORT).show()
          //  openAllConvertersActivity(R.array.length_array)
        }
        powerCalculator.setOnClickListener {
            Toast.makeText(requireContext(), "Coming soon", Toast.LENGTH_SHORT).show()
         //  openAllConvertersActivity(R.array.length_array)
        }
        resolationCalculator.setOnClickListener {
            Toast.makeText(requireContext(), "Coming soon", Toast.LENGTH_SHORT).show()
           // openAllConvertersActivity(R.array.length_array)
        }



        hatSizeCalculator.setOnClickListener {
            Toast.makeText(requireContext(), "Coming soon", Toast.LENGTH_SHORT).show()
         //   startActivity(Intent(requireContext(), HatSizeActivity::class.java))

        }
        clotheSizeCalculator.setOnClickListener {

            Toast.makeText(requireContext(), "Coming soon", Toast.LENGTH_SHORT).show()
            //startActivity(Intent(requireContext(), ClothesActivity::class.java))
        }
        shoeSizeCalculator.setOnClickListener {

            Toast.makeText(requireContext(), "Coming soon", Toast.LENGTH_SHORT).show()
            //startActivity(Intent(requireContext(), ShoeSizeActivity::class.java))
        }
        ringSizeCalculator.setOnClickListener {

            Toast.makeText(requireContext(), "Coming soon", Toast.LENGTH_SHORT).show()
           // startActivity(Intent(requireContext(), RingSizeActivity::class.java))
        }


    }

    private fun openAllConvertersActivity(s: Int) {
        val intent=Intent(context,AllConvertersActivity::class.java)
        intent.putExtra("converter",s)
        startActivity(intent)
    }

}