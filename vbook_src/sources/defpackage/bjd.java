package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bjd  reason: default package */
/* loaded from: classes.dex */
public class bjd extends hjd {
    public final WindowInsets.Builder e;

    public bjd(tjd tjdVar) {
        super(tjdVar);
        WindowInsets.Builder h;
        WindowInsets b = tjdVar.b();
        if (b != null) {
            h = dm.i(b);
        } else {
            h = dm.h();
        }
        this.e = h;
    }

    @Override // defpackage.hjd
    public tjd b() {
        a();
        tjd c = tjd.c(this.e.build(), null);
        cx5[] cx5VarArr = this.b;
        qjd qjdVar = c.a;
        qjdVar.w(cx5VarArr);
        qjdVar.v(null);
        qjdVar.B(this.c);
        qjdVar.C(this.d);
        return c;
    }

    @Override // defpackage.hjd
    public void e(cx5 cx5Var) {
        this.e.setMandatorySystemGestureInsets(cx5Var.d());
    }

    @Override // defpackage.hjd
    public void f(cx5 cx5Var) {
        this.e.setStableInsets(cx5Var.d());
    }

    @Override // defpackage.hjd
    public void g(cx5 cx5Var) {
        this.e.setSystemGestureInsets(cx5Var.d());
    }

    @Override // defpackage.hjd
    public void h(cx5 cx5Var) {
        this.e.setSystemWindowInsets(cx5Var.d());
    }

    @Override // defpackage.hjd
    public void i(cx5 cx5Var) {
        this.e.setTappableElementInsets(cx5Var.d());
    }

    public bjd() {
        this.e = dm.h();
    }
}
