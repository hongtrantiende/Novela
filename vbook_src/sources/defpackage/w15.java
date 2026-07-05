package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w15  reason: default package */
/* loaded from: classes.dex */
public final class w15 implements r15 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public c3e G;
    public int H;
    public final o61 b;
    public final n61 c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public em1 k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public w15() {
        o61 o61Var = new o61();
        n61 n61Var = new n61();
        this.b = o61Var;
        this.c = n61Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = zl1.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.H = 0;
    }

    @Override // defpackage.r15
    public final void A(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.r15
    public final float B() {
        return this.n;
    }

    @Override // defpackage.r15
    public final void C(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.r15
    public final int D() {
        return this.j;
    }

    @Override // defpackage.r15
    public final c3e E() {
        return this.G;
    }

    @Override // defpackage.r15
    public final void F(Outline outline, long j) {
        boolean z;
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
        this.d.discardDisplayList();
    }

    @Override // defpackage.r15
    public final void H(int i, long j, int i2) {
        this.E = i;
        this.F = i2;
        boolean a = dna.a(this.e, eg0.A(j));
        this.e = eg0.A(j);
        j();
        if (!a && y78.d(this.l, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
        }
    }

    @Override // defpackage.r15
    public final void I(k61 k61Var) {
        tf.a(k61Var).drawRenderNode(this.d);
    }

    @Override // defpackage.r15
    public final int J() {
        return this.H;
    }

    @Override // defpackage.r15
    public final em1 K() {
        return this.k;
    }

    @Override // defpackage.r15
    public final float L() {
        return this.u;
    }

    @Override // defpackage.r15
    public final boolean M() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.r15
    public final float N() {
        return this.v;
    }

    @Override // defpackage.r15
    public final void O(long j) {
        this.l = j;
        g();
    }

    @Override // defpackage.r15
    public final long P() {
        return this.r;
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
        int i5 = this.y;
        if (i != i5 || i2 != this.z || i3 != this.A || i4 != this.B) {
            if (i != i5 || i2 != this.z) {
                z2 = true;
            }
            this.y = i;
            this.z = i2;
            this.A = i3;
            this.B = i4;
            j();
            if (z2) {
                g();
            }
        }
    }

    @Override // defpackage.r15
    public final float R() {
        return this.p;
    }

    @Override // defpackage.r15
    public final long S() {
        return this.s;
    }

    @Override // defpackage.r15
    public final float T() {
        return this.w;
    }

    @Override // defpackage.r15
    public final float U() {
        return this.o;
    }

    @Override // defpackage.r15
    public final float V() {
        return this.t;
    }

    @Override // defpackage.r15
    public final void W(r13 r13Var, tc6 tc6Var, p15 p15Var, jc jcVar) {
        n61 n61Var = this.c;
        RecordingCanvas beginRecording = this.d.beginRecording();
        long floatToRawIntBits = (Float.floatToRawIntBits(this.z) & 4294967295L) | (Float.floatToRawIntBits(this.y) << 32);
        try {
            o61 o61Var = this.b;
            sf sfVar = o61Var.a;
            Canvas canvas = sfVar.a;
            sfVar.a = beginRecording;
            ij1 ij1Var = n61Var.b;
            ij1Var.W(r13Var);
            ij1Var.X(tc6Var);
            ij1Var.c = p15Var;
            ij1Var.Y(this.e);
            ij1Var.V(sfVar);
            if (this.y <= nae.e && this.z <= nae.e) {
                jcVar.invoke(n61Var);
                o61Var.a.a = canvas;
                this.d.endRecording();
            }
            int i = (int) (floatToRawIntBits >> 32);
            int i2 = (int) (floatToRawIntBits & 4294967295L);
            sfVar.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            jcVar.invoke(n61Var);
            sfVar.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            o61Var.a.a = canvas;
            this.d.endRecording();
        } catch (Throwable th) {
            this.d.endRecording();
            throw th;
        }
    }

    @Override // defpackage.r15
    public final void X(int i) {
        this.H = i;
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
        return this.q;
    }

    public final void a() {
        boolean z;
        boolean z2 = this.x;
        boolean z3 = false;
        if (z2 && !this.h) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && this.h) {
            z3 = true;
        }
        if (z != this.C) {
            this.C = z;
            this.d.setClipToBounds(z);
        }
        if (z3 != this.D) {
            this.D = z3;
            this.d.setClipToOutline(z3);
        }
    }

    public final void b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
            return;
        }
        renderNode.setUseCompositingLayer(false, paint);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // defpackage.r15
    public final void c(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // defpackage.r15
    public final float d() {
        return this.m;
    }

    @Override // defpackage.r15
    public final void e(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    public final void f() {
        int i = this.H;
        if (i != 1 && this.j == 3 && this.k == null && this.G == null) {
            b(this.d, i);
        } else {
            b(this.d, 1);
        }
    }

    public final void g() {
        long j = this.l;
        int i = ((9223372034707292159L & j) > 9205357640488583168L ? 1 : ((9223372034707292159L & j) == 9205357640488583168L ? 0 : -1));
        RenderNode renderNode = this.d;
        if (i == 0) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
            return;
        }
        renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
        this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
    }

    @Override // defpackage.r15
    public final void h(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.r15
    public final void i(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    public final void j() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // defpackage.r15
    public final void k(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(ff.D(i));
        f();
    }

    @Override // defpackage.r15
    public final void l(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.r15
    public final void q(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.r15
    public final void r(c3e c3eVar) {
        this.G = c3eVar;
        if (Build.VERSION.SDK_INT >= 31) {
            ih.s(this.d, c3eVar);
        }
    }

    @Override // defpackage.r15
    public final void s(em1 em1Var) {
        ColorFilter colorFilter;
        this.k = em1Var;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
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
        this.r = j;
        this.d.setAmbientShadowColor(sve.x(j));
    }

    @Override // defpackage.r15
    public final void v(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.r15
    public final void w(boolean z) {
        this.x = z;
        a();
    }

    @Override // defpackage.r15
    public final void x(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.r15
    public final void y(long j) {
        this.s = j;
        this.d.setSpotShadowColor(sve.x(j));
    }

    @Override // defpackage.r15
    public final float z() {
        return this.i;
    }
}
