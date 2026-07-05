package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z43  reason: default package */
/* loaded from: classes3.dex */
public final class z43 extends aab implements lu4 {
    public List C;
    public int D;
    public int E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ i53 I;
    public i53 a;
    public m82 b;
    public f34 c;
    public List d;
    public Iterator e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z43(i53 i53Var, m42 m42Var) {
        super(2, m42Var);
        this.I = i53Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        z43 z43Var = new z43(this.I, m42Var);
        z43Var.H = obj;
        return z43Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((z43) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:45|46|47|48|49|51|52|53|54|55|56|(9:58|59|60|61|62|63|(1:65)|66|(5:68|69|70|71|(1:73)(6:74|75|76|77|22|(1:108)(13:24|45|46|47|48|49|51|52|53|54|55|56|(0))))(5:89|76|77|22|(0)(0)))|34) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0192, code lost:
        r5 = r10;
        r10 = r8;
        r8 = r5;
        r5 = r4;
        r4 = r9;
        r9 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019f, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0240 A[Catch: all -> 0x020d, TryCatch #7 {all -> 0x020d, blocks: (B:85:0x01cc, B:96:0x0226, B:101:0x0240, B:103:0x0252, B:110:0x028a, B:116:0x02ba, B:117:0x02bf, B:120:0x02d3, B:121:0x02de, B:122:0x02df, B:124:0x02e9, B:126:0x030a), top: B:151:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ba A[Catch: all -> 0x020d, TryCatch #7 {all -> 0x020d, blocks: (B:85:0x01cc, B:96:0x0226, B:101:0x0240, B:103:0x0252, B:110:0x028a, B:116:0x02ba, B:117:0x02bf, B:120:0x02d3, B:121:0x02de, B:122:0x02df, B:124:0x02e9, B:126:0x030a), top: B:151:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02df A[Catch: all -> 0x020d, TryCatch #7 {all -> 0x020d, blocks: (B:85:0x01cc, B:96:0x0226, B:101:0x0240, B:103:0x0252, B:110:0x028a, B:116:0x02ba, B:117:0x02bf, B:120:0x02d3, B:121:0x02de, B:122:0x02df, B:124:0x02e9, B:126:0x030a), top: B:151:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x031b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0346 A[LOOP:0: B:132:0x031d->B:135:0x0346, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0349 A[EDGE_INSN: B:154:0x0349->B:136:0x0349 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133 A[Catch: all -> 0x0043, TryCatch #3 {all -> 0x0043, blocks: (B:10:0x0034, B:42:0x012d, B:44:0x0133, B:46:0x013b, B:18:0x0064, B:21:0x008a, B:29:0x00c1, B:38:0x0114, B:41:0x0121, B:33:0x00cc, B:35:0x00fa), top: B:143:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba A[Catch: all -> 0x0210, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:78:0x01b1, B:81:0x01b6, B:83:0x01ba, B:77:0x01a5), top: B:137:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x02ae -> B:114:0x02b0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x02c0 -> B:115:0x02b7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0226 -> B:49:0x0146). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z43.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
