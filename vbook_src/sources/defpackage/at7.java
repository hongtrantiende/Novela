package defpackage;

import java.io.Serializable;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: at7  reason: default package */
/* loaded from: classes.dex */
public final class at7 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.g = y9e.e[3 - i3];
        int i8 = y9e.f[i5];
        this.c = i8;
        int i9 = 2;
        if (i2 == 2) {
            this.c = i8 / 2;
        } else if (i2 == 0) {
            this.c = i8 / 4;
        }
        int i10 = (i >>> 9) & 1;
        int i11 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i11 = 384;
                } else {
                    p1a.g();
                    return false;
                }
            }
        } else if (i2 != 3) {
            i11 = 576;
        }
        this.f = i11;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = y9e.g[i4 - 1];
            } else {
                i7 = y9e.h[i4 - 1];
            }
            this.e = i7;
            this.b = (((i7 * 12) / this.c) + i10) * 4;
        } else {
            int i12 = Token.LABEL;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = y9e.i[i4 - 1];
                } else {
                    i6 = y9e.j[i4 - 1];
                }
                this.e = i6;
                this.b = ((i6 * Token.LABEL) / this.c) + i10;
            } else {
                int i13 = y9e.k[i4 - 1];
                this.e = i13;
                if (i3 == 1) {
                    i12 = 72;
                }
                this.b = ((i12 * i13) / this.c) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.d = i9;
        return true;
    }
}
