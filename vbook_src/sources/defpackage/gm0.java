package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gm0  reason: default package */
/* loaded from: classes.dex */
public final class gm0 extends fs9 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm0(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.e = obj;
        this.f = obj2;
        this.C = obj3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                gm0 gm0Var = new gm0((zl9) this.f, (zl9) obj2, m42Var, 0);
                gm0Var.d = obj;
                return gm0Var;
            case 1:
                gm0 gm0Var2 = new gm0((rj8) obj2, m42Var, 1);
                gm0Var2.d = obj;
                return gm0Var2;
            case 2:
                gm0 gm0Var3 = new gm0((m82) this.e, (gsd) this.f, (i59) obj2, m42Var, 2);
                gm0Var3.d = obj;
                return gm0Var3;
            case 3:
                gm0 gm0Var4 = new gm0((ih1) this.f, (yi0) obj2, m42Var, 3);
                gm0Var4.d = obj;
                return gm0Var4;
            case 4:
                gm0 gm0Var5 = new gm0((kj) this.e, (wr7) this.f, (npb) obj2, m42Var, 4);
                gm0Var5.d = obj;
                return gm0Var5;
            case 5:
                gm0 gm0Var6 = new gm0((d6b) obj2, m42Var, 5);
                gm0Var6.d = obj;
                return gm0Var6;
            default:
                gm0 gm0Var7 = new gm0((hk7) this.e, (em7) this.f, (hk7) obj2, m42Var, 6);
                gm0Var7.d = obj;
                return gm0Var7;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        gab gabVar = (gab) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((gm0) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((gm0) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((gm0) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((gm0) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((gm0) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((gm0) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((gm0) create(gabVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (defpackage.qye.g(r1, r20) == r13) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r2 != r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0314, code lost:
        if (r3 != r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x038d, code lost:
        if (r4 == r13) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0408, code lost:
        if (defpackage.jye.q(r3, (defpackage.wr7) r20.f, r1, r4, r20) != r13) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x041e, code lost:
        if (defpackage.jye.w(r3, r11, r4, r20) == r13) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x042a, code lost:
        if (defpackage.jye.i(r3, r11, r4, r1, r20) == r13) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0474, code lost:
        if (r2 == r13) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04c5, code lost:
        if (r4 != r13) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0585, code lost:
        if (r2 == r13) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05a7, code lost:
        if (r1 == r13) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0629, code lost:
        if (r6 == r13) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0680, code lost:
        if (r7 == r13) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0290, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:?, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:?, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:?, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:?, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:?, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:?, code lost:
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013e, code lost:
        if (r5 == r13) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ad, code lost:
        if (r5 == r13) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:18:0x0058). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:184:0x0314 -> B:186:0x0318). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:274:0x04c5 -> B:276:0x04c9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:314:0x05a7 -> B:316:0x05ab). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:360:0x0680 -> B:362:0x0685). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01ad -> B:86:0x01b1). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm0(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.f = obj;
        this.C = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm0(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.C = obj;
    }
}
