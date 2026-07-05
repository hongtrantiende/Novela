package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rr8  reason: default package */
/* loaded from: classes3.dex */
public final class rr8 extends aab implements lu4 {
    public final /* synthetic */ zg8 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int a;
    public ch8 b;
    public float c;
    public float d;
    public int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr8(int i, zg8 zg8Var, int i2, int i3, m42 m42Var, int i4) {
        super(2, m42Var);
        this.a = i4;
        this.f = i;
        this.C = zg8Var;
        this.D = i2;
        this.E = i3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new rr8(this.f, this.C, this.D, this.E, m42Var, 0);
            default:
                return new rr8(this.f, this.C, this.D, this.E, m42Var, 1);
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
                return ((rr8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((rr8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r14 == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
        if (r14 == r7) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[LOOP:0: B:24:0x007b->B:26:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105 A[LOOP:1: B:48:0x00ff->B:50:0x0105, LOOP_END] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
