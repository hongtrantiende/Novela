package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ds6  reason: default package */
/* loaded from: classes.dex */
public final class ds6 extends eo4 {
    public final mce f;

    public ds6(mce mceVar) {
        this.f = mceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds6)) {
            return false;
        }
        if (this.f == ((ds6) obj).f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ")";
    }
}
