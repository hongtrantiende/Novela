package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ljd  reason: default package */
/* loaded from: classes.dex */
public class ljd extends kjd {
    public cx5 t;
    public cx5 u;
    public cx5 v;

    public ljd(tjd tjdVar, WindowInsets windowInsets) {
        super(tjdVar, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.qjd
    public cx5 k() {
        if (this.u == null) {
            this.u = cx5.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.u;
    }

    @Override // defpackage.qjd
    public cx5 m() {
        if (this.t == null) {
            this.t = cx5.c(this.c.getSystemGestureInsets());
        }
        return this.t;
    }

    @Override // defpackage.qjd
    public cx5 o() {
        if (this.v == null) {
            this.v = cx5.c(this.c.getTappableElementInsets());
        }
        return this.v;
    }

    @Override // defpackage.ijd, defpackage.qjd
    public tjd r(int i, int i2, int i3, int i4) {
        return tjd.c(this.c.inset(i, i2, i3, i4), null);
    }

    public ljd(tjd tjdVar, ljd ljdVar) {
        super(tjdVar, ljdVar);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.jjd, defpackage.qjd
    public void z(cx5 cx5Var) {
    }
}
