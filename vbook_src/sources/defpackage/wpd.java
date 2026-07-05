package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wpd  reason: default package */
/* loaded from: classes3.dex */
public final class wpd {
    public final String a;
    public final int b;
    public final boolean c;
    public final je3 d;
    public final int e;
    public final long f;
    public final v20 g;
    public final long h;
    public final long i;

    public wpd(String str, int i, boolean z, je3 je3Var, int i2, long j, v20 v20Var, long j2, long j3) {
        str.getClass();
        v20Var.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = je3Var;
        this.e = i2;
        this.f = j;
        this.g = v20Var;
        this.h = j2;
        this.i = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wpd) {
                wpd wpdVar = (wpd) obj;
                if (!c16.i(this.a, wpdVar.a) || this.b != wpdVar.b || this.c != wpdVar.c || !this.d.equals(wpdVar.d) || this.e != wpdVar.e || this.f != wpdVar.f || !c16.i(this.g, wpdVar.g) || this.h != wpdVar.h || this.i != wpdVar.i) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int k = eub.k(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        return Long.hashCode(this.i) + hl5.c((this.g.hashCode() + hl5.c(hl5.a(this.e, (this.d.hashCode() + k) * 31, 31), this.f, 31)) * 31, this.h, 31);
    }

    public final String toString() {
        return "ZipEntry2(path=" + this.a + ", compressionMethod=" + this.b + ", isDirectory=" + this.c + ", time=" + this.d + ", offset=" + this.e + ", inode=" + this.f + ", headerEntry=" + this.g + ", compressedSize=" + this.h + ", uncompressedSize=" + this.i + ')';
    }
}
