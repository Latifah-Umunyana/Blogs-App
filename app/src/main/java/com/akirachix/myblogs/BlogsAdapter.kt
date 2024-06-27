package com.akirachix.myblogs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class BlogsAdapter (var blogsList: List<Blog>): RecyclerView.Adapter<BlogsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_list_item, parent, false)

        return BlogsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {

        val blog = blogsList[position]
        holder.tvDate.text = blog.date
        holder.tvAuthor.text = blog.author
        holder.tvTitle.text = blog.title
        holder.tvDescription.text = blog.description.toString()


    }

    override fun getItemCount(): Int {
       return blogsList.size
    }
}


class BlogsViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)

}