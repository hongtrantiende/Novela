package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o11  reason: default package */
/* loaded from: classes3.dex */
public final class o11 extends aab implements lu4 {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(s11 s11Var, f31 f31Var, i11 i11Var, m42 m42Var) {
        super(2, m42Var);
        this.E = s11Var;
        this.C = f31Var;
        this.G = i11Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new o11((s11) this.E, (f31) this.C, (i11) obj2, m42Var);
            default:
                return new o11((csc) this.F, (Map) obj2, m42Var);
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
                return ((o11) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((o11) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:84|(1:86)|88|89|91|92|93|94|95|(6:97|98|99|100|101|102)) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:84|(1:86)|87|88|89|91|92|93|94|95|(6:97|98|99|100|101|102)) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:97|(1:98)|99|100|101|102) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02a0, code lost:
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d9, code lost:
        if (r9.g(r30) == r5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ff, code lost:
        if (r9.g(r30) != r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0320, code lost:
        if (r9.g(r30) != r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
        if (r3 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014c, code lost:
        if (r1 != r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0164, code lost:
        if (r1 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x028b, code lost:
        if (defpackage.gae.r(r13, r4, r30) != r5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0291, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0292, code lost:
        r4 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0298, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0299, code lost:
        r4 = r3;
        r12 = r9;
        r15 = r13;
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029f, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e6 A[Catch: all -> 0x021d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x021d, blocks: (B:103:0x02ae, B:70:0x0223, B:72:0x0229, B:74:0x022f, B:76:0x0235, B:79:0x024c, B:113:0x02c2, B:121:0x02e6, B:65:0x0217, B:109:0x02bc), top: B:154:0x0217 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0170 A[LOOP:0: B:44:0x0170->B:45:0x018a, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0229 A[Catch: all -> 0x021d, TryCatch #9 {all -> 0x021d, blocks: (B:103:0x02ae, B:70:0x0223, B:72:0x0229, B:74:0x022f, B:76:0x0235, B:79:0x024c, B:113:0x02c2, B:121:0x02e6, B:65:0x0217, B:109:0x02bc), top: B:154:0x0217 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026e  */
    /* JADX WARN: Type inference failed for: r11v13, types: [f31] */
    /* JADX WARN: Type inference failed for: r12v1, types: [f31] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x02ac -> B:92:0x028f). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o11.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o11(csc cscVar, Map map, m42 m42Var) {
        super(2, m42Var);
        this.F = cscVar;
        this.G = map;
    }
}
