package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w46  reason: default package */
/* loaded from: classes3.dex */
public final class w46 extends i56 {
    public final boolean a;
    public final String b;

    public w46(Serializable serializable, boolean z) {
        serializable.getClass();
        this.a = z;
        this.b = serializable.toString();
    }

    @Override // defpackage.i56
    public final String a() {
        return this.b;
    }

    @Override // defpackage.i56
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w46.class == obj.getClass()) {
                w46 w46Var = (w46) obj;
                if (this.a == w46Var.a && c16.i(this.b, w46Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // defpackage.i56
    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        if (z) {
            StringBuilder sb = new StringBuilder();
            w3b.a(str, sb);
            return sb.toString();
        }
        return str;
    }
}
