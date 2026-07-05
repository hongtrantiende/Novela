package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eb0  reason: default package */
/* loaded from: classes.dex */
public final class eb0 extends u92 {
    public final String a;
    public final byte[] b;

    public eb0(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj != this) {
            if (obj instanceof u92) {
                u92 u92Var = (u92) obj;
                eb0 eb0Var = (eb0) u92Var;
                if (this.a.equals(eb0Var.a)) {
                    if (u92Var instanceof eb0) {
                        bArr = ((eb0) u92Var).b;
                    } else {
                        bArr = eb0Var.b;
                    }
                    if (Arrays.equals(this.b, bArr)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
