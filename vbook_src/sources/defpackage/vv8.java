package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv8  reason: default package */
/* loaded from: classes3.dex */
public final class vv8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final float g;
    public final float h;
    public final Map i;
    public final List j;
    public final Map k;

    public vv8(String str, String str2, String str3, String str4, String str5, int i, float f, float f2, Map map, List list, Map map2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = f;
        this.h = f2;
        this.i = map;
        this.j = list;
        this.k = map2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vv8) {
                vv8 vv8Var = (vv8) obj;
                if (!this.a.equals(vv8Var.a) || !this.b.equals(vv8Var.b) || !this.c.equals(vv8Var.c) || !this.d.equals(vv8Var.d) || !this.e.equals(vv8Var.e) || this.f != vv8Var.f || Float.compare(this.g, vv8Var.g) != 0 || Float.compare(this.h, vv8Var.h) != 0 || !this.i.equals(vv8Var.i) || !this.j.equals(vv8Var.j) || !this.k.equals(vv8Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.k.hashCode() + eub.l(rs8.a(nk2.d(this.h, nk2.d(this.g, hl5.a(this.f, eub.j(eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31, this.i), this.j, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("PiperConfig(name=", this.a, ", language=", this.b, ", dialect=");
        nk2.C(y, this.c, ", phonemeType=", this.d, ", espeakVoice=");
        a82.u(this.f, this.e, ", sampleRate=", ", noiseScale=", y);
        s21.D(y, this.g, ", noiseW=", this.h, ", speakerIdMap=");
        y.append(this.i);
        y.append(", speakers=");
        y.append(this.j);
        y.append(", phonemeIdMap=");
        y.append(this.k);
        y.append(")");
        return y.toString();
    }
}
