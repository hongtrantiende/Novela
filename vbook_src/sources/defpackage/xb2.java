package defpackage;

import android.util.Log;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xb2  reason: default package */
/* loaded from: classes.dex */
public final class xb2 extends fb6 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(Exception exc, Executor executor, rb2 rb2Var) {
        super(0);
        this.a = 2;
        this.d = exc;
        this.b = executor;
        this.c = rb2Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Executor) obj3).execute(new b9(21, (rb2) obj2, obj));
                return pvcVar;
            case 1:
                ((Executor) obj3).execute(new b9(26, (rb2) obj2, (zl9) obj));
                return pvcVar;
            case 2:
                StringBuilder sb = new StringBuilder("During clear credential sign out failed with ");
                Exception exc = (Exception) obj;
                sb.append(exc);
                Log.w("PlayServicesImpl", sb.toString());
                ((Executor) obj3).execute(new b9(27, (rb2) obj2, exc));
                return pvcVar;
            case 3:
                lu4 lu4Var = (lu4) obj3;
                ry6 ry6Var = (ry6) ((zl9) obj2).a;
                u95 u95Var = (u95) obj;
                tv7 tv7Var = ry6Var.I;
                if (tv7Var == null) {
                    long[] jArr = tz9.a;
                    tv7Var = new tv7();
                    ry6Var.I = tv7Var;
                }
                Object g = tv7Var.g(u95Var);
                if (g == null) {
                    g = new oy6(ry6Var);
                    tv7Var.n(u95Var, g);
                }
                oy6 oy6Var = (oy6) g;
                oy6Var.a = false;
                lu4Var.invoke(oy6Var, u95Var);
                return pvcVar;
            default:
                z0 z0Var = (z0) obj3;
                z0Var.removeOnAttachStateChangeListener((hj) obj2);
                c16.o(z0Var).a.remove((scd) obj);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
