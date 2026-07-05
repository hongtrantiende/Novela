package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m72  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class m72 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gtb b;

    public /* synthetic */ m72(gtb gtbVar, int i) {
        this.a = i;
        this.b = gtbVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        rk9 rk9Var;
        ol6 ol6Var;
        sc6 c;
        long j;
        char c2;
        long j2;
        float f;
        sc6 c3;
        float f2;
        sc6 c4;
        float f3;
        sc6 c5;
        sc6 c6;
        int i = this.a;
        gtb gtbVar = this.b;
        switch (i) {
            case 0:
                ib3 ib3Var = (ib3) obj;
                return new r6(gtbVar, 7);
            case 1:
                y78 y78Var = (y78) obj;
                gtbVar.r();
                return pvc.a;
            default:
                sc6 sc6Var = (sc6) obj;
                ol6 ol6Var2 = gtbVar.d;
                if (ol6Var2 != null) {
                    if (ol6Var2.p) {
                        ol6Var2 = null;
                    }
                    if (ol6Var2 != null) {
                        j88 j88Var = gtbVar.b;
                        long j3 = gtbVar.n().b;
                        int i2 = fxb.c;
                        int w = j88Var.w((int) (j3 >> 32));
                        int w2 = gtbVar.b.w((int) (gtbVar.n().b & 4294967295L));
                        ol6 ol6Var3 = gtbVar.d;
                        long j4 = 0;
                        if (ol6Var3 != null && (c6 = ol6Var3.c()) != null) {
                            j = c6.h0(gtbVar.l(true));
                        } else {
                            j = 0;
                        }
                        ol6 ol6Var4 = gtbVar.d;
                        if (ol6Var4 != null && (c5 = ol6Var4.c()) != null) {
                            j4 = c5.h0(gtbVar.l(false));
                        }
                        ol6 ol6Var5 = gtbVar.d;
                        float f4 = nae.e;
                        if (ol6Var5 != null && (c4 = ol6Var5.c()) != null) {
                            gvb d = ol6Var2.d();
                            if (d != null) {
                                f3 = d.a.c(w).b;
                            } else {
                                f3 = 0.0f;
                            }
                            c2 = ' ';
                            j2 = j4;
                            f = Float.intBitsToFloat((int) (c4.h0((Float.floatToRawIntBits(nae.e) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)) & 4294967295L));
                        } else {
                            c2 = ' ';
                            j2 = j4;
                            f = 0.0f;
                        }
                        ol6 ol6Var6 = gtbVar.d;
                        if (ol6Var6 != null && (c3 = ol6Var6.c()) != null) {
                            gvb d2 = ol6Var2.d();
                            if (d2 != null) {
                                f2 = d2.a.c(w2).b;
                            } else {
                                f2 = 0.0f;
                            }
                            f4 = Float.intBitsToFloat((int) (c3.h0((Float.floatToRawIntBits(nae.e) << c2) | (Float.floatToRawIntBits(f2) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (j >> c2);
                        int i4 = (int) (j2 >> c2);
                        rk9Var = new rk9(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f4), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (ol6Var2.a.g.f() * 25.0f) + Math.max(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L))));
                        ol6Var = gtbVar.d;
                        if (ol6Var == null && (c = ol6Var.c()) != null) {
                            return jye.x(rk9Var, c, sc6Var);
                        }
                        return null;
                    }
                }
                rk9Var = rk9.e;
                ol6Var = gtbVar.d;
                if (ol6Var == null) {
                }
                return null;
        }
    }
}
