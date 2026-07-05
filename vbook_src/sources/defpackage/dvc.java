package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dvc  reason: default package */
/* loaded from: classes3.dex */
public final class dvc extends f82 {
    public static final dvc c = new f82();

    @Override // defpackage.f82
    public final void C(d82 d82Var, Runnable runnable) {
        spd spdVar = (spd) d82Var.get(spd.c);
        if (spdVar != null) {
            spdVar.b = true;
        } else {
            xk5.q("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.f82
    public final f82 j0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.f82
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
