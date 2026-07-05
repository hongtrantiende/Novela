package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pgd  reason: default package */
/* loaded from: classes3.dex */
public final class pgd {
    public final WebView a;
    public final String b;
    public final String c;
    public final mu9 d;
    public vfd e;
    public final HashMap f;

    /* JADX WARN: Type inference failed for: r1v3, types: [mu9, java.lang.Object] */
    public pgd(Context context) {
        context.getClass();
        WebView webView = new WebView(context);
        this.a = webView;
        String concat = "jsi_".concat(k4b.L0(8, ube.B()));
        this.b = concat;
        this.c = "_callNativeFunction";
        ?? obj = new Object();
        obj.a = webView;
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.acceptCookie();
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        cookieManager.acceptThirdPartyCookies(webView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setSaveFormData(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        this.d = obj;
        this.f = new HashMap();
        webView.setWebViewClient(new mgd(this));
        webView.setWebChromeClient(new ngd(this));
        webView.addJavascriptInterface(this, concat);
    }

    public final Object a(String str, n42 n42Var) {
        f61 f61Var = new f61(1, w92.t(n42Var));
        f61Var.u();
        this.a.evaluateJavascript(r4b.N(str, false, this.c, hl5.n("window.", this.b, ".callback")), new ogd(this, f61Var));
        return f61Var.s();
    }

    public final void b(String str) {
        vfd vfdVar = this.e;
        if (vfdVar != null) {
            vfdVar.w(str, null);
        }
        this.a.loadUrl(str);
    }

    @JavascriptInterface
    public final Object callback(String str) {
        gs9 gs9Var;
        String a;
        str.getClass();
        try {
            List list = l46.f(r36.d.c(str)).a;
            String a2 = l46.h((k46) list.get(0)).a();
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i = 1; i < size; i++) {
                i56 h = l46.h((k46) list.get(i));
                if (h instanceof a56) {
                    a = null;
                } else {
                    a = h.a();
                }
                if (a != null) {
                    arrayList.add(a);
                }
            }
            u26 u26Var = (u26) this.f.get(a2);
            if (u26Var != null) {
                Object[] array = arrayList.toArray(new Object[0]);
                u26Var.a(Arrays.copyOf(array, array.length));
            }
            gs9Var = null;
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Throwable a3 = hs9.a(gs9Var);
        if (a3 != null) {
            a3.printStackTrace();
        }
        if (gs9Var != null) {
            return null;
        }
        return gs9Var;
    }
}
