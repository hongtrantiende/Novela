package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ml4  reason: default package */
/* loaded from: classes.dex */
public final class ml4 {
    public final void a(w27 w27Var, w27 w27Var2, long j) {
        long c = iwe.c(j, de6.a);
        if (w27Var != null) {
            int F = w27Var.F(x02.h(c));
            new jy5(jy5.a(F, w27Var.n0(F)));
        }
        if (w27Var2 != null) {
            int F2 = w27Var2.F(x02.h(c));
            new jy5(jy5.a(F2, w27Var2.n0(F2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof ml4)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + hl5.a(0, kl4.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + kl4.a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
