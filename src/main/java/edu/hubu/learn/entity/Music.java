package edu.hubu.learn.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "music")
@Data
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String songname;

    private String singer;

    private String type;
    
    @Column(name="avatar_url")
    private String avatar;

	public void setMusicname(String keyword) {
	}
}