package cinema.persistence.entity;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie, Integer> {
	Set<Movie> findByTitle(String title);
	Set<Movie> findByYear(Integer year);
//	Set<Movie> findByYearAfter(Integer year);
	Set<Movie> findByYearBetween(Integer year1, Integer year2);
	Set<Movie> findByTitleAndYear(String title, Integer year);
}
