package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n7a  reason: default package */
/* loaded from: classes.dex */
public final class n7a {
    public static final yy9 l = new yy9(new zy9(25), new az9(27));
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final cv7 c;
    public final AtomicLong d;
    public m6a e;
    public zd1 f;
    public dl7 g;
    public j6a h;
    public m6a i;
    public m6a j;
    public final hm8 k;

    public n7a(long j) {
        cv7 cv7Var = zx6.a;
        this.c = new cv7();
        this.d = new AtomicLong(j);
        cv7 cv7Var2 = zx6.a;
        cv7Var2.getClass();
        this.k = yae.z(cv7Var2);
    }

    public final cv7 a() {
        return (cv7) this.k.getValue();
    }

    public final boolean b(sc6 sc6Var, long j, long j2, h6a h6aVar, boolean z) {
        dl7 dl7Var = this.g;
        if (dl7Var != null) {
            f7a f7aVar = (f7a) dl7Var.b;
            long d = f7aVar.d(sc6Var, j);
            long d2 = f7aVar.d(sc6Var, j2);
            f7aVar.n(z);
            return f7aVar.s(d, d2, false, h6aVar);
        }
        return true;
    }

    public final void c() {
        j6a j6aVar = this.h;
        if (j6aVar != null) {
            j6aVar.invoke();
        }
    }

    public final void d(sc6 sc6Var, long j, h6a h6aVar, boolean z) {
        zd1 zd1Var = this.f;
        if (zd1Var != null) {
            zd1Var.h(Boolean.valueOf(z), sc6Var, new y78(j), h6aVar);
        }
    }

    public final ArrayList e(sc6 sc6Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            wl1.O(new oo1(new el7(sc6Var, 13), 5), arrayList);
            this.a = true;
        }
        return arrayList;
    }

    public final void f(cu7 cu7Var) {
        long j = cu7Var.a;
        cv7 cv7Var = this.c;
        if (cv7Var.b(j)) {
            this.b.remove(cu7Var);
            cv7Var.g(j);
            m6a m6aVar = this.j;
            if (m6aVar != null) {
                m6aVar.invoke(Long.valueOf(j));
            }
        }
    }
}
