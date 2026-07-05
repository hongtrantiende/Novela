package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h81  reason: default package */
/* loaded from: classes3.dex */
public final class h81 {
    public final uo3 a;
    public final ym0 b;
    public final wm0 c;
    public final zua d;

    public h81(uo3 uo3Var, ym0 ym0Var, wm0 wm0Var, zua zuaVar) {
        uo3Var.getClass();
        ym0Var.getClass();
        wm0Var.getClass();
        zuaVar.getClass();
        this.a = uo3Var;
        this.b = ym0Var;
        this.c = wm0Var;
        this.d = zuaVar;
    }

    public final void a() {
        ym0 ym0Var = this.b;
        ym0Var.a.clear();
        ym0Var.c.clear();
        em8 em8Var = ym0Var.b;
        em8Var.i(em8Var.h() + 1);
        wm0 wm0Var = this.c;
        wm0Var.a.clear();
        wm0Var.c.clear();
        em8 em8Var2 = wm0Var.b;
        em8Var2.i(em8Var2.h() + 1);
        int i = so3.f;
        so3 v = twe.v(tl1.A(new xl0(hre.q().toString(), en0.a, new cm0("", ks3.a))));
        uo3 uo3Var = this.a;
        uo3Var.getClass();
        uo3Var.g(v, true);
    }

    public final boolean b() {
        String str;
        List list = this.a.e().a;
        if (list.size() != 1) {
            return false;
        }
        xl0 xl0Var = (xl0) sl1.c0(list);
        if (!c16.i(xl0Var.b, en0.a)) {
            return false;
        }
        dub b = this.b.b(xl0Var.a);
        if (b != null) {
            str = b23.s(b);
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public final String c() {
        dub b;
        List<xl0> list = this.a.e().a;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (xl0 xl0Var : list) {
            dm0 dm0Var = xl0Var.c;
            String str = xl0Var.a;
            if ((dm0Var instanceof cm0) && (b = this.b.b(str)) != null) {
                String s = b23.s(b);
                if (!s.equals(((cm0) dm0Var).a)) {
                    xl0Var = xl0.a(xl0Var, null, new cm0(s, this.c.i(str)), null, 11);
                }
            }
            arrayList.add(xl0Var);
        }
        oc5 i = axe.i();
        ArrayList arrayList2 = new ArrayList();
        try {
            return new zg4(i, new mb5(i, arrayList2), arrayList2).I(arrayList);
        } catch (Throwable th) {
            arrayList2.add(rte.m(null, th));
            return "";
        }
    }
}
