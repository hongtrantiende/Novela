package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k35  reason: default package */
/* loaded from: classes3.dex */
public final class k35 extends WebViewClient {
    public final /* synthetic */ String a;
    public final /* synthetic */ bu1 b;
    public final /* synthetic */ bu1 c;

    public k35(String str, bu1 bu1Var, bu1 bu1Var2) {
        this.a = str;
        this.b = bu1Var;
        this.c = bu1Var2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri uri;
        String str;
        Uri uri2 = null;
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        } else {
            uri = null;
        }
        if (uri != null && (str = this.a) != null) {
            String uri3 = uri.toString();
            uri3.getClass();
            if (r4b.Q(uri3, str, false)) {
                z87.B(new d53(new di2(hh2.a(this.b), 1), uri, (m42) null, 28));
                Intent intent = new Intent();
                bu1 bu1Var = this.c;
                Intent intent2 = bu1Var.getIntent();
                if (intent2 != null) {
                    uri2 = intent2.getData();
                }
                bu1Var.setResult(-1, intent.setData(uri2));
                bu1Var.finish();
                return true;
            }
        }
        return false;
    }
}
