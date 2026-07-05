package com.google.android.play.core.integrity;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class s {
    private final s a = this;
    private final otd b;
    private final otd c;
    private final otd d;
    private final otd e;
    private final otd f;

    public s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        if (context != null) {
            l78 l78Var = new l78(context);
            this.b = l78Var;
            adVar = ac.a;
            mtd b = mtd.b(adVar);
            this.c = b;
            mVar = l.a;
            au auVar = new au(l78Var, mVar);
            this.d = auVar;
            mVar2 = l.a;
            mtd b2 = mtd.b(new al(l78Var, b, auVar, mVar2));
            this.e = b2;
            this.f = mtd.b(new ab(b2));
            return;
        }
        xk5.k("instance cannot be null");
        throw null;
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }
}
