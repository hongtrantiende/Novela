package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ai3  reason: default package */
/* loaded from: classes.dex */
public final class ai3 extends fs9 implements lu4 {
    public final /* synthetic */ zl9 C;
    public final /* synthetic */ zl9 D;
    public r09 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vl9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai3(vl9 vl9Var, zl9 zl9Var, zl9 zl9Var2, m42 m42Var) {
        super(2, m42Var);
        this.f = vl9Var;
        this.C = zl9Var;
        this.D = zl9Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        ai3 ai3Var = new ai3(this.f, this.C, this.D, m42Var);
        ai3Var.e = obj;
        return ai3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((ai3) create((gab) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r8 == r6) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce A[EDGE_INSN: B:70:0x00ce->B:45:0x00ce ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
