package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hbd  reason: default package */
/* loaded from: classes3.dex */
public final class hbd {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public hbd(String str, String str2, String str3, List list) {
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hbd) {
                hbd hbdVar = (hbd) obj;
                if (!this.a.equals(hbdVar.a) || !c16.i(this.b, hbdVar.b) || !c16.i(this.c, hbdVar.c) || !this.d.equals(hbdVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("VideoSubtitleTrack(label=", this.a, ", language=", this.b, ", type=");
        y.append(this.c);
        y.append(", entries=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
