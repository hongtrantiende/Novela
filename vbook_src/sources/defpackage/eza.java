package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eza  reason: default package */
/* loaded from: classes3.dex */
public final class eza extends r3 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.r3
    public final boolean a(q3 q3Var) {
        cza czaVar = (cza) q3Var;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(dza.a);
        return true;
    }

    @Override // defpackage.r3
    public final m42[] b(q3 q3Var) {
        cza czaVar = (cza) q3Var;
        this.a.set(null);
        return eg0.b;
    }
}
