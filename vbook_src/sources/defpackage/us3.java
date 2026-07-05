package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: us3  reason: default package */
/* loaded from: classes.dex */
public final class us3 {
    public final bt3 a;
    public final byte[] b;

    public us3(bt3 bt3Var, byte[] bArr) {
        if (bt3Var != null) {
            if (bArr != null) {
                this.a = bt3Var;
                this.b = bArr;
                return;
            }
            xk5.k("bytes is null");
            throw null;
        }
        xk5.k("encoding is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us3)) {
            return false;
        }
        us3 us3Var = (us3) obj;
        if (!this.a.equals(us3Var.a)) {
            return false;
        }
        return Arrays.equals(this.b, us3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
