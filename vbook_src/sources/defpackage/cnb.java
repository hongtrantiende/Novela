package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cnb  reason: default package */
/* loaded from: classes3.dex */
public final class cnb {
    public final int a;
    public final String b;
    public final int c;

    public cnb(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public static cnb a(cnb cnbVar, int i, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = cnbVar.a;
        }
        if ((i3 & 2) != 0) {
            str = cnbVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = cnbVar.c;
        }
        cnbVar.getClass();
        str.getClass();
        return new cnb(i, str, i2);
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cnb) {
                cnb cnbVar = (cnb) obj;
                if (this.a != cnbVar.a || !this.b.equals(cnbVar.b) || this.c != cnbVar.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + eub.j(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.g(this.c, ")", s21.r("TextChapterState(currentChapterIndex=", this.a, ", currentChapterName=", this.b, ", totalChapter="));
    }
}
