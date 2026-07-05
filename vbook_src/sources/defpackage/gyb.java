package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gyb  reason: default package */
/* loaded from: classes3.dex */
public final class gyb implements fyb {
    public final ii2 a;
    public final re5 b;
    public final pb1 c;
    public final h1a d;

    public gyb(ii2 ii2Var, re5 re5Var, pb1 pb1Var, h1a h1aVar) {
        this.a = ii2Var;
        this.b = re5Var;
        this.c = pb1Var;
        this.d = h1aVar;
    }

    public final dyb a(int i, String str) {
        str.getClass();
        ii2 ii2Var = this.a;
        switch (i) {
            case 10:
                return new h68(str, ii2Var, this.b, this.c, this.d);
            case 11:
                return new aw3(str, ii2Var);
            case 12:
                return new jd3(str, ii2Var, 3);
            case 13:
                return new asc(str, ii2Var);
            case 14:
                return new jd3(str, ii2Var, 2);
            case 15:
            case 19:
            case 23:
                return new jd3(str, ii2Var, 0);
            case 16:
                return new jd3(str, ii2Var, 1);
            case 17:
                return new jd3(str, ii2Var, 5);
            case 18:
                return new jd3(str, ii2Var, 4);
            case 20:
            case 21:
            default:
                cy7.e("not support");
                return null;
            case 22:
                return new zr8(str);
        }
    }
}
