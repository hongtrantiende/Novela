package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bdd  reason: default package */
/* loaded from: classes.dex */
public final class bdd extends View {
    public static final y53 I = new y53(2);
    public r13 C;
    public tc6 D;
    public xt4 E;
    public p15 F;
    public float G;
    public float H;
    public final yj3 a;
    public final o61 b;
    public final n61 c;
    public boolean d;
    public Outline e;
    public boolean f;

    public bdd(yj3 yj3Var, o61 o61Var, n61 n61Var) {
        super(yj3Var.getContext());
        this.a = yj3Var;
        this.b = o61Var;
        this.c = n61Var;
        setOutlineProvider(I);
        this.f = true;
        this.C = kte.c;
        this.D = tc6.a;
        r15.a.getClass();
        this.E = vt3.E;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        sf sfVar;
        r13 B;
        tc6 D;
        k61 w;
        long G;
        p15 p15Var;
        int i = (this.G > nae.e ? 1 : (this.G == nae.e ? 0 : -1));
        n61 n61Var = this.c;
        o61 o61Var = this.b;
        if (i <= 0 && this.H <= nae.e) {
            sfVar = o61Var.a;
            Canvas canvas2 = sfVar.a;
            sfVar.a = canvas;
            r13 r13Var = this.C;
            tc6 tc6Var = this.D;
            long floatToRawIntBits = (4294967295L & Float.floatToRawIntBits(getHeight())) | (Float.floatToRawIntBits(getWidth()) << 32);
            p15 p15Var2 = this.F;
            xt4 xt4Var = this.E;
            B = n61Var.Q0().B();
            D = n61Var.Q0().D();
            w = n61Var.Q0().w();
            G = n61Var.Q0().G();
            p15Var = (p15) n61Var.Q0().c;
            ij1 Q0 = n61Var.Q0();
            Q0.W(r13Var);
            Q0.X(tc6Var);
            Q0.V(sfVar);
            Q0.Y(floatToRawIntBits);
            Q0.c = p15Var2;
            sfVar.i();
            try {
                xt4Var.invoke(n61Var);
                sfVar.q();
                ij1 Q02 = n61Var.Q0();
                Q02.W(B);
                Q02.X(D);
                Q02.V(w);
                Q02.Y(G);
                Q02.c = p15Var;
                o61Var.a.a = canvas2;
            } finally {
            }
        } else {
            int save = canvas.save();
            canvas.translate(this.G, this.H);
            sfVar = o61Var.a;
            Canvas canvas3 = sfVar.a;
            sfVar.a = canvas;
            r13 r13Var2 = this.C;
            tc6 tc6Var2 = this.D;
            long floatToRawIntBits2 = (4294967295L & Float.floatToRawIntBits(getHeight())) | (Float.floatToRawIntBits(getWidth()) << 32);
            p15 p15Var3 = this.F;
            xt4 xt4Var2 = this.E;
            B = n61Var.Q0().B();
            D = n61Var.Q0().D();
            w = n61Var.Q0().w();
            G = n61Var.Q0().G();
            p15Var = (p15) n61Var.Q0().c;
            ij1 Q03 = n61Var.Q0();
            Q03.W(r13Var2);
            Q03.X(tc6Var2);
            Q03.V(sfVar);
            Q03.Y(floatToRawIntBits2);
            Q03.c = p15Var3;
            sfVar.i();
            try {
                xt4Var2.invoke(n61Var);
                sfVar.q();
                ij1 Q04 = n61Var.Q0();
                Q04.W(B);
                Q04.X(D);
                Q04.V(w);
                Q04.Y(G);
                Q04.c = p15Var;
                o61Var.a.a = canvas3;
                canvas.restoreToCount(save);
            } finally {
            }
        }
        this.d = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f;
    }

    public final o61 getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (!this.d) {
            this.d = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
