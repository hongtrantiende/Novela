package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ub6  reason: default package */
/* loaded from: classes3.dex */
public final class ub6 implements of9 {
    public final String a;

    public ub6(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ub6.class == obj.getClass()) {
            return c16.i(this.a, ((ub6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("LanguageQualifier(language='", this.a, "')");
    }
}
