package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xpd  reason: default package */
/* loaded from: classes3.dex */
public final class xpd {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;

    public xpd(long j, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        bArr.getClass();
        bArr2.getClass();
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = bArr;
        this.g = bArr2;
        this.h = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xpd) {
                xpd xpdVar = (xpd) obj;
                if (this.a != xpdVar.a || this.b != xpdVar.b || this.c != xpdVar.c || this.d != xpdVar.d || this.e != xpdVar.e || !c16.i(this.f, xpdVar.f) || !c16.i(this.g, xpdVar.g) || !this.h.equals(xpdVar.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = hl5.a(this.e, hl5.a(this.d, hl5.a(this.c, hl5.a(0, hl5.a(0, hl5.a(this.b, hl5.a(8, hl5.c(hl5.a(20, Integer.hashCode(788) * 31, 31), this.a, 31), 31), 31), 31), 31), 31), 31), 31);
        return Arrays.hashCode(this.h) + hl5.a(0, hl5.a(0, hl5.a(0, (Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + a) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ZipEntry(versionMadeBy=788, extractVersion=20, headerOffset=" + this.a + ", compressionMethod=8, flags=" + this.b + ", date=0, time=0, crc32=" + this.c + ", compressedSize=" + this.d + ", uncompressedSize=" + this.e + ", nameBytes=" + Arrays.toString(this.f) + ", extraBytes=" + Arrays.toString(this.g) + ", diskNumberStart=0, internalAttributes=0, externalAttributes=0, commentBytes=" + Arrays.toString(this.h) + ')';
    }
}
