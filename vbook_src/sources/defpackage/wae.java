package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wae  reason: default package */
/* loaded from: classes.dex */
public final class wae {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final dbe g;

    public wae(lte lteVar, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        dbe dbeVar;
        am8.p(str2);
        am8.p(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.f(ppe.f0(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ppe ppeVar2 = lteVar.f;
                    lte.m(ppeVar2);
                    ppeVar2.f.e("Param name can't be null");
                    it.remove();
                } else {
                    l6f l6fVar = lteVar.E;
                    lte.k(l6fVar);
                    Object g0 = l6fVar.g0(bundle2.get(next), next);
                    if (g0 == null) {
                        ppe ppeVar3 = lteVar.f;
                        lte.m(ppeVar3);
                        ppeVar3.E.f(lteVar.F.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        l6f l6fVar2 = lteVar.E;
                        lte.k(l6fVar2);
                        l6fVar2.o0(bundle2, next, g0);
                    }
                }
            }
            dbeVar = new dbe(bundle2);
        } else {
            dbeVar = new dbe(new Bundle());
        }
        this.g = dbeVar;
    }

    public final wae a(lte lteVar, long j) {
        return new wae(lteVar, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String dbeVar = this.g.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + dbeVar.length() + 1);
        nk2.C(sb, "Event{appId='", str, "', name='", str2);
        return nk2.v(sb, "', params=", dbeVar, "}");
    }

    public wae(lte lteVar, String str, String str2, String str3, long j, long j2, long j3, dbe dbeVar) {
        am8.p(str2);
        am8.p(str3);
        am8.s(dbeVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.E.g(ppe.f0(str2), ppe.f0(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = dbeVar;
    }
}
