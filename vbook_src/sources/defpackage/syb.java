package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: syb  reason: default package */
/* loaded from: classes3.dex */
public final class syb {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public syb(int i, boolean z, int i2, boolean z2, boolean z3, float f, float f2, boolean z4, boolean z5, String str) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = f;
        this.g = f2;
        this.h = z4;
        this.i = z5;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof syb) {
                syb sybVar = (syb) obj;
                if (this.a != sybVar.a || this.b != sybVar.b || this.c != sybVar.c || this.d != sybVar.d || this.e != sybVar.e || Float.compare(this.f, sybVar.f) != 0 || Float.compare(this.g, sybVar.g) != 0 || this.h != sybVar.h || this.i != sybVar.i || !this.j.equals(sybVar.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.j.hashCode() + eub.k(eub.k(nk2.d(this.g, nk2.d(this.f, eub.k(eub.k(hl5.a(this.c, eub.k(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Info(preloadSize=");
        sb.append(this.a);
        sb.append(", isPreloadParallel=");
        sb.append(this.b);
        sb.append(", maxSpeechInputLength=");
        eub.w(sb, this.c, ", isSupportChangeSpeedRate=", this.d, ", isSupportChangePinch=");
        sb.append(this.e);
        sb.append(", maxSpeedRate=");
        sb.append(this.f);
        sb.append(", maxPinch=");
        sb.append(this.g);
        sb.append(", isNetworkRequired=");
        sb.append(this.h);
        sb.append(", hasApiKey=");
        sb.append(this.i);
        sb.append(", supportUrl=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
