package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cl5  reason: default package */
/* loaded from: classes.dex */
public final class cl5 {
    public final String a;
    public final float b;

    public cl5(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cl5) {
                cl5 cl5Var = (cl5) obj;
                if (!this.a.equals(cl5Var.a) || Float.compare(this.b, cl5Var.b) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdentifiedLanguage(languageTag=" + this.a + ", confidence=" + this.b + ")";
    }
}
