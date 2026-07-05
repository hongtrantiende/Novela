package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb3  reason: default package */
/* loaded from: classes.dex */
public final class fb3 extends mq7 implements zj3 {
    public qh6 K;

    @Override // defpackage.mq7
    public final void A1() {
        qh6 qh6Var = this.K;
        qh6Var.e();
        qh6Var.b = null;
        qh6Var.c = -1;
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        n61 n61Var = qd6Var.a;
        ArrayList arrayList = this.K.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mh6 mh6Var = (mh6) arrayList.get(i);
            p15 p15Var = mh6Var.o;
            if (p15Var != null) {
                long j = mh6Var.m;
                long j2 = p15Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((mu9) n61Var.b.b).D(f, f2);
                try {
                    npe.p(qd6Var, p15Var);
                } finally {
                    ((mu9) n61Var.b.b).D(-f, -f2);
                }
            }
        }
        qd6Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fb3) && c16.i(this.K, ((fb3) obj).K)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.K.hashCode();
    }

    public final String toString() {
        qh6 qh6Var = this.K;
        return "DisplayingDisappearingItemsNode(animator=" + qh6Var + ")";
    }

    @Override // defpackage.mq7
    public final void z1() {
        this.K.j = this;
    }
}
