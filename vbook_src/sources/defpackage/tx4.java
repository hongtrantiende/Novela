package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tx4  reason: default package */
/* loaded from: classes.dex */
public final class tx4 implements gza {
    public final TaskCompletionSource a;

    public tx4(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.gza
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.gza
    public final boolean b(ad0 ad0Var) {
        int i = ad0Var.b;
        if (i == 3 || i == 4 || i == 5) {
            this.a.trySetResult(ad0Var.a);
            return true;
        }
        return false;
    }
}
