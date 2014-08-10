package tvclient.my.edu.mmu.tvclient.frag;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import tvclient.my.edu.mmu.tvclient.R;
import tvclient.my.edu.mmu.tvclient.TvClient;

/**
 * Created by Ghetto on 8/10/14.
 */
public class Channel3Fragment extends Fragment {
    private static String TAG = Channel3Fragment.class.getCanonicalName();
    // Declaration
    String url = "https://www.instagram.com";

    public Channel3Fragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section number.
     */
    public static Channel3Fragment newInstance() {
        Channel3Fragment fragment = new Channel3Fragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ch3, container,
                false);
        // Load WebView
        WebView webView = (WebView) rootView.findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new webClient());


        webView.loadUrl(url);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((TvClient) activity).onSectionAttached(0);
    }

    private class webClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;

        }

    }

}
