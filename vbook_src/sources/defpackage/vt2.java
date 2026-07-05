package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vt2  reason: default package */
/* loaded from: classes.dex */
public final class vt2 extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public wl9 b;
    public int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ i2a e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt2(sqa sqaVar, float f, xt4 xt4Var, i2a i2aVar, m42 m42Var) {
        super(2, m42Var);
        this.f = sqaVar;
        this.d = f;
        this.C = xt4Var;
        this.e = i2aVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                i2a i2aVar = this.e;
                return new vt2(this.d, (wt2) obj2, i2aVar, m42Var);
            default:
                i2a i2aVar2 = this.e;
                return new vt2((sqa) this.f, this.d, (xt4) obj2, i2aVar2, m42Var);
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
                return ((vt2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((vt2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
        if (r1 == r7) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [pqa] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt2(float f, wt2 wt2Var, i2a i2aVar, m42 m42Var) {
        super(2, m42Var);
        this.d = f;
        this.C = wt2Var;
        this.e = i2aVar;
    }
}
