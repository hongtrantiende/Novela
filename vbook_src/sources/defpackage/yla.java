package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yla  reason: default package */
/* loaded from: classes3.dex */
public final class yla {
    public final int a;
    public final int b;
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    public yla(int i) {
        int i2 = 1 << i;
        this.a = i2;
        this.b = i2 - 1;
        this.c = new byte[i2];
        this.f = i2;
    }

    public final void a(int i) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f)) {
            this.e += i;
            this.g += i;
            this.f = i2 - i;
            return;
        }
        vs.k("Try to write more than available");
    }

    public final int b(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int min = Math.min(this.g, i2);
        int i3 = this.d;
        int i4 = 0;
        while (true) {
            int i5 = this.g;
            int i6 = this.d;
            int i7 = this.b;
            int min2 = Math.min(min, Math.min(i5, this.a - (i6 & i7)));
            if (min2 > 0) {
                que.l(i3 & i7, i, min2, this.c, bArr);
                min -= min2;
                i += min2;
                i3 += min2;
                i4 += min2;
            } else {
                int min3 = Math.min(this.g, i4);
                this.d = (this.d + min3) & i7;
                this.f += min3;
                this.g -= min3;
                return min3;
            }
        }
    }

    public final int c() {
        int i = this.g;
        if (i <= 0) {
            return -1;
        }
        int i2 = this.d;
        int i3 = this.c[i2] & 255;
        this.d = (i2 + 1) & this.b;
        this.g = i - 1;
        this.f++;
        return i3;
    }

    public final int d(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int min = Math.min(this.f, i2);
        int i3 = 0;
        while (min > 0) {
            int i4 = this.f;
            int i5 = this.e;
            int i6 = this.b;
            int min2 = Math.min(min, Math.min(i4, this.a - (i5 & i6)));
            if (min2 <= 0) {
                break;
            }
            que.l(i, this.e & i6, min2, bArr, this.c);
            a(min2);
            i += min2;
            min -= min2;
            i3 += min2;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yla) {
            int i = this.g;
            yla ylaVar = (yla) obj;
            if (i == ylaVar.g) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (this.c[(this.d + i2) & this.b] == ylaVar.c[(ylaVar.d + i2) & ylaVar.b]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 7) + this.c[(this.d + i3) & this.b];
        }
        return i2;
    }
}
