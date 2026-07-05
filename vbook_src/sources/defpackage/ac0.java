package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ac0  reason: default package */
/* loaded from: classes.dex */
public final class ac0 {
    public cc0 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final bc0 a() {
        cc0 cc0Var;
        String str;
        String str2;
        if (this.e == 1 && (cc0Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new bc0(cc0Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        vs.k(s21.o("Missing required properties:", sb));
        return null;
    }
}
