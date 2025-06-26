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
            Book(
                2,
                "To Kill a Mockingbird",
                "Harper Lee",
                "The story of racial injustice and the loss of innocence in the American South.",
                R.drawable.book_mockingbird,
                180000
            ),
            Book(
                3,
                "1984",
                "George Orwell",
                "A dystopian novel set in a totalitarian society where critical thought is suppressed.",
                R.drawable.book_1984,
                200000
            ),
            Book(
                4,
                "Pride and Prejudice",
                "Jane Austen",
                "The story follows the main character Elizabeth Bennet as she deals with issues of manners, upbringing, morality, education, and marriage.",
                R.drawable.book_pride,
                175000
            ),
            Book(
                5,
                "The Hobbit",
                "J.R.R. Tolkien",
                "The story of Bilbo Baggins, a hobbit who embarks on an epic adventure.",
                R.drawable.book_hobbit,
                275000
            ),
            )
    }
}