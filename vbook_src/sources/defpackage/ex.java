package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ex  reason: default package */
/* loaded from: classes3.dex */
public final class ex {
    public final boolean a;
    public final String b;

    public ex(String str) {
        this.a = true;
        this.b = str;
    }

    public static ex a(ex exVar, String str, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = exVar.a;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            str = exVar.b;
        }
        exVar.getClass();
        str.getClass();
        return new ex(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        if (this.a == exVar.a && c16.i(this.b, exVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AppState(isLoading=" + this.a + ", languageTag=" + this.b + ")";
    }

    public ex(String str, boolean z) {
        this.a = z;
        this.b = str;
    }
}
