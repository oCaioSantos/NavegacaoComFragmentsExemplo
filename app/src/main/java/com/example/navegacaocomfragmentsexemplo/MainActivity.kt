package com.example.navegacaocomfragmentsexemplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navegacaocomfragmentsexemplo.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView.LABEL_VISIBILITY_UNLABELED

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(
            layoutInflater
        )
    }

    private val navController by lazy {
        (supportFragmentManager
            .findFragmentById(binding.fragmentContainerView.id) as NavHostFragment
                ).navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*
             Inicializando o NavController do Navigation Component
             O NavController é responsável pela navegação entre fragmentos
         */

        with(binding.bottomNavigationView) {
            /*
                Configurando o BottomNavigationView para funcionar com o NavController,
                o que permite que o BottomNavigationView utilize das configurações
                que você criar no gráfico de navegação (main_navigation).
             */
            setupWithNavController(navController)

            /*
                Caso queira mostrar a label (texto) do item do menu,
                retire a linha a seguir.
             */
            labelVisibilityMode = LABEL_VISIBILITY_UNLABELED
        }
    }
}
