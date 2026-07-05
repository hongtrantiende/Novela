package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qq1  reason: default package */
/* loaded from: classes.dex */
public final class qq1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ytb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq1(ytb ytbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ytbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ytb ytbVar = this.c;
        switch (i) {
            case 0:
                qq1 qq1Var = new qq1(ytbVar, m42Var, 0);
                long j = ((y78) obj).a;
                return qq1Var;
            case 1:
                return new qq1(ytbVar, m42Var, 1);
            case 2:
                return new qq1(ytbVar, m42Var, 2);
            default:
                return new qq1(ytbVar, m42Var, 3);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                long j = ((y78) obj).a;
                return new qq1(this.c, (m42) obj2, 0).invokeSuspend(pvcVar);
            case 1:
                return ((qq1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((qq1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((qq1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
        if (r6 == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
        if (r9 == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:
        return r5;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [xl9, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qq1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
