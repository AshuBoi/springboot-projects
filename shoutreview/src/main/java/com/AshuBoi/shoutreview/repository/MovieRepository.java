package com.AshuBoi.shoutreview.repository;

import com.AshuBoi.shoutreview.domain.Movie;
import com.AshuBoi.shoutreview.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface MovieRepository extends JpaRepository<Movie,Long>
{
    public Movie findByTitle(String title);


    public List<Movie> findByGenre(Genre genre);
}
