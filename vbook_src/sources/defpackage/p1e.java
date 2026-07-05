package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p1e  reason: default package */
/* loaded from: classes.dex */
public abstract class p1e {
    public final int a;
    public final l97 b = new l97(this);
    public qf4 c;
    public f0e d;
    public Object e;
    public aae f;
    public hvc g;
    public p4e h;
    public x3e i;
    public c70 j;
    public yb3 k;
    public r4e l;
    public boolean m;

    public p1e(int i) {
        new ArrayList();
        this.a = i;
    }

    public abstract String a();

    public final void b(qf4 qf4Var) {
        am8.t(qf4Var, "firebaseApp cannot be null");
        this.c = qf4Var;
    }

    public final void c(Status status) {
        this.m = true;
        this.g.F(null, status);
    }

    public abstract void d(TaskCompletionSource taskCompletionSource, r0e r0eVar);

    public abstract void e();

    public final void f(Object obj) {
        this.m = true;
        this.g.F(obj, null);
    }
}
