package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r39  reason: default package */
/* loaded from: classes.dex */
public final class r39 extends fs9 implements lu4 {
    public final /* synthetic */ boolean C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ ws2 F;
    public final /* synthetic */ mu4 G;
    public final /* synthetic */ vt4 H;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vt4 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r39(vt4 vt4Var, boolean z, float f, boolean z2, float f2, float f3, ws2 ws2Var, mu4 mu4Var, vt4 vt4Var2, m42 m42Var) {
        super(2, m42Var);
        this.d = vt4Var;
        this.e = z;
        this.f = f;
        this.C = z2;
        this.D = f2;
        this.E = f3;
        this.F = ws2Var;
        this.G = mu4Var;
        this.H = vt4Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        r39 r39Var = new r39(this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, m42Var);
        r39Var.c = obj;
        return r39Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((r39) create((gab) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r2 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (java.lang.Float.intBitsToFloat((int) (r16 >> r24)) < (((int) (r1.f.U >> r24)) / 2.0f)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
        if (r4 != false) goto L27;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r39.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
