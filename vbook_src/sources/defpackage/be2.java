package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be2  reason: default package */
/* loaded from: classes.dex */
public final class be2 {
    public final rg a;
    public final zg4 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public jub j;
    public fvb k;
    public j88 l;
    public rk9 n;
    public rk9 o;
    public final Object c = new Object();
    public xt4 m = kg.Z;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = l27.a();
    public final Matrix r = new Matrix();

    public be2(rg rgVar, zg4 zg4Var) {
        this.a = rgVar;
        this.b = zg4Var;
    }

    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        int i7;
        zg4 zg4Var = this.b;
        ye6 ye6Var = (ye6) zg4Var.c;
        View view = (View) zg4Var.b;
        if (!((InputMethodManager) ye6Var.getValue()).isActive(view)) {
            return;
        }
        xt4 xt4Var = this.m;
        float[] fArr = this.q;
        xt4Var.invoke(new l27(fArr));
        this.a.s(fArr);
        Matrix matrix = this.r;
        fre.r(matrix, fArr);
        jub jubVar = this.j;
        jubVar.getClass();
        long j = jubVar.b;
        j88 j88Var = this.l;
        j88Var.getClass();
        fvb fvbVar = this.k;
        fvbVar.getClass();
        rk9 rk9Var = this.n;
        rk9Var.getClass();
        rk9 rk9Var2 = this.o;
        rk9Var2.getClass();
        boolean z5 = this.f;
        boolean z6 = this.g;
        boolean z7 = this.h;
        boolean z8 = this.i;
        CursorAnchorInfo.Builder builder = this.p;
        builder.reset();
        builder.setMatrix(matrix);
        fxb fxbVar = jubVar.c;
        int g = fxb.g(j);
        builder.setSelectionRange(g, fxb.f(j));
        oq9 oq9Var = oq9.b;
        if (z5 && g >= 0) {
            int w = j88Var.w(g);
            rk9 c = fvbVar.c(w);
            z = z6;
            z2 = z7;
            float m = dce.m(c.a, nae.e, (int) (fvbVar.c >> 32));
            boolean m2 = y9e.m(rk9Var, m, c.b);
            boolean m3 = y9e.m(rk9Var, m, c.d);
            if (fvbVar.a(w) == oq9Var) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!m2 && !m3) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            if (!m2 || !m3) {
                i7 |= 2;
            }
            if (z4) {
                i7 |= 4;
            }
            float f = c.b;
            float f2 = c.d;
            builder.setInsertionMarkerLocation(m, f, f2, f2, i7);
        } else {
            z = z6;
            z2 = z7;
        }
        if (z) {
            int i8 = -1;
            if (fxbVar != null) {
                i2 = fxb.g(fxbVar.a);
            } else {
                i2 = -1;
            }
            if (fxbVar != null) {
                i8 = fxb.f(fxbVar.a);
            }
            if (i2 >= 0 && i2 < i8) {
                builder.setComposingText(i2, jubVar.a.b.subSequence(i2, i8));
                int w2 = j88Var.w(i2);
                int w3 = j88Var.w(i8);
                float[] fArr2 = new float[(w3 - w2) * 4];
                z3 = z8;
                fvbVar.b.a(sze.a(w2, w3), fArr2);
                while (i2 < i8) {
                    int w4 = j88Var.w(i2);
                    int i9 = (w4 - w2) * 4;
                    float f3 = fArr2[i9];
                    float f4 = fArr2[i9 + 1];
                    int i10 = i8;
                    float f5 = fArr2[i9 + 2];
                    float f6 = fArr2[i9 + 3];
                    int i11 = w2;
                    if (rk9Var.a < f5) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (f3 < rk9Var.c) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i12 = i3 & i4;
                    if (rk9Var.b < f6) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i13 = i12 & i5;
                    if (f4 < rk9Var.d) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    int i14 = i13 & i6;
                    if (!y9e.m(rk9Var, f3, f4) || !y9e.m(rk9Var, f5, f6)) {
                        i14 |= 2;
                    }
                    if (fvbVar.a(w4) == oq9Var) {
                        i14 |= 4;
                    }
                    int i15 = i2;
                    builder.addCharacterBounds(i15, f3, f4, f5, f6, i14);
                    i2 = i15 + 1;
                    i8 = i10;
                    w2 = i11;
                }
                i = Build.VERSION.SDK_INT;
                if (i >= 33 && z2) {
                    r4.w(builder, rk9Var2);
                }
                if (i >= 34 && z3) {
                    k4.a(builder, fvbVar, rk9Var);
                }
                ((InputMethodManager) ye6Var.getValue()).updateCursorAnchorInfo(view, builder.build());
                this.e = false;
            }
        }
        z3 = z8;
        i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            r4.w(builder, rk9Var2);
        }
        if (i >= 34) {
            k4.a(builder, fvbVar, rk9Var);
        }
        ((InputMethodManager) ye6Var.getValue()).updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
