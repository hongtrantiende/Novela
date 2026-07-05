package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: if4  reason: default package */
/* loaded from: classes3.dex */
public final class if4 extends c16 {
    public final int h;
    public final String i;

    public if4(int i, String str) {
        this.h = i;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof if4) {
                if4 if4Var = (if4) obj;
                if (this.h != if4Var.h || !this.i.equals(if4Var.i)) {
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
        return "Insert(position=" + this.h + ", text=" + this.i + ")";
    }
}
