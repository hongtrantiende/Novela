package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nq3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nq3(Object obj, lu4 lu4Var, y67 y67Var, String str) {
        this.a = 12;
        this.b = obj;
        this.c = lu4Var;
        this.d = y67Var;
    }

    private final Object a(Object obj) {
        hy0 hy0Var = (hy0) this.b;
        na5 na5Var = (na5) this.d;
        ak3 ak3Var = (ak3) obj;
        ak3Var.getClass();
        ak3.h1(ak3Var, hy0Var, 0L, 0L, nae.e, null, null, 0, Token.ELSE);
        ak3.h1(ak3Var, (hy0) this.c, 0L, 0L, nae.e, null, null, 13, 62);
        long j = zl1.c;
        ak3.R0(ak3Var, j, 0L, 0L, nae.e, new s4b(ak3Var.L0(0.5f), nae.e, 0, 0, null, 30), 0, 110);
        long b = ak3Var.b();
        float intBitsToFloat = Float.intBitsToFloat((int) (b & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(na5Var.b * Float.intBitsToFloat((int) (b >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits((1.0f - na5Var.c) * intBitsToFloat));
        ak3.D0(ak3Var, zl1.e, ak3Var.L0(6.0f), floatToRawIntBits, nae.e, new s4b(ak3Var.L0(2.0f), nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
        ak3.D0(ak3Var, j, ak3Var.L0(4.0f), floatToRawIntBits, nae.e, new s4b(ak3Var.L0(1.0f), nae.e, 0, 0, null, 30), Token.ASSIGN_LOGICAL_AND);
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0519  */
    /* JADX WARN: Type inference failed for: r0v39, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [zl9, java.lang.Object] */
    @Override // defpackage.xt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r49) {
        /*
            Method dump skipped, instructions count: 3104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq3.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ nq3(m55 m55Var, String str, String str2, e49 e49Var) {
        this.a = 4;
        this.b = str;
        this.c = str2;
        this.d = e49Var;
    }

    public /* synthetic */ nq3(wb6 wb6Var, xt4 xt4Var, aw7 aw7Var) {
        this.a = 7;
        this.d = wb6Var;
        this.c = xt4Var;
        this.b = aw7Var;
    }

    public /* synthetic */ nq3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ nq3(Object obj, aw7 aw7Var, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = aw7Var;
        this.d = obj2;
    }

    public /* synthetic */ nq3(Object obj, Object obj2, xt4 xt4Var, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = xt4Var;
    }

    public /* synthetic */ nq3(Object obj, Object obj2, aw7 aw7Var, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = aw7Var;
    }
}
