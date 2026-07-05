package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s6d  reason: default package */
/* loaded from: classes3.dex */
public final class s6d {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final float h;
    public final float i;
    public final long j;
    public final long k;
    public final int l;
    public final float m;
    public final boolean n;
    public final float o;
    public final float p;
    public final int q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final float u;
    public final boolean v;
    public final boolean w;

    public s6d(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, long j, long j2, int i4, float f3, boolean z5, float f4, float f5, int i5, int i6, boolean z6, boolean z7, float f6, boolean z8, boolean z9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = f;
        this.i = f2;
        this.j = j;
        this.k = j2;
        this.l = i4;
        this.m = f3;
        this.n = z5;
        this.o = f4;
        this.p = f5;
        this.q = i5;
        this.r = i6;
        this.s = z6;
        this.t = z7;
        this.u = f6;
        this.v = z8;
        this.w = z9;
    }

    public static s6d a(s6d s6dVar, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, float f, float f2, long j, long j2, int i4, float f3, boolean z5, float f4, float f5, int i5, int i6, boolean z6, boolean z7, float f6, boolean z8, boolean z9, int i7) {
        int i8 = (i7 & 1) != 0 ? s6dVar.a : i;
        int i9 = (i7 & 2) != 0 ? s6dVar.b : i2;
        int i10 = (i7 & 4) != 0 ? s6dVar.c : i3;
        boolean z10 = (i7 & 8) != 0 ? s6dVar.d : z;
        boolean z11 = (i7 & 16) != 0 ? s6dVar.e : z2;
        boolean z12 = (i7 & 32) != 0 ? s6dVar.f : z3;
        boolean z13 = (i7 & 64) != 0 ? s6dVar.g : z4;
        float f7 = (i7 & Token.CASE) != 0 ? s6dVar.h : f;
        float f8 = (i7 & 256) != 0 ? s6dVar.i : f2;
        long j3 = (i7 & 512) != 0 ? s6dVar.j : j;
        long j4 = (i7 & 1024) != 0 ? s6dVar.k : j2;
        int i11 = (i7 & 2048) != 0 ? s6dVar.l : i4;
        int i12 = i8;
        float f9 = (i7 & 4096) != 0 ? s6dVar.m : f3;
        boolean z14 = (i7 & 8192) != 0 ? s6dVar.n : z5;
        float f10 = (i7 & 16384) != 0 ? s6dVar.o : f4;
        float f11 = (i7 & 32768) != 0 ? s6dVar.p : f5;
        int i13 = (i7 & Parser.ARGC_LIMIT) != 0 ? s6dVar.q : i5;
        int i14 = (i7 & 131072) != 0 ? s6dVar.r : i6;
        boolean z15 = (i7 & 262144) != 0 ? s6dVar.s : z6;
        boolean z16 = (i7 & 524288) != 0 ? s6dVar.t : z7;
        float f12 = (i7 & 1048576) != 0 ? s6dVar.u : f6;
        boolean z17 = (i7 & 2097152) != 0 ? s6dVar.v : z8;
        boolean z18 = (i7 & 4194304) != 0 ? s6dVar.w : z9;
        s6dVar.getClass();
        return new s6d(i12, i9, i10, z10, z11, z12, z13, f7, f8, j3, j4, i11, f9, z14, f10, f11, i13, i14, z15, z16, f12, z17, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6d)) {
            return false;
        }
        s6d s6dVar = (s6d) obj;
        if (this.a == s6dVar.a && this.b == s6dVar.b && this.c == s6dVar.c && this.d == s6dVar.d && this.e == s6dVar.e && this.f == s6dVar.f && this.g == s6dVar.g && Float.compare(this.h, s6dVar.h) == 0 && Float.compare(this.i, s6dVar.i) == 0 && this.j == s6dVar.j && this.k == s6dVar.k && this.l == s6dVar.l && Float.compare(this.m, s6dVar.m) == 0 && this.n == s6dVar.n && Float.compare(this.o, s6dVar.o) == 0 && Float.compare(this.p, s6dVar.p) == 0 && this.q == s6dVar.q && this.r == s6dVar.r && this.s == s6dVar.s && this.t == s6dVar.t && Float.compare(this.u, s6dVar.u) == 0 && this.v == s6dVar.v && this.w == s6dVar.w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + eub.k(nk2.d(this.u, eub.k(eub.k(hl5.a(this.r, hl5.a(this.q, nk2.d(this.p, nk2.d(this.o, eub.k(nk2.d(this.m, hl5.a(this.l, hl5.c(hl5.c(nk2.d(this.i, nk2.d(this.h, eub.k(eub.k(eub.k(eub.k(hl5.a(this.c, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31), this.j, 31), this.k, 31), 31), 31), 31, this.n), 31), 31), 31), 31), 31, this.s), 31, this.t), 31), 31, this.v);
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "VideoConfigState(darkMode=", ", screenOrientation=", ", resizeMode=");
        eub.w(r, this.c, ", isAutoPlay=", this.d, ", isAutoNextEpisode=");
        rs8.z(r, this.e, ", isAutoResumeLastPosition=", this.f, ", isShowSubtitle=");
        r.append(this.g);
        r.append(", subtitleTextSize=");
        r.append(this.h);
        r.append(", subtitleBackgroundOpacity=");
        r.append(this.i);
        r.append(", subtitleTextColor=");
        r.append(this.j);
        rs8.x(r, ", subtitleBackgroundColor=", this.k, ", subtitleFontWeight=");
        r.append(this.l);
        r.append(", subtitlePadding=");
        r.append(this.m);
        r.append(", isMuted=");
        r.append(this.n);
        r.append(", defaultVolume=");
        r.append(this.o);
        r.append(", playbackSpeed=");
        r.append(this.p);
        r.append(", seekForwardSeconds=");
        r.append(this.q);
        r.append(", seekBackwardSeconds=");
        eub.w(r, this.r, ", isAlwaysScreenOn=", this.s, ", isAutoBrightness=");
        r.append(this.t);
        r.append(", brightness=");
        r.append(this.u);
        r.append(", isLockOrientationWhenFullscreen=");
        r.append(this.v);
        r.append(", isContinuePlayInPip=");
        r.append(this.w);
        r.append(")");
        return r.toString();
    }
}
