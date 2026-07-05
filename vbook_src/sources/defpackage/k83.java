package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k83  reason: default package */
/* loaded from: classes3.dex */
public final class k83 extends aab implements lu4 {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public int d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(y5c y5cVar, String str, String str2, String str3, f76 f76Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.f = y5cVar;
        this.C = str;
        this.E = str2;
        this.F = str3;
        this.G = f76Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                k83 k83Var = new k83((m83) obj2, m42Var, 0);
                k83Var.f = obj;
                return k83Var;
            case 1:
                k83 k83Var2 = new k83((jw7) this.E, (ow7) this.F, (lu4) obj2, this.f, m42Var);
                k83Var2.e = obj;
                return k83Var2;
            case 2:
                return new k83((re9) obj2, m42Var, 2);
            case 3:
                return new k83((y5c) this.f, (String) this.C, (String) this.E, (String) this.F, (f76) obj2, m42Var);
            case 4:
                k83 k83Var3 = new k83((k8c) obj2, m42Var, 4);
                k83Var3.F = obj;
                return k83Var3;
            default:
                return new k83((s8c) this.D, (t8c) this.E, (vy5) this.F, (nl5) obj2, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((k83) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((k83) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((k83) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((k83) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((k83) create((qz9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((k83) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02d9, code lost:
        if (((defpackage.mnb) r0).o((java.lang.String) r50.C, (java.lang.String) r50.E, (java.lang.String) r50.F, (defpackage.f76) r8, r50) == r10) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0443, code lost:
        if (r4 == r10) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0704, code lost:
        if (defpackage.m83.D(r1, r50) != r10) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x071c, code lost:
        if (defpackage.m83.E(r1, r50) == r10) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0746, code lost:
        if (r11 != r10) goto L250;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x05fb: INVOKE  (r2 I:qw7), (r12 I:java.lang.Object) type: INTERFACE call: qw7.q(java.lang.Object):void, block:B:216:0x05fb */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05db A[Catch: all -> 0x05e6, TRY_LEAVE, TryCatch #3 {all -> 0x05e6, blocks: (B:197:0x05d2, B:198:0x05d4, B:201:0x05db, B:209:0x05eb, B:210:0x05ed, B:212:0x05f3, B:215:0x05fa), top: B:290:0x053f }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b A[Catch: all -> 0x0159, TryCatch #8 {all -> 0x0159, blocks: (B:36:0x013d, B:38:0x014b, B:41:0x015c), top: B:299:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0165 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #10 {all -> 0x01eb, blocks: (B:67:0x01dc, B:69:0x01e6), top: B:303:0x01dc }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0235  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x02fe -> B:130:0x0300). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:173:0x04d3 -> B:146:0x0391). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:265:0x0746 -> B:222:0x062e). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r51) {
        /*
            Method dump skipped, instructions count: 2002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k83.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(jw7 jw7Var, ow7 ow7Var, lu4 lu4Var, Object obj, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.E = jw7Var;
        this.F = ow7Var;
        this.G = lu4Var;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(s8c s8cVar, t8c t8cVar, vy5 vy5Var, nl5 nl5Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 5;
        this.D = s8cVar;
        this.E = t8cVar;
        this.F = vy5Var;
        this.G = nl5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k83(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.G = obj;
    }
}
