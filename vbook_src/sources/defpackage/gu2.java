package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gu2  reason: default package */
/* loaded from: classes.dex */
public final class gu2 {
    public final b85 a;
    public final HashMap b;
    public final /* synthetic */ hu2 c;

    public gu2(hu2 hu2Var, b85 b85Var) {
        this.c = hu2Var;
        this.a = b85Var;
        HashMap hashMap = new HashMap();
        jwc it = ts5.j(b85Var.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) b85Var.b.get(str);
            uri.getClass();
            hashMap.put(uri, new fu2(this.c, uri, str));
        }
        this.b = hashMap;
    }

    public static q75 a(gu2 gu2Var, Uri uri) {
        fu2 fu2Var = (fu2) nk2.r(gu2Var.b, uri, uri);
        fu2Var.getClass();
        return fu2Var.e;
    }

    public static void b(gu2 gu2Var, Uri uri, boolean z) {
        Uri uri2;
        fu2 fu2Var = (fu2) nk2.r(gu2Var.b, uri, uri);
        fu2Var.getClass();
        if (z) {
            uri2 = fu2Var.a();
        } else {
            uri2 = fu2Var.a;
        }
        fu2Var.c(uri2);
    }

    public static boolean c(gu2 gu2Var, Uri uri, long j) {
        boolean z;
        HashMap hashMap = gu2Var.b;
        fu2 fu2Var = (fu2) nk2.r(hashMap, uri, uri);
        fu2Var.getClass();
        fu2Var.E = SystemClock.elapsedRealtime() + j;
        hu2 hu2Var = gu2Var.c;
        b85 b85Var = gu2Var.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (fu2 fu2Var2 : hashMap.values()) {
            if (!fu2Var2.b.equals(b85Var.d) && elapsedRealtime > fu2Var2.E) {
                Uri c = b85Var.c();
                String str = fu2Var2.b;
                wq9.D(b85Var.b.containsKey(str));
                b85Var.d = str;
                if (c.equals(hu2Var.L)) {
                    hu2Var.h(fu2Var2.a);
                }
                fu2 fu2Var3 = (fu2) hashMap.get(c);
                fu2Var3.getClass();
                fu2Var2.H = fu2Var3.H;
                fu2Var3.H = false;
                return true;
            }
        }
        Uri uri2 = hu2Var.L;
        if (uri2 == null || uri.equals(uri2)) {
            qs5 qs5Var = hu2Var.H;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            int i = 0;
            while (true) {
                if (i < qs5Var.size()) {
                    Uri c2 = ((b85) qs5Var.get(i)).c();
                    gu2 gu2Var2 = (gu2) hu2Var.d.get(c2);
                    gu2Var2.getClass();
                    HashMap hashMap2 = gu2Var2.b;
                    fu2 fu2Var4 = (fu2) nk2.r(hashMap2, c2, c2);
                    fu2Var4.getClass();
                    if (elapsedRealtime2 <= fu2Var4.E) {
                        i++;
                    } else {
                        hu2Var.L = c2;
                        Uri d = hu2Var.d(c2);
                        fu2 fu2Var5 = (fu2) nk2.r(hashMap2, c2, c2);
                        fu2Var5.getClass();
                        fu2Var5.c(d);
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
