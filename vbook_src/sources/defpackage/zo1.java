package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zo1  reason: default package */
/* loaded from: classes.dex */
public final class zo1 extends aab implements lu4 {
    public Object C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo1(ty5 ty5Var, fp1 fp1Var, List list, kj kjVar, pta ptaVar, m42 m42Var) {
        super(2, m42Var);
        this.C = ty5Var;
        this.D = fp1Var;
        this.E = list;
        this.F = kjVar;
        this.G = ptaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        Object obj4 = this.E;
        switch (i) {
            case 0:
                zo1 zo1Var = new zo1((ty5) this.C, (fp1) this.D, (List) obj4, (kj) obj3, (pta) obj2, m42Var);
                zo1Var.f = obj;
                return zo1Var;
            default:
                return new zo1((o78[]) obj4, (koc) obj3, (xjc) obj2, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((zo1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((zo1) create((r19) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (defpackage.koc.d(r6, r5, r4, r24) == r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
        r4 = r9;
        r9 = r3;
        r3 = r4;
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (defpackage.koc.c(r6, r5, r4, r24) == r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:21:0x0072). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:27:0x0093). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x017f -> B:54:0x0182). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo1(o78[] o78VarArr, koc kocVar, xjc xjcVar, m42 m42Var) {
        super(2, m42Var);
        this.E = o78VarArr;
        this.F = kocVar;
        this.G = xjcVar;
    }
}
