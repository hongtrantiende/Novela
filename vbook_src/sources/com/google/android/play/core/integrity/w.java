package com.google.android.play.core.integrity;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class w implements aw {
    private final w a = this;
    private final otd b;
    private final otd c;
    private final otd d;
    private final otd e;
    private final otd f;
    private final otd g;

    public w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        if (context != null) {
            l78 l78Var = new l78(context);
            this.b = l78Var;
            bcVar = bb.a;
            mtd b = mtd.b(bcVar);
            this.c = b;
            oVar = n.a;
            au auVar = new au(l78Var, oVar);
            this.d = auVar;
            oVar2 = n.a;
            mtd b2 = mtd.b(new bp(l78Var, b, auVar, oVar2));
            this.e = b2;
            mtd b3 = mtd.b(new bu(b2));
            this.f = b3;
            this.g = mtd.b(new ba(b2, b3));
            return;
        }
        xk5.k("instance cannot be null");
        throw null;
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }
}
