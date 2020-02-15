package svce.svcepro;

/**
 * Created by harishananth on 25/12/16.
 */

public class cdata {
    public String title,desc;
    public float rval;
    public int imageId;

    cdata(String title, Float value,String desc, int imageId) {
        this.title = title;
        this.rval = value;
        this.desc=desc;
        this.imageId = imageId;
    }

}
