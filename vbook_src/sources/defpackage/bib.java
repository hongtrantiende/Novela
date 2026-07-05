package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bib  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bib implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ rq9 c;
    public final /* synthetic */ String d;

    public /* synthetic */ bib(String str, rq9 rq9Var, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = rq9Var;
        this.d = str2;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [cq4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [cq4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [cq4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [cq4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [cq4, java.lang.Object] */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z4 = false;
        rq9 rq9Var = this.c;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    jye.e(this.b, null, new nyb(rq9Var, new e4c(zr1.q(16)), new Object(), 120), 1, rv4Var, 3072);
                    String str = this.d;
                    if (str.length() > 0) {
                        rv4Var.e0(-2011775432);
                        jye.e(str, null, new nyb(rq9Var, new e4c(zr1.q(14)), null, Token.IMPORT), 1, rv4Var, 3072);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-2011559207);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(1 & intValue2, z2)) {
                    jye.e(this.b, null, new nyb(rq9Var, new e4c(zr1.q(16)), new Object(), 120), 2, rv4Var2, 3072);
                    ube.p(s9e.t(vy4.a, 4.0f), rv4Var2, 0);
                    jye.e(this.d, null, new nyb(rq9Var, new e4c(zr1.q(13)), null, Token.IMPORT), 2, rv4Var2, 3072);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z4)) {
                    jye.e(this.b, null, new nyb(rq9Var, new e4c(zr1.q(20)), new Object(), 120), 2, rv4Var3, 3072);
                    jye.e(this.d, null, new nyb(rq9Var, new e4c(zr1.q(16)), null, Token.IMPORT), 1, rv4Var3, 3072);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 3:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z4 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z4)) {
                    jye.e(this.b, null, new nyb(rq9Var, new e4c(zr1.q(16)), new Object(), 120), 1, rv4Var4, 3072);
                    jye.e(this.d, null, new nyb(rq9Var, new e4c(zr1.q(13)), null, Token.IMPORT), 1, rv4Var4, 3072);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var5 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var5.U(1 & intValue5, z3)) {
                    jye.e(this.b, null, new nyb(rq9Var, new e4c(zr1.q(16)), new Object(), 120), 1, rv4Var5, 3072);
                    String str2 = this.d;
                    if (str2.length() > 0) {
                        rv4Var5.e0(1040746233);
                        jye.e(str2, null, new nyb(rq9Var, new e4c(zr1.q(14)), null, Token.IMPORT), 1, rv4Var5, 3072);
                        rv4Var5.q(false);
                    } else {
                        rv4Var5.e0(1040962458);
                        rv4Var5.q(false);
                    }
                } else {
                    rv4Var5.X();
                }
                return pvcVar;
        }
    }
}
