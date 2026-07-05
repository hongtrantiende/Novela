package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zg5  reason: default package */
/* loaded from: classes3.dex */
public final class zg5 {
    public static final zg5 d = new zg5("HTTP", 3, 0);
    public static final zg5 e = new zg5("HTTP", 2, 0);
    public static final zg5 f = new zg5("HTTP", 1, 1);
    public static final zg5 g = new zg5("HTTP", 1, 0);
    public static final zg5 h = new zg5("SPDY", 3, 0);
    public static final zg5 i = new zg5("QUIC", 1, 0);
    public final String a;
    public final int b;
    public final int c;

    public zg5(String str, int i2, int i3) {
        this.a = str;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zg5) {
                zg5 zg5Var = (zg5) obj;
                if (!this.a.equals(zg5Var.a) || this.b != zg5Var.b || this.c != zg5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.a + '/' + this.b + '.' + this.c;
    }
}
