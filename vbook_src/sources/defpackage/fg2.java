package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fg2  reason: default package */
/* loaded from: classes.dex */
public final class fg2 extends ih0 {
    public int C;
    public int D;
    public mg2 e;
    public byte[] f;

    @Override // defpackage.jg2
    public final void close() {
        if (this.f != null) {
            this.f = null;
            c();
        }
        this.e = null;
    }

    @Override // defpackage.jg2
    public final long d(mg2 mg2Var) {
        g();
        this.e = mg2Var;
        Uri uri = mg2Var.a;
        long j = mg2Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        wq9.u("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = a2d.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str2, 0);
                } catch (IllegalArgumentException e) {
                    throw new xm8(s21.m("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                this.f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j2 = mg2Var.e;
            byte[] bArr = this.f;
            if (j2 <= bArr.length) {
                int i = (int) j2;
                this.C = i;
                int length = bArr.length - i;
                this.D = length;
                int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i2 != 0) {
                    this.D = (int) Math.min(length, j);
                }
                k(mg2Var);
                if (i2 != 0) {
                    return j;
                }
                return this.D;
            }
            this.f = null;
            throw new kg2(2008);
        }
        throw new xm8("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.D;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = a2d.a;
        System.arraycopy(bArr2, this.C, bArr, i, min);
        this.C += min;
        this.D -= min;
        b(min);
        return min;
    }

    @Override // defpackage.jg2
    public final Uri t() {
        mg2 mg2Var = this.e;
        if (mg2Var != null) {
            return mg2Var.a;
        }
        return null;
    }
}
