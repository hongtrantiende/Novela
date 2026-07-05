package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q08  reason: default package */
/* loaded from: classes3.dex */
public final class q08 extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q08(boolean z, int i, r13 r13Var, int i2, m82 m82Var, k2a k2aVar, m42 m42Var) {
        super(2, m42Var);
        this.c = z;
        this.b = i;
        this.e = r13Var;
        this.d = i2;
        this.f = m82Var;
        this.C = k2aVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new q08(this.c, this.b, (r13) this.e, this.d, (m82) this.f, (k2a) this.C, m42Var);
            default:
                return new q08(this.c, this.d, (aw7) this.e, (aw7) this.f, (aw7) this.C, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((q08) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((q08) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b1, code lost:
        if (defpackage.lq.c(r0, r2, r2, null, r4, r22, 4) == r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0111, code lost:
        if (defpackage.lq.c(r0, r2, r3, null, r4, r22, 4) == r11) goto L24;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q08.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q08(boolean z, int i, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, m42 m42Var) {
        super(2, m42Var);
        this.c = z;
        this.d = i;
        this.e = aw7Var;
        this.f = aw7Var2;
        this.C = aw7Var3;
    }
}
