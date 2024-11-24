package com.project.myapps.movie.services;import com.project.myapps.movie.entities.Movie;import org.springframework.stereotype.Service;@Servicepublic class MovieService implements MovieServiceImpl {    @Override    public String addMovie(Movie movies) {        // Validasi untuk semua properti        if (movies.getTitle() == null || movies.getTitle().isEmpty()) {            return "Title tidak boleh kosong";        }        if (movies.getGenre() == null || movies.getGenre().isEmpty()) {            return "Genre tidak boleh kosong";        }        if (movies.getDuration() == null || movies.getDuration().isEmpty()) {            return "Duration tidak boleh kosong";        }        if (movies.getDirector() == null || movies.getDirector().isEmpty()) {            return "Director tidak boleh kosong";        }        if (movies.getRating() == null || movies.getRating().isEmpty()) {            return "Rating tidak boleh kosong";        }        if (!isString(movies.getRating())) {            return "Properti rating tidak menerima nilai angka";        }        // Kalo semua validasi berhasil "Success"        return "Movie berhasil ditambahkan ke daftar tontonan";    }    // Validasi jika String "true", jika Integer/Double "false"    private boolean isString(String string) {        try {            Integer.parseInt(string);            return false;        } catch (NumberFormatException var1) {            try {                Double.parseDouble(string);                return false;            } catch (NumberFormatException var2) {                return true;            }        }    }}