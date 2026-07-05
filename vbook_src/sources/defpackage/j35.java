package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Map;
import org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j35  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class j35 implements lu4 {
    public final /* synthetic */ int a;

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                bu1 bu1Var = (bu1) obj;
                tn4 tn4Var = HandleRedirectActivity.R;
                bu1Var.getClass();
                WebView webView = new WebView(bu1Var);
                HandleRedirectActivity.S.invoke(webView);
                webView.setWebChromeClient(new WebChromeClient());
                webView.setWebViewClient(new k35((String) obj2, bu1Var, bu1Var));
                return webView;
            case 1:
                ((String) obj).getClass();
                ((List) obj2).getClass();
                return pvcVar;
            case 2:
                ((String) obj).getClass();
                ((List) obj2).getClass();
                return pvcVar;
            case 3:
                ((wh5) obj).getClass();
                ((gh5) obj2).getClass();
                return pvcVar;
            case 4:
                int intValue = ((Integer) obj2).intValue();
                ((vh5) obj).getClass();
                return Long.valueOf(tg9.b.i() + Math.min((long) (Math.pow(2.0d, intValue - 1) * 1000.0d), 60000L));
            case 5:
                Object key = ((Map.Entry) obj2).getKey();
                key.getClass();
                return Integer.valueOf(((String) ((Map.Entry) obj).getKey()).compareTo((String) key));
            case 6:
                dna dnaVar = (dna) obj;
                return (y78) obj2;
            case 7:
                lg6 lg6Var = (lg6) obj;
                ((Integer) obj2).intValue();
                return new i25(dpe.b(1));
            case 8:
                rx9 rx9Var = (rx9) obj;
                qg6 qg6Var = (qg6) obj2;
                return tl1.B(Integer.valueOf(qg6Var.h()), Integer.valueOf(qg6Var.i()));
            case 9:
                rx9 rx9Var2 = (rx9) obj;
                kj6 kj6Var = (kj6) obj2;
                return tl1.B(Integer.valueOf(kj6Var.h()), Integer.valueOf(kj6Var.i()));
            case 10:
                rx9 rx9Var3 = (rx9) obj;
                Map d = ((qj6) obj2).d();
                if (d.isEmpty()) {
                    return null;
                }
                return d;
            case 11:
                rx9 rx9Var4 = (rx9) obj;
                n53 n53Var = ((nk6) obj2).c;
                return tl1.B((int[]) n53Var.c, (int[]) n53Var.e);
            case 12:
                ((Integer) obj).intValue();
                mvb mvbVar = (mvb) obj2;
                mvbVar.getClass();
                return mvbVar.a;
            case 13:
                q0a q0aVar = (q0a) obj;
                q0aVar.getClass();
                ((wl8) obj2).getClass();
                return new t27(q0aVar.b(cm9.a(u27.class)));
            case 14:
                ((Integer) obj).intValue();
                nc9 nc9Var = (nc9) obj2;
                nc9Var.getClass();
                return Long.valueOf(nc9Var.a);
            case 15:
                ((Integer) obj).intValue();
                l54 l54Var = (l54) obj2;
                l54Var.getClass();
                return l54Var.a;
            case 16:
                ((Integer) obj2).getClass();
                z87.d(xoe.p(1), (rv4) obj);
                return pvcVar;
            case 17:
                ((Integer) obj2).getClass();
                oc2.f(xoe.p(1), (rv4) obj);
                return pvcVar;
            case 18:
                ((Integer) obj).intValue();
                mq5 mq5Var = (mq5) obj2;
                mq5Var.getClass();
                return mq5Var.a;
            case 19:
                ((Integer) obj2).getClass();
                xl7.e(xoe.p(1), (rv4) obj);
                return pvcVar;
            case 20:
                ((Integer) obj2).getClass();
                cq7.e(xoe.p(1), (rv4) obj);
                return pvcVar;
            case 21:
                ((Integer) obj).intValue();
                j48 j48Var = (j48) obj2;
                j48Var.getClass();
                return j48Var.a;
            case 22:
                hn8 hn8Var = (hn8) obj;
                hn8Var.getClass();
                ((pe4) obj2).getClass();
                return new pma(fn8.d(hn8Var.a.t(), true).a.t());
            case 23:
                return Integer.valueOf(((w27) obj).n0(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((w27) obj).J(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((w27) obj).j(((Integer) obj2).intValue()));
            case 26:
                return Integer.valueOf(((w27) obj).F(((Integer) obj2).intValue()));
            case 27:
                sj8 sj8Var = (sj8) obj2;
                ((rx9) obj).getClass();
                sj8Var.getClass();
                return tl1.B(Integer.valueOf(sj8Var.k()), Float.valueOf(sj8Var.l()), Integer.valueOf(sj8Var.n()));
            case 28:
                ((Integer) obj).getClass();
                vh8 vh8Var = (vh8) obj2;
                vh8Var.getClass();
                return vh8Var.a;
            default:
                ((Integer) obj).getClass();
                vh8 vh8Var2 = (vh8) obj2;
                vh8Var2.getClass();
                return vh8Var2.a;
        }
    }

    public /* synthetic */ j35(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ j35(int i) {
        this.a = i;
    }
}
