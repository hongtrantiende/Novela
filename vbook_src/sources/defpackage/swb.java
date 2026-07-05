package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: swb  reason: default package */
/* loaded from: classes3.dex */
public final class swb {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public swb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static swb a(swb swbVar, int i, int i2, int i3, int i4, int i5) {
        swbVar.getClass();
        if ((i5 & 2) != 0) {
            i = swbVar.a;
        }
        if ((i5 & 4) != 0) {
            i2 = swbVar.b;
        }
        if ((i5 & 8) != 0) {
            i3 = swbVar.c;
        }
        if ((i5 & 16) != 0) {
            i4 = swbVar.d;
        }
        swbVar.getClass();
        return new swb(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof swb) {
                swb swbVar = (swb) obj;
                if (this.a != swbVar.a || this.b != swbVar.b || this.c != swbVar.c || this.d != swbVar.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.a(this.c, hl5.a(this.b, hl5.a(this.a, Boolean.hashCode(true) * 31, 31), 31), 31);
    }

    public final String toString() {
        return hl5.j(this.c, this.d, ", generalNameCount=", ")", hl5.r(this.a, this.b, "TextQtDictionaryState(isLoading=true, privVpCount=", ", privNameCount=", ", generalVpCount="));
    }
}
