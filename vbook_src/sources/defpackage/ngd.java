package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ngd  reason: default package */
/* loaded from: classes3.dex */
public final class ngd extends WebChromeClient {
    public final /* synthetic */ pgd a;

    public ngd(pgd pgdVar) {
        this.a = pgdVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        vfd vfdVar = this.a.e;
        if (vfdVar != null) {
            vfdVar.l(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        vfd vfdVar;
        super.onReceivedIcon(webView, bitmap);
        if (bitmap != null && (vfdVar = this.a.e) != null) {
            vfdVar.s(new jj(bitmap));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        vfd vfdVar = this.a.e;
        if (vfdVar != null) {
            if (str == null) {
                str = "";
            }
            vfdVar.b(str);
        }
    }
}
