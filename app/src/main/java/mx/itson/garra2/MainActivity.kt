package mx.itson.garra2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mx.itson.garra.entities.Animal

    class MainActivity : AppCompatActivity(), View.OnLongClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnNew = findViewById<Button>(R.id.btn_new)
        btnNew.setOnClickListener(this)

        val btnlist = findViewById<Button>(R.id.btn_list)
        btnlist.setOnClickListener(this)

        //Animal().save(this, "Tigre toñin")
        //Animal().get(this)

    }

        override fun onLongClick(p0: View?): Boolean {
            when (p0?.id){
                R.id.btn_new ->{
                    val interFormAnimal = Intent(this, AnimalFormActivity::class.java)
                    startActivity(interFormAnimal)
                }
                R.id.btn_list ->{
                    val interListAnimal = Intent(this, AnimalListActivity::class.java)
                    startActivity(interListAnimal)
                }
            }
        }
    }