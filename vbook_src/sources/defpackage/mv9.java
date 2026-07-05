package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mv9  reason: default package */
/* loaded from: classes3.dex */
public final class mv9 extends c1 implements o42, c03 {
    public final abf b;
    public final /* synthetic */ xl9 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mv9(defpackage.xl9 r2) {
        /*
            r1 = this;
            abf r0 = defpackage.abf.d
            r1.c = r2
            r1.<init>(r0)
            r1.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv9.<init>(xl9):void");
    }

    @Override // defpackage.o42
    public final m42 G(n42 n42Var) {
        this.c.a++;
        return n42Var;
    }

    @Override // defpackage.o42
    public final void b1(m42 m42Var) {
        m42Var.getClass();
    }

    @Override // defpackage.c1, defpackage.d82
    public final b82 get(c82 c82Var) {
        return n4f.o(this, c82Var);
    }

    @Override // defpackage.c1, defpackage.b82
    public final c82 getKey() {
        return this.b;
    }

    @Override // defpackage.c1, defpackage.d82
    public final d82 minusKey(c82 c82Var) {
        return n4f.r(this, c82Var);
    }

    @Override // defpackage.c03
    public final kb3 o(long j, Runnable runnable, d82 d82Var) {
        return st2.a.o(j, runnable, d82Var);
    }

    @Override // defpackage.c03
    public final void q(long j, f61 f61Var) {
        f61Var.resumeWith(pvc.a);
    }
}
