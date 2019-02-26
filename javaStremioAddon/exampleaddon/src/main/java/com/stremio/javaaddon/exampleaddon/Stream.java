package com.stremio.javaaddon.exampleaddon;
import java.util.Vector;

public class Stream {
    Vector<StreamElement> streams = new Vector<StreamElement>();
    class StreamElement {
    String url;
    public StreamElement(String url) {
        this.url = url;
        }
        /**
         * @return the url
         */
        public String getUrl() {
            return url;
        }
    }

    /**
     * @return the url
     */
    public Vector<StreamElement> getStreams() {
        return streams;
    }
    public void addStream(String url) {
        streams.add(new StreamElement(url));
    }
}