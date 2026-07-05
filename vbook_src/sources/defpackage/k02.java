package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k02  reason: default package */
/* loaded from: classes3.dex */
public final class k02 implements b9a {
    public final AtomicReference a;

    public k02(b9a b9aVar) {
        this.a = new AtomicReference(b9aVar);
    }

    @Override // defpackage.b9a
    public final Iterator iterator() {
        b9a b9aVar = (b9a) this.a.getAndSet(null);
        if (b9aVar != null) {
            return b9aVar.iterator();
        }
        vs.k("This sequence can be consumed only once.");
        return null;
    }
}
