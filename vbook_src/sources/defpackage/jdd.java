package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jdd  reason: default package */
/* loaded from: classes.dex */
public abstract class jdd {
    public static final tw8 a = new tw8(4);

    public static final hk1 a(gdd gddVar) {
        hk1 hk1Var;
        n35 n35Var;
        gddVar.getClass();
        synchronized (a) {
            hk1Var = (hk1) gddVar.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (hk1Var == null) {
                gs3 gs3Var = gs3.a;
                try {
                    sw2 sw2Var = ab3.a;
                    n35Var = zz6.a.f;
                } catch (g48 | IllegalStateException unused) {
                }
                hk1 hk1Var2 = new hk1(n35Var.plus(rse.b()));
                gddVar.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", hk1Var2);
                hk1Var = hk1Var2;
            }
        }
        return hk1Var;
    }
}
