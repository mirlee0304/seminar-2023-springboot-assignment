package com.wafflestudio.seminar.spring2023.song.repository

import com.wafflestudio.seminar.spring2023.song.service.Artist
import jakarta.persistence.*

@Entity(name= "songs")
class SongEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0L,
    val title: String,
    val image: String,
    val duration: Int,
    @ManyToOne //
    @JoinColumn(name = "album_id") //sma1   여러노래1앨범
    val album: AlbumEntity,
    @OneToMany(mappedBy = "song") // s1am   1노래여러아티스트
    val artists: List<ArtistEntity>,
    // var playlist
)