package junction.dohack.mapservice;

import de.westnordost.osmapi.OsmConnection;
import de.westnordost.osmapi.map.MapDataDao;
import de.westnordost.osmapi.map.MapDataFactory;
import de.westnordost.osmapi.map.OsmMapDataFactory;
import de.westnordost.osmapi.map.data.BoundingBox;

/**
 * @author Silas Mahler
 * @version 0.1
 */
public class MapService {


    OsmConnection osm = new OsmConnection(
            "https://api.openstreetmap.org/api/0.6/",
            "my user agent", null);

    public void getDate(){

        //Testarea

        BoundingBox bb = new BoundingBox(7.4191617965,51.4934081641,7.4212056398,51.494316611);
        MapDataFactory mdf = new OsmMapDataFactory();
        MapDataDao mdd = new MapDataDao(osm, mdf);

        mdd.getMap(bb, new MyMapDataHandler());



    }
}
