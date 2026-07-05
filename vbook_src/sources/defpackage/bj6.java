package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bj6  reason: default package */
/* loaded from: classes.dex */
public final class bj6 extends c3e {
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ lk0 E;
    public final /* synthetic */ mk0 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ long J;
    public final /* synthetic */ kj6 K;
    public final si6 b;
    public final vh6 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ vh6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj6(long j, boolean z, si6 si6Var, vh6 vh6Var, int i, int i2, lk0 lk0Var, mk0 mk0Var, boolean z2, int i3, int i4, long j2, kj6 kj6Var) {
        super(4);
        int i5;
        this.e = z;
        this.f = vh6Var;
        this.C = i;
        this.D = i2;
        this.E = lk0Var;
        this.F = mk0Var;
        this.G = z2;
        this.H = i3;
        this.I = i4;
        this.J = j2;
        this.K = kj6Var;
        this.b = si6Var;
        this.c = vh6Var;
        if (z) {
            i5 = x02.i(j);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        this.d = y02.b(0, i5, 0, z ? Integer.MAX_VALUE : x02.h(j), 5);
    }

    public final gj6 Y(int i, long j) {
        int i2;
        si6 si6Var = this.b;
        Object b = si6Var.b(i);
        Object q = si6Var.b.q(i);
        List A = A(this.c, i, j);
        if (i == this.C - 1) {
            i2 = 0;
        } else {
            i2 = this.D;
        }
        int i3 = i2;
        return new gj6(i, A, this.e, this.E, this.F, this.f.b.getLayoutDirection(), this.G, this.H, this.I, i3, this.J, b, q, this.K.o, j);
    }

    @Override // defpackage.c3e
    public final wh6 x(int i, int i2, int i3, long j) {
        return Y(i, j);
    }
}
