package kr.ac.kumoh.s20190645.w2024w02controller.repository

import kr.ac.kumoh.s20190645.w2024w02controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song(1,"Beloved","GLAY"),
        Song(2,"RIVER","ISHII TATSUYA"),
        Song(3,"Life","Siam Shade"),
    )

    fun fetchSong() = songs
}