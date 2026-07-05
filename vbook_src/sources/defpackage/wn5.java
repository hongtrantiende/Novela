package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wn5  reason: default package */
/* loaded from: classes.dex */
public final class wn5 {
    public final long a;
    public final String b;
    public final int c;
    public final int d;

    public wn5(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
        int i = az5.c;
        this.c = (int) (j >> 32);
        this.d = (int) (j & 4294967295L);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.c);
        sb.append('x');
        sb.append(this.d);
        sb.append(",'");
        return s21.q(sb, this.b, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn5)) {
            return false;
        }
        wn5 wn5Var = (wn5) obj;
        if (az5.a(this.a, wn5Var.a) && c16.i(this.b, wn5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = az5.c;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageInfo(size=");
        sb.append(this.c);
        sb.append('x');
        sb.append(this.d);
        sb.append(", mimeType='");
        return s21.q(sb, this.b, "')");
    }
}
