package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nr4  reason: default package */
/* loaded from: classes3.dex */
public final class nr4 implements bc4 {
    public static final List g = tl1.B(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public static final List h = tl1.B(2, 1, 0, 2, 1, 0, 2, 1, 0);
    public final g1 a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final int f;

    public nr4() {
        List list = g;
        list.getClass();
        tw4 tw4Var = p9c.d;
        tw4Var.getClass();
        this.a = tw4Var;
        this.b = 1;
        this.c = 9;
        this.d = list;
        this.e = 1;
        this.f = 9;
    }

    @Override // defpackage.bc4
    public final yq4 a() {
        return new wy1(new mz1(1, this.a.a(), o89.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0, 6), this.b, this.c, this.d);
    }

    @Override // defpackage.bc4
    public final zm8 b() {
        g1 g1Var = this.a;
        return new zm8(tl1.A(new z68(tl1.A(new mr4(this.b, this.c, g1Var.a(), g1Var.c())))), ks3.a);
    }

    @Override // defpackage.bc4
    public final g1 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nr4) {
            nr4 nr4Var = (nr4) obj;
            if (this.e == nr4Var.e && this.f == nr4Var.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.e * 31) + this.f;
    }
}
