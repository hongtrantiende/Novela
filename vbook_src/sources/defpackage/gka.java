package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gka  reason: default package */
/* loaded from: classes.dex */
public final class gka implements xb8, lq7 {
    public final zja a;
    public final fka b;

    public gka(zja zjaVar, fka fkaVar) {
        zjaVar.getClass();
        fkaVar.getClass();
        this.a = zjaVar;
        this.b = fkaVar;
    }

    @Override // defpackage.xb8
    public final void t(i38 i38Var) {
        rk9 rk9Var;
        try {
            long m = i38Var.m(0L);
            int i = (int) (m >> 32);
            int i2 = (int) (m & 4294967295L);
            rk9Var = new rk9(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + ((int) (i38Var.c >> 32)), Float.intBitsToFloat(i2) + ((int) (4294967295L & i38Var.c)));
        } catch (IllegalStateException unused) {
            rk9Var = rk9.e;
        }
        zja zjaVar = this.a;
        zjaVar.getClass();
        if (!rk9Var.equals(zjaVar.h)) {
            zjaVar.h = rk9Var;
            zjaVar.a();
        }
    }
}
