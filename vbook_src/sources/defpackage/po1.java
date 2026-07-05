package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: po1  reason: default package */
/* loaded from: classes.dex */
public final class po1 extends ro1 {
    public po1(List list) {
        this.a.addAll(list);
        g();
    }

    @Override // defpackage.ex3
    public final boolean b(cp3 cp3Var, cp3 cp3Var2) {
        cp3Var.getClass();
        cp3Var2.getClass();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.b.get(i2);
            obj.getClass();
            if (!((ex3) obj).b(cp3Var, cp3Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ex3
    public final boolean c(cp3 cp3Var, al6 al6Var) {
        cp3Var.getClass();
        al6Var.getClass();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.b.get(i2);
            obj.getClass();
            if (!((ex3) obj).c(cp3Var, al6Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String[] strArr = d4b.a;
        return d4b.j("", this.a);
    }
}
