package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kr  reason: default package */
/* loaded from: classes.dex */
public final class kr extends aab implements lu4 {
    public final /* synthetic */ Drawable a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ vt4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(Drawable drawable, vt4 vt4Var, vt4 vt4Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = drawable;
        this.b = vt4Var;
        this.c = vt4Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new kr(this.a, this.b, this.c, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        pvc pvcVar = pvc.a;
        ((kr) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        ((AnimatedImageDrawable) this.a).registerAnimationCallback(new e2d(this.b, this.c));
        return pvc.a;
    }
}
