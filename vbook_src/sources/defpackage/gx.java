package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gx  reason: default package */
/* loaded from: classes3.dex */
public final class gx extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(tl tlVar, int i, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.a = 7;
        this.d = tlVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                gx gxVar = new gx((tx) obj2, m42Var);
                gxVar.c = ((Boolean) obj).booleanValue();
                return gxVar;
            case 1:
                return new gx((pz1) obj2, this.c, m42Var, 1);
            case 2:
                return new gx((fw7) obj2, this.c, m42Var, 2);
            case 3:
                return new gx((i44) obj2, this.c, m42Var, 3);
            case 4:
                return new gx((v84) obj2, this.c, m42Var, 4);
            case 5:
                return new gx((ao4) obj2, this.c, m42Var, 5);
            case 6:
                return new gx((ur5) obj2, this.c, m42Var, 6);
            case 7:
                return new gx((tl) obj2, this.b, this.c, m42Var);
            case 8:
                return new gx((gia) obj2, this.c, m42Var, 8);
            case 9:
                return new gx((gtb) obj2, this.c, m42Var, 9);
            case 10:
                return new gx((y5c) obj2, this.c, m42Var, 10);
            case 11:
                return new gx((shc) obj2, this.c, m42Var, 11);
            case 12:
                return new gx((zlc) obj2, this.c, m42Var, 12);
            default:
                return new gx((ubd) obj2, this.c, m42Var, 13);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((gx) create(bool, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 8:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((gx) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0450, code lost:
        if (r3 == r9) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x049e, code lost:
        if (r3 == r9) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:?, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019b, code lost:
        if (r2 == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c3, code lost:
        if (r1 == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
        return r8;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(tx txVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.d = txVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx(Object obj, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.c = z;
    }
}
