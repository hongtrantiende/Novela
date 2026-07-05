package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lb0  reason: default package */
/* loaded from: classes.dex */
public final class lb0 {
    public long a;
    public String b;
    public ga2 c;
    public ha2 d;
    public ia2 e;
    public la2 f;
    public byte g;

    public final mb0 a() {
        String str;
        ga2 ga2Var;
        ha2 ha2Var;
        if (this.g == 1 && (str = this.b) != null && (ga2Var = this.c) != null && (ha2Var = this.d) != null) {
            return new mb0(this.a, str, ga2Var, ha2Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        vs.k(s21.o("Missing required properties:", sb));
        return null;
    }
}
