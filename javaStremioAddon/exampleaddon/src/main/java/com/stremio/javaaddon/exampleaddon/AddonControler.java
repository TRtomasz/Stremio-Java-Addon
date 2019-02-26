package com.stremio.javaaddon.exampleaddon;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import java.util.Optional;




@RestController
//more about manifest definition here https://github.com/Stremio/stremio-addon-sdk/blob/master/docs/api/responses/manifest.md
public class AddonControler {
Manifest manifest = new Manifest("org.stremio.javaExample", "0.0.1", "JavaAddon", "Example Addon In Java", new String[0] , new String[] {"catalog", "stream", "subtitles"} , new String[] {"movie"}, new Catalog[] {new Catalog("movie", "otherTestCatalog", "OtherJavaCatalog", new String[] {}, new String[0], new String[] {"search"})}, "","https://upload.wikimedia.org/wikipedia/de/thumb/e/e1/Java-Logo.svg/364px-Java-Logo.svg.png", "contact@stremio.com" );
@RequestMapping(value = "/manifest.json")
@CrossOrigin
public Manifest produceManifest()
{
    return  manifest;
}
//value should be set to something like /subtitles/{type}/{hash}/{extra}.json  
@RequestMapping(value = "/subtitles/**")
@CrossOrigin
public Subtitles getSubtitles(){
    Subtitles subs = new Subtitles();
    subs.addSubtitle("en", "https://mkvtoolnix.download/samples/vsshort-en.srt");
    subs.addSubtitle("de", "https://mkvtoolnix.download/samples/vsshort-de.srt");
    return subs;
}
@RequestMapping(value = {"/catalog/{type}/{id}.json","/catalog/{type}/{id}/{extra}.json"})
@CrossOrigin
public CatalogContainer getCatalog(@PathVariable("type") String type, @PathVariable("id") String id, @PathVariable("extra") Optional<String> extra) {
   CatalogContainer cc = new CatalogContainer();
   cc.addMetaElement("tt1254207", "movie", "Big Buck Bunny", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/uVEFQvFMMsg4e6yb03xOfVsDz4o.jpg");
   if(type.equals("movie") && id.equals("otherTestCatalog")) {

       return cc;
   }
   //add logic to handle search now returns whole catalog
   return null;
}
@RequestMapping(value = "/stream/{type}/{id}.json")
@CrossOrigin
public Stream getStreams(@PathVariable("type") String type, @PathVariable("id") String id) {
    Stream streams = new Stream();
    streams.addStream("http://distribution.bbb3d.renderfarming.net/video/mp4/bbb_sunflower_1080p_30fps_normal.mp4");
    if(type.equals("movie") && id.equals("tt1254207")){
        return streams;
    }
    return null;
}
@RequestMapping(value="/", method=RequestMethod.GET)
public String index() {
    return "";

}
@Bean
public CommonsRequestLoggingFilter requestLoggingFilter() {
    CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
    loggingFilter.setIncludeClientInfo(true);
    loggingFilter.setIncludeQueryString(true);
    loggingFilter.setIncludePayload(true);
    loggingFilter.setIncludeHeaders(false);
    return loggingFilter;
}

}