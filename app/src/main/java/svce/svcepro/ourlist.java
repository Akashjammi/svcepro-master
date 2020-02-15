package svce.svcepro;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by harishananth on 13/10/16.
 */

public class ourlist {
    private int imageId;
    private String name;
    private String subone;
    private String subtwo;

    public ourlist(int imageId,String name, String subone,String subtwo) {
        this.imageId = imageId;
        this.name = name;
        this.subone=subone;
        this.subtwo=subtwo;

    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getsubone() {
        return subone;
    }
    public void setsubone(String subone) {
        this.subone = subone;
    }
    public String getsubtwo() {
        return subtwo;
    }
    public void setsubtwo(String subtwo) {
        this.subtwo = subtwo;
    }

    @Override
    public String toString() {
        return subtwo + "\n";
    }


}
