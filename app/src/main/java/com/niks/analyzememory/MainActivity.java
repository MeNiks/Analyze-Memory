package com.niks.analyzememory;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextInputLayout textInputLayout1;
    boolean thisisit = true;
    Picasso picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayList<IAMKB> list = new ArrayList<IAMKB>();
        list.add(new IAMKB());
        ImageView imageView = (ImageView) findViewById(R.id.imageview);

//        picasso = Picasso.with(getApplicationContext());
//        picasso.load("http://192.168.1.109/webserver/images/ccc.png").into(imageView, new Callback() {
//
//            @Override
//            public void onSuccess() {
//            }
//
//            @Override
//            public void onError() {
//
//            }
//        });

        textInputLayout1 = (TextInputLayout) findViewById(R.id.textInputLayout1);


        Button mybottom1 = (Button) findViewById(R.id.mybottom1);
        mybottom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                textInputLayout1.setErrorEnabled(true);
//                textInputLayout1.setError("Hi");
                new TestLoadAsync().execute();
            }
        });
        Button mybottom2 = (Button) findViewById(R.id.mybottom2);
        mybottom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textInputLayout1.setErrorEnabled(false);
            }
        });

    }

    private class TestLoadAsync extends AsyncTask<String, Integer, String> {

        @Override
        protected String doInBackground(String... params) {
            //To generate 10MB data in memory
            ArrayList<IAMKB> list = new ArrayList<IAMKB>();
            for (int i = 1; i <= 10000; i++) {
                list.add(new IAMKB());
                System.out.println("At " + i);
            }
//                Thread.sleep(5000);
            return null;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "destroyed", Toast.LENGTH_SHORT).show();
    }

    public class IAMKB {
        double aa = 10;

        double ba = 10;

        double ca = 10;

        double da = 10;

        double ea = 10;

        double fa = 10;

        double ga = 10;

        double ha = 10;

        double ia = 10;

        double ja = 10;

        double ka = 10;

        double la = 10;

        double ma = 10;

        double na = 10;

        double oa = 10;

        double pa = 10;

        double qa = 10;

        double ra = 10;

        double sa = 10;

        double ta = 10;

        double ua = 10;

        double va = 10;

        double wa = 10;

        double xa = 10;

        double ya = 10;

        double za = 10;

        double ab = 10;

        double bb = 10;

        double cb = 10;

        double db = 10;

        double eb = 10;

        double fb = 10;

        double gb = 10;

        double hb = 10;

        double ib = 10;

        double jb = 10;

        double kb = 10;

        double lb = 10;

        double mb = 10;

        double nb = 10;

        double ob = 10;

        double pb = 10;

        double qb = 10;

        double rb = 10;

        double sb = 10;

        double tb = 10;

        double ub = 10;

        double vb = 10;

        double wb = 10;

        double xb = 10;

        double yb = 10;

        double zb = 10;

        double ac = 10;

        double bc = 10;

        double cc = 10;

        double dc = 10;

        double ec = 10;

        double fc = 10;

        double gc = 10;

        double hc = 10;

        double ic = 10;

        double jc = 10;

        double kc = 10;

        double lc = 10;

        double mc = 10;

        double nc = 10;

        double oc = 10;

        double pc = 10;

        double qc = 10;

        double rc = 10;

        double sc = 10;

        double tc = 10;

        double uc = 10;

        double vc = 10;

        double wc = 10;

        double xc = 10;

        double yc = 10;

        double zc = 10;

        double ad = 10;

        double bd = 10;

        double cd = 10;

        double dd = 10;

        double ed = 10;

        double fd = 10;

        double gd = 10;

        double hd = 10;

        double id = 10;

        double jd = 10;

        double kd = 10;

        double ld = 10;

        double md = 10;

        double nd = 10;

        double od = 10;

        double pd = 10;

        double qd = 10;

        double rd = 10;

        double sd = 10;

        double td = 10;

        double ud = 10;

        double vd = 10;

        double wd = 10;

        double xd = 10;

        double yd = 10;

        double zd = 10;
        double ae = 10;

        double be = 10;

        double ce = 10;

        double de = 10;

        double ee = 10;

        double fe = 10;

        double ge = 10;

        double he = 10;

        double ie = 10;

        double je = 10;

        double ke = 10;

        double le = 10;

        double me = 10;

        double ne = 10;

        double oe = 10;

        double pe = 10;

        double qe = 10;

        double re = 10;

        double se = 10;

        double te = 10;

        double ue = 10;

        double ve = 10;

        double we = 10;

        double xe = 10;

    }
}
