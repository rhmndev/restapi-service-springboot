package com.project.myapps.movie.entities;import jakarta.persistence.Entity;import jakarta.persistence.GeneratedValue;import jakarta.persistence.GenerationType;import jakarta.persistence.Id;import lombok.Getter;import lombok.Setter;@Entity@Getter@Setterpublic class Movie {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    private String title;    private String genre;    private String duration;    private String director;    private String rating;}