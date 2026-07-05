package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gg1  reason: default package */
/* loaded from: classes3.dex */
public final class gg1 extends aab implements lu4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 3;
    public Object b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(sx8 sx8Var, String str, long j, fxb fxbVar, gtb gtbVar, j88 j88Var, m42 m42Var) {
        super(2, m42Var);
        this.b = sx8Var;
        this.e = str;
        this.C = j;
        this.c = fxbVar;
        this.f = gtbVar;
        this.D = j88Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.D;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                gg1 gg1Var = new gg1((ng1) obj3, this.C, (List) obj2, m42Var);
                gg1Var.e = obj;
                return gg1Var;
            case 1:
                gg1 gg1Var2 = new gg1((ng1) obj3, (String) obj2, this.C, m42Var);
                gg1Var2.e = obj;
                return gg1Var2;
            case 2:
                gg1 gg1Var3 = new gg1((rxc) this.e, (i22) this.c, (hv0) obj3, this.C, (w26) obj2, m42Var);
                gg1Var3.b = obj;
                return gg1Var3;
            case 3:
                return new gg1(this.C, (pl5) this.e, (float[]) this.c, (aw7) obj3, (aw7) obj2, m42Var);
            default:
                return new gg1((sx8) this.b, (String) this.e, this.C, (fxb) this.c, (gtb) obj3, (j88) obj2, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((gg1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((gg1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((gg1) create((s3a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((gg1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((gg1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0241 A[LOOP:0: B:105:0x0241->B:106:0x028a, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a6 A[LOOP:3: B:145:0x03a6->B:146:0x03f2, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(ng1 ng1Var, long j, List list, m42 m42Var) {
        super(2, m42Var);
        this.f = ng1Var;
        this.C = j;
        this.D = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(ng1 ng1Var, String str, long j, m42 m42Var) {
        super(2, m42Var);
        this.f = ng1Var;
        this.D = str;
        this.C = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(long j, pl5 pl5Var, float[] fArr, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.C = j;
        this.e = pl5Var;
        this.c = fArr;
        this.f = aw7Var;
        this.D = aw7Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg1(rxc rxcVar, i22 i22Var, hv0 hv0Var, long j, w26 w26Var, m42 m42Var) {
        super(2, m42Var);
        this.e = rxcVar;
        this.c = i22Var;
        this.f = hv0Var;
        this.C = j;
        this.D = w26Var;
    }
}
