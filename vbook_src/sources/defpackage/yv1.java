package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv1  reason: default package */
/* loaded from: classes.dex */
public final class yv1 extends ClickableSpan {
    public final fp6 a;

    public yv1(fp6 fp6Var) {
        this.a = fp6Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        fp6 fp6Var = this.a;
        d89 a = fp6Var.a();
        if (a != null) {
            a.b(fp6Var);
        }
    }
}
