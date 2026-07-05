package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d9d  reason: default package */
/* loaded from: classes.dex */
public final class d9d implements PointerInputEventHandler {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ m82 D;
    public final /* synthetic */ aw7 E;
    public final /* synthetic */ aw7 F;
    public final /* synthetic */ aw7 G;
    public final /* synthetic */ vt4 H;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dx4 e;
    public final /* synthetic */ xt4 f;

    public d9d(boolean z, boolean z2, int i, int i2, dx4 dx4Var, xt4 xt4Var, xt4 xt4Var2, m82 m82Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, vt4 vt4Var) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = dx4Var;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.D = m82Var;
        this.E = aw7Var;
        this.F = aw7Var2;
        this.G = aw7Var3;
        this.H = vt4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c9d] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        final boolean z = this.a;
        final boolean z2 = this.b;
        final int i = this.c;
        final int i2 = this.d;
        final dx4 dx4Var = this.e;
        final xt4 xt4Var = this.f;
        final xt4 xt4Var2 = this.C;
        final m82 m82Var = this.D;
        final aw7 aw7Var = this.E;
        final aw7 aw7Var2 = this.F;
        final aw7 aw7Var3 = this.G;
        return ukb.e(d19Var, new xt4() { // from class: c9d
            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                boolean z3;
                cf3 cf3Var;
                int i3;
                boolean z4;
                int i4;
                float f;
                aw7 aw7Var4;
                dx4 dx4Var2 = dx4Var;
                hm8 hm8Var = dx4Var2.i;
                hm8 hm8Var2 = dx4Var2.j;
                y78 y78Var = (y78) obj;
                boolean z5 = z;
                pvc pvcVar = pvc.a;
                if (!z5 || !z2) {
                    return pvcVar;
                }
                long j = y78Var.a;
                int i5 = (int) (j >> 32);
                float intBitsToFloat = Float.intBitsToFloat(i5);
                aw7 aw7Var5 = aw7Var;
                if (intBitsToFloat < ((Number) aw7Var5.getValue()).intValue() / 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    cf3Var = cf3.b;
                } else {
                    cf3Var = cf3.c;
                }
                if (z3) {
                    i3 = i;
                } else {
                    i3 = i2;
                }
                em8 em8Var = dx4Var2.o;
                em8 em8Var2 = dx4Var2.l;
                if (((cf3) hm8Var.getValue()) == cf3Var && ((Number) hm8Var2.getValue()).intValue() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i4 = 5;
                } else {
                    i4 = i3;
                }
                if (z4) {
                    i3 = ((Number) hm8Var2.getValue()).intValue() + 5;
                }
                dx4Var2.f.setValue(cf3Var);
                dx4Var2.g.setValue(Integer.valueOf(i3));
                hm8Var.setValue(cf3Var);
                hm8Var2.setValue(Integer.valueOf(i3));
                hm8 hm8Var3 = dx4Var2.h;
                Boolean bool = Boolean.TRUE;
                hm8Var3.setValue(bool);
                dx4Var2.k.setValue(bool);
                float f2 = 0.5f;
                if (((Number) aw7Var5.getValue()).intValue() > 0) {
                    f = dce.m(Float.intBitsToFloat(i5) / ((Number) aw7Var5.getValue()).intValue(), nae.e, 1.0f);
                } else {
                    f = 0.5f;
                }
                dx4Var2.m.i(f);
                if (((Number) aw7Var2.getValue()).intValue() > 0) {
                    f2 = dce.m(Float.intBitsToFloat((int) (j & 4294967295L)) / ((Number) aw7Var4.getValue()).intValue(), nae.e, 1.0f);
                }
                dx4Var2.n.i(f2);
                em8Var2.i(em8Var2.h() + 1);
                em8Var.i(em8Var.h() + 1);
                int ordinal = cf3Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            xt4Var2.invoke(Integer.valueOf(i4));
                        } else {
                            xk5.o();
                            return null;
                        }
                    } else {
                        xt4Var.invoke(Integer.valueOf(i4));
                    }
                }
                aw7 aw7Var6 = aw7Var3;
                w26 w26Var = (w26) aw7Var6.getValue();
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
                aw7Var6.setValue(z87.v(m82Var, null, null, new rzc(dx4Var2, null, 4), 3));
                return pvcVar;
            }
        }, null, null, new nv(18, this.H), m42Var, 6);
    }
}
