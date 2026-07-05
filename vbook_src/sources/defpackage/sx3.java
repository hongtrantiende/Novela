package defpackage;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sx3  reason: default package */
/* loaded from: classes.dex */
public final class sx3 implements rb7 {
    public static final vq4 g;
    public static final vq4 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        uq4 uq4Var = new uq4();
        uq4Var.n = lc7.p("application/id3");
        g = new vq4(uq4Var);
        uq4 uq4Var2 = new uq4();
        uq4Var2.n = lc7.p("application/x-scte35");
        h = new vq4(uq4Var2);
    }

    public sx3(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // defpackage.rb7
    public final vq4 a() {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return h;
            case 1:
            case 2:
                return g;
            default:
                return null;
        }
    }

    @Override // defpackage.rb7
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sx3.class == obj.getClass()) {
                sx3 sx3Var = (sx3) obj;
                if (this.c == sx3Var.c && this.d == sx3Var.d && Objects.equals(this.a, sx3Var.a) && this.b.equals(sx3Var.b) && Arrays.equals(this.e, sx3Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.f == 0) {
            String str = this.a;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int j = eub.j((527 + i) * 31, 31, this.b);
            long j2 = this.c;
            long j3 = this.d;
            this.f = Arrays.hashCode(this.e) + ((((j + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
