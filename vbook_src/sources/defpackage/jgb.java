package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jgb  reason: default package */
/* loaded from: classes.dex */
public final class jgb extends uq7 {
    /* JADX WARN: Type inference failed for: r2v1, types: [mq7, hx5, kgb] */
    @Override // defpackage.uq7
    public final mq7 b() {
        x8d x8dVar = nc2.g;
        ?? hx5Var = new hx5(w92.d);
        hx5Var.N = x8dVar;
        return hx5Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        kgb kgbVar = (kgb) mq7Var;
        x8d x8dVar = nc2.g;
        if (kgbVar.N != x8dVar) {
            kgbVar.N = x8dVar;
            yjd yjdVar = kgbVar.O;
            if (yjdVar != null) {
                rp rpVar = yjdVar.g;
                if (!c16.i(rpVar, kgbVar.M)) {
                    kgbVar.M = rpVar;
                    kgbVar.I1();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof jgb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return nc2.g.hashCode();
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
