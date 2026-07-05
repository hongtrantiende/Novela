package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tv4  reason: default package */
/* loaded from: classes.dex */
public final class tv4 implements rx1 {
    public final ox1 a;

    public tv4(ox1 ox1Var) {
        this.a = ox1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tv4) {
            if (this.a.equals(((tv4) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
