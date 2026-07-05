package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yo1  reason: default package */
/* loaded from: classes.dex */
public final class yo1 extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 2;
    public int b;
    public final /* synthetic */ int c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(dt8 dt8Var, sk8 sk8Var, ar8 ar8Var, ss8 ss8Var, int i, aw7 aw7Var, m42 m42Var) {
        super(2, m42Var);
        this.d = dt8Var;
        this.e = sk8Var;
        this.f = ar8Var;
        this.C = ss8Var;
        this.c = i;
        this.D = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                yo1 yo1Var = new yo1((kj) obj5, this.c, (fp1) obj4, (pta) obj3, (sm2) obj2, m42Var);
                yo1Var.d = obj;
                return yo1Var;
            case 1:
                return new yo1((dt8) this.d, (sk8) obj5, (ar8) obj4, (ss8) obj3, this.c, (aw7) obj2, m42Var);
            case 2:
                return new yo1(this.c, (nn) obj5, (ps) obj4, (oyb) obj3, (List) obj2, m42Var);
            default:
                yo1 yo1Var2 = new yo1((jm9) obj5, (vy5) obj4, this.c, (s8c) obj3, (t8c) obj2, m42Var);
                yo1Var2.d = obj;
                return yo1Var2;
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
                return ((yo1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((yo1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((yo1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((yo1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0688, code lost:
        if (r8.u(r4, r42) == r10) goto L283;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f3  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 1702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(kj kjVar, int i, fp1 fp1Var, pta ptaVar, sm2 sm2Var, m42 m42Var) {
        super(2, m42Var);
        this.e = kjVar;
        this.c = i;
        this.f = fp1Var;
        this.C = ptaVar;
        this.D = sm2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(int i, nn nnVar, ps psVar, oyb oybVar, List list, m42 m42Var) {
        super(2, m42Var);
        this.c = i;
        this.e = nnVar;
        this.f = psVar;
        this.C = oybVar;
        this.D = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(jm9 jm9Var, vy5 vy5Var, int i, s8c s8cVar, t8c t8cVar, m42 m42Var) {
        super(2, m42Var);
        this.e = jm9Var;
        this.f = vy5Var;
        this.c = i;
        this.C = s8cVar;
        this.D = t8cVar;
    }
}
