package com.stremio.javaaddon.exampleaddon;

public class Manifest {
    final String id;
    final String version;
    final String name;
    final String description;
    final String[] idPrefixes;
    final String[] resources;
    final String[] types;
    final Catalog[] catalogs;
    final String background;
    final String logo;
    final String contactEmail;
    public Manifest(String id, String version, String name, String description, String[] idPrefixes, String[] resources, String[] types, Catalog[] catalogs, String background, String logo, String contactEmail)
    {
        this.id = id;
        this.version = version;
        this.name = name;
        this.idPrefixes = idPrefixes;
        this.description = description;
        this.resources = resources;
        this.types = types;
        this.catalogs = catalogs;
        this.background = background;
        this.logo = logo;
        this.contactEmail = contactEmail;
    }
    /**
     * @return the idPrefixes
     */
    public String[] getIdPrefixes() {
        return idPrefixes;
    }
    /**
     * @return the background
     */
    public String getBackground() {
        return background;
    }
    /**
     * @return the catalog
     */
    public Catalog[] getCatalogs() {
        return catalogs;
    }
    /**
     * @return the contactEmail
     */
    public String getContactEmail() {
        return contactEmail;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the types
     */
    public String[] getTypes() {
        return types;
    }
    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }
    /**
     * @return the resources
     */
    public String[] getResources() {
        return resources;
    }
}