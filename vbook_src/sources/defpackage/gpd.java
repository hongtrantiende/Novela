package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gpd  reason: default package */
/* loaded from: classes3.dex */
public final class gpd implements bc4 {
    public final g1 a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final lh8 e;

    public gpd(lh8 lh8Var) {
        Integer num;
        tw4 tw4Var = mpd.a;
        Integer valueOf = Integer.valueOf(lh8Var != lh8.a ? 1 : 4);
        if (lh8Var == lh8.b) {
            num = 4;
        } else {
            num = null;
        }
        tw4Var.getClass();
        this.a = tw4Var;
        this.b = valueOf;
        this.c = num;
        this.d = 4;
        this.e = lh8Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yq4] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, yq4] */
    @Override // defpackage.bc4
    public final yq4 a() {
        int i;
        this.a.a();
        Integer num = this.b;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        ?? obj = new Object();
        if (i >= 0) {
            if (i <= 9) {
                if (this.c != null) {
                    return new Object();
                }
                return obj;
            }
            p1a.k(hl5.l("The minimum number of digits (", ") exceeds the length of an Int", i));
            return null;
        }
        p1a.k(hl5.l("The minimum number of digits (", ") is negative", i));
        return null;
    }

    @Override // defpackage.bc4
    public final zm8 b() {
        g1 g1Var = this.a;
        o89 a = g1Var.a();
        String c = g1Var.c();
        a.getClass();
        c.getClass();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList C = tl1.C(qye.p(num, null, num2, a, c, true));
        Integer num3 = this.d;
        ks3 ks3Var = ks3.a;
        if (num3 != null) {
            C.add(qye.p(num, num3, num2, a, c, false));
            C.add(new zm8(tl1.B(new vw8("+"), new z68(tl1.A(new ixc(Integer.valueOf(num3.intValue() + 1), null, a, c, false)))), ks3Var));
        } else {
            C.add(qye.p(num, null, num2, a, c, false));
        }
        return new zm8(ks3Var, C);
    }

    @Override // defpackage.bc4
    public final g1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gpd) {
            if (this.e == ((gpd) obj).e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.e.hashCode() * 31);
    }
}
