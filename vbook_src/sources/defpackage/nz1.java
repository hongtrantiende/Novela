package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nz1  reason: default package */
/* loaded from: classes3.dex */
public final class nz1 extends aab implements lu4 {
    public Object C;
    public fdd D;
    public Object E;
    public Object F;
    public Object G;
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz1(ur5 ur5Var, String str, int i, int i2, m42 m42Var) {
        super(2, m42Var);
        this.F = ur5Var;
        this.G = str;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new nz1((pz1) this.D, m42Var);
            default:
                return new nz1((ur5) this.F, (String) this.G, this.e, this.f, m42Var);
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
                return ((nz1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((nz1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cc, code lost:
        if (r12 != r4) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x028c -> B:44:0x011c). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz1(pz1 pz1Var, m42 m42Var) {
        super(2, m42Var);
        this.D = pz1Var;
    }
}
