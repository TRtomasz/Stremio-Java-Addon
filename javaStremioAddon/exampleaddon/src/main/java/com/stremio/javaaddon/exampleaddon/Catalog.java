package com.stremio.javaaddon.exampleaddon;

public class Catalog {
    final String type;
    final String id;
    final String name;
    final String[] genres;
    final String[] extraRequired;
    final String[] extraSupported;

    public Catalog(String type, String id, String name, String[] genres, String[] extraRequired, String[] extraSupported){
        this.type = type;
        this.id = id;
        this.name = name;
        this.genres = genres;
        this.extraRequired = extraRequired;
        this.extraSupported = extraSupported;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the extraRequired
     */
    public String[] getExtraRequired() {
        return extraRequired;
    }
    /**
     * @return the extraSupported
     */
    public String[] getExtraSupported() {
        return extraSupported;
    }
    /**
     * @return the genres
     */
    public String[] getGenres() {
        return genres;
    }
}