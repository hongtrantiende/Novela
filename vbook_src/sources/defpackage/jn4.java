package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jn4  reason: default package */
/* loaded from: classes.dex */
public final class jn4 extends mq7 implements xm4 {
    @Override // defpackage.xm4
    public final void e0(tm4 tm4Var) {
        boolean z;
        View i = w9e.i(this);
        if (this.a.J && w9e.i(this).hasFocusable()) {
            z = true;
        } else {
            z = false;
        }
        tm4Var.d(z);
        View findFocus = i.findFocus();
        if (findFocus != null) {
            tm4Var.e(lm4.a(findFocus, i));
        }
    }
}
