package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p1c  reason: default package */
/* loaded from: classes3.dex */
public final class p1c {
    public final String a;
    public final String b;

    public p1c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p1c) {
                p1c p1cVar = (p1c) obj;
                if (!this.a.equals(p1cVar.a) || !this.b.equals(p1cVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hl5.o("TtsLanguage(id=", this.a, ", name=", this.b, ")");
    }
}
