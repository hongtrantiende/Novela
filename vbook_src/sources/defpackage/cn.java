package defpackage;

import android.view.ActionMode;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cn  reason: default package */
/* loaded from: classes3.dex */
public final class cn implements xob {
    public final View a;
    public final xt4 b;
    public final vt4 c;
    public final ow7 d = new ow7();
    public final sra e = new sra(new wm(this, 0));
    public final wm f = new wm(this, 1);
    public final wm g = new wm(this, 2);
    public ActionMode h;
    public bn i;
    public Runnable j;

    public cn(View view, xt4 xt4Var, vt4 vt4Var) {
        this.a = view;
        this.b = xt4Var;
        this.c = vt4Var;
    }

    @Override // defpackage.xob
    public final Object a(oob oobVar, aab aabVar) {
        ge geVar = new ge(this, oobVar, null, 2);
        ow7 ow7Var = this.d;
        ow7Var.getClass();
        Object p = k27.p(new xr0(jw7.a, ow7Var, geVar, (m42) null, 13), aabVar);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }
}
