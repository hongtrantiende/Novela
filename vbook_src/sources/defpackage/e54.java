package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e54  reason: default package */
/* loaded from: classes3.dex */
public final class e54 extends aab implements lu4 {
    public HashMap C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ HashMap F;
    public final /* synthetic */ HashMap G;
    public final /* synthetic */ HashMap H;
    public final /* synthetic */ HashMap I;
    public HashMap a;
    public Object b;
    public Object c;
    public j6d d;
    public q36 e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e54(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, m42 m42Var) {
        super(2, m42Var);
        this.F = hashMap;
        this.G = hashMap2;
        this.H = hashMap3;
        this.I = hashMap4;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        e54 e54Var = new e54(this.F, this.G, this.H, this.I, m42Var);
        e54Var.E = obj;
        return e54Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((e54) create((j6d) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x020c, code lost:
        if (r13 == r5) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #0 {all -> 0x00d8, blocks: (B:11:0x0063, B:24:0x00a8, B:20:0x0094), top: B:79:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0244 -> B:75:0x0245). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e54.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
