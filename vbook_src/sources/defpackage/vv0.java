package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vv0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg6 b;

    public /* synthetic */ vv0(qg6 qg6Var, int i) {
        this.a = i;
        this.b = qg6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i;
        int i2;
        int i3 = this.a;
        Object obj = null;
        int i4 = 0;
        int i5 = -1;
        qg6 qg6Var = this.b;
        switch (i3) {
            case 0:
                eg6 j = qg6Var.j();
                int i6 = j.p;
                List list = j.m;
                fg6 fg6Var = (fg6) sl1.e0(list);
                if (i6 > 0 && fg6Var != null && list.size() < i6) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((int) (((fg6) next).x >> 32)) != ((int) (fg6Var.x >> 32))) {
                                obj = next;
                            }
                        }
                    }
                    fg6 fg6Var2 = (fg6) obj;
                    if (fg6Var2 != null) {
                        i = ((int) (fg6Var2.x >> 32)) - ((int) (fg6Var.x >> 32));
                    } else {
                        i = (int) (fg6Var.w >> 32);
                    }
                    float f = i;
                    if (f < 1.0f) {
                        f = 1.0f;
                    }
                    float f2 = ((fg6Var.a / 3) * f) - ((int) (fg6Var.x >> 32));
                    float f3 = (j.o - j.n) / f;
                    float f4 = (i6 + 2) / 3;
                    float m = dce.m(f3 / f4, 0.1f, 1.0f);
                    float f5 = (f4 - f3) * f;
                    if (f5 < 1.0f) {
                        f5 = 1.0f;
                    }
                    return new yk8(Float.valueOf((1.0f - m) * dce.m(f2 / f5, nae.e, 1.0f)), Float.valueOf(m));
                }
                return new yk8(Float.valueOf((float) nae.e), Float.valueOf(1.0f));
            case 1:
                return Integer.valueOf(qg6Var.h());
            case 2:
                qg6Var.j().getClass();
                return Boolean.FALSE;
            case 3:
                Iterator it2 = qg6Var.j().m.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((fg6) next2).a == qg6Var.h()) {
                            obj = next2;
                        }
                    }
                }
                return (fg6) obj;
            case 4:
                Iterator it3 = qg6Var.j().m.iterator();
                while (it3.hasNext() && (i2 = ((fg6) it3.next()).z) != -1 && i4 == i2) {
                    i4++;
                }
                if (i4 < 1) {
                    i4 = 1;
                }
                return Integer.valueOf(i4);
            case 5:
                fg6 fg6Var3 = (fg6) sl1.e0(qg6Var.j().m);
                if (fg6Var3 != null) {
                    i4 = fg6Var3.a;
                }
                return Integer.valueOf(i4);
            default:
                fg6 fg6Var4 = (fg6) sl1.k0(qg6Var.j().m);
                if (fg6Var4 != null) {
                    i5 = fg6Var4.a;
                }
                return Integer.valueOf(i5);
        }
    }
}
