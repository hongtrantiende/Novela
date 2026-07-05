package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: ib  reason: default package */
/* loaded from: classes3.dex */
public final class ib {
    public static final hb Companion = new Object();
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;

    public ib(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, int i2, int i3, String str7, String str8, String str9) {
        String str10;
        String str11;
        if (47 == (i & 47)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
            }
            this.f = str5;
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str6;
            }
            if ((i & Token.CASE) == 0) {
                this.h = 22050;
            } else {
                this.h = i2;
            }
            if ((i & 256) == 0) {
                this.i = 1;
            } else {
                this.i = i3;
            }
            if ((i & 512) == 0) {
                this.j = "";
            } else {
                this.j = str7;
            }
            if ((i & 1024) == 0) {
                str10 = "vits";
            } else {
                str10 = str8;
            }
            this.k = str10;
            if ((i & 2048) == 0) {
                str11 = "onnx";
            } else {
                str11 = str9;
            }
            this.l = str11;
            return;
        }
        w92.x(i, 47, gb.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        if (c16.i(this.a, ibVar.a) && c16.i(this.b, ibVar.b) && c16.i(this.c, ibVar.c) && this.d == ibVar.d && c16.i(this.e, ibVar.e) && c16.i(this.f, ibVar.f) && c16.i(this.g, ibVar.g) && this.h == ibVar.h && this.i == ibVar.i && c16.i(this.j, ibVar.j) && c16.i(this.k, ibVar.k) && c16.i(this.l, ibVar.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(eub.j(hl5.c(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31, this.f);
        String str = this.g;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.l.hashCode() + eub.j(eub.j(hl5.a(this.i, hl5.a(this.h, (j + hashCode) * 31, 31), 31), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder y = nk2.y("AiTtsRemoteModelDto(id=", this.a, ", name=", this.b, ", language=");
        y.append(this.c);
        y.append(", sizeBytes=");
        y.append(this.d);
        nk2.C(y, ", description=", this.e, ", downloadUrl=", this.f);
        y.append(", checksum=");
        y.append(this.g);
        y.append(", sampleRate=");
        y.append(this.h);
        y.append(", numSpeakers=");
        y.append(this.i);
        y.append(", gender=");
        y.append(this.j);
        nk2.C(y, ", modelType=", this.k, ", modelFormat=", this.l);
        y.append(")");
        return y.toString();
    }
}
