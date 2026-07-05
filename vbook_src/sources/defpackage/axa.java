package defpackage;

import android.view.ViewConfiguration;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: axa  reason: default package */
/* loaded from: classes.dex */
public abstract class axa {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final pq2 a(rv4 rv4Var) {
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        boolean c = rv4Var.c(r13Var.f());
        Object P = rv4Var.P();
        if (c || P == ax1.a) {
            P = new pq2(new g99(r13Var));
            rv4Var.o0(P);
        }
        return (pq2) P;
    }
}
