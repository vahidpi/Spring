package com.frankmoley.landon.data.entity;

import javax.presistence.Entity;
import javax.presistence.Table;

@Entity
@Table(name="ROOM")


/**
 *
 * @author Vahid
 */


public class Room {
	@Id 
	@Column(name="ROOM_ID")
	@GeneratedValue(strategy= GenerationType.AUTO)	
    Private long id;
    @Column(name="NAME")
    Private String name;
    @Column(name="ROOM_NUMBER")
    Private String number;
    @Column(name="BED_INFO")
    Private String bedInfo;
}
