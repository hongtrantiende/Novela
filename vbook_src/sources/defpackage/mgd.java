package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mgd  reason: default package */
/* loaded from: classes.dex */
public final class mgd extends WebViewClient {
    public final /* synthetic */ pgd a;

    public mgd(pgd pgdVar) {
        this.a = pgdVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        vfd vfdVar;
        super.onPageFinished(webView, str);
        if (str != null && (vfdVar = this.a.e) != null) {
            vfdVar.x(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        vfd vfdVar;
        jj jjVar;
        vfd vfdVar2;
        super.onPageStarted(webView, str, bitmap);
        pgd pgdVar = this.a;
        if (bitmap != null && (vfdVar2 = pgdVar.e) != null) {
            vfdVar2.s(new jj(bitmap));
        }
        if (str != null && (vfdVar = pgdVar.e) != null) {
            if (bitmap != null) {
                jjVar = new jj(bitmap);
            } else {
                jjVar = null;
            }
            vfdVar.w(str, jjVar);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        vfd vfdVar = this.a.e;
        ygd ygdVar = null;
        Uri uri = null;
        if (vfdVar != null) {
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            }
            ygdVar = vfdVar.g(String.valueOf(uri));
        }
        if (ygdVar != null) {
            return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(ygdVar.a));
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        vfd vfdVar = this.a.e;
        ygd g = vfdVar != null ? vfdVar.g(String.valueOf(str)) : null;
        if (g != null) {
            return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(g.a));
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
