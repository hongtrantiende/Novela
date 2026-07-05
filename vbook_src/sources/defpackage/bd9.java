package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bd9  reason: default package */
/* loaded from: classes3.dex */
public final class bd9 extends aab implements lu4 {
    public Object C;
    public Object D;
    public Object E;
    public final /* synthetic */ Object F;
    public Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int a = 3;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd9(dub dubVar, uo3 uo3Var, ym0 ym0Var, xl0 xl0Var, zoa zoaVar, cva cvaVar, ppb ppbVar, wm0 wm0Var, hq6 hq6Var, g90 g90Var, m42 m42Var) {
        super(2, m42Var);
        this.e = dubVar;
        this.f = uo3Var;
        this.C = ym0Var;
        this.d = xl0Var;
        this.D = zoaVar;
        this.E = cvaVar;
        this.F = ppbVar;
        this.G = wm0Var;
        this.c = hq6Var;
        this.H = g90Var;
    }

    public static final void o(ppb ppbVar, uo3 uo3Var, ym0 ym0Var, wm0 wm0Var, zoa zoaVar, long j) {
        int b;
        lo3 B = kwe.B(uo3Var.e(), ym0Var, wm0Var);
        ppbVar.getClass();
        opb opbVar = ppbVar.a;
        opbVar.getClass();
        if (!fxb.d(j)) {
            opbVar.a();
        } else {
            t97 t97Var = opbVar.b;
            if (t97Var != null && (((int) (j >> 32)) != (b = t97Var.b()) || ((int) (j & 4294967295L)) != b)) {
                opbVar.a();
            }
        }
        List list = ppbVar.b.a;
        list.getClass();
        ppbVar.b = new no3(B, list);
        if (zoaVar != null) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (zoaVar.f >= 0) {
                int min = Math.min(i, i2);
                int max = Math.max(i, i2);
                if (min < zoaVar.f || max > zoaVar.g) {
                    zoaVar.a();
                }
            }
        }
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.H;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                bd9 bd9Var = new bd9((hn8) obj2, (lu4) obj3, m42Var);
                bd9Var.c = obj;
                return bd9Var;
            case 1:
                bd9 bd9Var2 = new bd9((ey) this.e, (kk9) this.f, (yl9) this.d, (cza) this.C, (Context) this.D, (rn9) this.E, (jac) obj3, (iac) this.G, (m82) obj2, m42Var);
                bd9Var2.c = obj;
                return bd9Var2;
            case 2:
                return new bd9((dub) this.e, (uo3) this.f, (ym0) this.C, (xl0) this.d, (zoa) this.D, (cva) this.E, (ppb) obj3, (wm0) this.G, (hq6) this.c, (g90) obj2, m42Var);
            default:
                bd9 bd9Var3 = new bd9((bic) obj3, (List) this.G, (String) obj2, m42Var);
                bd9Var3.c = obj;
                return bd9Var3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((bd9) create((oh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((bd9) create((ik9) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((bd9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((bd9) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02c5, code lost:
        if (r6 == r8) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0342, code lost:
        if (r0 == r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0385, code lost:
        if (r12 == r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0164, code lost:
        if (r0 == r8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a7, code lost:
        if (r4 == r8) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036e A[Catch: all -> 0x030e, TryCatch #4 {all -> 0x030e, blocks: (B:115:0x0307, B:134:0x0389, B:136:0x0391, B:129:0x0368, B:131:0x036e), top: B:159:0x0307 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:10:0x0030, B:54:0x0168, B:55:0x016e, B:16:0x004a, B:50:0x013e, B:19:0x006d, B:36:0x00e6, B:37:0x00ed, B:27:0x00a8, B:29:0x00af, B:32:0x00be, B:38:0x00f2, B:43:0x011a, B:46:0x0120, B:51:0x0145, B:26:0x0098, B:39:0x0106), top: B:155:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:10:0x0030, B:54:0x0168, B:55:0x016e, B:16:0x004a, B:50:0x013e, B:19:0x006d, B:36:0x00e6, B:37:0x00ed, B:27:0x00a8, B:29:0x00af, B:32:0x00be, B:38:0x00f2, B:43:0x011a, B:46:0x0120, B:51:0x0145, B:26:0x0098, B:39:0x0106), top: B:155:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Type inference failed for: r0v16, types: [az0] */
    /* JADX WARN: Type inference failed for: r13v3, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v5, types: [yl9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0385 -> B:134:0x0389). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bb -> B:37:0x00ed). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e3 -> B:36:0x00e6). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd9(hn8 hn8Var, lu4 lu4Var, m42 m42Var) {
        super(2, m42Var);
        this.H = hn8Var;
        this.F = lu4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd9(ey eyVar, kk9 kk9Var, yl9 yl9Var, cza czaVar, Context context, rn9 rn9Var, jac jacVar, iac iacVar, m82 m82Var, m42 m42Var) {
        super(2, m42Var);
        this.e = eyVar;
        this.f = kk9Var;
        this.d = yl9Var;
        this.C = czaVar;
        this.D = context;
        this.E = rn9Var;
        this.F = jacVar;
        this.G = iacVar;
        this.H = m82Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd9(bic bicVar, List list, String str, m42 m42Var) {
        super(2, m42Var);
        this.F = bicVar;
        this.G = list;
        this.H = str;
    }
}
