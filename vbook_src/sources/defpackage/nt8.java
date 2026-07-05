package defpackage;

import java.util.Set;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nt8  reason: default package */
/* loaded from: classes.dex */
public final class nt8 extends f0 {
    @Override // defpackage.f0
    public final umd b() {
        ymd ymdVar = (ymd) this.b;
        if (!ymdVar.q) {
            return new umd((UUID) this.a, ymdVar, (Set) this.c);
        }
        vs.m("PeriodicWorkRequests cannot be expedited");
        return null;
    }

    @Override // defpackage.f0
    public final f0 g() {
        return this;
    }
}
