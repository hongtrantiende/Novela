package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aa  reason: default package */
/* loaded from: classes3.dex */
public final class aa extends aab implements lu4 {
    public az0 C;
    public long D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ hn8 G;
    public final /* synthetic */ y69 H;
    public final /* synthetic */ int a;
    public s11 b;
    public byte[] c;
    public yl9 d;
    public Closeable e;
    public y69 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa(hn8 hn8Var, y69 y69Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.G = hn8Var;
        this.H = y69Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        y69 y69Var = this.H;
        hn8 hn8Var = this.G;
        switch (i) {
            case 0:
                aa aaVar = new aa(hn8Var, y69Var, m42Var, 0);
                aaVar.F = obj;
                return aaVar;
            default:
                aa aaVar2 = new aa(hn8Var, y69Var, m42Var, 1);
                aaVar2.F = obj;
                return aaVar2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        oh5 oh5Var = (oh5) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((aa) create(oh5Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((aa) create(oh5Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r1 == r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        if (r10 == r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
        if (r1 == r12) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0190, code lost:
        if (r13 == r12) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:9:0x0035, B:30:0x00b9, B:32:0x00c1, B:25:0x0098, B:27:0x009e), top: B:98:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0177 A[Catch: all -> 0x011b, TryCatch #3 {all -> 0x011b, blocks: (B:55:0x010a, B:77:0x0194, B:79:0x019c, B:72:0x0171, B:74:0x0177), top: B:102:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12, types: [az0] */
    /* JADX WARN: Type inference failed for: r1v23, types: [az0] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v3, types: [yl9] */
    /* JADX WARN: Type inference failed for: r9v8, types: [yl9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0190 -> B:77:0x0194). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
