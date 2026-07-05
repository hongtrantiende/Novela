package defpackage;

import android.view.WindowInsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jjd  reason: default package */
/* loaded from: classes.dex */
public class jjd extends ijd {
    public cx5 s;

    public jjd(tjd tjdVar, jjd jjdVar) {
        super(tjdVar, jjdVar);
        this.s = null;
        this.s = jjdVar.s;
    }

    @Override // defpackage.qjd
    public tjd b() {
        return tjd.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.qjd
    public tjd c() {
        return tjd.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.qjd
    public final cx5 l() {
        if (this.s == null) {
            WindowInsets windowInsets = this.c;
            this.s = cx5.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.s;
    }

    @Override // defpackage.qjd
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // defpackage.qjd
    public void z(cx5 cx5Var) {
        this.s = cx5Var;
    }

    public jjd(tjd tjdVar, WindowInsets windowInsets) {
        super(tjdVar, windowInsets);
        this.s = null;
    }
}
