package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e9d  reason: default package */
/* loaded from: classes3.dex */
public final class e9d extends fs9 implements lu4 {
    public Serializable C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ vt4 E;
    public final /* synthetic */ hu4 F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ hu4 H;
    public final /* synthetic */ hu4 I;
    public final /* synthetic */ int b = 1;
    public z09 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9d(dx4 dx4Var, vt4 vt4Var, vt4 vt4Var2, aw7 aw7Var, xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.D = dx4Var;
        this.E = vt4Var;
        this.F = vt4Var2;
        this.f = aw7Var;
        this.H = xt4Var;
        this.I = xt4Var2;
        this.G = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        hu4 hu4Var = this.I;
        hu4 hu4Var2 = this.H;
        Object obj2 = this.G;
        hu4 hu4Var3 = this.F;
        Object obj3 = this.D;
        switch (i) {
            case 0:
                e9d e9dVar = new e9d((dx4) obj3, this.E, (vt4) hu4Var3, this.f, (xt4) hu4Var2, (xt4) hu4Var, (aw7) obj2, m42Var);
                e9dVar.e = obj;
                return e9dVar;
            default:
                e9d e9dVar2 = new e9d((atd) obj3, this.f, (hk7) this.E, (zub) hu4Var3, (kbd) obj2, (a0b) hu4Var2, (x8c) hu4Var, m42Var);
                e9dVar2.e = obj;
                return e9dVar2;
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
                return ((e9d) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((e9d) create(gabVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02a9, code lost:
        if (defpackage.mi3.j(r15, r1, r6, r23) == r4) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r8 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
        if (r6 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0132, code lost:
        if (r6 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016f, code lost:
        if (r0 == r10) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [yl9, java.lang.Object, java.io.Serializable] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9d(atd atdVar, aw7 aw7Var, hk7 hk7Var, zub zubVar, kbd kbdVar, a0b a0bVar, x8c x8cVar, m42 m42Var) {
        super(2, m42Var);
        this.D = atdVar;
        this.f = aw7Var;
        this.E = hk7Var;
        this.F = zubVar;
        this.G = kbdVar;
        this.H = a0bVar;
        this.I = x8cVar;
    }
}
