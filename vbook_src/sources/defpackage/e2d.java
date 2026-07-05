package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e2d  reason: default package */
/* loaded from: classes.dex */
public final class e2d extends Animatable2.AnimationCallback {
    public final /* synthetic */ vt4 a;
    public final /* synthetic */ vt4 b;

    public e2d(vt4 vt4Var, vt4 vt4Var2) {
        this.a = vt4Var;
        this.b = vt4Var2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        vt4 vt4Var = this.b;
        if (vt4Var != null) {
            vt4Var.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        vt4 vt4Var = this.a;
        if (vt4Var != null) {
            vt4Var.invoke();
        }
    }
}
