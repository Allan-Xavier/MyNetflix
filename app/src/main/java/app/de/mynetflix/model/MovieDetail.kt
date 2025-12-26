package app.de.mynetflix.model

data class MovieDetail(
    val movie: Movie,
    val similars: List<Movie>
)