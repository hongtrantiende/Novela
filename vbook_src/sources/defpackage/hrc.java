package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hrc  reason: default package */
/* loaded from: classes3.dex */
public final class hrc extends aab implements lu4 {
    public irc C;
    public az0 D;
    public vl9 E;
    public az0 F;
    public Object G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ irc J;
    public final /* synthetic */ String K;
    public final /* synthetic */ w14 L;
    public hk2 a;
    public Object b;
    public tj4 c;
    public Object d;
    public Closeable e;
    public w14 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrc(irc ircVar, String str, w14 w14Var, m42 m42Var) {
        super(2, m42Var);
        this.J = ircVar;
        this.K = str;
        this.L = w14Var;
    }

    public static final pvc o(vl9 vl9Var, az0 az0Var, String str) {
        String obj = k4b.N0(str).toString();
        int length = obj.length();
        pvc pvcVar = pvc.a;
        if (length == 0) {
            return pvcVar;
        }
        if (vl9Var.a) {
            az0Var.i0("\n\n");
        }
        az0Var.i0(obj);
        vl9Var.a = true;
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        hrc hrcVar = new hrc(this.J, this.K, this.L, m42Var);
        hrcVar.I = obj;
        return hrcVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((hrc) create((tj4) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03e0, code lost:
        if (r9 == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0152, code lost:
        if (defpackage.zo0.f(r1, r2, r3, 0, 1, r18) == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017f, code lost:
        if (r0 == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a8, code lost:
        if (defpackage.zo0.f(r1, r2, r3, 1, 1, r18) == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b7, code lost:
        if (r3 == r11) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d8, code lost:
        if (r0 == r11) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00bf: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:24:0x00bd */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00c0: MOVE  (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:24:0x00bd */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0438 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0439 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0402 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ad A[Catch: all -> 0x0298, TRY_ENTER, TryCatch #4 {all -> 0x0298, blocks: (B:87:0x02d7, B:83:0x02ad, B:71:0x026b), top: B:161:0x026b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0321 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:10:0x004d, B:94:0x031b, B:96:0x0321, B:18:0x0091, B:93:0x030f, B:26:0x00d9), top: B:153:0x0016 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27, types: [az0] */
    /* JADX WARN: Type inference failed for: r4v24, types: [az0] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [az0] */
    /* JADX WARN: Type inference failed for: r5v18, types: [az0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [w14] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x03b5 -> B:129:0x03e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x03bd -> B:129:0x03e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03e0 -> B:129:0x03e3). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
