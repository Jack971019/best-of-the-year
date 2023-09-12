package org.lessons.Bestof.Controller;

import org.lessons.Bestof.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping
    public String moviesList(Model model){
        List<Movie> movieList = getMoviesList();
        model.addAttribute("movies", movieList);

        return "movies";
    }


    private List<Movie> getMoviesList(){
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(Integer.parseInt("1"), "Dune"));
        movies.add(new Movie(Integer.parseInt("2"), "Forrest Gump"));
        movies.add(new Movie(Integer.parseInt("3"), "Hoppenheimer"));

        return movies;
    }


}
