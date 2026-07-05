package defpackage;

import android.util.Base64;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ld0  reason: default package */
/* loaded from: classes.dex */
public final class ld0 {
    public final String a;
    public final byte[] b;
    public final c69 c;

    public ld0(String str, byte[] bArr, c69 c69Var) {
        this.a = str;
        this.b = bArr;
        this.c = c69Var;
    }

    public static ij1 a() {
        ij1 ij1Var = new ij1(13, false);
        ij1Var.d = c69.a;
        return ij1Var;
    }

    public final ld0 b(c69 c69Var) {
        ij1 a = a();
        a.U(this.a);
        if (c69Var != null) {
            a.d = c69Var;
            a.c = this.b;
            return a.l();
        }
        xk5.k("Null priority");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ld0) {
            ld0 ld0Var = (ld0) obj;
            if (this.a.equals(ld0Var.a) && Arrays.equals(this.b, ld0Var.b) && this.c.equals(ld0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return s21.q(sb, encodeToString, ")");
    }
}
