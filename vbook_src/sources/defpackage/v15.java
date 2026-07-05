package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v15  reason: default package */
/* loaded from: classes.dex */
public final class v15 implements r15 {
    public static final AtomicBoolean K = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public c3e J;
    public final o61 b;
    public final n61 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public em1 l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public v15(rg rgVar, o61 o61Var, n61 n61Var) {
        this.b = o61Var;
        this.c = n61Var;
        RenderNode create = RenderNode.create("Compose", rgVar);
        this.d = create;
        this.e = 0L;
        this.i = 0L;
        if (K.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                xn9.c(create, xn9.a(create));
                xn9.d(create, xn9.b(create));
            }
            wn9.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        b(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = zl1.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // defpackage.r15
    public final void A(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.r15
    public final float B() {
        return this.q;
    }

    @Override // defpackage.r15
    public final void C(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.r15
    public final int D() {
        return this.k;
    }

    @Override // defpackage.r15
    public final c3e E() {
        return this.J;
    }

    @Override // defpackage.r15
    public final void F(Outline outline, long j) {
        boolean z;
        this.i = j;
        this.d.setOutline(outline);
        if (outline != null) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        a();
    }

    @Override // defpackage.r15
    public final void G() {
        wn9.a(this.d);
    }

    @Override // defpackage.r15
    public final void H(int i, long j, int i2) {
        this.H = i;
        this.I = i2;
        boolean b = zy5.b(this.e, j);
        this.e = j;
        j();
        if (!b) {
            if (this.n || y78.d(this.o, 9205357640488583168L)) {
                this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
                this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
            }
        }
    }

    @Override // defpackage.r15
    public final void I(k61 k61Var) {
        DisplayListCanvas a = tf.a(k61Var);
        a.getClass();
        a.drawRenderNode(this.d);
    }

    @Override // defpackage.r15
    public final int J() {
        return this.j;
    }

    @Override // defpackage.r15
    public final em1 K() {
        return this.l;
    }

    @Override // defpackage.r15
    public final float L() {
        return this.x;
    }

    @Override // defpackage.r15
    public final boolean M() {
        return this.d.isValid();
    }

    @Override // defpackage.r15
    public final float N() {
        return this.y;
    }

    @Override // defpackage.r15
    public final void O(long j) {
        this.o = j;
        g();
    }

    @Override // defpackage.r15
    public final long P() {
        return this.u;
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
        int i5 = this.B;
        if (i != i5 || i2 != this.C || i3 != this.D || i4 != this.E) {
            if (i != i5 || i2 != this.C) {
                z2 = true;
            }
            this.B = i;
            this.C = i2;
            this.D = i3;
            this.E = i4;
            j();
            if (z2) {
                g();
            }
        }
    }

    @Override // defpackage.r15
    public final float R() {
        return this.s;
    }

    @Override // defpackage.r15
    public final long S() {
        return this.v;
    }

    @Override // defpackage.r15
    public final float T() {
        return this.z;
    }

    @Override // defpackage.r15
    public final float U() {
        return this.r;
    }

    @Override // defpackage.r15
    public final float V() {
        return this.w;
    }

    @Override // defpackage.r15
    public final void W(r13 r13Var, tc6 tc6Var, p15 p15Var, jc jcVar) {
        Canvas canvas;
        Canvas canvas2;
        Canvas canvas3;
        long j;
        int i;
        int i2;
        r13 B;
        tc6 D;
        k61 w;
        long G;
        p15 p15Var2;
        n61 n61Var = this.c;
        ij1 ij1Var = n61Var.b;
        Canvas start = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        long floatToRawIntBits = (Float.floatToRawIntBits(this.C) & 4294967295L) | (Float.floatToRawIntBits(this.B) << 32);
        try {
            sf sfVar = this.b.a;
            Canvas canvas4 = sfVar.a;
            sfVar.a = start;
            try {
                try {
                    if (this.B <= nae.e) {
                        try {
                            if (this.C > nae.e) {
                                canvas2 = start;
                                j = 4294967295L;
                                canvas3 = canvas4;
                            } else {
                                long A = eg0.A(this.e);
                                r13 B2 = ij1Var.B();
                                tc6 D2 = ij1Var.D();
                                k61 w2 = ij1Var.w();
                                canvas3 = canvas4;
                                long G2 = ij1Var.G();
                                canvas2 = start;
                                p15 p15Var3 = (p15) ij1Var.c;
                                ij1Var.W(r13Var);
                                ij1Var.X(tc6Var);
                                ij1Var.V(sfVar);
                                ij1Var.Y(A);
                                ij1Var.c = p15Var;
                                sfVar.i();
                                jcVar.invoke(n61Var);
                                sfVar.q();
                                ij1Var.W(B2);
                                ij1Var.X(D2);
                                ij1Var.V(w2);
                                ij1Var.Y(G2);
                                ij1Var.c = p15Var3;
                                sfVar.a = canvas3;
                                this.d.end(canvas2);
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            canvas2 = start;
                            canvas = canvas2;
                            this.d.end(canvas);
                            throw th;
                        }
                    } else {
                        canvas2 = start;
                        canvas3 = canvas4;
                        j = 4294967295L;
                    }
                    jcVar.invoke(n61Var);
                    sfVar.q();
                    ij1Var.W(B);
                    ij1Var.X(D);
                    ij1Var.V(w);
                    ij1Var.Y(G);
                    ij1Var.c = p15Var2;
                    sfVar.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    sfVar.a = canvas3;
                    this.d.end(canvas2);
                    return;
                } catch (Throwable th2) {
                    canvas = canvas2;
                    try {
                        sfVar.q();
                        ij1Var.W(B);
                        ij1Var.X(D);
                        ij1Var.V(w);
                        ij1Var.Y(G);
                        ij1Var.c = p15Var2;
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        this.d.end(canvas);
                        throw th;
                    }
                }
                i = (int) (floatToRawIntBits >> 32);
                i2 = (int) (floatToRawIntBits & j);
                sfVar.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                long A2 = eg0.A(this.e);
                B = ij1Var.B();
                D = ij1Var.D();
                w = ij1Var.w();
                G = ij1Var.G();
                p15Var2 = (p15) ij1Var.c;
                ij1Var.W(r13Var);
                ij1Var.X(tc6Var);
                ij1Var.V(sfVar);
                ij1Var.Y(A2);
                ij1Var.c = p15Var;
                sfVar.i();
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            canvas = start;
        }
    }

    @Override // defpackage.r15
    public final void X(int i) {
        this.j = i;
        f();
    }

    @Override // defpackage.r15
    public final Matrix Y() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.r15
    public final float Z() {
        return this.t;
    }

    public final void a() {
        boolean z;
        boolean z2 = this.A;
        boolean z3 = false;
        if (z2 && !this.h) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && this.h) {
            z3 = true;
        }
        if (z != this.F) {
            this.F = z;
            this.d.setClipToBounds(z);
        }
        if (z3 != this.G) {
            this.G = z3;
            this.d.setClipToOutline(z3);
        }
    }

    public final void b(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.r15
    public final void c(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.r15
    public final float d() {
        return this.p;
    }

    @Override // defpackage.r15
    public final void e(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    public final void f() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            b(i);
        } else {
            b(1);
        }
    }

    public final void g() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
            return;
        }
        this.n = false;
        this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
        this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
    }

    @Override // defpackage.r15
    public final void h(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.r15
    public final void i(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    public final void j() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = this.I;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i - this.B, i2 - this.C, i + ((int) (j >> 32)) + this.D, i2 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // defpackage.r15
    public final void k(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(ff.F(i)));
        f();
    }

    @Override // defpackage.r15
    public final void l(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.r15
    public final void q(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.r15
    public final void r(c3e c3eVar) {
        this.J = c3eVar;
    }

    @Override // defpackage.r15
    public final void s(em1 em1Var) {
        this.l = em1Var;
        if (em1Var != null) {
            b(1);
            RenderNode renderNode = this.d;
            Paint paint = this.f;
            if (paint == null) {
                paint = new Paint();
                this.f = paint;
            }
            paint.setColorFilter(em1Var.a);
            renderNode.setLayerPaint(paint);
            return;
        }
        f();
    }

    @Override // defpackage.r15
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            xn9.c(this.d, sve.x(j));
        }
    }

    @Override // defpackage.r15
    public final void v(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.r15
    public final void w(boolean z) {
        this.A = z;
        a();
    }

    @Override // defpackage.r15
    public final void x(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.r15
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            xn9.d(this.d, sve.x(j));
        }
    }

    @Override // defpackage.r15
    public final float z() {
        return this.m;
    }
}
