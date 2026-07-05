package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ag6  reason: default package */
/* loaded from: classes.dex */
public final class ag6 extends c3e {
    public final /* synthetic */ boolean C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final wf6 b;
    public final vh6 c;
    public final int d;
    public final /* synthetic */ vh6 e;
    public final /* synthetic */ qg6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag6(wf6 wf6Var, vh6 vh6Var, int i, qg6 qg6Var, boolean z, int i2, int i3, long j) {
        super(4);
        this.e = vh6Var;
        this.f = qg6Var;
        this.C = z;
        this.D = i2;
        this.E = i3;
        this.F = j;
        this.b = wf6Var;
        this.c = vh6Var;
        this.d = i;
    }

    public final fg6 Y(int i, long j, int i2, int i3, int i4) {
        int j2;
        wf6 wf6Var = this.b;
        Object b = wf6Var.b(i);
        Object q = wf6Var.b.q(i);
        List A = A(this.c, i, j);
        if (x02.g(j)) {
            j2 = x02.k(j);
        } else {
            if (!x02.f(j)) {
                ov5.a("does not have fixed height");
            }
            j2 = x02.j(j);
        }
        int i5 = j2;
        tc6 layoutDirection = this.e.b.getLayoutDirection();
        qh6 qh6Var = this.f.m;
        return new fg6(i, b, this.C, i5, i4, layoutDirection, this.D, this.E, A, this.F, q, qh6Var, j, i2, i3);
    }

    @Override // defpackage.c3e
    public final wh6 x(int i, int i2, int i3, long j) {
        return Y(i, j, i2, i3, this.d);
    }
}
