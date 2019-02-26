package com.stremio.javaaddon.exampleaddon;
import java.util.Vector;

public class Subtitles {
public class subsContainer {
    class Pair {
        String lang;
        String url;
        public Pair(String lang, String url) {
            this.lang = lang;
            this.url = url;
        }
        /**
         * @return the lang
         */
        public String getLang() {
            return lang;
        }
        /**
         * @return the url
         */
        public String getUrl() {
            return url;
        }
    }
    Vector<Pair> all = new Vector<Pair>();

    /**
     * @return the all
     */
    public Vector<Pair> getAll() {
        return all;
    }
    public void addSubtitle(String lang, String url){
        all.add(new Pair(lang, url));
    }
}
subsContainer subtitles = new subsContainer();
public void addSubtitle(String lang, String url) {
    subtitles.addSubtitle(lang, url);
}
/**
 * @return the subtitles
 */
public subsContainer getSubtitles() {
    return subtitles;
}
}