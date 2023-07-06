package com.example.finaluri.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.finaluri.*
import com.example.finaluri.Calcium

class MealFragment:Fragment(R.layout.fragment_meal) {
    private lateinit var Button1: Button
    private lateinit var Button2: Button
    private lateinit var Button3: Button
    private lateinit var Button4: Button
    private lateinit var Button5: Button
    private lateinit var Button6: Button
    private lateinit var Button7: Button
    private lateinit var Button8: Button
    private lateinit var Button9: Button
    private lateinit var Button10: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Button1 = view.findViewById(R.id.button1)
        Button2 = view.findViewById(R.id.button2)
        Button3 = view.findViewById(R.id.button3)


        Button3.setOnClickListener {
            val intent = Intent (getActivity(), C::class.java)
            getActivity()?.startActivity(intent)
        }
        Button1.setOnClickListener {
            val intent = Intent(getActivity(), A::class.java)
            getActivity()?.startActivity(intent)
        }
        Button2.setOnClickListener {
            val intent = Intent(getActivity(), B::class.java)
            getActivity()?.startActivity(intent)




    }



}
}