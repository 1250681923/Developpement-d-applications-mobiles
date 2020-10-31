package com.example.neighbors.fragments

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextWatcher
import android.text.style.BackgroundColorSpan
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.neighbors.NavigationListener
import com.example.neighbors.R
import com.example.neighbors.data.NeighborRepository
import com.example.neighbors.models.Neighbor


class AddNeighbourFragment : Fragment(), TextWatcher{

    private lateinit var image:EditText
    private lateinit var nom: EditText
    private lateinit var tele:EditText
    private lateinit var web: EditText
    private lateinit var add: EditText
    private lateinit var pro: EditText
    private lateinit var enre: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.add_neighbor, container, false)
        enre = view.findViewById(R.id.enre)
        image = view.findViewById(R.id.image)
        nom = view.findViewById(R.id.nom)
        tele = view.findViewById(R.id.tele)
        web = view.findViewById(R.id.web)
        add = view.findViewById(R.id.add)
        pro = view.findViewById(R.id.pro)
        //    - Tous les champs sont obligatoires
        image.addTextChangedListener(this)
        nom.addTextChangedListener(this)
        tele.addTextChangedListener(this)
        web.addTextChangedListener(this)
        add.addTextChangedListener(this)
        pro.addTextChangedListener(this)
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? NavigationListener)?.let {
            it.updateTitle(R.string.add_neighbor)
        }


        enre.setOnClickListener {

            val neighbor = Neighbor(
                id = NeighborRepository.getInstance().getNeighbours().size + 1.toLong(),
                name = nom.text.toString(),
                avatarUrl = image.text.toString(),
                address = add.text.toString(),
                phoneNumber = tele.text.toString(),
                aboutMe = pro.text.toString(),
                favorite = false,
                webSite = web.text.toString()
            )
            NeighborRepository.getInstance().createNeighbour(neighbor)
            activity?.onBackPressed()
        }
    }

    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        //    - Tous les champs sont obligatoires
        //    - Le champ bio A propos de moi doit autoriser au maximum 30 charactères
        enre.isEnabled = image.text.isNotEmpty() && nom.text.isNotEmpty() && tele.text.isNotEmpty() && web.text.isNotEmpty() && add.text.isNotEmpty() && pro.text.toString().length> 30
        //    - L'email doit être valide (afficher une erreur sous le champ email indiquant à l'utilisateur qu'il y a une erreur)
//        if("@" !in web.text.toString()) {
//            val spannableString = SpannableString(web.text.toString())
//            spannableString.setSpan(
//                BackgroundColorSpan(Color.parseColor("#FF0000")),
//                2,
//                spannableString.length,
//                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
//            )
//            web.setText(spannableString)
//        }

        // A faire
//    - Le téléphone doit être valide (commencant par 06 ou 07 et doit avoir 10 charactères) -- (afficher une erreur sous le champ téléphone indiquant à l'utilisateur que le format doit être 0X XX XX XX XX XX)
//    - Les champs Image et Website doivent être des liens valides


    }


}