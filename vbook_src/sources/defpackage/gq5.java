package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gq5  reason: default package */
/* loaded from: classes3.dex */
public final class gq5 implements fq5 {
    public final ii2 a;
    public final re5 b;
    public final pb1 c;
    public final h1a d;

    public gq5(ii2 ii2Var, re5 re5Var, pb1 pb1Var, i34 i34Var, h1a h1aVar) {
        this.a = ii2Var;
        this.b = re5Var;
        this.c = pb1Var;
        this.d = h1aVar;
    }

    public final cq5 a(int i, String str) {
        str.getClass();
        ii2 ii2Var = this.a;
        if (i != 17) {
            if (i != 20) {
                if (i == 21) {
                    return new s91(str, ii2Var, 0);
                }
                cy7.e("not support");
                return null;
            }
            return new lp1(str, ii2Var, this.b, this.c, this.d);
        }
        return new s91(str, ii2Var, 1);
    }
}
