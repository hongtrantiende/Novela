package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe4  reason: default package */
/* loaded from: classes.dex */
public final class xe4 extends be4 implements aod {
    @Override // defpackage.aod
    public final Object a(m42 m42Var, Object obj) {
        if (!((AtomicBoolean) this.d).get()) {
            Object b = nc2.b((File) this.b, new dh2(this, obj, null), (n42) m42Var);
            if (b == n82.a) {
                return b;
            }
            return pvc.a;
        }
        vs.k("This scope has already been closed.");
        return null;
    }
}
