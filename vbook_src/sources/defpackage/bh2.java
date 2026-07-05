package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bh2  reason: default package */
/* loaded from: classes3.dex */
public final class bh2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public /* synthetic */ Object d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh2(lg3 lg3Var, String str, int i, int i2, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.f = lg3Var;
        this.d = str;
        this.b = i;
        this.e = i2;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                bh2 bh2Var = new bh2((gh2) this.d, this.e, m42Var, 0);
                bh2Var.c = ((Boolean) obj).booleanValue();
                return bh2Var;
            case 1:
                bh2 bh2Var2 = new bh2((gh2) this.d, this.e, m42Var, 1);
                bh2Var2.c = ((Boolean) obj).booleanValue();
                return bh2Var2;
            case 2:
                bh2 bh2Var3 = new bh2(2, m42Var);
                bh2Var3.d = obj;
                return bh2Var3;
            default:
                return new bh2((lg3) this.f, (String) this.d, this.b, this.e, this.c, m42Var);
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
                return ((bh2) create(bool, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((bh2) create(bool2, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((bh2) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                ((bh2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:6|(1:(1:(8:10|11|12|13|14|(2:20|(1:(1:28)(1:27))(1:23))(1:17)|18|19)(2:32|33))(1:34))(2:44|(2:46|47)(2:48|(1:55)(4:52|(1:54)|39|40)))|35|36|37|(10:41|13|14|(0)|20|(0)|(1:25)|28|18|19)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0103, code lost:
        r12 = r13;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
        if (r13 == r5) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ad  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh2(gh2 gh2Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.d = gh2Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh2(int i, m42 m42Var) {
        super(i, m42Var);
        this.a = 2;
    }
}
