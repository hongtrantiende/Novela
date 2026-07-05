package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aw1  reason: default package */
/* loaded from: classes.dex */
public final class aw1 extends View.DragShadowBuilder {
    public final u13 a;
    public final long b;
    public final xt4 c;

    public aw1(u13 u13Var, long j, xt4 xt4Var) {
        this.a = u13Var;
        this.b = j;
        this.c = xt4Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        n61 n61Var = new n61();
        Canvas canvas2 = tf.a;
        sf sfVar = new sf();
        sfVar.a = canvas;
        m61 m61Var = n61Var.a;
        r13 r13Var = m61Var.a;
        tc6 tc6Var = m61Var.b;
        k61 k61Var = m61Var.c;
        long j = m61Var.d;
        m61Var.a = this.a;
        m61Var.b = tc6.a;
        m61Var.c = sfVar;
        m61Var.d = this.b;
        sfVar.i();
        this.c.invoke(n61Var);
        sfVar.q();
        m61Var.a = r13Var;
        m61Var.b = tc6Var;
        m61Var.c = k61Var;
        m61Var.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        u13 u13Var = this.a;
        point.set(u13Var.X0(intBitsToFloat / u13Var.f()), u13Var.X0(Float.intBitsToFloat((int) (j & 4294967295L)) / u13Var.f()));
        point2.set(point.x / 2, point.y / 2);
    }
}
