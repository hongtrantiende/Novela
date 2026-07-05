package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o0  reason: default package */
/* loaded from: classes.dex */
public final class o0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(sob sobVar, long j, xob xobVar, rob robVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 9;
        this.d = sobVar;
        this.c = j;
        this.e = xobVar;
        this.f = robVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new o0((w26) this.e, this.c, (yu7) obj2, m42Var, 0);
            case 1:
                o0 o0Var = new o0((ng1) obj2, this.c, m42Var);
                o0Var.e = obj;
                return o0Var;
            case 2:
                return new o0((wl9) this.d, (zc6) this.e, (a52) obj2, this.c, m42Var, 2);
            case 3:
                return new o0(this.c, (pl5) this.e, (aw7) obj2, m42Var);
            case 4:
                return new o0((yl9) this.d, (yl9) this.e, (lz5) obj2, this.c, m42Var, 4);
            case 5:
                return new o0((mh6) this.e, (lf4) obj2, this.c, m42Var);
            case 6:
                o0 o0Var2 = new o0((t3a) this.e, this.c, (wl9) obj2, m42Var, 6);
                o0Var2.d = obj;
                return o0Var2;
            case 7:
                return new o0((uxa) obj2, m42Var);
            case 8:
                return new o0((b7b) this.d, (g7b) this.e, this.c, (String) obj2, m42Var, 8);
            case 9:
                return new o0((sob) this.d, this.c, (xob) this.e, (rob) obj2, m42Var);
            case 10:
                return new o0((aw7) this.e, this.c, (yu7) obj2, m42Var, 10);
            case 11:
                return new o0((sx8) this.d, (CharSequence) this.e, this.c, (ytb) obj2, m42Var, 11);
            case 12:
                return new o0((ytb) this.e, this.c, (yu7) obj2, m42Var, 12);
            default:
                return new o0((yrd) this.e, this.c, (Map) obj2, m42Var, 13);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((o0) create((s3a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((o0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x021e, code lost:
        if (r1.invoke(r2, r4) == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x022f, code lost:
        if (((defpackage.xob) r4.e).a((defpackage.rob) r4.f, r4) == r0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0441, code lost:
        if (defpackage.lq.c(r2, r5, r11, null, r10, r4, 4) != r9) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0483, code lost:
        if (defpackage.b23.t(r4) == r1) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04ab, code lost:
        if (defpackage.ade.q((r10 - r8) / 1000000, r4) == r1) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0627, code lost:
        if (((defpackage.w26) r4.e).join(r4) == r1) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x064a, code lost:
        if (r0.b(r2, r4) != r1) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ca, code lost:
        if (r0.b(r8, r4) == r2) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01da  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ng1 ng1Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.f = ng1Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mh6 mh6Var, lf4 lf4Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.a = 5;
        this.e = mh6Var;
        this.f = lf4Var;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(uxa uxaVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 7;
        this.f = uxaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(long j, pl5 pl5Var, aw7 aw7Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.c = j;
        this.e = pl5Var;
        this.f = aw7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Serializable serializable, Object obj, Object obj2, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = serializable;
        this.e = obj;
        this.f = obj2;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, long j, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = obj;
        this.c = j;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, Object obj2, long j, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
        this.f = obj3;
    }
}
