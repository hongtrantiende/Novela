package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g42  reason: default package */
/* loaded from: classes3.dex */
public final class g42 extends aab implements lu4 {
    public Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public boolean d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g42(boolean z, boolean z2, ddd dddVar, rk9 rk9Var, rk9 rk9Var2, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.c = z;
        this.d = z2;
        this.e = dddVar;
        this.f = rk9Var;
        this.C = rk9Var2;
        this.D = aw7Var;
        this.E = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new g42((h42) this.f, m42Var);
            case 1:
                return new g42(this.c, this.d, (ddd) this.e, (rk9) this.f, (rk9) this.C, (aw7) this.D, (aw7) this.E, m42Var);
            default:
                return new g42((y5c) this.D, this.c, this.d, (String) this.E, m42Var);
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
                return ((g42) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((g42) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((g42) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x03dc, code lost:
        if (r0 == false) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0255  */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x03c6 -> B:145:0x03c9). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g42.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g42(y5c y5cVar, boolean z, boolean z2, String str, m42 m42Var) {
        super(2, m42Var);
        this.D = y5cVar;
        this.c = z;
        this.d = z2;
        this.E = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g42(h42 h42Var, m42 m42Var) {
        super(2, m42Var);
        this.f = h42Var;
    }
}
