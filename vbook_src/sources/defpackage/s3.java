package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s3  reason: default package */
/* loaded from: classes.dex */
public final class s3 extends u3 {
    @Override // defpackage.u3
    public final Object q(Object obj, Object obj2) {
        c10 c10Var = (c10) obj;
        ListenableFuture apply = c10Var.apply(obj2);
        wq9.y(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", c10Var);
        return apply;
    }

    @Override // defpackage.u3
    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
