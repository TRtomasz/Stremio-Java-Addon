package com.stremio.javaaddon.exampleaddon;
import java.util.Vector;

public class CatalogContainer {
    Vector<MetaElement> metas = new Vector<MetaElement>();
    class MetaElement {
        final String id;
        final String type;
        final String name;
        final String poster;

        public MetaElement(String id, String type, String name, String poster) {
            this.id = id;
            this.type = type;
            this.name = name;
            this.poster = poster;
        }
        /**
         * @return the id
         */
        public String getId() {
            return id;
        }
        /**
         * @return the type
         */
        public String getType() {
            return type;
        }
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @return the poster
         */
        public String getPoster() {
            return poster;
        }
    }
    /**
     * @return the metas
     */
    public Vector<MetaElement> getMetas() {
        return metas;
    }
    public void addMetaElement(String id, String type, String name, String poster) {
        metas.add(new MetaElement(id,type,name,poster));
    }
}