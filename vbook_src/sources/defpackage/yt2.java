package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yt2  reason: default package */
/* loaded from: classes3.dex */
public final class yt2 {
    public final uo3 a;
    public final ym0 b;
    public final zua c;
    public final ea3 d;

    public yt2(uo3 uo3Var, ym0 ym0Var, zua zuaVar, ea3 ea3Var) {
        uo3Var.getClass();
        ym0Var.getClass();
        zuaVar.getClass();
        this.a = uo3Var;
        this.b = ym0Var;
        this.c = zuaVar;
        this.d = ea3Var;
    }

    public final zq4 a() {
        so3 e;
        String str;
        xl0 c;
        dub b;
        if (((qo3) this.d.invoke()).d && (str = (e = this.a.e()).b) != null && (c = e.c(str)) != null) {
            hn0 hn0Var = c.b;
            if (!hn0Var.d() || !hn0Var.b() || !e.c.isEmpty() || e.d != null || (b = this.b.b(str)) == null) {
                return null;
            }
            long r = b23.r(b);
            int i = fxb.c;
            return new zq4(str, (int) (r >> 32), (int) (r & 4294967295L));
        }
        return null;
    }

    public final void b(tva tvaVar) {
        a6b F;
        Object obj;
        zq4 a = a();
        if (a != null) {
            String str = a.a;
            int i = a.b;
            int i2 = a.c;
            zua zuaVar = this.c;
            uo3 uo3Var = zuaVar.d;
            wm0 wm0Var = zuaVar.c;
            str.getClass();
            ym0 ym0Var = zuaVar.b;
            if (ym0Var.e(str) != null && !zuaVar.e(str)) {
                if (i == i2) {
                    if (ym0Var.e(str) != null) {
                        if (uo3Var != null) {
                            uo3Var.b(str);
                        }
                        Set h = wm0Var.h(str);
                        if (h == null) {
                            if (i <= 0) {
                                h = rs3.a;
                            } else {
                                h = wm0Var.a(i - 1, str);
                            }
                        }
                        Iterator it = h.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (abf.x((tva) obj, tvaVar)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        tva tvaVar2 = (tva) obj;
                        if (tvaVar2 != null) {
                            wm0Var.m(str, fca.s(h, tvaVar2));
                        } else {
                            wm0Var.m(str, fca.w(h, tvaVar));
                        }
                        if (uo3Var == null) {
                            return;
                        }
                        uo3Var.l(str, gwe.g(uo3Var, ym0Var, wm0Var));
                        return;
                    }
                    return;
                }
                wm0Var.getClass();
                aw7 aw7Var = (aw7) nk2.q(str, wm0Var.a);
                if (aw7Var == null) {
                    F = a6b.c;
                } else {
                    F = zbe.F((List) aw7Var.getValue(), i, i2, tvaVar);
                }
                if (yua.a[F.ordinal()] == 1) {
                    zuaVar.c(str, i, i2, tvaVar);
                } else {
                    zuaVar.a(str, i, i2, tvaVar);
                }
            }
        }
    }
}
