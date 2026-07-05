package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wf5  reason: default package */
/* loaded from: classes3.dex */
public final class wf5 extends aab implements lu4 {
    public re5 C;
    public gh5 D;
    public gh5 E;
    public vl9 F;
    public vl9 G;
    public vl9 H;
    public vl9 I;
    public Iterator J;
    public long K;
    public int L;
    public final /* synthetic */ d56 M;
    public final /* synthetic */ kg5 N;
    public final /* synthetic */ String O;
    public z62 a;
    public oh5 b;
    public d56 c;
    public kg5 d;
    public Object e;
    public gh5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf5(d56 d56Var, kg5 kg5Var, String str, m42 m42Var) {
        super(2, m42Var);
        this.M = d56Var;
        this.N = kg5Var;
        this.O = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new wf5(this.M, this.N, this.O, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((wf5) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(15:75|(2:77|(13:79|80|(2:82|(3:84|85|(7:114|(5:117|(1:119)(1:125)|(2:121|122)(1:124)|123|115)|126|127|128|129|130)(6:88|(3:90|(1:92)(1:101)|(3:94|(1:100)|(1:99)))|102|(1:104)|105|(1:107)(4:108|109|110|111))))|133|85|(0)|114|(1:115)|126|127|128|129|130))|134|80|(0)|133|85|(0)|114|(1:115)|126|127|128|129|130) */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x054d, code lost:
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0314 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e1  */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v35, types: [vl9] */
    /* JADX WARN: Type inference failed for: r0v5, types: [vl9] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v4, types: [vl9] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3, types: [vl9] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4, types: [vl9] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v12, types: [vl9] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v24, types: [vl8, c3e] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18, types: [vl9] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [vl9] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [vl9] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [vl9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01eb -> B:76:0x0293). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0263 -> B:72:0x026c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x027a -> B:73:0x0276). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
