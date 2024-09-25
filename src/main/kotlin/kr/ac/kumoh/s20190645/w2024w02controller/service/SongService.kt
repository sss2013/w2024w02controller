package kr.ac.kumoh.s20190645.w2024w02controller.service

import kr.ac.kumoh.s20190645.w2024w02controller.model.Song
import kr.ac.kumoh.s20190645.w2024w02controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }
}