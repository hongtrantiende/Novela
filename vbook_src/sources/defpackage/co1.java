package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: co1  reason: default package */
/* loaded from: classes3.dex */
public final class co1 extends aab implements lu4 {
    public Object C;
    public Serializable D;
    public Object E;
    public Object F;
    public Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co1(m42 m42Var, tj4 tj4Var, vt4 vt4Var, mu4 mu4Var, sj4[] sj4VarArr) {
        super(2, m42Var);
        this.F = sj4VarArr;
        this.G = vt4Var;
        this.H = mu4Var;
        this.I = tj4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                tj4 tj4Var = (tj4) obj2;
                co1 co1Var = new co1(m42Var, tj4Var, (vt4) this.G, (mu4) obj3, (sj4[]) this.F);
                co1Var.E = obj;
                return co1Var;
            default:
                return new co1((List) obj3, this.d, (y5c) obj2, this.e, m42Var);
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
                return ((co1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((co1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4 A[LOOP:0: B:28:0x00de->B:30:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0227 A[LOOP:1: B:64:0x0227->B:72:0x0248, LOOP_START, PHI: r5 r12 
      PHI: (r5v6 int) = (r5v5 int), (r5v7 int) binds: [B:62:0x0221, B:72:0x0248] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v11 du5) = (r12v10 du5), (r12v17 du5) binds: [B:62:0x0221, B:72:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v12, types: [ta1] */
    /* JADX WARN: Type inference failed for: r14v15, types: [ta1] */
    /* JADX WARN: Type inference failed for: r14v9, types: [ta1] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0274 -> B:57:0x01f7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0295 -> B:85:0x029a). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co1(List list, int i, y5c y5cVar, int i2, m42 m42Var) {
        super(2, m42Var);
        this.H = list;
        this.d = i;
        this.I = y5cVar;
        this.e = i2;
    }
}
