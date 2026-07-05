package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fh2  reason: default package */
/* loaded from: classes3.dex */
public final class fh2 extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh2(boolean z, Object obj, gn8 gn8Var, cs9 cs9Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = obj;
        this.e = gn8Var;
        this.C = cs9Var;
        this.D = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.C;
        Object obj3 = this.D;
        switch (i) {
            case 0:
                fh2 fh2Var = new fh2((xl9) this.e, (gh2) obj3, this.C, this.c, m42Var);
                fh2Var.f = obj;
                return fh2Var;
            case 1:
                return new fh2(this.c, (dm8) this.f, (ora) obj2, (dm8) obj3, m42Var);
            case 2:
                fh2 fh2Var2 = new fh2(this.c, (d3d) this.d, (gn8) this.e, (cs9) obj2, (String) obj3, m42Var, 2);
                fh2Var2.f = obj;
                return fh2Var2;
            default:
                fh2 fh2Var3 = new fh2(this.c, (s3d) this.d, (gn8) this.e, (cs9) obj2, (String) obj3, m42Var, 3);
                fh2Var3.f = obj;
                return fh2Var3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((fh2) create((aod) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((fh2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((fh2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((fh2) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0269, code lost:
        if (r10.a(r18, r6) == r9) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [wl9, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(boolean z, dm8 dm8Var, ora oraVar, dm8 dm8Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.c = z;
        this.f = dm8Var;
        this.C = oraVar;
        this.D = dm8Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh2(xl9 xl9Var, gh2 gh2Var, Object obj, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.e = xl9Var;
        this.D = gh2Var;
        this.C = obj;
        this.c = z;
    }
}
