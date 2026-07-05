package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uo3  reason: default package */
/* loaded from: classes3.dex */
public final class uo3 {
    public final hm8 a;
    public ym0 c;
    public wm0 d;
    public int e;
    public boolean g;
    public final oaa b = new oaa(12);
    public final LinkedHashMap f = new LinkedHashMap();

    public uo3(so3 so3Var) {
        this.a = yae.z(so3Var.b());
    }

    public final void a(q65 q65Var, p65 p65Var) {
        uo3 uo3Var;
        Throwable th;
        cm0 cm0Var;
        lo3 lo3Var;
        uo3 uo3Var2;
        no3 no3Var;
        this.g = true;
        try {
            boolean z = q65Var instanceof t4b;
            p65 p65Var2 = p65.a;
            try {
                if (z) {
                    if (p65Var == p65Var2) {
                        no3Var = ((t4b) q65Var).a;
                    } else {
                        no3Var = ((t4b) q65Var).b;
                    }
                    ym0 ym0Var = this.c;
                    wm0 wm0Var = this.d;
                    if (ym0Var != null && wm0Var != null) {
                        gwe.d(this, no3Var, ym0Var, wm0Var);
                        k(no3Var);
                    } else {
                        g(gwe.u(no3Var), false);
                    }
                    uo3Var2 = this;
                } else {
                    try {
                        if (q65Var instanceof xm0) {
                            if (p65Var == p65Var2) {
                                cm0Var = ((xm0) q65Var).b;
                            } else {
                                cm0Var = ((xm0) q65Var).c;
                            }
                            cm0 cm0Var2 = cm0Var;
                            if (p65Var == p65Var2) {
                                lo3Var = ((xm0) q65Var).d;
                            } else {
                                lo3Var = ((xm0) q65Var).e;
                            }
                            lo3 lo3Var2 = lo3Var;
                            ym0 ym0Var2 = this.c;
                            wm0 wm0Var2 = this.d;
                            if (ym0Var2 != null && wm0Var2 != null) {
                                uo3Var2 = this;
                                cwe.b(uo3Var2, ((xm0) q65Var).a, cm0Var2, lo3Var2, ym0Var2, wm0Var2);
                                uo3Var2.m(((xm0) q65Var).a, cm0Var2, lo3Var2);
                            } else {
                                uo3Var2 = this;
                                yk8 m = iwe.m(q65Var, uo3Var2.e().a, p65Var);
                                List list = (List) m.a;
                                lo3 lo3Var3 = (lo3) m.b;
                                int i = so3.f;
                                uo3Var2.g(so3.a(twe.v(list), null, lo3Var3.a, gwe.s(lo3Var3, list), null, null, 25), false);
                            }
                        } else {
                            throw new gt1(7);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        uo3Var.g = false;
                        throw th;
                    }
                }
                uo3Var2.g = false;
            } catch (Throwable th3) {
                th = th3;
                uo3Var = this;
                uo3Var.g = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            uo3Var = this;
        }
    }

    public final void b(String str) {
        str.getClass();
        Set set = (Set) this.f.get(new pm0(str));
        if (set != null) {
            for (ppb ppbVar : sl1.C0(set)) {
                ppbVar.a();
            }
        }
    }

    public final void c(List list) {
        Collection<?> collection;
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = sl1.V(list).iterator();
        if (!it.hasNext()) {
            collection = rs3.a;
        } else {
            xl0 xl0Var = (xl0) it.next();
            xl0Var.getClass();
            pm0 pm0Var = new pm0(xl0Var.a);
            if (!it.hasNext()) {
                collection = fca.B(pm0Var);
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(pm0Var);
                while (it.hasNext()) {
                    xl0 xl0Var2 = (xl0) it.next();
                    xl0Var2.getClass();
                    linkedHashSet.add(new pm0(xl0Var2.a));
                }
                collection = linkedHashSet;
            }
        }
        linkedHashMap.keySet().retainAll(collection);
    }

    public final void d(mo3 mo3Var) {
        mo3Var.getClass();
        j(mo3Var.a(e()).b());
        c(e().a);
    }

    public final so3 e() {
        return (so3) this.a.getValue();
    }

    public final void f(q65 q65Var, r97 r97Var) {
        xm0 xm0Var;
        xm0 xm0Var2;
        r97Var.getClass();
        if (!this.g) {
            oaa oaaVar = this.b;
            rz rzVar = (rz) oaaVar.b;
            if (iwe.h(q65Var)) {
                return;
            }
            if (r97Var.equals(p97.a)) {
                rzVar.addLast(q65Var);
            } else if (r97Var instanceof q97) {
                q65 q65Var2 = (q65) rzVar.g();
                xm0 xm0Var3 = null;
                if (q65Var2 != null) {
                    q97 q97Var = wo3.b;
                    if (q65Var2 instanceof xm0) {
                        xm0Var = (xm0) q65Var2;
                    } else {
                        xm0Var = null;
                    }
                    if (xm0Var != null) {
                        if (q65Var instanceof xm0) {
                            xm0Var2 = (xm0) q65Var;
                        } else {
                            xm0Var2 = null;
                        }
                        if (xm0Var2 != null && xm0Var.c.equals(xm0Var2.b) && c16.i(xm0Var.e, xm0Var2.d)) {
                            cm0 cm0Var = xm0Var2.c;
                            lo3 lo3Var = xm0Var2.e;
                            String str = xm0Var.a;
                            cm0 cm0Var2 = xm0Var.b;
                            lo3 lo3Var2 = xm0Var.d;
                            lo3Var2.getClass();
                            lo3Var.getClass();
                            xm0Var3 = new xm0(str, cm0Var2, cm0Var, lo3Var2, lo3Var);
                        }
                    }
                }
                if (xm0Var3 == null) {
                    rzVar.addLast(q65Var);
                } else if (iwe.h(xm0Var3)) {
                    rzVar.removeLast();
                } else {
                    rzVar.removeLast();
                    rzVar.addLast(xm0Var3);
                }
            } else {
                xk5.o();
                return;
            }
            ((rz) oaaVar.c).clear();
            while (rzVar.c > 100) {
                rzVar.removeFirst();
            }
            oaaVar.R();
        }
    }

    public final void g(so3 so3Var, boolean z) {
        j(so3Var.b());
        c(e().a);
        if (z) {
            oaa oaaVar = this.b;
            if (((Boolean) ((hm8) oaaVar.d).getValue()).booleanValue() || ((Boolean) ((hm8) oaaVar.e).getValue()).booleanValue()) {
                ((rz) oaaVar.b).clear();
                ((rz) oaaVar.c).clear();
                oaaVar.R();
            }
        }
    }

    public final void h(ym0 ym0Var, wm0 wm0Var, vt4 vt4Var) {
        int i;
        Iterable<ppb> iterable;
        if (!this.g && (i = this.e) <= 0) {
            if (ym0Var == null) {
                ym0Var = this.c;
            }
            if (wm0Var == null) {
                wm0Var = this.d;
            }
            if (ym0Var != null && wm0Var != null) {
                this.e = i + 1;
                try {
                    c00 V = sl1.V(this.f.values());
                    u83 u83Var = new u83(20);
                    k9a k9aVar = k9a.a;
                    rb3 rb3Var = new rb3(new ki4(V, u83Var).iterator(), new j9a(0));
                    if (!rb3Var.hasNext()) {
                        iterable = ks3.a;
                    } else {
                        Object next = rb3Var.next();
                        if (!rb3Var.hasNext()) {
                            iterable = tl1.A(next);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(next);
                            while (rb3Var.hasNext()) {
                                arrayList.add(rb3Var.next());
                            }
                            iterable = arrayList;
                        }
                    }
                    for (ppb ppbVar : iterable) {
                        ppbVar.a();
                    }
                    no3 g = gwe.g(this, ym0Var, wm0Var);
                    vt4Var.invoke();
                    no3 g2 = gwe.g(this, ym0Var, wm0Var);
                    f(new t4b(g, g2), p97.a);
                    k(g2);
                    return;
                } finally {
                    this.e--;
                }
            }
            vt4Var.invoke();
            return;
        }
        vt4Var.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ym0 r8, defpackage.wm0 r9, defpackage.dh2 r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo3.i(ym0, wm0, dh2, n42):java.lang.Object");
    }

    public final void j(so3 so3Var) {
        this.a.setValue(so3Var);
    }

    public final void k(no3 no3Var) {
        Iterable<ppb> iterable;
        c(e().a);
        c00 V = sl1.V(this.f.values());
        u83 u83Var = new u83(20);
        k9a k9aVar = k9a.a;
        ki4 ki4Var = new ki4(V, u83Var);
        rb3 rb3Var = new rb3(ki4Var.iterator(), new j9a(0));
        if (!rb3Var.hasNext()) {
            iterable = ks3.a;
        } else {
            Object next = rb3Var.next();
            if (!rb3Var.hasNext()) {
                iterable = tl1.A(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (rb3Var.hasNext()) {
                    arrayList.add(rb3Var.next());
                }
                iterable = arrayList;
            }
        }
        for (ppb ppbVar : iterable) {
            ppbVar.a.a();
            ppbVar.b = no3Var;
        }
    }

    public final void l(String str, no3 no3Var) {
        str.getClass();
        Set set = (Set) this.f.get(new pm0(str));
        if (set != null) {
            for (ppb ppbVar : sl1.C0(set)) {
                ppbVar.a.a();
                ppbVar.b = no3Var;
            }
        }
    }

    public final void m(String str, cm0 cm0Var, lo3 lo3Var) {
        Set set = (Set) this.f.get(new pm0(str));
        if (set != null) {
            for (ppb ppbVar : sl1.C0(set)) {
                ppbVar.getClass();
                ppbVar.a.a();
                ppbVar.b = new no3(lo3Var, iwe.l(ppbVar.b.a, str, cm0Var));
            }
        }
    }
}
