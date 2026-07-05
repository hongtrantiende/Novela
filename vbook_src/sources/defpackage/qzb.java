package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qzb  reason: default package */
/* loaded from: classes3.dex */
public final class qzb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a0c c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzb(String str, a0c a0cVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.d = str;
        this.c = a0cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        a0c a0cVar = this.c;
        switch (i) {
            case 0:
                return new qzb(a0cVar, str, m42Var, 0);
            case 1:
                return new qzb(a0cVar, str, m42Var, 1);
            case 2:
                return new qzb(a0cVar, str, m42Var, 2);
            case 3:
                return new qzb(str, a0cVar, m42Var);
            default:
                return new qzb(a0cVar, str, m42Var, 4);
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
                return ((qzb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((qzb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((qzb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((qzb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((qzb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0197, code lost:
        if (r15 == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a0, code lost:
        if (r13.o(r16) == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a9, code lost:
        if (r13.p(r16) == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b2, code lost:
        if (r13.q(r16) == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bb, code lost:
        if (r13.t(r16) == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c4, code lost:
        if (r13.r(r16) == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cc, code lost:
        if (r15 == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d4, code lost:
        if (r15 == r12) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01d7, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r15 == r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r13.t(r16) == r12) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        if (r10 == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
        if (r15 != r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r13.s(r16) == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r13.o(r16) == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d7, code lost:
        if (r13.p(r16) == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        if (r13.q(r16) == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
        if (r13.t(r16) == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
        if (r13.r(r16) == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fc, code lost:
        if (r15 == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
        if (r15 == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x013b, code lost:
        if (r15 == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
        if (r13.q(r16) == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
        if (r13.t(r16) == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0156, code lost:
        if (r13.r(r16) == r12) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0159, code lost:
        return r12;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qzb(a0c a0cVar, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = a0cVar;
        this.d = str;
    }
}
