package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tb0  reason: default package */
/* loaded from: classes.dex */
public final class tb0 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final ub0 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new ub0(this.e, this.a, this.d, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        vs.k(s21.o("Missing required properties:", sb));
        return null;
    }
}
