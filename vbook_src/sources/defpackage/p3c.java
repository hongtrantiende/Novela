package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p3c  reason: default package */
/* loaded from: classes3.dex */
public final class p3c {
    public final String a;
    public final int b;
    public final int c;
    public final String d;

    public p3c(String str, int i, int i2, String str2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p3c) {
                p3c p3cVar = (p3c) obj;
                if (!c16.i(this.a, p3cVar.a) || this.b != p3cVar.b || this.c != p3cVar.c || !this.d.equals(p3cVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("TextTranslateSelection(sentence=", this.a, ", selectionStart=", this.b, ", selectionEnd=");
        s.append(this.c);
        s.append(", translate=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
