package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ozb  reason: default package */
/* loaded from: classes3.dex */
public final class ozb {
    public final float a;
    public final float b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final List g;
    public final int h;

    public ozb(float f, float f2, long j, boolean z, boolean z2, float f3, List list, int i) {
        list.getClass();
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = f3;
        this.g = list;
        this.h = i;
    }

    public static ozb a(ozb ozbVar, float f, float f2, long j, boolean z, boolean z2, float f3, List list, int i, int i2) {
        boolean z3;
        float f4;
        List list2;
        int i3;
        if ((i2 & 1) != 0) {
            f = ozbVar.a;
        }
        float f5 = f;
        if ((i2 & 2) != 0) {
            f2 = ozbVar.b;
        }
        float f6 = f2;
        ozbVar.getClass();
        if ((i2 & 8) != 0) {
            j = ozbVar.c;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            z = ozbVar.d;
        }
        boolean z4 = z;
        if ((i2 & 32) != 0) {
            z3 = ozbVar.e;
        } else {
            z3 = z2;
        }
        if ((i2 & 64) != 0) {
            f4 = ozbVar.f;
        } else {
            f4 = f3;
        }
        if ((i2 & Token.CASE) != 0) {
            list2 = ozbVar.g;
        } else {
            list2 = list;
        }
        if ((i2 & 256) != 0) {
            i3 = ozbVar.h;
        } else {
            i3 = i;
        }
        ozbVar.getClass();
        list2.getClass();
        return new ozb(f5, f6, j2, z4, z3, f4, list2, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ozb) {
                ozb ozbVar = (ozb) obj;
                if (Float.compare(this.a, ozbVar.a) != 0 || Float.compare(this.b, ozbVar.b) != 0 || Float.compare(1.0f, 1.0f) != 0 || this.c != ozbVar.c || this.d != ozbVar.d || this.e != ozbVar.e || Float.compare(this.f, ozbVar.f) != 0 || !c16.i(this.g, ozbVar.g) || this.h != ozbVar.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + eub.l(nk2.d(this.f, eub.k(eub.k(hl5.c(nk2.d(1.0f, nk2.d(this.b, Float.hashCode(this.a) * 31, 31), 31), this.c, 31), 31, this.d), 31, this.e), 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder x = nk2.x("TextToSpeechConfigState(speed=", this.a, ", pitch=", this.b, ", volume=1.0, offTime=");
        x.append(this.c);
        x.append(", isSaveOffTime=");
        x.append(this.d);
        x.append(", isEnableBackgroundMusic=");
        x.append(this.e);
        x.append(", backgroundMusicVolume=");
        x.append(this.f);
        x.append(", backgroundMusicList=");
        x.append(this.g);
        x.append(", floatStyle=");
        x.append(this.h);
        x.append(")");
        return x.toString();
    }
}
