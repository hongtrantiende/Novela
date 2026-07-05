package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eu2  reason: default package */
/* loaded from: classes.dex */
public final class eu2 implements z75 {
    public final /* synthetic */ hu2 a;

    public eu2(hu2 hu2Var) {
        this.a = hu2Var;
    }

    @Override // defpackage.z75
    public final void a() {
        this.a.e.remove(this);
    }

    @Override // defpackage.z75
    public final boolean b(Uri uri, jt1 jt1Var, boolean z) {
        gu2 gu2Var;
        hu2 hu2Var = this.a;
        HashMap hashMap = hu2Var.d;
        if (hu2Var.M == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            gu2 gu2Var2 = (gu2) hashMap.get(uri);
            gu2Var2.getClass();
            b85 b85Var = gu2Var2.a;
            int size = b85Var.b.size();
            jwc it = ts5.j(b85Var.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                gu2 gu2Var3 = (gu2) hashMap.get(uri2);
                if (gu2Var3 != null) {
                    fu2 fu2Var = (fu2) nk2.r(gu2Var3.b, uri2, uri2);
                    fu2Var.getClass();
                    if (elapsedRealtime <= fu2Var.E) {
                        i++;
                    }
                }
            }
            int size2 = hu2Var.H.size();
            ms5 listIterator = hu2Var.H.listIterator(0);
            int i2 = 0;
            while (listIterator.hasNext()) {
                if (hu2Var.e((b85) listIterator.next(), elapsedRealtime)) {
                    i2++;
                }
            }
            mc2 mc2Var = new mc2(size, i, size2, i2, 1);
            hu2Var.c.getClass();
            cy5 o = ox9.o(mc2Var, jt1Var);
            if (o != null && (gu2Var = (gu2) hashMap.get(uri)) != null) {
                return gu2.c(gu2Var, uri, o.b);
            }
        }
        return false;
    }
}
