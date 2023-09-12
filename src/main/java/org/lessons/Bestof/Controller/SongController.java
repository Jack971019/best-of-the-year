package org.lessons.Bestof.Controller;


import org.lessons.Bestof.model.Movie;
import org.lessons.Bestof.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String songsList(Model model){
        List<Song> songList = getSongsList();
        model.addAttribute("songs", getSongsList());
        return "songs";
    }


    private List<Song> getSongsList(){
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(Integer.parseInt("1"), "Live Forever"));
        songs.add(new Song(Integer.parseInt("2"), "Money trees"));
        songs.add(new Song(Integer.parseInt("3"), "When I'm gone"));
        return songs;
    }

}
