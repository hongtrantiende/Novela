package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n1c  reason: default package */
/* loaded from: classes3.dex */
public final class n1c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public n1c(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = z2;
    }

    public static n1c a(n1c n1cVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        if ((i & 1) != 0) {
            str = n1cVar.a;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = n1cVar.b;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = n1cVar.c;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = n1cVar.d;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = n1cVar.e;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = n1cVar.f;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            z3 = n1cVar.g;
        } else {
            z3 = z;
        }
        if ((i & Token.CASE) != 0) {
            z4 = n1cVar.h;
        } else {
            z4 = z2;
        }
        n1cVar.getClass();
        str7.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        return new n1c(str7, str8, str9, str10, str11, str12, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n1c) {
                n1c n1cVar = (n1c) obj;
                if (!this.a.equals(n1cVar.a) || !this.b.equals(n1cVar.b) || !this.c.equals(n1cVar.c) || !this.d.equals(n1cVar.d) || !this.e.equals(n1cVar.e) || !this.f.equals(n1cVar.f) || this.g != n1cVar.g || this.h != n1cVar.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + eub.k(eub.j(eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TextToSpeechInfoState(bookId=", this.a, ", bookName=", this.b, ", authorName=");
        nk2.C(y, this.c, ", chapterName=", this.d, ", bookPath=");
        nk2.C(y, this.e, ", coverPath=", this.f, ", isExpand=");
        y.append(this.g);
        y.append(", isRunning=");
        y.append(this.h);
        y.append(")");
        return y.toString();
    }
}
