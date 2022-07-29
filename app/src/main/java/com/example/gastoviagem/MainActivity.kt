package com.example.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

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

    }
}