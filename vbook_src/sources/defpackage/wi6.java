package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wi6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wi6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk6 b;

    public /* synthetic */ wi6(nk6 nk6Var, int i) {
        this.a = i;
        this.b = nk6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object obj;
        int i;
        int i2 = this.a;
        boolean z = false;
        int i3 = 0;
        int i4 = 1;
        nk6 nk6Var = this.b;
        switch (i2) {
            case 0:
                ik6 ik6Var = (ik6) sl1.k0(nk6Var.g().m);
                if (ik6Var == null || ik6Var.a >= nk6Var.g().l - 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return Integer.valueOf(((em8) nk6Var.c.d).h());
            case 2:
                Iterator it = nk6Var.g().m.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ik6) obj).a == ((em8) nk6Var.c.d).h()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                return (ik6) obj;
            default:
                Iterator it2 = nk6Var.g().m.iterator();
                while (it2.hasNext() && (i = ((ik6) it2.next()).e) != -1 && i3 == i) {
                    i3++;
                }
                i4 = i3;
                return Integer.valueOf(i4);
        }
    }
}
