package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gd2  reason: default package */
/* loaded from: classes.dex */
public final class gd2 extends nmd {
    public final ic f;

    public gd2(ic icVar) {
        this.f = icVar;
    }

    @Override // defpackage.nmd
    public final int t(int i, int i2, tc6 tc6Var, mw8 mw8Var, int i3) {
        int o0 = mw8Var.o0(this.f.a);
        if (o0 != Integer.MIN_VALUE) {
            int i4 = i3 - o0;
            if (tc6Var == tc6.b) {
                return (i - i2) - i4;
            }
            return i4;
        }
        return 0;
    }

    @Override // defpackage.nmd
    public final Integer x(mw8 mw8Var) {
        return Integer.valueOf(mw8Var.o0(this.f.a));
    }
}
