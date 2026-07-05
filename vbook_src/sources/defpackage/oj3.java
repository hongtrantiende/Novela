package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oj3  reason: default package */
/* loaded from: classes3.dex */
public final class oj3 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj3(fna fnaVar, long j, hna hnaVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.d = fnaVar;
        this.c = j;
        this.e = hnaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                oj3 oj3Var = new oj3((pj3) obj2, this.c, m42Var, 0);
                oj3Var.d = obj;
                return oj3Var;
            case 1:
                return new oj3((fna) this.d, this.c, (hna) obj2, m42Var);
            case 2:
                return new oj3((zxa) obj2, m42Var);
            case 3:
                oj3 oj3Var2 = new oj3(this.c, (y5c) obj2, m42Var);
                oj3Var2.d = obj;
                return oj3Var2;
            default:
                oj3 oj3Var3 = new oj3((shc) obj2, this.c, m42Var, 4);
                oj3Var3.d = obj;
                return oj3Var3;
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
                return ((oj3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((oj3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((oj3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((oj3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((oj3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104 A[LOOP:2: B:54:0x0104->B:55:0x0114, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0124 -> B:48:0x00e7). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj3(long j, y5c y5cVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.c = j;
        this.e = y5cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj3(zxa zxaVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.e = zxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj3(Object obj, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.c = j;
    }
}
