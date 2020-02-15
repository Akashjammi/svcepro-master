package svce.svcepro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;


public class webloader extends Activity {


    private WebView webView;
    Integer x;


    Activity activity ;
    private ProgressDialog progDailog;



    @SuppressLint("NewApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webloader);
        Bundle extras=getIntent().getExtras();
        x=extras.getInt("firsel");


        activity = this;

        progDailog = ProgressDialog.show(activity, "Loading","Please wait...", true);
        progDailog.setCancelable(false);



        webView = (WebView) findViewById(R.id.webview_compontent);



        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setDisplayZoomControls(true);
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                progDailog.show();
                view.loadUrl(url);

                return true;
            }
            @Override
            public void onPageFinished(WebView view, final String url) {
               progDailog.dismiss();
            }
        });




        switch(x) {
            case 1: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdds6vzIW9YHO_P7Fwl2yrKLWVTtaudz0CfjqKjgXRdAKVbUw/viewform");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }
            case 2: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSc1BiJ8S_gLbo8VSojy4btUkcFDdoiHg70Pu10KLmoYajqpaw/viewform");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }
            case 3: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSf3-YkewEp5Z20cFPbiak-VlZS05wN711Xp29wZCywwvgb6nw/viewform");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }
            case 4: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdAXgRT54CnijffSsxxPcWmhNDnEgf9JBjRobmr2HhmWd_VUg/viewform");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }
            case 5: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdAWDNBOum9YSko0mp7kSm1htmwsA_WtrWg4HDQCVn6ywo8sA/viewform");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }
            case 6: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("http://coe1.annauniv.edu/home/");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }
            case 7: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("https://www.svce.ac.in/");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }
            case 8: {
                //progressBar.setVisibility(View.INVISIBLE);

                webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdfsD1Ksf5SVCktdBIOvbeSpljUy3EXC-INIn5xtmbzJ5EBXw/viewform");
                webView.setDownloadListener(new DownloadListener() {
                    public void onDownloadStart(String url, String userAgent,
                                                String contentDisposition, String mimetype,
                                                long contentLength) {
                        Intent i = new Intent(Intent.ACTION_VIEW);

                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });  break;
            }


        }


    }
}

