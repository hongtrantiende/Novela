package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cj8  reason: default package */
/* loaded from: classes.dex */
public final class cj8 implements PointerInputEventHandler {
    public final /* synthetic */ vt4 C;
    public final /* synthetic */ ri8 D;
    public final /* synthetic */ si8 E;
    public final /* synthetic */ sk8 F;
    public final /* synthetic */ xt4 G;
    public final /* synthetic */ m82 H;
    public final /* synthetic */ xt4 a;
    public final /* synthetic */ qi8 b;
    public final /* synthetic */ vt4 c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ vt4 f;

    public cj8(xt4 xt4Var, qi8 qi8Var, vt4 vt4Var, vt4 vt4Var2, boolean z, vt4 vt4Var3, vt4 vt4Var4, ri8 ri8Var, si8 si8Var, sk8 sk8Var, xt4 xt4Var2, m82 m82Var) {
        this.a = xt4Var;
        this.b = qi8Var;
        this.c = vt4Var;
        this.d = vt4Var2;
        this.e = z;
        this.f = vt4Var3;
        this.C = vt4Var4;
        this.D = ri8Var;
        this.E = si8Var;
        this.F = sk8Var;
        this.G = xt4Var2;
        this.H = m82Var;
    }

    public static final boolean a(vt4 vt4Var, vt4 vt4Var2, d19 d19Var, float f) {
        if (((Number) vt4Var.invoke()).floatValue() * f <= d(d19Var) && ((Number) vt4Var2.invoke()).floatValue() * f <= c(d19Var)) {
            return false;
        }
        return true;
    }

    public static final yk8 b(vt4 vt4Var, vt4 vt4Var2, ri8 ri8Var, si8 si8Var, d19 d19Var, float f, float f2, float f3) {
        yk8 yk8Var;
        yk8 yk8Var2;
        float f4;
        float d = d(d19Var);
        float c = c(d19Var);
        float floatValue = (((Number) vt4Var.invoke()).floatValue() * f3) - d;
        float abs = Math.abs(floatValue) / 2.0f;
        float floatValue2 = (((Number) vt4Var2.invoke()).floatValue() * f3) - c;
        float abs2 = Math.abs(floatValue2) / 2.0f;
        int ordinal = ri8Var.ordinal();
        Float f5 = null;
        float f6 = nae.e;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (floatValue >= nae.e) {
                        yk8Var = new yk8(Float.valueOf(-abs), Float.valueOf(abs));
                    } else {
                        yk8Var = new yk8(Float.valueOf(abs), Float.valueOf(abs));
                    }
                } else {
                    xk5.o();
                    return null;
                }
            } else {
                Float valueOf = Float.valueOf(abs);
                if (floatValue < nae.e) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    f4 = valueOf.floatValue();
                } else {
                    f4 = 0.0f;
                }
                yk8Var = new yk8(Float.valueOf(-f4), Float.valueOf(f4));
            }
        } else if (floatValue >= nae.e) {
            yk8Var = new yk8(Float.valueOf(-abs), Float.valueOf(abs));
        } else {
            float f7 = -abs;
            yk8Var = new yk8(Float.valueOf(f7), Float.valueOf(f7));
        }
        float floatValue3 = ((Number) yk8Var.a).floatValue();
        float floatValue4 = ((Number) yk8Var.b).floatValue();
        int ordinal2 = si8Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 == 2) {
                    if (floatValue2 >= nae.e) {
                        yk8Var2 = new yk8(Float.valueOf(-abs2), Float.valueOf(abs2));
                    } else {
                        yk8Var2 = new yk8(Float.valueOf(abs2), Float.valueOf(abs2));
                    }
                } else {
                    xk5.o();
                    return null;
                }
            } else {
                Float valueOf2 = Float.valueOf(abs2);
                if (floatValue2 >= nae.e) {
                    f5 = valueOf2;
                }
                if (f5 != null) {
                    f6 = f5.floatValue();
                }
                yk8Var2 = new yk8(Float.valueOf(-f6), Float.valueOf(f6));
            }
        } else if (floatValue2 >= nae.e) {
            yk8Var2 = new yk8(Float.valueOf(-abs2), Float.valueOf(abs2));
        } else {
            float f8 = -abs2;
            yk8Var2 = new yk8(Float.valueOf(f8), Float.valueOf(f8));
        }
        return new yk8(Float.valueOf(dce.m(f, floatValue3, floatValue4)), Float.valueOf(dce.m(f2, ((Number) yk8Var2.a).floatValue(), ((Number) yk8Var2.b).floatValue())));
    }

    public static final float c(d19 d19Var) {
        return (int) (((hab) d19Var).U & 4294967295L);
    }

    public static final float d(d19 d19Var) {
        return (int) (((hab) d19Var).U >> 32);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [yl9, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final d19 d19Var, m42 m42Var) {
        final ?? obj = new Object();
        final c5d c5dVar = new c5d();
        final ?? obj2 = new Object();
        final ?? obj3 = new Object();
        final ?? obj4 = new Object();
        obj4.a = 0L;
        final qi8 qi8Var = this.b;
        final vt4 vt4Var = this.c;
        final vt4 vt4Var2 = this.d;
        final boolean z = this.e;
        final vt4 vt4Var3 = this.f;
        final vt4 vt4Var4 = this.C;
        final ri8 ri8Var = this.D;
        final si8 si8Var = this.E;
        nu4 nu4Var = new nu4() { // from class: aj8
            @Override // defpackage.nu4
            public final Object h(Object obj5, Object obj6, Object obj7, Object obj8) {
                boolean z2;
                float f;
                float f2;
                y78 y78Var = (y78) obj5;
                y78 y78Var2 = (y78) obj6;
                float floatValue = ((Float) obj7).floatValue();
                long longValue = ((Long) obj8).longValue();
                qi8 qi8Var2 = qi8.this;
                dm8 dm8Var = qi8Var2.a;
                dm8 dm8Var2 = qi8Var2.c;
                dm8 dm8Var3 = qi8Var2.b;
                float h = dm8Var.h();
                int i = (floatValue > 1.0f ? 1 : (floatValue == 1.0f ? 0 : -1));
                wl9 wl9Var = obj;
                vl9 vl9Var = obj2;
                d19 d19Var2 = d19Var;
                vt4 vt4Var5 = vt4Var3;
                vt4 vt4Var6 = vt4Var4;
                ri8 ri8Var2 = ri8Var;
                si8 si8Var2 = si8Var;
                if (i == 0) {
                    if (h <= 1.05f && !cj8.a(vt4Var5, vt4Var6, d19Var2, h)) {
                        z2 = false;
                    } else {
                        float h2 = dm8Var3.h();
                        long j = y78Var2.a;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + h2;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + dm8Var2.h();
                        yk8 b = cj8.b(vt4Var5, vt4Var6, ri8Var2, si8Var2, d19Var2, intBitsToFloat, intBitsToFloat2, h);
                        float floatValue2 = ((Number) b.a).floatValue();
                        float floatValue3 = ((Number) b.b).floatValue();
                        if (z) {
                            f = intBitsToFloat2 - floatValue3;
                        } else {
                            f = intBitsToFloat - floatValue2;
                        }
                        if (f == nae.e) {
                            f2 = 0.0f;
                        } else {
                            f2 = wl9Var.a + f;
                        }
                        wl9Var.a = f2;
                        qi8Var2.c(floatValue2);
                        qi8Var2.d(floatValue3);
                        vl9Var.a = true;
                        yl9 yl9Var = obj4;
                        long j2 = y78.j(yl9Var.a, j);
                        yl9Var.a = j2;
                        c5dVar.a(longValue, j2);
                        z2 = true;
                    }
                } else {
                    float m = dce.m(h * floatValue, ((Number) vt4Var.invoke()).floatValue(), ((Number) vt4Var2.invoke()).floatValue());
                    float f3 = m / h;
                    float f4 = 1.0f - f3;
                    yk8 b2 = cj8.b(vt4Var5, vt4Var6, ri8Var2, si8Var2, d19Var2, Float.intBitsToFloat((int) (y78Var2.a >> 32)) + ((Float.intBitsToFloat((int) (y78Var.a >> 32)) - (cj8.d(d19Var2) / 2.0f)) * f4) + (dm8Var3.h() * f3), Float.intBitsToFloat((int) (y78Var2.a & 4294967295L)) + ((Float.intBitsToFloat((int) (y78Var.a & 4294967295L)) - (cj8.c(d19Var2) / 2.0f)) * f4) + (dm8Var2.h() * f3), m);
                    float floatValue4 = ((Number) b2.a).floatValue();
                    float floatValue5 = ((Number) b2.b).floatValue();
                    qi8Var2.e(m);
                    qi8Var2.c(floatValue4);
                    qi8Var2.d(floatValue5);
                    wl9Var.a = nae.e;
                    vl9Var.a = false;
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        };
        final sk8 sk8Var = this.F;
        le1 le1Var = new le1((Object) obj, (Object) obj2, c5dVar, (Object) obj4, (Object) obj3, sk8Var, 3);
        final xt4 xt4Var = this.G;
        final m82 m82Var = this.H;
        return fce.v(d19Var, nu4Var, le1Var, new vt4() { // from class: bj8
            @Override // defpackage.vt4
            public final Object invoke() {
                float d;
                int i;
                qi8 qi8Var2 = qi8.this;
                float h = qi8Var2.b.h();
                float h2 = qi8Var2.c.h();
                dm8 dm8Var = qi8Var2.a;
                float h3 = dm8Var.h();
                vt4 vt4Var5 = vt4Var3;
                vt4 vt4Var6 = vt4Var4;
                ri8 ri8Var2 = ri8Var;
                si8 si8Var2 = si8Var;
                d19 d19Var2 = d19Var;
                yk8 b = cj8.b(vt4Var5, vt4Var6, ri8Var2, si8Var2, d19Var2, h, h2, h3);
                float floatValue = ((Number) b.a).floatValue();
                float floatValue2 = ((Number) b.b).floatValue();
                qi8Var2.c(floatValue);
                qi8Var2.d(floatValue2);
                float h4 = dm8Var.h();
                int i2 = (h4 > 1.05f ? 1 : (h4 == 1.05f ? 0 : -1));
                if (i2 > 0) {
                    wl9 wl9Var = obj;
                    float abs = Math.abs(wl9Var.a);
                    if (z) {
                        d = cj8.c(d19Var2);
                    } else {
                        d = cj8.d(d19Var2);
                    }
                    if (abs > d * 0.1f) {
                        if (wl9Var.a < nae.e) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        xt4Var.invoke(Integer.valueOf(i));
                        return pvc.a;
                    }
                }
                int i3 = (1.001f > h4 ? 1 : (1.001f == h4 ? 0 : -1));
                sk8 sk8Var2 = sk8Var;
                m82 m82Var2 = m82Var;
                if (i3 <= 0 && h4 <= 1.05f && !cj8.a(vt4Var5, vt4Var6, d19Var2, 1.0f)) {
                    float floatValue3 = ((Number) vt4Var5.invoke()).floatValue();
                    float floatValue4 = ((Number) vt4Var6.invoke()).floatValue();
                    float d2 = cj8.d(d19Var2);
                    float c = cj8.c(d19Var2);
                    sk8Var2.getClass();
                    m82Var2.getClass();
                    iya iyaVar = (iya) sk8Var2.h;
                    if (iyaVar != null) {
                        iyaVar.cancel(null);
                    }
                    sk8Var2.h = null;
                    sk8Var2.h = z87.v(m82Var2, null, null, new fz7(qi8Var2, sk8Var2, aye.a(floatValue3, d2, ri8Var2), aye.b(floatValue4, c, si8Var2), (m42) null), 3);
                } else if (obj2.a && (i2 > 0 || cj8.a(vt4Var5, vt4Var6, d19Var2, h4))) {
                    long b2 = c5dVar.b();
                    float floatValue5 = ((Number) vt4Var5.invoke()).floatValue();
                    float floatValue6 = ((Number) vt4Var6.invoke()).floatValue();
                    float d3 = cj8.d(d19Var2);
                    float c2 = cj8.c(d19Var2);
                    sk8Var2.getClass();
                    m82Var2.getClass();
                    iya iyaVar2 = (iya) sk8Var2.h;
                    if (iyaVar2 != null) {
                        iyaVar2.cancel(null);
                    }
                    sk8Var2.h = null;
                    float h5 = dm8Var.h();
                    yk8 m = aye.m(floatValue5, h5, d3, ri8Var2);
                    float floatValue7 = ((Number) m.a).floatValue();
                    float floatValue8 = ((Number) m.b).floatValue();
                    yk8 t = aye.t(floatValue6, h5, c2, si8Var2);
                    iya v = z87.v(m82Var2, null, null, new qk8(qi8Var2, floatValue7, floatValue8, ((Number) t.a).floatValue(), ((Number) t.b).floatValue(), b2, sk8Var2, null), 3);
                    sk8Var2.h = v;
                    obj3.a = v;
                }
                return pvc.a;
            }
        }, this.a, new rg1(sk8Var, qi8Var, vt4Var3, vt4Var4, si8Var, ri8Var, m82Var, d19Var, 4), m42Var);
    }
}
