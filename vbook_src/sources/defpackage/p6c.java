package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p6c  reason: default package */
/* loaded from: classes3.dex */
public final class p6c {
    public final c6c a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final float k;
    public final String l;
    public final int m;
    public final String n;
    public final float o;

    public p6c(c6c c6cVar, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, float f, String str2, int i3, String str3, float f2) {
        list.getClass();
        list2.getClass();
        this.a = c6cVar;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
        this.k = f;
        this.l = str2;
        this.m = i3;
        this.n = str3;
        this.o = f2;
    }

    public static p6c a(p6c p6cVar, c6c c6cVar, String str, List list, List list2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, float f, String str2, int i3, String str3, float f2, int i4) {
        c6c c6cVar2;
        String str4;
        List list3;
        List list4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6;
        float f3;
        String str5;
        int i7;
        String str6;
        float f4;
        if ((i4 & 1) != 0) {
            c6cVar2 = p6cVar.a;
        } else {
            c6cVar2 = c6cVar;
        }
        if ((i4 & 2) != 0) {
            str4 = p6cVar.b;
        } else {
            str4 = str;
        }
        if ((i4 & 4) != 0) {
            list3 = p6cVar.c;
        } else {
            list3 = list;
        }
        if ((i4 & 8) != 0) {
            list4 = p6cVar.d;
        } else {
            list4 = list2;
        }
        if ((i4 & 16) != 0) {
            i5 = p6cVar.e;
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            z5 = p6cVar.f;
        } else {
            z5 = z;
        }
        if ((i4 & 64) != 0) {
            z6 = p6cVar.g;
        } else {
            z6 = z2;
        }
        if ((i4 & Token.CASE) != 0) {
            z7 = p6cVar.h;
        } else {
            z7 = z3;
        }
        if ((i4 & 256) != 0) {
            z8 = p6cVar.i;
        } else {
            z8 = z4;
        }
        if ((i4 & 512) != 0) {
            i6 = p6cVar.j;
        } else {
            i6 = i2;
        }
        if ((i4 & 1024) != 0) {
            f3 = p6cVar.k;
        } else {
            f3 = f;
        }
        p6cVar.getClass();
        if ((i4 & 4096) != 0) {
            str5 = p6cVar.l;
        } else {
            str5 = str2;
        }
        if ((i4 & 8192) != 0) {
            i7 = p6cVar.m;
        } else {
            i7 = i3;
        }
        if ((i4 & 16384) != 0) {
            str6 = p6cVar.n;
        } else {
            str6 = str3;
        }
        if ((i4 & 32768) != 0) {
            f4 = p6cVar.o;
        } else {
            f4 = f2;
        }
        p6cVar.getClass();
        str4.getClass();
        list3.getClass();
        list4.getClass();
        str5.getClass();
        str6.getClass();
        return new p6c(c6cVar2, str4, list3, list4, i5, z5, z6, z7, z8, i6, f3, str5, i7, str6, f4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p6c) {
                p6c p6cVar = (p6c) obj;
                if (!c16.i(this.a, p6cVar.a) || !this.b.equals(p6cVar.b) || !c16.i(this.c, p6cVar.c) || !c16.i(this.d, p6cVar.d) || this.e != p6cVar.e || this.f != p6cVar.f || this.g != p6cVar.g || this.h != p6cVar.h || this.i != p6cVar.i || this.j != p6cVar.j || Float.compare(this.k, p6cVar.k) != 0 || !this.l.equals(p6cVar.l) || this.m != p6cVar.m || !this.n.equals(p6cVar.n) || Float.compare(this.o, p6cVar.o) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        c6c c6cVar = this.a;
        if (c6cVar == null) {
            hashCode = 0;
        } else {
            hashCode = c6cVar.hashCode();
        }
        return Float.hashCode(this.o) + eub.j(hl5.a(this.m, eub.j(eub.k(nk2.d(this.k, hl5.a(this.j, eub.k(eub.k(eub.k(eub.k(hl5.a(this.e, eub.l(eub.l(eub.j(hashCode * 31, 31, this.b), this.c, 31), this.d, 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31, false), 31, this.l), 31), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeSettingState(themeColor=");
        sb.append(this.a);
        sb.append(", themeId=");
        sb.append(this.b);
        sb.append(", basicColors=");
        sb.append(this.c);
        sb.append(", userColors=");
        sb.append(this.d);
        sb.append(", darkTheme=");
        eub.w(sb, this.e, ", useAmoledTheme=", this.f, ", useEInkTheme=");
        rs8.z(sb, this.g, ", useLiquidGlass=", this.h, ", useSystemColor=");
        sb.append(this.i);
        sb.append(", style=");
        sb.append(this.j);
        sb.append(", contrastLevel=");
        sb.append(this.k);
        sb.append(", isExtendedFidelity=false, fontFamily=");
        sb.append(this.l);
        sb.append(", swipeBack=");
        nk2.z(this.m, ", themeBackgroundImage=", this.n, ", themeBackgroundImageAlpha=", sb);
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
