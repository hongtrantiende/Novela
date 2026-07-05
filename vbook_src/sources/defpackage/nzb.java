package defpackage;

import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nzb  reason: default package */
/* loaded from: classes3.dex */
public final class nzb {
    public final float a;
    public final float b;
    public final String c;
    public final List d;
    public final String e;
    public final List f;
    public final String g;
    public final List h;
    public final String i;
    public final int j;
    public final List k;
    public final boolean l;
    public final String m;
    public final String n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public nzb(float f, float f2, String str, List list, String str2, List list2, String str3, List list3, String str4, int i, List list4, boolean z, String str5, String str6, int i2, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = f;
        this.b = f2;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = list2;
        this.g = str3;
        this.h = list3;
        this.i = str4;
        this.j = i;
        this.k = list4;
        this.l = z;
        this.m = str5;
        this.n = str6;
        this.o = i2;
        this.p = z2;
        this.q = z3;
        this.r = z4;
    }

    public static nzb a(nzb nzbVar, float f, float f2, String str, List list, String str2, List list2, String str3, List list3, String str4, int i, List list4, boolean z, String str5, String str6, int i2, boolean z2, boolean z3, boolean z4, int i3) {
        float f3 = (i3 & 1) != 0 ? nzbVar.a : f;
        float f4 = (i3 & 2) != 0 ? nzbVar.b : f2;
        String str7 = (i3 & 4) != 0 ? nzbVar.c : str;
        List list5 = (i3 & 8) != 0 ? nzbVar.d : list;
        String str8 = (i3 & 16) != 0 ? nzbVar.e : str2;
        List list6 = (i3 & 32) != 0 ? nzbVar.f : list2;
        String str9 = (i3 & 64) != 0 ? nzbVar.g : str3;
        List list7 = (i3 & Token.CASE) != 0 ? nzbVar.h : list3;
        String str10 = (i3 & 256) != 0 ? nzbVar.i : str4;
        int i4 = (i3 & 512) != 0 ? nzbVar.j : i;
        List list8 = (i3 & 1024) != 0 ? nzbVar.k : list4;
        boolean z5 = (i3 & 2048) != 0 ? nzbVar.l : z;
        String str11 = (i3 & 4096) != 0 ? nzbVar.m : str5;
        String str12 = (i3 & 8192) != 0 ? nzbVar.n : str6;
        float f5 = f3;
        int i5 = (i3 & 16384) != 0 ? nzbVar.o : i2;
        boolean z6 = (i3 & 32768) != 0 ? nzbVar.p : z2;
        boolean z7 = (i3 & Parser.ARGC_LIMIT) != 0 ? nzbVar.q : z3;
        boolean z8 = (i3 & 131072) != 0 ? nzbVar.r : z4;
        nzbVar.getClass();
        str7.getClass();
        list5.getClass();
        str8.getClass();
        list6.getClass();
        list7.getClass();
        str10.getClass();
        list8.getClass();
        return new nzb(f5, f4, str7, list5, str8, list6, str9, list7, str10, i4, list8, z5, str11, str12, i5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nzb) {
                nzb nzbVar = (nzb) obj;
                if (Float.compare(this.a, nzbVar.a) != 0 || Float.compare(this.b, nzbVar.b) != 0 || !this.c.equals(nzbVar.c) || !c16.i(this.d, nzbVar.d) || !this.e.equals(nzbVar.e) || !c16.i(this.f, nzbVar.f) || !this.g.equals(nzbVar.g) || !c16.i(this.h, nzbVar.h) || !this.i.equals(nzbVar.i) || this.j != nzbVar.j || !c16.i(this.k, nzbVar.k) || this.l != nzbVar.l || !this.m.equals(nzbVar.m) || !this.n.equals(nzbVar.n) || this.o != nzbVar.o || this.p != nzbVar.p || this.q != nzbVar.q || this.r != nzbVar.r) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r) + eub.k(eub.k(hl5.a(this.o, eub.j(eub.j(eub.k(eub.l(hl5.a(this.j, eub.j(eub.l(eub.j(eub.l(eub.j(eub.l(eub.j(nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31, this.c), this.d, 31), 31, this.e), this.f, 31), 31, this.g), this.h, 31), 31, this.i), 31), this.k, 31), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder x = nk2.x("TextToSpeechConfigInfoState(currentSpeed=", this.a, ", currentPitch=", this.b, ", currentTTS=");
        x.append(this.c);
        x.append(", availableTTS=");
        x.append(this.d);
        x.append(", currentEngine=");
        x.append(this.e);
        x.append(", availableEngines=");
        x.append(this.f);
        x.append(", currentLanguage=");
        x.append(this.g);
        x.append(", availableLanguages=");
        x.append(this.h);
        x.append(", currentVoice=");
        a82.u(this.j, this.i, ", breakMode=", ", availableVoices=", x);
        x.append(this.k);
        x.append(", apiKeyRequired=");
        x.append(this.l);
        x.append(", availableApiKeys=");
        nk2.C(x, this.m, ", supportUrlApiKeys=", this.n, ", maxSpeechInputLength=");
        eub.w(x, this.o, ", isPlaying=", this.p, ", isEmotionEnabled=");
        x.append(this.q);
        x.append(", isPunctuationPauseEnabled=");
        x.append(this.r);
        x.append(")");
        return x.toString();
    }
}
