package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aea  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aea implements tj4, uu4 {
    public final /* synthetic */ AtomicReference a;

    public aea(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.uu4
    public final hu4 a() {
        return new h7(2, 4, AtomicReference.class, this.a, "set", "set(Ljava/lang/Object;)V");
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        this.a.set((saa) obj);
        return pvc.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tj4) || !(obj instanceof uu4)) {
            return false;
        }
        return c16.i(a(), ((uu4) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
