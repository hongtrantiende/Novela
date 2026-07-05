package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uz8  reason: default package */
/* loaded from: classes.dex */
public final class uz8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public uz8(zid zidVar, View view) {
        this.a = 3;
        this.b = zidVar;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                vz8 vz8Var = (vz8) obj;
                vz8Var.i(1);
                if (vz8Var.C) {
                    ((qz8) obj2).post(vz8Var.t);
                    vz8Var.C = false;
                    return;
                }
                return;
            case 1:
                vz8 vz8Var2 = (vz8) obj;
                vz8Var2.i(2);
                if (vz8Var2.C) {
                    ((qz8) obj2).post(vz8Var2.t);
                    vz8Var2.C = false;
                    return;
                }
                return;
            case 2:
                vz8 vz8Var3 = (vz8) obj;
                vz8Var3.i(2);
                if (vz8Var3.C) {
                    ((qz8) obj2).post(vz8Var3.t);
                    vz8Var3.C = false;
                    return;
                }
                return;
            default:
                zid zidVar = (zid) obj2;
                zidVar.a.d(1.0f);
                uid.e(zidVar, (View) obj);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((vz8) obj).i(3);
                return;
            case 1:
                ((vz8) obj).i(3);
                return;
            case 2:
                ((vz8) obj).i(3);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ uz8(vz8 vz8Var, qz8 qz8Var, int i) {
        this.a = i;
        this.c = vz8Var;
        this.b = qz8Var;
    }
}
