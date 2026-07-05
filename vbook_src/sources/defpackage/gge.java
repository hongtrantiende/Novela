package defpackage;

import android.os.Bundle;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gge  reason: default package */
/* loaded from: classes.dex */
public final class gge extends xke {
    public final yz b;
    public final yz c;
    public long d;

    /* JADX WARN: Type inference failed for: r2v1, types: [yz, jla] */
    /* JADX WARN: Type inference failed for: r2v2, types: [yz, jla] */
    public gge(lte lteVar) {
        super(lteVar);
        this.c = new jla(0);
        this.b = new jla(0);
    }

    public final void Y(long j, String str) {
        lte lteVar = (lte) this.a;
        if (str != null && str.length() != 0) {
            ete eteVar = lteVar.C;
            lte.m(eteVar);
            eteVar.g0(new bxd(this, str, j, 0));
            return;
        }
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.f.e("Ad unit id must be a non-empty string");
    }

    public final void Z(long j, String str) {
        lte lteVar = (lte) this.a;
        if (str != null && str.length() != 0) {
            ete eteVar = lteVar.C;
            lte.m(eteVar);
            eteVar.g0(new bxd(this, str, j, 1));
            return;
        }
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.f.e("Ad unit id must be a non-empty string");
    }

    public final void a0(long j) {
        b1f b1fVar = ((lte) this.a).H;
        lte.l(b1fVar);
        s0f b0 = b1fVar.b0(false);
        yz yzVar = this.b;
        Iterator it = ((vz) yzVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c0(str, j - ((Long) yzVar.get(str)).longValue(), b0);
        }
        if (!yzVar.isEmpty()) {
            b0(j - this.d, b0);
        }
        d0(j);
    }

    public final void b0(long j, s0f s0fVar) {
        lte lteVar = (lte) this.a;
        if (s0fVar == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.J.e("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.J.f(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            l6f.U0(s0fVar, bundle, true);
            yze yzeVar = lteVar.I;
            lte.l(yzeVar);
            yzeVar.e0("am", "_xa", bundle);
        }
    }

    public final void c0(String str, long j, s0f s0fVar) {
        lte lteVar = (lte) this.a;
        if (s0fVar == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.J.e("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.J.f(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            l6f.U0(s0fVar, bundle, true);
            yze yzeVar = lteVar.I;
            lte.l(yzeVar);
            yzeVar.e0("am", "_xu", bundle);
        }
    }

    public final void d0(long j) {
        yz yzVar = this.b;
        Iterator it = ((vz) yzVar.keySet()).iterator();
        while (it.hasNext()) {
            yzVar.put((String) it.next(), Long.valueOf(j));
        }
        if (!yzVar.isEmpty()) {
            this.d = j;
        }
    }
}
