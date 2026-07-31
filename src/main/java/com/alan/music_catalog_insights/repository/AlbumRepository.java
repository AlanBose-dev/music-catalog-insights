package com.alan.music_catalog_insights.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alan.music_catalog_insights.dto.GenreCountResponse;
import com.alan.music_catalog_insights.entity.Album;
import java.util.List;
import com.alan.music_catalog_insights.dto.TopRatedAlbumResponse;

public interface AlbumRepository extends JpaRepository<Album, Long> {
	@Query("SELECT AVG(a.rating) FROM Album a")
	Double getAverageRating();
	
	@Query("""
		    SELECT new com.alan.music_catalog_insights.dto.GenreCountResponse(
		        a.genre,
		        COUNT(a)
		    )
		    FROM Album a
		    GROUP BY a.genre
		""")
		List<GenreCountResponse> getAlbumsByGenre();
	@Query("""
		    SELECT new com.alan.music_catalog_insights.dto.TopRatedAlbumResponse(
		        a.albumName,
		        a.artistName,
		        a.rating
		    )
		    FROM Album a
		    ORDER BY a.rating DESC
		""")
		List<TopRatedAlbumResponse> getTopRatedAlbums();
}