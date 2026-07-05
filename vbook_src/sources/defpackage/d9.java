package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d9  reason: default package */
/* loaded from: classes.dex */
public final class d9 extends dpe {
    @Override // defpackage.dpe
    public final void m(lo1 lo1Var, Set set) {
        synchronized (lo1Var) {
            try {
                if (lo1Var.D == null) {
                    lo1Var.D = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dpe
    public final int n(lo1 lo1Var) {
        int i;
        synchronized (lo1Var) {
            i = lo1Var.E - 1;
            lo1Var.E = i;
        }
        return i;
    }
}
