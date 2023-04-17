package com.example.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navegacion.databinding.FragmentHomeBinding


class home : Fragment() {

    lateinit var layout:FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        layout= FragmentHomeBinding.inflate(inflater,container,false)

        layout.apply {

            btnContactos.setOnClickListener {b->
                nav(b,R.id.action_home2_to_contactos)
            }

            imgConfig.setOnClickListener {img->
                nav(img,R.id.action_home2_to_configuracion)
            }

        }

        return layout.root
    }


    fun nav(v:View,destino:Int){
        Navigation.findNavController(v).navigate(destino)
    }
}