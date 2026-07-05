package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uyb  reason: default package */
/* loaded from: classes3.dex */
public final class uyb {
    public final String a;
    public final int b;
    public final int c;

    public uyb(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static uyb a(uyb uybVar, String str) {
        int i = uybVar.b;
        int i2 = uybVar.c;
        str.getClass();
        return new uyb(str, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uyb) {
                uyb uybVar = (uyb) obj;
                if (!this.a.equals(uybVar.a) || this.b != uybVar.b || this.c != uybVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.g(this.c, ")", s21.s("Sentence(text=", this.a, ", start=", this.b, ", end="));
    }
}
