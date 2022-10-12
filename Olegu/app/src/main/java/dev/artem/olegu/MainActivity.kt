package dev.artem.olegu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

val someList = listOf( // Переменная Мои ненаглядные коты
    "a",
    "b",
    "c",
) //создание списка с которого будут браться элементы
var list = mutableListOf<String>() //список куда будут класться элементы

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (s in someList){ // с помощью цикла for берем все значения из первого списка
            list.add(s) // и записываем во второй список
        }
        println(list) //ds
    }
}