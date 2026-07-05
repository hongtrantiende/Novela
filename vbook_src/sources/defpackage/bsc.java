package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bsc  reason: default package */
/* loaded from: classes3.dex */
public final class bsc extends aab implements lu4 {
    public xs5 C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ csc G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ f76 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ List L;
    public Object a;
    public Object b;
    public Object c;
    public String d;
    public yk8[] e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsc(csc cscVar, String str, String str2, f76 f76Var, String str3, List list, m42 m42Var) {
        super(2, m42Var);
        this.G = cscVar;
        this.H = str;
        this.I = str2;
        this.J = f76Var;
        this.K = str3;
        this.L = list;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        bsc bscVar = new bsc(this.G, this.H, this.I, this.J, this.K, this.L, m42Var);
        bscVar.F = obj;
        return bscVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((bsc) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0131, code lost:
        if (((defpackage.zs5) r6).b(r10, r0, r23) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {all -> 0x003d, blocks: (B:11:0x0038, B:16:0x0056, B:30:0x00df, B:32:0x00e3, B:38:0x00f8, B:23:0x008d, B:26:0x00be), top: B:68:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
