package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fbd  reason: default package */
/* loaded from: classes3.dex */
public final class fbd {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;
    public final int e;
    public final xic f;
    public final List g;
    public final int h;
    public final List i;
    public final int j;

    public fbd(boolean z, boolean z2, String str, List list, int i, xic xicVar, List list2, int i2, List list3, int i3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = list;
        this.e = i;
        this.f = xicVar;
        this.g = list2;
        this.h = i2;
        this.i = list3;
        this.j = i3;
    }

    public static fbd a(fbd fbdVar, boolean z, boolean z2, String str, List list, int i, xic xicVar, List list2, int i2, List list3, int i3, int i4) {
        int i5;
        xic xicVar2;
        List list4;
        int i6;
        List list5;
        int i7;
        if ((i4 & 1) != 0) {
            z = fbdVar.a;
        }
        boolean z3 = z;
        if ((i4 & 2) != 0) {
            z2 = fbdVar.b;
        }
        boolean z4 = z2;
        if ((i4 & 4) != 0) {
            str = fbdVar.c;
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            list = fbdVar.d;
        }
        List list6 = list;
        if ((i4 & 16) != 0) {
            i5 = fbdVar.e;
        } else {
            i5 = i;
        }
        if ((i4 & 32) != 0) {
            xicVar2 = fbdVar.f;
        } else {
            xicVar2 = xicVar;
        }
        if ((i4 & 64) != 0) {
            list4 = fbdVar.g;
        } else {
            list4 = list2;
        }
        if ((i4 & Token.CASE) != 0) {
            i6 = fbdVar.h;
        } else {
            i6 = i2;
        }
        if ((i4 & 256) != 0) {
            list5 = fbdVar.i;
        } else {
            list5 = list3;
        }
        if ((i4 & 512) != 0) {
            i7 = fbdVar.j;
        } else {
            i7 = i3;
        }
        fbdVar.getClass();
        list6.getClass();
        list4.getClass();
        list5.getClass();
        return new fbd(z3, z4, str2, list6, i5, xicVar2, list4, i6, list5, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbd)) {
            return false;
        }
        fbd fbdVar = (fbd) obj;
        if (this.a == fbdVar.a && this.b == fbdVar.b && c16.i(this.c, fbdVar.c) && c16.i(this.d, fbdVar.d) && this.e == fbdVar.e && c16.i(this.f, fbdVar.f) && c16.i(this.g, fbdVar.g) && this.h == fbdVar.h && c16.i(this.i, fbdVar.i) && this.j == fbdVar.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a = hl5.a(this.e, eub.l((k + hashCode) * 31, this.d, 31), 31);
        xic xicVar = this.f;
        if (xicVar != null) {
            i = xicVar.hashCode();
        }
        return Integer.hashCode(this.j) + eub.l(hl5.a(this.h, eub.l((a + i) * 31, this.g, 31), 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("VideoState(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        p.append(this.c);
        p.append(", tracks=");
        p.append(this.d);
        p.append(", trackIndex=");
        p.append(this.e);
        p.append(", trackContent=");
        p.append(this.f);
        p.append(", audioTracks=");
        p.append(this.g);
        p.append(", selectedAudioIndex=");
        p.append(this.h);
        p.append(", subtitleTracks=");
        p.append(this.i);
        p.append(", selectedSubtitleIndex=");
        p.append(this.j);
        p.append(")");
        return p.toString();
    }
}
