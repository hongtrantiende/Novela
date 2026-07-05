package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hf4  reason: default package */
/* loaded from: classes3.dex */
public final class hf4 extends c16 {
    public final int h;
    public final String i;

    public hf4(int i, String str) {
        this.h = i;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hf4) {
                hf4 hf4Var = (hf4) obj;
                if (this.h != hf4Var.h || !this.i.equals(hf4Var.i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() + (Integer.hashCode(this.h) * 31);
    }

    public final String toString() {
        return "Delete(position=" + this.h + ", text=" + this.i + ")";
    }
}
