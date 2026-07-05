package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ce2  reason: default package */
/* loaded from: classes.dex */
public final class ce2 {
    public final mkc a;
    public final hvb b;
    public final kw5 c;
    public final m82 d;
    public iya e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j = new CursorAnchorInfo.Builder();
    public final float[] k = l27.a();
    public final Matrix l = new Matrix();

    public ce2(mkc mkcVar, hvb hvbVar, kw5 kw5Var, m82 m82Var) {
        this.a = mkcVar;
        this.b = hvbVar;
        this.c = kw5Var;
        this.d = m82Var;
    }

    public final CursorAnchorInfo a() {
        sc6 sc6Var;
        sc6 b;
        fvb c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        hvb hvbVar = this.b;
        sc6 e = hvbVar.e();
        if (e != null) {
            if (!e.t()) {
                e = null;
            }
            if (e != null && (sc6Var = (sc6) hvbVar.e.getValue()) != null) {
                if (!sc6Var.t()) {
                    sc6Var = null;
                }
                if (sc6Var != null && (b = hvbVar.b()) != null) {
                    if (!b.t()) {
                        b = null;
                    }
                    if (b != null && (c = hvbVar.c()) != null) {
                        grb f = this.a.f();
                        float[] fArr = this.k;
                        l27.f(fArr);
                        e.z(fArr);
                        Matrix matrix = this.l;
                        fre.r(matrix, fArr);
                        rk9 o = yte.w(sc6Var).o(e.e0(sc6Var, 0L));
                        rk9 o2 = yte.w(b).o(e.e0(b, 0L));
                        long j = f.e;
                        fxb fxbVar = f.f;
                        boolean z2 = this.f;
                        boolean z3 = this.g;
                        boolean z4 = this.h;
                        boolean z5 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int g = fxb.g(j);
                        builder.setSelectionRange(g, fxb.f(j));
                        oq9 oq9Var = oq9.b;
                        if (z2 && g >= 0) {
                            rk9 c2 = c.c(g);
                            float m = dce.m(c2.a, nae.e, (int) (c.c >> 32));
                            boolean t = ase.t(o, m, c2.b);
                            boolean t2 = ase.t(o, m, c2.d);
                            if (c.a(g) == oq9Var) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!t && !t2) {
                                i6 = 0;
                            } else {
                                i6 = 1;
                            }
                            if (!t || !t2) {
                                i6 |= 2;
                            }
                            if (z) {
                                i6 |= 4;
                            }
                            int i7 = i6;
                            float f2 = c2.b;
                            float f3 = c2.d;
                            builder.setInsertionMarkerLocation(m, f2, f3, f3, i7);
                        }
                        if (z3) {
                            int i8 = -1;
                            if (fxbVar != null) {
                                i = fxb.g(fxbVar.a);
                            } else {
                                i = -1;
                            }
                            if (fxbVar != null) {
                                i8 = fxb.f(fxbVar.a);
                            }
                            if (i >= 0 && i < i8) {
                                builder.setComposingText(i, f.d.subSequence(i, i8));
                                float[] fArr2 = new float[(i8 - i) * 4];
                                c.b.a(sze.a(i, i8), fArr2);
                                int i9 = i;
                                while (i9 < i8) {
                                    int i10 = (i9 - i) * 4;
                                    float f4 = fArr2[i10];
                                    float f5 = fArr2[i10 + 1];
                                    float f6 = fArr2[i10 + 2];
                                    float f7 = fArr2[i10 + 3];
                                    if (o.a < f6) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    int i11 = i8;
                                    if (f4 < o.c) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    int i12 = i3 & i2;
                                    if (o.b < f7) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    int i13 = i12 & i4;
                                    if (f5 < o.d) {
                                        i5 = 1;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i14 = i13 & i5;
                                    if (!ase.t(o, f4, f5) || !ase.t(o, f6, f7)) {
                                        i14 |= 2;
                                    }
                                    if (c.a(i9) == oq9Var) {
                                        i14 |= 4;
                                    }
                                    builder.addCharacterBounds(i9, f4, f5, f6, f7, i14);
                                    i9++;
                                    i8 = i11;
                                }
                            }
                        }
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 >= 33 && z4) {
                            r4.x(builder, o2);
                        }
                        if (i15 >= 34 && z5) {
                            k4.b(builder, c, o);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
