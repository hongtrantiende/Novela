package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f05  reason: default package */
/* loaded from: classes.dex */
public final class f05 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public hn8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f05(hn8 hn8Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = hn8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                f05 f05Var = new f05(this.d, m42Var, 0);
                f05Var.c = obj;
                return f05Var;
            case 1:
                f05 f05Var2 = new f05(this.d, m42Var, 1);
                f05Var2.c = obj;
                return f05Var2;
            default:
                f05 f05Var3 = new f05(2, m42Var);
                f05Var3.c = obj;
                return f05Var3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((f05) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((f05) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((f05) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|4|(1:(2:7|8)(3:28|22|23))(8:29|30|(2:32|(2:34|35)(1:36))|16|17|(2:19|20)|22|23)|9|10|11|12|13|(6:15|16|17|(0)|22|23)(1:24)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f05.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f05(int i, m42 m42Var) {
        super(i, m42Var);
        this.a = 2;
    }
}
