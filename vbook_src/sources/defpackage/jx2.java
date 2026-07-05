package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jx2  reason: default package */
/* loaded from: classes.dex */
public final class jx2 extends jwa {
    public final hx2 b;
    public AnimatorSet c;

    public jx2(hx2 hx2Var) {
        this.b = hx2Var;
    }

    @Override // defpackage.jwa
    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        AnimatorSet animatorSet = this.c;
        animatorSet.getClass();
        animatorSet.start();
        if (hs4.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // defpackage.jwa
    public final void b(ze0 ze0Var, ViewGroup viewGroup) {
        viewGroup.getClass();
        this.c.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        throw null;
    }

    @Override // defpackage.jwa
    public final void c(ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        viewGroup.getClass();
        hx2 hx2Var = this.b;
        if (hx2Var.y()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        kw5 J = hx2Var.J(context);
        if (J != null) {
            animatorSet = (AnimatorSet) J.c;
        } else {
            animatorSet = null;
        }
        this.c = animatorSet;
        throw null;
    }
}
