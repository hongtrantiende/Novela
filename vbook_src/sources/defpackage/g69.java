package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g69  reason: default package */
/* loaded from: classes.dex */
public final class g69 extends wk5 {
    public final String b;
    public final byte[] c;

    public g69(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g69.class == obj.getClass()) {
                g69 g69Var = (g69) obj;
                if (this.b.equals(g69Var.b) && Arrays.equals(this.c, g69Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + eub.j(527, 31, this.b);
    }

    @Override // defpackage.wk5
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
