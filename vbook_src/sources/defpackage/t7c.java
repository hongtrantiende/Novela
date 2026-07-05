package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t7c  reason: default package */
/* loaded from: classes.dex */
public final class t7c {
    public final long a;
    public final vy5 b;
    public final int c;
    public hz2 d;
    public l8c e;
    public int f;
    public int g;
    public final r7c h;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, r7c] */
    public t7c(int i, long j, vy5 vy5Var) {
        this.a = j;
        this.b = vy5Var;
        this.c = i;
        ?? obj = new Object();
        obj.a = yq7.a();
        obj.b = 1.0f;
        obj.c = 255;
        this.h = obj;
    }

    public final void a() {
        b(null, 0, false);
    }

    public final void b(l8c l8cVar, int i, boolean z) {
        l8c l8cVar2 = this.e;
        if (!c16.i(l8cVar, l8cVar2)) {
            if (l8cVar2 != null) {
                l8cVar2.a();
            }
            this.e = l8cVar;
            this.f = i;
            if (l8cVar != null) {
                l8cVar.a();
            }
            r7c r7cVar = this.h;
            if (l8cVar != null && z) {
                r7cVar.getClass();
                r7cVar.a = yq7.a();
                r7cVar.a(nae.e);
                r7cVar.c = 0;
            } else if (r7cVar.b < 1.0f) {
                r7cVar.a = yq7.a();
                r7cVar.a(1.0f);
                r7cVar.c = 255;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t7c.class == obj.getClass()) {
                t7c t7cVar = (t7c) obj;
                long j = t7cVar.a;
                int i = qy5.c;
                if (this.a == j && this.b.equals(t7cVar.b) && this.c == t7cVar.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = qy5.c;
        return ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Tile(coordinate=");
        sb.append(uaf.B(this.a));
        sb.append(",srcRect=");
        vy5 vy5Var = this.b;
        sb.append(fca.E(vy5Var));
        sb.append(",srcSize=");
        sb.append(vy5Var.c - vy5Var.a);
        sb.append('x');
        sb.append(vy5Var.d - vy5Var.b);
        sb.append(",state=");
        int i = this.g;
        String str2 = "UNKNOWN";
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "UNKNOWN";
                    } else {
                        str = "ERROR";
                    }
                } else {
                    str = "LOADED";
                }
            } else {
                str = "LOADING";
            }
        } else {
            str = "NONE";
        }
        sb.append(str);
        sb.append(",from=");
        int i2 = this.f;
        if (i2 != 1) {
            if (i2 == 2) {
                str2 = "LOCAL";
            }
        } else {
            str2 = "MEMORY_CACHE";
        }
        sb.append(str2);
        sb.append(",sampleSize=");
        sb.append(this.c);
        sb.append(",bitmap=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
