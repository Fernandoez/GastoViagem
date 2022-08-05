package com.example.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    //ActivityMainBinding classe criada para ajudar mapear os elementos
    //inflate digo para "ativar" o layout para que eu possa usar os atributos que contém nela
    //Definimos a variavel binding como sendo global para que possa ser usada em outras funcoes
    //que venham a aparecer e que irão interagir com nosso layout.
    //Porém, a variável precisa ser inicializada no super.onCreate que é onde ele instancia as variáveis,
    //faz com que ela se comporte como uma activity e torna acessível os elementyos da interface.
    //setContentView é onde atribuímos o layot dessa activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
        //forma de chamar o evento ao clicar no botão. Usando o termo 'this' porque fiz um override
        //da interface OnclickListener da classe View. Portanto a função responsável pelo evento será
        //a Onclick da própria interface.
    }
        //Como os elementos da Activity herdam de uma View, acabam sendo todos do tipo View, por isso
        //o tipo View como parâmetro da função.
    override fun onClick(view: View) {
            //R significa Resources, tudo que colocamos nos resources (colors, strings, ids...) podem ser acessados a partir de R.
        if (view.id == R.id.button_calculate)
            calculate();
    }

    private fun calculate() {

        val distance = binding.editDistance.text.toString().toFloat()
        val price = binding.editPrice.text.toString().toFloat()
        val autonomy = binding.editAutonomy.text.toString().toFloat()
        val totalValue = (distance*price)/autonomy
        //String.format(valor que quero que seja formatado conforme informado na string)
        binding.textTotalValue.text = "R$ ${"%.2f".format(totalValue)}"
        //Toast notification
        //Toast.makeText(this, "Fui clicado!", Toast.LENGTH_SHORT).show()
    }
}