package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kge  reason: default package */
/* loaded from: classes.dex */
public final class kge extends PhantomReference {
    public final Set a;
    public final t51 b;

    public /* synthetic */ kge(pi1 pi1Var, ReferenceQueue referenceQueue, Set set, t51 t51Var) {
        super(pi1Var, referenceQueue);
        this.a = set;
        this.b = t51Var;
    }
}
