package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rhb  reason: default package */
/* loaded from: classes3.dex */
public final class rhb {
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final List i;
    public final List j;
    public final int k;

    public rhb(List list, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, List list2, List list3, int i) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = f;
        this.i = list2;
        this.j = list3;
        this.k = i;
    }

    public static rhb a(rhb rhbVar, List list, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, List list2, List list3, int i, int i2) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        float f2;
        List list4;
        List list5;
        int i3;
        if ((i2 & 1) != 0) {
            list = rhbVar.a;
        }
        List list6 = list;
        if ((i2 & 2) != 0) {
            str = rhbVar.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z = rhbVar.c;
        }
        boolean z10 = z;
        if ((i2 & 8) != 0) {
            z6 = rhbVar.d;
        } else {
            z6 = z2;
        }
        if ((i2 & 16) != 0) {
            z7 = rhbVar.e;
        } else {
            z7 = z3;
        }
        if ((i2 & 32) != 0) {
            z8 = rhbVar.f;
        } else {
            z8 = z4;
        }
        if ((i2 & 64) != 0) {
            z9 = rhbVar.g;
        } else {
            z9 = z5;
        }
        if ((i2 & Token.CASE) != 0) {
            f2 = rhbVar.h;
        } else {
            f2 = f;
        }
        if ((i2 & 256) != 0) {
            list4 = rhbVar.i;
        } else {
            list4 = list2;
        }
        if ((i2 & 512) != 0) {
            list5 = rhbVar.j;
        } else {
            list5 = list3;
        }
        if ((i2 & 1024) != 0) {
            i3 = rhbVar.k;
        } else {
            i3 = i;
        }
        rhbVar.getClass();
        list6.getClass();
        str2.getClass();
        list4.getClass();
        list5.getClass();
        return new rhb(list6, str2, z10, z6, z7, z8, z9, f2, list4, list5, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rhb) {
                rhb rhbVar = (rhb) obj;
                if (!c16.i(this.a, rhbVar.a) || !this.b.equals(rhbVar.b) || this.c != rhbVar.c || this.d != rhbVar.d || this.e != rhbVar.e || this.f != rhbVar.f || this.g != rhbVar.g || Float.compare(this.h, rhbVar.h) != 0 || !c16.i(this.i, rhbVar.i) || !c16.i(this.j, rhbVar.j) || this.k != rhbVar.k) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + eub.l(eub.l(nk2.d(this.h, eub.k(eub.k(eub.k(eub.k(eub.k(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TTSSettingState(availableTts=");
        sb.append(this.a);
        sb.append(", currentTtsId=");
        sb.append(this.b);
        sb.append(", isAlwaysExpandTTS=");
        rs8.z(sb, this.c, ", isAllowContinueWhenExit=", this.d, ", isHeadSetControl=");
        rs8.z(sb, this.e, ", isSkipFocusAudio=", this.f, ", isEnableBackgroundMusic=");
        sb.append(this.g);
        sb.append(", backgroundMusicVolume=");
        sb.append(this.h);
        sb.append(", backgroundMusicList=");
        sb.append(this.i);
        sb.append(", skipWordList=");
        sb.append(this.j);
        sb.append(", floatStyle=");
        return rs8.g(this.k, ")", sb);
    }
}
