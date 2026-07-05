package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vyb  reason: default package */
/* loaded from: classes3.dex */
public final class vyb {
    public final String a;
    public final String b;
    public final boolean c;

    public vyb(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vyb) {
                vyb vybVar = (vyb) obj;
                if (!this.a.equals(vybVar.a) || !this.b.equals(vybVar.b) || this.c != vybVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.m(")", nk2.y("Tts(id=", this.a, ", name=", this.b, ", isRequireNetwork="), this.c);
    }
}
