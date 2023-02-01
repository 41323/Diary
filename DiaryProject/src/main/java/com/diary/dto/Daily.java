package com.diary.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicInsert;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;



@Entity
@Setter
@ToString
@DynamicInsert @NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder @Getter
public class Daily {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seq_d; //고유번호
	
	private String map_d;//지도 데이터
	private String content_d;//내용
	private String image_d;//이미지
	private String memo_d;//메모
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date regdate_d;//작성일

	@ManyToOne
	@JoinColumn(name="book_id", updatable=false)
	public Users user;

	public void setUser(Users user) {
		this.user = user;
	}
}
