package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bkc  reason: default package */
/* loaded from: classes3.dex */
public final class bkc extends fs9 implements lu4 {
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ nu4 G;
    public float b;
    public float c;
    public float d;
    public long e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkc(boolean z, nu4 nu4Var, m42 m42Var) {
        super(2, m42Var);
        this.F = z;
        this.G = nu4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        bkc bkcVar = new bkc(this.F, this.G, m42Var);
        bkcVar.E = obj;
        return bkcVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((bkc) create((gab) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
        if (r5 != r9) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
        if (defpackage.y78.d(r7, 0) == false) goto L59;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0097 -> B:18:0x009a). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
