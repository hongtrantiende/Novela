package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pm3  reason: default package */
/* loaded from: classes3.dex */
public final class pm3 {
    public final xu8 a;

    public pm3(xu8 xu8Var) {
        this.a = xu8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pm3) || this.a != ((pm3) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DynamicPickMultipleVisualMediaInput(request=" + this.a + ", maxItems=null)";
    }
}
