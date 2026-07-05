package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zg9  reason: default package */
/* loaded from: classes.dex */
public final class zg9 {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public zg9(long j, long j2, String str) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final zg9 a(zg9 zg9Var, String str) {
        String x = voe.x(str, this.c);
        if (zg9Var != null) {
            long j = zg9Var.b;
            if (x.equals(voe.x(str, zg9Var.c))) {
                long j2 = this.b;
                long j3 = -1;
                int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                if (i != 0) {
                    long j4 = this.a;
                    if (j4 + j2 == zg9Var.a) {
                        if (j != -1) {
                            j3 = j2 + j;
                        }
                        return new zg9(j4, j3, x);
                    }
                }
                if (j != -1) {
                    long j5 = zg9Var.a;
                    if (j5 + j == this.a) {
                        if (i != 0) {
                            j3 = j + j2;
                        }
                        return new zg9(j5, j3, x);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zg9.class == obj.getClass()) {
                zg9 zg9Var = (zg9) obj;
                if (this.a == zg9Var.a && this.b == zg9Var.b && this.c.equals(zg9Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return hl5.q(sb, this.b, ")");
    }
}
