package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d16  reason: default package */
/* loaded from: classes3.dex */
public final class d16 extends es9 {
    public int a;
    public final /* synthetic */ xt4 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d16(defpackage.xt4 r2) {
        /*
            r1 = this;
            et1 r0 = defpackage.gae.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d16.<init>(xt4):void");
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.a = 2;
                hre.r(obj);
                return obj;
            }
            vs.k("This coroutine had already completed");
            return null;
        }
        this.a = 1;
        hre.r(obj);
        xt4 xt4Var = this.b;
        jsc.u(1, xt4Var);
        return xt4Var.invoke(this);
    }
}
