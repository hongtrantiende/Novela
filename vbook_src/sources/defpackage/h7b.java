package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h7b  reason: default package */
/* loaded from: classes.dex */
public final class h7b implements j7b {
    public final String a;

    public h7b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof h7b) || !this.a.equals(((h7b) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return s21.p(new StringBuilder("Error(message="), this.a, ')');
    }
}
