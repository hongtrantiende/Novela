package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ym0  reason: default package */
/* loaded from: classes3.dex */
public final class ym0 {
    public final qra a = new qra();
    public final em8 b = new em8(0);
    public final LinkedHashMap c = new LinkedHashMap();

    public static dub c(ym0 ym0Var, String str, String str2) {
        ym0Var.getClass();
        str.getClass();
        str2.getClass();
        qra qraVar = ym0Var.a;
        pm0 pm0Var = new pm0(str);
        Object obj = qraVar.get(pm0Var);
        dub dubVar = obj;
        if (obj == null) {
            dub dubVar2 = new dub("\u200b".concat(str2));
            int n = dce.n(0, 0, str2.length());
            frb g = dubVar2.g();
            int i = n + 1;
            try {
                g.g(sze.a(i, i));
                dubVar2.b(g);
                dubVar2.c();
                qraVar.put(pm0Var, dubVar2);
                dubVar = dubVar2;
            } catch (Throwable th) {
                dubVar2.c();
                throw th;
            }
        }
        return (dub) dubVar;
    }

    public final void a(Set set) {
        LinkedHashMap linkedHashMap;
        qra qraVar = this.a;
        Set set2 = set;
        Iterator it = fca.t(qraVar.c, set2).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.c;
            if (!hasNext) {
                break;
            }
            String str = ((pm0) it.next()).a;
            qraVar.remove(new pm0(str));
            linkedHashMap.remove(new pm0(str));
        }
        for (pm0 pm0Var : fca.t(linkedHashMap.keySet(), set2)) {
            linkedHashMap.remove(new pm0(pm0Var.a));
        }
    }

    public final dub b(String str) {
        str.getClass();
        return (dub) nk2.q(str, this.a);
    }

    public final fxb d(String str) {
        str.getClass();
        dub dubVar = (dub) nk2.q(str, this.a);
        if (dubVar == null) {
            return null;
        }
        sed l = n4f.l(dubVar);
        int i = l.b;
        int length = l.a.length();
        long j = dubVar.d().e;
        int i2 = fxb.c;
        return new fxb(sze.a(dce.n(((int) (j >> 32)) - i, 0, length), dce.n(((int) (j & 4294967295L)) - i, 0, length)));
    }

    public final String e(String str) {
        str.getClass();
        dub dubVar = (dub) nk2.q(str, this.a);
        if (dubVar != null) {
            return n4f.l(dubVar).a;
        }
        return null;
    }

    public final String f(String str, int i, int i2, String str2, Integer num) {
        int length;
        str.getClass();
        dub dubVar = (dub) nk2.q(str, this.a);
        if (dubVar == null) {
            return null;
        }
        String t0 = k4b.t0(dubVar.d().d.toString(), "\u200b");
        int n = dce.n(i, 0, t0.length());
        String o = eub.o(t0.substring(0, n), str2, t0.substring(dce.n(i2, n, t0.length())));
        if (num != null) {
            length = num.intValue();
        } else {
            length = n + str2.length();
        }
        frb g = dubVar.g();
        try {
            g.c(0, g.c.length(), "");
            g.append("\u200b".concat(o));
            int n2 = dce.n(length, 0, o.length()) + 1;
            g.g(sze.a(n2, n2));
            dubVar.b(g);
            dubVar.c();
            this.c.put(new pm0(str), o);
            return o;
        } catch (Throwable th) {
            dubVar.c();
            throw th;
        }
    }

    public final void g(long j, String str) {
        str.getClass();
        dub dubVar = (dub) nk2.q(str, this.a);
        if (dubVar == null) {
            return;
        }
        sed l = n4f.l(dubVar);
        int length = l.a.length();
        int i = fxb.c;
        long a = sze.a(dce.n((int) (j >> 32), 0, length), dce.n((int) (j & 4294967295L), 0, length));
        frb g = dubVar.g();
        int i2 = (int) (a >> 32);
        try {
            int i3 = l.b;
            g.g(sze.a(i2 + i3, ((int) (a & 4294967295L)) + i3));
            dubVar.b(g);
        } finally {
            dubVar.c();
        }
    }

    public final void h(String str, String str2, Integer num) {
        int length;
        str.getClass();
        str2.getClass();
        dub dubVar = (dub) nk2.q(str, this.a);
        if (dubVar != null) {
            String t0 = k4b.t0(dubVar.d().d.toString(), "\u200b");
            frb g = dubVar.g();
            try {
                g.c(0, g.c.length(), "");
                g.append("\u200b".concat(str2));
                if (num != null) {
                    length = num.intValue();
                } else {
                    length = str2.length();
                }
                int i = length + 1;
                g.g(sze.a(i, i));
                dubVar.b(g);
                dubVar.c();
                if (!str2.equals(t0)) {
                    this.c.put(new pm0(str), str2);
                }
            } catch (Throwable th) {
                dubVar.c();
                throw th;
            }
        }
    }
}
