package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f3c  reason: default package */
/* loaded from: classes3.dex */
public final class f3c extends fs9 implements lu4 {
    public yl9 C;
    public z09 D;
    public z09 E;
    public boolean F;
    public long G;
    public long H;
    public int I;
    public int J;
    public float K;
    public float L;
    public float M;
    public int N;
    public /* synthetic */ Object O;
    public final /* synthetic */ g3c P;
    public final /* synthetic */ se0 Q;
    public final /* synthetic */ imb R;
    public final /* synthetic */ p52 S;
    public z09 b;
    public z09 c;
    public gab d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3c(g3c g3cVar, se0 se0Var, imb imbVar, p52 p52Var, m42 m42Var) {
        super(2, m42Var);
        this.P = g3cVar;
        this.Q = se0Var;
        this.R = imbVar;
        this.S = p52Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        f3c f3cVar = new f3c(this.P, this.Q, this.R, this.S, m42Var);
        f3cVar.O = obj;
        return f3cVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((f3c) create((gab) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01e9, code lost:
        if (r7 == r6) goto L202;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0534 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0433  */
    /* JADX WARN: Type inference failed for: r13v25, types: [yl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [yl9, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x044e -> B:92:0x0408). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0493 -> B:117:0x0495). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x053e -> B:117:0x0495). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0570 -> B:119:0x04af). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x05f7 -> B:159:0x0601). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x065f -> B:170:0x0666). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:171:0x066a -> B:119:0x04af). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x0686 -> B:86:0x03ee). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x06da -> B:29:0x0241). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0213 -> B:27:0x0220). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x02bd -> B:27:0x0220). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02f1 -> B:29:0x0241). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0375 -> B:69:0x037d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x03d2 -> B:80:0x03d6). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 2004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
