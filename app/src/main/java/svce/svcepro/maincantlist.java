package svce.svcepro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.identity.intents.AddressConstants;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by harishananth on 12/01/17.
 */

public class maincantlist extends AppCompatActivity {
    int x,y;
    String[] hotcoff={"Espresso - 22","Americano - 22","Cappuccino -22(Small),38(Regular)","Cafe latte - 38","Cafe Mocha - 45","Vanilla Cappucino - 45"};
    String[] hoteas={"Garam Chai - 22(Small),38(Regular)","Masal Chai - 22(Small),38(Regular)","Ginger Chai -22(Small),38(Regular)","Hot Lemon Chai-22(Small),38(Regular)","Cardamom Chai - 22(Small),38(Regular)"};
    String[] healthcl={"Horlicks - 28(Small),45(Regular)","Boost - 28(Small),45(Regular)","Badam Milk - 45(Regular)"};
    String[] coldcoff={"Eskimo Cofee - 50","Tropical Moksha - 50"};
    String[] frosteas={"Lemon Ice Tea - 33"};
    String[] choco={"Flavoured Chocolate Moksha - 40","Flavoured Cold Choco - 55"};
    String[] fruit={"Orangillo - 33","Gauva Freeze - 33","Choco Cookie SLush - 50","Jaljeera Slush - 33","Fresh Lemon Slush- 33"};
    String[] soups={"Creamy Tomato - 30","Sweet Corn - 30","Tom Yum - 30"};


//food court

    String[] snacks1={"Veg Puff - 20","Paneer Puff - 25","Mushroom Puff - 25","Samosa - 15","Kadai Paneer Wrap Roll - 30","Choco Donught - 30","Walnut Brownie - 60","Walnut Brownie with Icecream - 70"};
    String[] kulfi={"Kesar Pista kulfi - 25","Matka Kulfi - 25"};
    String[] creambun={"Pineapple Cream Bun - 25","Strawberry Cream Bun - 25"};
    String[] sandwich={"Paneer Tikka S/W - 50","Cheese S/W - 50"};
    String[] pastries={"Black Forest - 55","Vannila - 55","Pineapple - 55","Strawberry - 55","Blueberry - 55","Choco Fantasy - 55"};
    String[] soda={"Lemon - 30","Cola -30","Blueberry - 30","Orange - 30","Strawberry - 30","Fruit Ale - 30","Kala-Kata - 30","Jaljeera - 30","Mango - 30","Hot Chilli - 30"};
    String[] shakes={"Chocolate - 40","Mango - 40","Strawberry - 40","Vanilla - 40","Black Current - 40"};
    String[] crushers={"Pineapple Crush - 60","Strawberry Crush - 60","Lychee Crush - 60","Kiwi Crush - 60","Blackcurrent Crush - 60","Orange Crush - 60","Cold Coffee Crush - 60","Chocolate Crush - 60","Kesar Elaichi Crush - 60","Butterscotch Crush - 60","Fig Crush - 60","Alphonsa Crush - 60"};

//main canteen

    String[] breakfast={"1-Pongal - 30 ","2-Vadai - 25","3-Idly - 20","4-Poori - 20","5-Dosai - 20"};
    String[] lunch={"1-Meals - 65","2-Sambar Rice - 35","3-Brinji Rice -35","4-Fried Rice - 35","5-Tomato Rice - 35","6-Coconut Rice - 35","7-Puthina Rice - 35","8-Coconut Rice - 35","9-Corainder Rice - 35","10-Curd Rice - 25","11-Chola Poori -30","12-Chappathi(2nos)- 25","13-Parota(2nos) - 25"};
    String[] snacks={"1-Bonda(2nos) - 20","2-Bajji(2nos)- 20","3-Vadai(2nos) - 20","4-Masal vadai(2nos) - 20","5-Mini Idly Sambar - 20","6-Sambar Vadai(2nos) - 20","7-Kara Sev - 20","8-Kara Bhoondi - 20","9-Veg Roll - 20","10-Samosa - 12","11-Puff - 12","12-Tea -10","13-Coffee- 15","14-Hot Milk - 15" };
    String[] chocolates={"Diary Milk - 5","Five Star - 5","Perk - 5","Diary Milk - 10","Five Star - 10","Snickers - 20","Diary Milk -25","Diary Milk -40"};
    String[] parle={"20-20 - 5","Chocopie - 10","Oreo -15","Hide and seek -30","Milano - 30"};
    String[] chips={"Corn Puff - 10","Lays - 10"};
    String[] britania={"Milkbikis - 10","Mariegold - 10","50-50 - 10","C.Chip/Treat - 10","Good day - 10","Bourbon - 10","Britiana Cake - 15","Jam Treat - 15"};
    String[] softdrinks={"Rc Cola - 15","Appy & Frooti(Small) - 10","Appy Fiz - 15","Frooti - 15","Cuba Cafe/A.Fizz - 25","Mineral Water(1 ltr) - 20","Mineral Water(500 Ml) - 10","Tropicana - 20","Milk Shake (CA) - 30","Zero Coke,T.up - 20","Tin-Coke - 25","Tin-Coke - 30","Sprite - 30","Pulpy Orange - 30"};

    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busroutes);
        Bundle extras=getIntent().getExtras();
        y=extras.getInt("mainsel"); //inside selection
        x=extras.getInt("mainselec");

        lv = (ListView) findViewById(R.id.searchlist);
        inputSearch = (EditText) findViewById(R.id.input);
        setTitle("Search Items");

        switch (y) //initial main selecttion where d type of canteen is chose
        {
            case 1:
            {
                switch(x) //inside main cant
                {
                    case 1: {
                      //  Toast.makeText(maincantlist.this,"The val of mainsel is"+y,Toast.LENGTH_SHORT).show();
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, breakfast);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 2: {
                        //Toast.makeText(maincantlist.this,"val"+x,Toast.LENGTH_LONG).show();
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, lunch);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 3: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, snacks);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 4: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, chocolates);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 5: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, parle);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 6: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, chips);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 7: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, britania);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 8: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, softdrinks);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }


                }
                break;
            }
            case 2:
            {
                switch(x) //inside food court
                {
                    case 1: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, snacks1);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 2: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, kulfi);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 3: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, creambun);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 4: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, sandwich);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 5: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, pastries);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 6: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, soda);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 7: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, shakes);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 8: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, crushers);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }

                }
                break;
            }
            case 3: {
                switch (x) //inside gurunath
                {
                    case 1: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, breakfast);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 2: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, breakfast);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 3: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, breakfast);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 4: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, breakfast);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 5: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, breakfast);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                    case 6: {
                        adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, breakfast);
                        lv.setAdapter(adapter);

                        inputSearch.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                maincantlist.this.adapter.getFilter().filter(cs);
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        break;
                    }
                }
                break;
            }
                case 4:
                {
                    switch(x) //inside coffee day
                    {
                        case 1: {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, hotcoff);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                        }
                        case 2: {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, hoteas);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                        }
                        case 3: {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, healthcl);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                        }
                        case 4: {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, coldcoff);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                        }
                        case 5: {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, frosteas);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                        }
                        case 6:
                        {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, choco);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                        }
                        case 7: {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, fruit);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                        }
                        case 8:
                        {
                            adapter = new ArrayAdapter<String>(this, R.layout.buslist_item, R.id.product_name, soups);
                            lv.setAdapter(adapter);

                            inputSearch.addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence cs, int i, int i1, int i2) {
                                    maincantlist.this.adapter.getFilter().filter(cs);
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                }

                                @Override
                                public void afterTextChanged(Editable editable) {

                                }
                            });
                            break;
                    }
                    }
                break;
            }





        }

    }
}
