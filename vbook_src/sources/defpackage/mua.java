package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mua  reason: default package */
/* loaded from: classes3.dex */
public final class mua extends aab implements lu4 {
    public HashMap C;
    public int D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ oua G;
    public Object a;
    public oua b;
    public w8b c;
    public bw7 d;
    public Object e;
    public kua f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mua(oua ouaVar, m42 m42Var) {
        super(2, m42Var);
        this.G = ouaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        mua muaVar = new mua(this.G, m42Var);
        muaVar.F = obj;
        return muaVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((mua) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0126, code lost:
        if (r4 != r12) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0126 -> B:57:0x0129). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mua.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
