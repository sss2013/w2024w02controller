package kr.ac.kumoh.s20190645.w2024w02controller.controller

import kr.ac.kumoh.s20190645.w2024w02controller.model.Song
import kr.ac.kumoh.s20190645.w2024w02controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class SongController(val service: SongService) {
//   val title = listOf(
//       "Dear..",
//       "Diver",
//       "Soul love",
//   )

    @GetMapping("/song/list")
//    fun Get_SongList() = title
    fun getSongList() : List<Song> {
        return service.getAllSongs()
    }
}