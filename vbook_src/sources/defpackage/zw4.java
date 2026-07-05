package defpackage;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zw4  reason: default package */
/* loaded from: classes.dex */
public final class zw4 extends wk5 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public zw4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zw4.class == obj.getClass()) {
                zw4 zw4Var = (zw4) obj;
                if (Objects.equals(this.b, zw4Var.b) && this.c.equals(zw4Var.c) && this.d.equals(zw4Var.d) && Arrays.equals(this.e, zw4Var.e)) {
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
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + eub.j(eub.j((527 + i) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.wk5
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
