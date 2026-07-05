package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pbd  reason: default package */
/* loaded from: classes3.dex */
public final class pbd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ubd b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbd(ubd ubdVar, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.b = ubdVar;
        this.c = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ubd ubdVar = this.b;
        switch (i) {
            case 0:
                return new pbd(ubdVar, this.c, m42Var, 0);
            case 1:
                return new pbd(ubdVar, this.c, m42Var, 1);
            case 2:
                return new pbd(ubdVar, this.c, m42Var, 2);
            case 3:
                return new pbd(ubdVar, this.c, m42Var, 3);
            case 4:
                return new pbd(ubdVar, this.c, m42Var, 4);
            case 5:
                return new pbd(ubdVar, m42Var, 5);
            case 6:
                return new pbd(ubdVar, m42Var, 6);
            case 7:
                return new pbd(ubdVar, m42Var, 7);
            default:
                return new pbd(ubdVar, m42Var, 8);
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
                ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                return ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pbd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0276, code lost:
        if (r3.o(r4, false, r31) != r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0279, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:?, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r4 == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0159, code lost:
        if (r3 == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016b, code lost:
        if (r3.a(r0, r31) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a6, code lost:
        if (r6 == r5) goto L87;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbd(ubd ubdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = ubdVar;
    }
}
