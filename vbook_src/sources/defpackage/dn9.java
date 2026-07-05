package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dn9  reason: default package */
/* loaded from: classes.dex */
public final class dn9 extends c1 implements g82 {
    public final /* synthetic */ sx1 b;
    public final /* synthetic */ en9 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dn9(defpackage.sx1 r2, defpackage.en9 r3) {
        /*
            r1 = this;
            p40 r0 = defpackage.p40.d
            r1.b = r2
            r1.c = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn9.<init>(sx1, en9):void");
    }

    @Override // defpackage.g82
    public final void S(d82 d82Var, Throwable th) {
        sx1 sx1Var = this.b;
        en9 en9Var = this.c;
        zxe.x(th, new t7(23, sx1Var, en9Var));
        g82 g82Var = (g82) en9Var.a.get(p40.d);
        if (g82Var != null) {
            g82Var.S(d82Var, th);
            return;
        }
        throw th;
    }
}
