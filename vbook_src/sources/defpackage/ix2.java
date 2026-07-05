package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ix2  reason: default package */
/* loaded from: classes.dex */
public final class ix2 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jx2 c;

    public ix2(ViewGroup viewGroup, boolean z, kwa kwaVar, jx2 jx2Var) {
        this.a = viewGroup;
        this.b = z;
        this.c = jx2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        this.a.endViewTransition(null);
        if (!this.b) {
            throw null;
        }
        throw null;
    }
}
