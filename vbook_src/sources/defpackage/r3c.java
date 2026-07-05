package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r3c  reason: default package */
/* loaded from: classes3.dex */
public final class r3c {
    public final String a;
    public final int b;
    public final boolean c;

    public r3c(int i, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r3c) {
                r3c r3cVar = (r3c) obj;
                if (!c16.i(this.a, r3cVar.a) || this.b != r3cVar.b || this.c != r3cVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rs8.m(")", s21.s("TextTranslateWord(text=", this.a, ", type=", this.b, ", isPriv="), this.c);
    }
}
