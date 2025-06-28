package com.uti.buku_app.model

import com.uti.buku_app.R

class Book (
    val id: Int,
    val title: String,
    val author: String,
    val description: String,
    val imageResId: Int,
    val price: Int
){
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
            Book(
                6,
                "The Catcher in the Rye",
                "J.D. Salinger",
                "The story of Holden Caulfield's experiences in New York City after being expelled from prep school.",
                R.drawable.book_catcher,
                195000
            ),
            Book(
                7,
                "Lord of the Flies",
                "William Golding",
                "A novel about a group of British boys stranded on an uninhabited island and their disastrous attempt to govern themselves.",
                R.drawable.book_flies,
                185000
            ),
            Book(
                8,
                "The Alchemist",
                "Paulo Coelho",
                "The story of a young shepherd named Santiago who dreams of finding a worldly treasure.",
                R.drawable.book_alchemist,
                210000
            ),
            Book(
                9,
                "Harry Potter and the Cursed Child",
                "J.K. Rowling",
                "Harry Potter and the Cursed Child is a stage play and the official continuation of the Harry Potter saga, set 19 years after the events of the final book.",
                R.drawable.book_thecursed,
                25000000
            ),
            Book(
                10,
                "The Land of Five Towers",
                "A. Fuadi",
                "Negeri 5 Menara is an inspiring novel based on the true story of Alif, a young man from Maninjau, West Sumatra, Indonesia.",
                R.drawable.book_negeri5negara,
                190000
            ),
            Book(
                11,
                "The Alchemist",
                "Paulo Coelho",
                "The Alchemist is an allegorical novel by Paulo Coelho, first published in Portuguese in 1988.",
                R.drawable.book_alchemist,
                150000
            ),
            Book(
                12,
                "The Lord of the Rings: The Two Towers",
                "J.R.R. Tolkien",
                "The Two Towers is the second volume of J.R.R. Tolkien's renowned fantasy epic, The Lord of the Rings. Following the shattering of the Fellowship, the narrative splits into two main, intertwined storylines.",
                R.drawable.book_lordring,
                150000
            ),
            Book(
                13,
                "Kim Ji-yeong",
                "Cho Nam-joo",
                "Kim Ji-yeong, Born 1982 is a South Korean novel by Cho Nam-joo that sparked widespread discussion and became a global phenomenon.",
                R.drawable.book_chonam,
                100000
            ),
            Book(
                14,
                "Susan Hill",
                "The Woman in Black",
                "The Woman in Black is a chilling gothic ghost story written by Susan Hill, first published in 1983. The novel is framed as the memoir of Arthur Kipps, a retired solicitor who is recounting a terrifying experience from his youth. ",
                R.drawable.book_black,
                160000
            ),
            Book(
                15,
                "Percy Jackson & The Olympians: The Lightning Thief (Book 1)",
                "Rick Riordan",
                "The Lightning Thief is the first novel in the Percy Jackson & The Olympians series by Rick Riordan, published in 2005. The story introduces Percy Jackson, a twelve-year-old boy with ADHD and dyslexia, who constantly finds himself in trouble.",
                R.drawable.book_jackson,
                170000
            ),
            Book(
                16,
                "Percy Jackson & The Olympians: The Lightning Thief ",
                "Rick Riordan",
                "The Lightning Thief is the first novel in the Percy Jackson & The Olympians series by Rick Riordan, published in 2005. The story introduces Percy Jackson, a twelve-year-old boy with ADHD and dyslexia, who constantly finds himself in trouble.",
                R.drawable.book_warstrom,
                170000
            ),
            Book(
                17,
                "The Old Man and the Sea",
                "Ernest Hemingway",
                "The Old Man and the Sea is a novella by American author Ernest Hemingway, published in 1952. It tells the epic struggle between an aging, experienced Cuban fisherman, Santiago, and a giant marlin. For 84 days, Santiago has caught no fish, leading many to believe he is salao, the unluckiest of all.",
                R.drawable.book_ernes,
                150000
            ),
            Book(
                18,
                "Night Watch",
                "Jayne Anne Phillips",
                "Night Watch is a Pulitzer Prize-winning novel by Jayne Anne Phillips. Set shortly after the American Civil War, the novel centers on a West Virginia asylum that houses traumatized war veterans, displaced women, and orphaned children.",
                R.drawable.book_nightwatch,
                100000
            ),
            Book(
                19,
                "Persuasion",
                "Jane Austen",
                "Persuasion is Jane Austen's last completed novel, published posthumously in 1817. It tells the story of Anne Elliot, a gentle and intelligent young woman who, at nineteen, was persuaded by her family and a dear friend to break off her engagement to the ambitious but then-poor naval officer Frederick Wentworth.",
                R.drawable.book_persuasion,
                500000
            )
        )
    }
}