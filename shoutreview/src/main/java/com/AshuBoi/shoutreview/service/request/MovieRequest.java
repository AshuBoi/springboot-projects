package com.AshuBoi.shoutreview.service.request;

import com.AshuBoi.shoutreview.domain.Genre;
import com.AshuBoi.shoutreview.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieRequest {

    private String titles;
    private Genre genre;

    public Movie toMovie(){
        return Movie.builder().title(titles).genre(genre).rating(0.0).build();
    }
}
