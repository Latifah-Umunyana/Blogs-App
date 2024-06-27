package com.akirachix.myblogs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myblogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlogs.layoutManager = LinearLayoutManager(this)

        displayBlogs()

    }

//    binding.loginLink.setOnClickListener {
//
//        val intent = Intent(this, Login::class.java)
//
//        startActivity(intent)
//
//    }

    fun displayBlogs(){

        val blog1 = Blog("","Mikisa Priscilla","2023/12/21","Uganda",("Uganda is a landlocked country in East Africa whose diverse landscape encompasses the snow-capped Rwenzori Mountains and immense Lake Victoria. Its abundant wildlife includes chimpanzees as well as rare birds. Remote Bwindi Impenetrable National Park is a renowned mountain gorilla sanctuary. Murchison Falls National Park in the northwest is known for its 43m-tall waterfall and wildlife such as hippos").toString(),"","")
        val blog2 = Blog("","Mikisa Priscilla","2023/12/21","Rwanda",("Rwanda is a landlocked country in East Africa whose diverse landscape encompasses the snow-capped Rwenzori Mountains and immense Lake Victoria. Its abundant wildlife includes chimpanzees as well as rare birds. Remote Bwindi Impenetrable National Park is a renowned mountain gorilla sanctuary. Murchison Falls National Park in the northwest is known for its 43m-tall waterfall and wildlife such as hippos").toString(),"","")
        val blog3 = Blog("","Mikisa Priscilla","2023/12/21","Malawi",("Malawi is a landlocked country in East Africa whose diverse landscape encompasses the snow-capped Rwenzori Mountains and immense Lake Victoria. Its abundant wildlife includes chimpanzees as well as rare birds. Remote Bwindi Impenetrable National Park is a renowned mountain gorilla sanctuary. Murchison Falls National Park in the northwest is known for its 43m-tall waterfall and wildlife such as hippos").toString(),"","")
        val blog4 = Blog("","Mikisa Priscilla","2023/12/21","Kenya",("Kenya is a landlocked country in East Africa whose diverse landscape encompasses the snow-capped Rwenzori Mountains and immense Lake Victoria. Its abundant wildlife includes chimpanzees as well as rare birds. Remote Bwindi Impenetrable National Park is a renowned mountain gorilla sanctuary. Murchison Falls National Park in the northwest is known for its 43m-tall waterfall and wildlife such as hippos").toString(),"","")

        val blogList = listOf(blog1,blog2,blog3,blog4)
        val blogsAdapter = BlogsAdapter(blogList)
        binding.rvBlogs.adapter = blogsAdapter

    }


}