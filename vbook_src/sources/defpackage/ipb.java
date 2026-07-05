package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ipb  reason: default package */
/* loaded from: classes.dex */
public final class ipb {
    public final ps a;
    public final oyb b;
    public final boolean e;
    public final r13 g;
    public final do4 h;
    public bm1 j;
    public tc6 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = ks3.a;

    public ipb(ps psVar, oyb oybVar, boolean z, r13 r13Var, do4 do4Var, int i) {
        this.a = psVar;
        this.b = oybVar;
        this.e = z;
        this.g = r13Var;
        this.h = do4Var;
    }

    public final void a(tc6 tc6Var) {
        bm1 bm1Var = this.j;
        if (bm1Var == null || tc6Var != this.k || bm1Var.b()) {
            this.k = tc6Var;
            bm1Var = new bm1(this.a, uaf.z(this.b, tc6Var), this.i, this.g, this.h);
        }
        this.j = bm1Var;
    }
}
