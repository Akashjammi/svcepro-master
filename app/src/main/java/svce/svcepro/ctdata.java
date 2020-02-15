package svce.svcepro;

/**
 * Created by harishananth on 25/12/16.
 */

public class ctdata {
    public String title,desc,timing;
    public float rval;
    public int imageId;

    ctdata(String title, Float value,String desc,String timing, int imageId) {
        this.title = title;
        this.rval = value;
        this.desc=desc;
        this.imageId = imageId;
        this.timing=timing;
    }

}
