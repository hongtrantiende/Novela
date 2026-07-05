package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q0a  reason: default package */
/* loaded from: classes3.dex */
public final class q0a {
    public final nf9 a;
    public final String b;
    public final boolean c;
    public final lsc d;
    public final m96 e;
    public final ArrayList f;
    public volatile ThreadLocal g;

    public q0a(nf9 nf9Var, String str, lsc lscVar, m96 m96Var, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        lscVar = (i & 8) != 0 ? null : lscVar;
        nf9Var.getClass();
        this.a = nf9Var;
        this.b = str;
        this.c = z;
        this.d = lscVar;
        this.e = m96Var;
        this.f = new ArrayList();
        new LinkedHashSet();
    }

    public final void a(rz rzVar) {
        if (!rzVar.isEmpty()) {
            rzVar.removeFirst();
        }
        if (rzVar.isEmpty()) {
            c().remove();
        }
    }

    public final ArrayList b(gi1 gi1Var) {
        m96 m96Var = this.e;
        bm1 bm1Var = new bm1(m96Var.a, this, gi1Var);
        zg4 zg4Var = m96Var.d;
        zg4Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ((ConcurrentHashMap) zg4Var.c).values()) {
            yj0 yj0Var = ((yx5) obj).a;
            nf9 nf9Var = yj0Var.a;
            if (c16.i(nf9Var, this.a) || c16.i(nf9Var, this.d)) {
                if (yj0Var.b.equals(gi1Var) || yj0Var.e.contains(gi1Var)) {
                    arrayList.add(obj);
                }
            }
        }
        List<yx5> C0 = sl1.C0(sl1.G0(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (yx5 yx5Var : C0) {
            Object b = yx5Var.b(bm1Var);
            if (b == null) {
                b = null;
            }
            if (b != null) {
                arrayList2.add(b);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.f;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList4.get(i);
            i++;
            xl1.P(arrayList3, ((q0a) obj2).b(gi1Var));
        }
        return sl1.n0(arrayList2, arrayList3);
    }

    public final ThreadLocal c() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.g;
        if (threadLocal2 == null) {
            synchronized (this) {
                threadLocal = this.g;
                if (threadLocal == null) {
                    threadLocal = new ThreadLocal();
                    this.g = threadLocal;
                }
            }
            return threadLocal;
        }
        return threadLocal2;
    }

    public final rz d(wl8 wl8Var) {
        wl8Var.getClass();
        rz rzVar = (rz) c().get();
        if (rzVar == null) {
            rzVar = new rz();
            c().set(rzVar);
        }
        rzVar.addFirst(wl8Var);
        return rzVar;
    }

    public final Object e(gi1 gi1Var, wl8 wl8Var, nf9 nf9Var) {
        zj1 zj1Var = this.e.a;
        zj1Var.getClass();
        if (ul6.e.compareTo(ul6.a) <= 0) {
            if (nf9Var != null) {
                nf9Var.toString();
            }
            v66.a(gi1Var);
            zj1Var.getClass();
            long a = yq7.a();
            Object g = g(gi1Var, wl8Var, nf9Var);
            long a2 = u9c.a(a);
            v66.a(gi1Var);
            hq7 hq7Var = wl3.b;
            wl3.i(a2, am3.MICROSECONDS);
            zj1Var.getClass();
            return g;
        }
        return g(gi1Var, wl8Var, nf9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02dd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bm1 r12) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0a.f(bm1):java.lang.Object");
    }

    public final Object g(gi1 gi1Var, wl8 wl8Var, nf9 nf9Var) {
        m96 m96Var = this.e;
        bm1 bm1Var = new bm1(m96Var.a, this, gi1Var, nf9Var, wl8Var);
        zj1 zj1Var = m96Var.a;
        if (wl8Var == null) {
            return f(bm1Var);
        }
        zj1Var.getClass();
        ul6 ul6Var = ul6.e;
        ul6 ul6Var2 = ul6.a;
        if (ul6Var.compareTo(ul6Var2) <= 0) {
            wl8Var.toString();
        }
        rz d = d(wl8Var);
        try {
            return f(bm1Var);
        } finally {
            zj1Var.getClass();
            ul6Var.compareTo(ul6Var2);
            a(d);
        }
    }

    public final String toString() {
        return s21.q(new StringBuilder("['"), this.b, "']");
    }
}
