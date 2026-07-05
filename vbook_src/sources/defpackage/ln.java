package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ln  reason: default package */
/* loaded from: classes3.dex */
public final class ln extends aab implements lu4 {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(xv7 xv7Var, mkc mkcVar, hvb hvbVar, kw5 kw5Var, kk kkVar, as5 as5Var, xt4 xt4Var, vt4 vt4Var, ucd ucdVar, xt4 xt4Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.d = xv7Var;
        this.e = mkcVar;
        this.f = hvbVar;
        this.C = kw5Var;
        this.D = kkVar;
        this.E = as5Var;
        this.F = xt4Var;
        this.H = vt4Var;
        this.I = ucdVar;
        this.G = xt4Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                ln lnVar = new ln((xv7) this.d, (mkc) this.e, (hvb) this.f, (kw5) this.C, (kk) this.D, (as5) this.E, (xt4) this.F, (vt4) this.H, (ucd) obj2, (xt4) this.G, m42Var);
                lnVar.b = obj;
                return lnVar;
            case 1:
                ln lnVar2 = new ln((List) this.H, (bt5) obj2, m42Var);
                lnVar2.G = obj;
                return lnVar2;
            case 2:
                ln lnVar3 = new ln((re9) obj2, m42Var, 2);
                lnVar3.H = obj;
                return lnVar3;
            default:
                return new ln((y5c) obj2, m42Var, 3);
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
                ((ln) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
            case 1:
                return ((ln) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((ln) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ln) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x052d, code lost:
        if (r3 == r6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
        if (defpackage.y5c.P(r7, true, r40) == r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028f, code lost:
        if (((defpackage.be9) r4).v(r5, r40) != r6) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02cd, code lost:
        if (r12 != r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x036c, code lost:
        if (r9 != r6) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a6  */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x04f2 -> B:150:0x056c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x052d -> B:138:0x0532). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x012a -> B:34:0x0131). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x015f -> B:35:0x0145). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x036c -> B:45:0x019f). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln(fdd fddVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.I = fddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(List list, bt5 bt5Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.H = list;
        this.I = bt5Var;
    }
}
