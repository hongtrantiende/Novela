package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wk0  reason: default package */
/* loaded from: classes.dex */
public final class wk0 extends wk5 {
    public final byte[] b;

    public wk0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && wk0.class == obj.getClass()) {
                wk0 wk0Var = (wk0) obj;
                if (this.a.equals(wk0Var.a) && Arrays.equals(this.b, wk0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + eub.j(527, 31, this.a);
    }
}
