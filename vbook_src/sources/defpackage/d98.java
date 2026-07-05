package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d98  reason: default package */
/* loaded from: classes3.dex */
public final class d98 extends aab implements lu4 {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public final /* synthetic */ Object H;
    public Serializable I;
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d98(xt4 xt4Var, pa8 pa8Var, String str, cs9 cs9Var, m42 m42Var) {
        super(2, m42Var);
        this.F = xt4Var;
        this.G = pa8Var;
        this.H = str;
        this.I = cs9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                d98 d98Var = new d98((bz0) obj2, (d82) this.D, (oe4) this.F, m42Var);
                d98Var.e = obj;
                return d98Var;
            case 1:
                d98 d98Var2 = new d98((xt4) this.F, (pa8) this.G, (String) obj2, (cs9) this.I, m42Var);
                d98Var2.e = obj;
                return d98Var2;
            default:
                d98 d98Var3 = new d98(m42Var, (y5c) obj2, (String) this.G);
                d98Var3.e = obj;
                return d98Var3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((d98) create((bod) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((d98) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((d98) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x044d A[Catch: all -> 0x049e, TryCatch #5 {all -> 0x049e, blocks: (B:121:0x0447, B:123:0x044d, B:125:0x0453, B:127:0x0457), top: B:164:0x0447 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102 A[Catch: all -> 0x00fe, TryCatch #6 {all -> 0x00fe, blocks: (B:38:0x00fa, B:41:0x0102, B:43:0x0108, B:46:0x0111, B:48:0x012c, B:50:0x0140, B:52:0x0159, B:47:0x012a), top: B:166:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140 A[Catch: all -> 0x00fe, TryCatch #6 {all -> 0x00fe, blocks: (B:38:0x00fa, B:41:0x0102, B:43:0x0108, B:46:0x0111, B:48:0x012c, B:50:0x0140, B:52:0x0159, B:47:0x012a), top: B:166:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0371  */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [xl9, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v10, types: [xl9] */
    /* JADX WARN: Type inference failed for: r13v12, types: [xl9] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x0499 -> B:111:0x03ff). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f6 -> B:166:0x00fa). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0187 -> B:40:0x00fe). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0393 -> B:97:0x0396). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d98.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d98(m42 m42Var, y5c y5cVar, String str) {
        super(2, m42Var);
        this.G = str;
        this.H = y5cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d98(bz0 bz0Var, d82 d82Var, oe4 oe4Var, m42 m42Var) {
        super(2, m42Var);
        this.H = bz0Var;
        this.D = d82Var;
        this.F = oe4Var;
    }
}
