package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y15  reason: default package */
/* loaded from: classes.dex */
public final class y15 implements r15 {
    public static final x15 I = new Canvas();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public c3e H;
    public final yj3 b;
    public final o61 c;
    public final bdd d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public em1 o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public y15(yj3 yj3Var) {
        o61 o61Var = new o61();
        n61 n61Var = new n61();
        this.b = yj3Var;
        this.c = o61Var;
        bdd bddVar = new bdd(yj3Var, o61Var, n61Var);
        this.d = bddVar;
        this.e = yj3Var.getResources();
        this.f = new Rect();
        yj3Var.addView(bddVar);
        bddVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = zl1.b;
        this.y = j;
        this.z = j;
    }

    @Override // defpackage.r15
    public final void A(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.r15
    public final float B() {
        return this.u;
    }

    @Override // defpackage.r15
    public final void C(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.r15
    public final int D() {
        return this.n;
    }

    @Override // defpackage.r15
    public final c3e E() {
        return this.H;
    }

    @Override // defpackage.r15
    public final void F(Outline outline, long j) {
        bdd bddVar = this.d;
        bddVar.e = outline;
        bddVar.invalidateOutline();
        boolean z = false;
        if ((this.m || bddVar.getClipToOutline()) && outline != null) {
            bddVar.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        if (outline != null) {
            z = true;
        }
        this.l = z;
    }

    @Override // defpackage.r15
    public final void G() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // defpackage.r15
    public final void H(int i, long j, int i2) {
        if (!zy5.b(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            b();
            return;
        }
        int i3 = this.h;
        bdd bddVar = this.d;
        if (i3 != i) {
            bddVar.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            bddVar.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.r15
    public final void I(k61 k61Var) {
        Rect rect;
        boolean z = this.k;
        bdd bddVar = this.d;
        if (z) {
            if ((this.m || bddVar.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = bddVar.getWidth();
                rect.bottom = bddVar.getHeight();
            } else {
                rect = null;
            }
            bddVar.setClipBounds(rect);
        }
        if (tf.a(k61Var).isHardwareAccelerated()) {
            this.b.a(k61Var, bddVar, bddVar.getDrawingTime());
        }
    }

    @Override // defpackage.r15
    public final int J() {
        return this.p;
    }

    @Override // defpackage.r15
    public final em1 K() {
        return this.o;
    }

    @Override // defpackage.r15
    public final float L() {
        return this.B;
    }

    @Override // defpackage.r15
    public final float N() {
        return this.C;
    }

    @Override // defpackage.r15
    public final void O(long j) {
        boolean z;
        this.s = j;
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        this.r = z;
        g();
    }

    @Override // defpackage.r15
    public final long P() {
        return this.y;
    }

    @Override // defpackage.r15
    public final void Q(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = false;
        if (i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder r = hl5.r(i, i2, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
            r.append(i3);
            r.append(", Bottom: ");
            r.append(i4);
            kv5.a(r.toString());
        }
        int i5 = this.D;
        if (i != i5 || i2 != this.E || i3 != this.F || i4 != this.G) {
            if (i != i5 || i2 != this.E) {
                z2 = true;
            }
            this.D = i;
            this.E = i2;
            this.F = i3;
            this.G = i4;
            b();
            if (z2) {
                g();
            }
        }
    }

    @Override // defpackage.r15
    public final float R() {
        return this.w;
    }

    @Override // defpackage.r15
    public final long S() {
        return this.z;
    }

    @Override // defpackage.r15
    public final float T() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.r15
    public final float U() {
        return this.v;
    }

    @Override // defpackage.r15
    public final float V() {
        return this.A;
    }

    @Override // defpackage.r15
    public final void W(r13 r13Var, tc6 tc6Var, p15 p15Var, jc jcVar) {
        bdd bddVar = this.d;
        ViewParent parent = bddVar.getParent();
        yj3 yj3Var = this.b;
        if (parent == null) {
            yj3Var.addView(bddVar);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(this.D) << 32) | (Float.floatToRawIntBits(this.E) & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        bddVar.C = r13Var;
        bddVar.D = tc6Var;
        bddVar.E = jcVar;
        bddVar.F = p15Var;
        bddVar.G = intBitsToFloat;
        bddVar.H = intBitsToFloat2;
        if (bddVar.isAttachedToWindow()) {
            bddVar.setVisibility(4);
            bddVar.setVisibility(0);
            try {
                o61 o61Var = this.c;
                x15 x15Var = I;
                sf sfVar = o61Var.a;
                Canvas canvas = sfVar.a;
                sfVar.a = x15Var;
                yj3Var.a(sfVar, bddVar, bddVar.getDrawingTime());
                o61Var.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.r15
    public final void X(int i) {
        this.p = i;
        f();
    }

    @Override // defpackage.r15
    public final Matrix Y() {
        return this.d.getMatrix();
    }

    @Override // defpackage.r15
    public final float Z() {
        return this.x;
    }

    public final void a(int i) {
        bdd bddVar = this.d;
        boolean z = true;
        if (i == 1) {
            bddVar.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                bddVar.setLayerType(0, paint);
                z = false;
            } else {
                bddVar.setLayerType(0, paint);
            }
        }
        bddVar.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void b() {
        boolean z = this.m;
        bdd bddVar = this.d;
        if (z || bddVar.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = this.i;
        long j = this.j;
        bddVar.layout(i - this.D, i2 - this.E, i + ((int) (j >> 32)) + this.F, i2 + ((int) (j & 4294967295L)) + this.G);
    }

    @Override // defpackage.r15
    public final void c(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.r15
    public final float d() {
        return this.t;
    }

    @Override // defpackage.r15
    public final void e(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    public final void f() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            a(i);
        } else {
            a(1);
        }
    }

    public final void g() {
        boolean z = this.r;
        bdd bddVar = this.d;
        if (!z && !y78.d(this.s, 9205357640488583168L)) {
            bddVar.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            bddVar.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
            return;
        }
        bddVar.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
        bddVar.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
    }

    @Override // defpackage.r15
    public final void h(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.r15
    public final void i(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.r15
    public final void k(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(ff.F(i)));
        f();
    }

    @Override // defpackage.r15
    public final void l(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.r15
    public final void q(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.r15
    public final void r(c3e c3eVar) {
        this.H = c3eVar;
        if (Build.VERSION.SDK_INT >= 31) {
            ih.t(this.d, c3eVar);
        }
    }

    @Override // defpackage.r15
    public final void s(em1 em1Var) {
        ColorFilter colorFilter;
        this.o = em1Var;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        if (em1Var != null) {
            colorFilter = em1Var.a;
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
        f();
    }

    @Override // defpackage.r15
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            ru.L(this.d, sve.x(j));
        }
    }

    @Override // defpackage.r15
    public final void v(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.r15
    public final void w(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z && !this.l) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.m = z2;
        this.k = true;
        if (z && this.l) {
            z3 = true;
        }
        this.d.setClipToOutline(z3);
    }

    @Override // defpackage.r15
    public final void x(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.r15
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            ru.M(this.d, sve.x(j));
        }
    }

    @Override // defpackage.r15
    public final float z() {
        return this.q;
    }
}
