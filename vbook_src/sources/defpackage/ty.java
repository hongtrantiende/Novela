package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty  reason: default package */
/* loaded from: classes.dex */
public final class ty implements uy, ry {
    public final /* synthetic */ ry a;
    public final tc6 b;

    public ty(ry ryVar, tc6 tc6Var) {
        this.a = ryVar;
        this.b = tc6Var;
    }

    @Override // defpackage.r13
    public final float B0(float f) {
        return this.a.B0(f);
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.a.G0();
    }

    @Override // defpackage.u06
    public final boolean I0() {
        return this.a.I0();
    }

    @Override // defpackage.r13
    public final float L0(float f) {
        return this.a.L0(f);
    }

    @Override // defpackage.r13
    public final long P(float f) {
        return this.a.P(f);
    }

    @Override // defpackage.r13
    public final long Q(long j) {
        return this.a.Q(j);
    }

    @Override // defpackage.e37
    public final c37 W0(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2) {
        int i3;
        int i4;
        if (i < 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if (i2 < 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            lv5.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new sy(i3, i4, map, xt4Var, 0);
    }

    @Override // defpackage.r13
    public final int X0(float f) {
        return this.a.X0(f);
    }

    @Override // defpackage.r13
    public final float c0(long j) {
        return this.a.c0(j);
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a.f();
    }

    @Override // defpackage.r13
    public final long f1(long j) {
        return this.a.f1(j);
    }

    @Override // defpackage.u06
    public final tc6 getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.r13
    public final float k1(long j) {
        return this.a.k1(j);
    }

    @Override // defpackage.r13
    public final long p0(int i) {
        return this.a.p0(i);
    }

    @Override // defpackage.r13
    public final long r0(float f) {
        return this.a.r0(f);
    }

    @Override // defpackage.r13
    public final float y0(int i) {
        return this.a.y0(i);
    }
}
