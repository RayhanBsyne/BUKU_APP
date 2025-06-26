package com.uti.buku_app.model

import com.uti.buku_app.R

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val description: String,
    val imageResId: Int,
    val price: Int
) {
    companion object {
        val dummyBooks = listOf(
            Book(
                1,
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                "A story of the fabulously wealthy Jay Gatsby and his love for the beautiful Daisy Buchanan.",
                R.drawable.book_gatsby,
                250000
            ),
        )
    }
}