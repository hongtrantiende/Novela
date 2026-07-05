package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: my  reason: default package */
/* loaded from: classes.dex */
public final class my extends f0 {
    @Override // defpackage.ny
    public final /* bridge */ /* synthetic */ void c(int i, Object obj) {
        lp3 lp3Var = (lp3) obj;
    }

    @Override // defpackage.f0
    public final void h() {
        Object obj = this.a;
        obj.getClass();
        ((up3) obj).b.clear();
    }

    @Override // defpackage.ny
    public final void i(int i, int i2, int i3) {
        int i4;
        ArrayList m = m();
        if (i > i2) {
            i4 = i2;
        } else {
            i4 = i2 - i3;
        }
        if (i3 == 1) {
            if (i != i2 + 1 && i != i2 - 1) {
                m.add(i4, m.remove(i));
                return;
            } else {
                m.set(i, m.set(i2, m.get(i)));
                return;
            }
        }
        List subList = m.subList(i, i3 + i);
        ArrayList E0 = sl1.E0(subList);
        subList.clear();
        m.addAll(i4, E0);
    }

    @Override // defpackage.ny
    public final void k(int i, int i2) {
        ArrayList m = m();
        if (i2 == 1) {
            m.remove(i);
        } else {
            m.subList(i, i2 + i).clear();
        }
    }

    public final ArrayList m() {
        lp3 lp3Var = (lp3) this.b;
        if (lp3Var instanceof up3) {
            return ((up3) lp3Var).b;
        }
        vs.k("Current node cannot accept children");
        return null;
    }

    @Override // defpackage.ny
    public final void p(int i, Object obj) {
        lp3 lp3Var = (lp3) obj;
        Object obj2 = this.b;
        obj2.getClass();
        int i2 = ((up3) obj2).a;
        if (i2 > 0) {
            if (lp3Var instanceof up3) {
                ((up3) lp3Var).a = i2 - 1;
            }
            m().add(i, lp3Var);
            return;
        }
        Object obj3 = this.a;
        obj3.getClass();
        int i3 = ((up3) obj3).a;
        throw new IllegalArgumentException(("Too many embedded views for the current surface. The maximum depth is: " + i3).toString());
    }
}
