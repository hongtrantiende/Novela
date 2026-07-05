package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mx4  reason: default package */
/* loaded from: classes.dex */
public final class mx4 implements gza {
    public final c2d a;
    public final TaskCompletionSource b;

    public mx4(c2d c2dVar, TaskCompletionSource taskCompletionSource) {
        this.a = c2dVar;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.gza
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.gza
    public final boolean b(ad0 ad0Var) {
        if (ad0Var.b == 4 && !this.a.a(ad0Var)) {
            String str = ad0Var.c;
            if (str != null) {
                this.b.setResult(new rc0(ad0Var.e, ad0Var.f, str));
                return true;
            }
            xk5.k("Null token");
        }
        return false;
    }
}
