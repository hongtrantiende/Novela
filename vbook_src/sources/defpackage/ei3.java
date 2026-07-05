package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ei3  reason: default package */
/* loaded from: classes.dex */
public final class ei3 extends fs9 implements lu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ hu4 D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei3(ye3 ye3Var, qo4 qo4Var, lu4 lu4Var, vt4 vt4Var, nv nvVar, m42 m42Var) {
        super(2, m42Var);
        this.b = 0;
        this.e = ye3Var;
        this.f = qo4Var;
        this.C = lu4Var;
        this.D = vt4Var;
        this.E = nvVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        Object obj2 = this.E;
        hu4 hu4Var = this.D;
        hu4 hu4Var2 = this.C;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ei3 ei3Var = new ei3((ye3) this.e, (qo4) obj3, (lu4) hu4Var2, (vt4) hu4Var, (nv) obj2, m42Var);
                ei3Var.d = obj;
                return ei3Var;
            case 1:
                ei3 ei3Var2 = new ei3((ca0) obj3, (da0) hu4Var2, (z90) hu4Var, (z90) obj2, m42Var, 1);
                ei3Var2.d = obj;
                return ei3Var2;
            case 2:
                ei3 ei3Var3 = new ei3((xt4) obj3, (lu4) hu4Var2, (vt4) hu4Var, (vt4) obj2, m42Var, 2);
                ei3Var3.d = obj;
                return ei3Var3;
            default:
                ei3 ei3Var4 = new ei3((m82) obj3, (mu4) hu4Var2, (xt4) hu4Var, (j59) obj2, m42Var, 3);
                ei3Var4.d = obj;
                return ei3Var4;
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
                return ((ei3) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ei3) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((ei3) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ei3) create(gabVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
        if (r6 == r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
        if (r2 == r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
        if (r1 == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0153, code lost:
        if (r0 == r9) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b2, code lost:
        if (r1 == r9) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0200, code lost:
        if (r0 == r9) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0248, code lost:
        if (r2 == r9) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [wl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [hi3] */
    /* JADX WARN: Type inference failed for: r4v8, types: [hi3] */
    /* JADX WARN: Type inference failed for: r7v4, types: [wl9, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei3(Object obj, hu4 hu4Var, hu4 hu4Var2, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.f = obj;
        this.C = hu4Var;
        this.D = hu4Var2;
        this.E = obj2;
    }
}
