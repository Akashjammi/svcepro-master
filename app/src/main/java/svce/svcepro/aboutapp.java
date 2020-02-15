package svce.svcepro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by harishananth on 15/01/17.
 */

public class aboutapp extends Fragment {
    TextView abt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.aboutapp,null);
        abt=(TextView)view.findViewById(R.id.aboutapp);
        abt.setText("Svce Pro version 7.0.0\n Official App of Sri Venkateswara College Of Engineering.All rights reserved \n The App is open source and is available with complete documentation \n Backend services from Google firebase Analytics+Database and Microsoft Onedrive with fabric integeration\n Feel free to suggest any changes to be made in the Write To Us section \n Developers Welcome! Do pitch us about yourself via the -Be a Developer- section\n The notes and question paper modules are under the control of the Institution wherein notes will be updated in a timely basis");
        return view;
    }
}
