package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q1c  reason: default package */
/* loaded from: classes3.dex */
public final class q1c {
    public final String a;
    public final String b;
    public final String c;

    public q1c(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q1c) {
                q1c q1cVar = (q1c) obj;
                if (!this.a.equals(q1cVar.a) || !this.b.equals(q1cVar.b) || !this.c.equals(q1cVar.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return s21.q(nk2.y("TtsVoice(id=", this.a, ", name=", this.b, ", language="), this.c, ")");
    }
}
