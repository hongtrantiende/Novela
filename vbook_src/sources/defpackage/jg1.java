package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jg1  reason: default package */
/* loaded from: classes3.dex */
public final class jg1 extends aab implements lu4 {
    public /* synthetic */ Object C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg1(ps psVar, oyb oybVar, nn nnVar, List list, int i, int i2, int i3, m42 m42Var) {
        super(2, m42Var);
        this.f = psVar;
        this.C = oybVar;
        this.D = nnVar;
        this.E = list;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.E;
        switch (i) {
            case 0:
                jg1 jg1Var = new jg1(this.e, (ng1) obj2, m42Var);
                jg1Var.C = obj;
                return jg1Var;
            case 1:
                return new jg1((ps) this.f, (oyb) this.C, (nn) this.D, (List) obj2, this.c, this.d, this.e, m42Var);
            default:
                return new jg1((y5c) this.f, this.c, (String) this.C, (String) this.D, (String) obj2, this.d, this.e, m42Var);
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
                return ((jg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((jg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((jg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0 A[LOOP:0: B:77:0x01f0->B:78:0x023b, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0244  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg1(int i, ng1 ng1Var, m42 m42Var) {
        super(2, m42Var);
        this.E = ng1Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg1(y5c y5cVar, int i, String str, String str2, String str3, int i2, int i3, m42 m42Var) {
        super(2, m42Var);
        this.f = y5cVar;
        this.c = i;
        this.C = str;
        this.D = str2;
        this.E = str3;
        this.d = i2;
        this.e = i3;
    }
}
