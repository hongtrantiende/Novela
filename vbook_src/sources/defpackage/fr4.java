package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fr4  reason: default package */
/* loaded from: classes3.dex */
public abstract class fr4 extends pe4 {
    public final pe4 c;

    public fr4(pe4 pe4Var) {
        pe4Var.getClass();
        this.c = pe4Var;
    }

    @Override // defpackage.pe4
    public final yd4 I0(hn8 hn8Var) {
        hn8Var.getClass();
        yd4 I0 = this.c.I0(hn8Var);
        if (I0 == null) {
            return null;
        }
        hn8 hn8Var2 = I0.c;
        if (hn8Var2 == null) {
            return I0;
        }
        boolean z = I0.a;
        boolean z2 = I0.b;
        Long l = I0.d;
        Long l2 = I0.e;
        Long l3 = I0.f;
        Long l4 = I0.g;
        Map map = I0.h;
        map.getClass();
        return new yd4(z, z2, hn8Var2, l, l2, l3, l4, map);
    }

    @Override // defpackage.pe4
    public final x56 N0(hn8 hn8Var) {
        return this.c.N0(hn8Var);
    }

    @Override // defpackage.pe4
    public final void Q(hn8 hn8Var) {
        hn8Var.getClass();
        this.c.Q(hn8Var);
    }

    @Override // defpackage.pe4
    public final void V(hn8 hn8Var, boolean z) {
        hn8Var.getClass();
        this.c.V(hn8Var, z);
    }

    @Override // defpackage.pe4
    public final x56 V0(hn8 hn8Var) {
        hn8Var.getClass();
        return this.c.V0(hn8Var);
    }

    @Override // defpackage.pe4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.pe4
    public final osa k1(hn8 hn8Var) {
        hn8Var.getClass();
        return this.c.k1(hn8Var);
    }

    @Override // defpackage.pe4
    public final List m0(hn8 hn8Var) {
        hn8Var.getClass();
        List<hn8> m0 = this.c.m0(hn8Var);
        ArrayList arrayList = new ArrayList();
        for (hn8 hn8Var2 : m0) {
            hn8Var2.getClass();
            arrayList.add(hn8Var2);
        }
        wl1.N(arrayList);
        return arrayList;
    }

    @Override // defpackage.pe4
    public final yma o(hn8 hn8Var) {
        hn8Var.getClass();
        return this.c.o(hn8Var);
    }

    @Override // defpackage.pe4
    public final List p0(hn8 hn8Var) {
        hn8Var.getClass();
        List<hn8> p0 = this.c.p0(hn8Var);
        if (p0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (hn8 hn8Var2 : p0) {
            hn8Var2.getClass();
            arrayList.add(hn8Var2);
        }
        wl1.N(arrayList);
        return arrayList;
    }

    @Override // defpackage.pe4
    public final void q(hn8 hn8Var, hn8 hn8Var2) {
        hn8Var.getClass();
        hn8Var2.getClass();
        this.c.q(hn8Var, hn8Var2);
    }

    public final String toString() {
        return cm9.a(getClass()).g() + '(' + this.c + ')';
    }
}
