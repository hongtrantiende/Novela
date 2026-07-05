package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq4  reason: default package */
/* loaded from: classes.dex */
public final class vq4 {
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final gm1 E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public int Q;
    public final String a;
    public final String b;
    public final qs5 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final tb7 l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List r;
    public final zk3 s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new uq4().a();
        a2d.K(0);
        a2d.K(1);
        a2d.K(2);
        a2d.K(3);
        a2d.K(4);
        a82.s(5, 6, 7, 8, 9);
        a82.s(10, 11, 12, 13, 14);
        a82.s(15, 16, 17, 18, 19);
        a82.s(20, 21, 22, 23, 24);
        a82.s(25, 26, 27, 28, 29);
        a82.s(30, 31, 32, 33, 34);
        a2d.K(35);
        a2d.K(36);
        a2d.K(37);
    }

    public vq4(uq4 uq4Var) {
        boolean z;
        String str;
        boolean z2;
        this.a = uq4Var.a;
        String R = a2d.R(uq4Var.d);
        this.d = R;
        if (uq4Var.c.isEmpty() && uq4Var.b != null) {
            this.c = qs5.r(new za6(R, uq4Var.b));
            this.b = uq4Var.b;
        } else if (!uq4Var.c.isEmpty() && uq4Var.b == null) {
            qs5 qs5Var = uq4Var.c;
            this.c = qs5Var;
            int size = qs5Var.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = qs5Var.get(i);
                    i++;
                    za6 za6Var = (za6) obj;
                    if (TextUtils.equals(za6Var.a, R)) {
                        str = za6Var.b;
                        break;
                    }
                } else {
                    str = ((za6) qs5Var.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!uq4Var.c.isEmpty() || uq4Var.b != null) {
                for (int i2 = 0; i2 < uq4Var.c.size(); i2++) {
                    if (!((za6) uq4Var.c.get(i2)).b.equals(uq4Var.b)) {
                    }
                }
                z = false;
                wq9.D(z);
                this.c = uq4Var.c;
                this.b = uq4Var.b;
            }
            z = true;
            wq9.D(z);
            this.c = uq4Var.c;
            this.b = uq4Var.b;
        }
        this.e = uq4Var.e;
        if (uq4Var.g != 0 && (uq4Var.f & 32768) == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        wq9.C("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z2);
        this.f = uq4Var.f;
        this.g = uq4Var.g;
        int i3 = uq4Var.h;
        this.h = i3;
        int i4 = uq4Var.i;
        this.i = i4;
        this.j = i4 != -1 ? i4 : i3;
        this.k = uq4Var.j;
        this.l = uq4Var.k;
        this.m = uq4Var.l;
        this.n = uq4Var.m;
        this.o = uq4Var.n;
        this.p = uq4Var.o;
        this.q = uq4Var.p;
        List list = uq4Var.q;
        this.r = list == null ? Collections.EMPTY_LIST : list;
        zk3 zk3Var = uq4Var.r;
        this.s = zk3Var;
        this.t = uq4Var.s;
        this.u = uq4Var.t;
        this.v = uq4Var.u;
        this.w = uq4Var.v;
        this.x = uq4Var.w;
        this.y = uq4Var.x;
        this.z = uq4Var.y;
        int i5 = uq4Var.z;
        this.A = i5 == -1 ? 0 : i5;
        float f = uq4Var.A;
        this.B = f == -1.0f ? 1.0f : f;
        this.C = uq4Var.B;
        this.D = uq4Var.C;
        this.E = uq4Var.D;
        this.F = uq4Var.E;
        this.G = uq4Var.F;
        this.H = uq4Var.G;
        this.I = uq4Var.H;
        int i6 = uq4Var.I;
        this.J = i6 == -1 ? 0 : i6;
        int i7 = uq4Var.J;
        this.K = i7 != -1 ? i7 : 0;
        this.L = uq4Var.K;
        this.M = uq4Var.L;
        this.N = uq4Var.M;
        this.O = uq4Var.N;
        int i8 = uq4Var.O;
        if (i8 == 0 && zk3Var != null) {
            this.P = 1;
        } else {
            this.P = i8;
        }
    }

    public static String c(vq4 vq4Var) {
        int i;
        String str;
        String str2;
        String str3;
        if (vq4Var == null) {
            return "null";
        }
        int i2 = vq4Var.e;
        qs5 qs5Var = vq4Var.c;
        String str4 = vq4Var.d;
        int i3 = vq4Var.H;
        int i4 = vq4Var.G;
        int i5 = vq4Var.F;
        float f = vq4Var.z;
        gm1 gm1Var = vq4Var.E;
        float f2 = vq4Var.B;
        int i6 = vq4Var.y;
        int i7 = vq4Var.x;
        int i8 = vq4Var.w;
        int i9 = vq4Var.v;
        zk3 zk3Var = vq4Var.s;
        String str5 = vq4Var.k;
        int i10 = vq4Var.j;
        String str6 = vq4Var.m;
        String str7 = vq4Var.n;
        int i11 = vq4Var.f;
        lie lieVar = new lie(String.valueOf(','), 2);
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(vq4Var.a);
        sb.append(", mimeType=");
        sb.append(vq4Var.o);
        if (str7 != null) {
            sb.append(", container=");
            sb.append(str7);
        }
        if (str6 != null) {
            sb.append(", primaryGroupId=");
            sb.append(str6);
        }
        if (i10 != -1) {
            sb.append(", bitrate=");
            sb.append(i10);
        }
        if (str5 != null) {
            sb.append(", codecs=");
            sb.append(str5);
        }
        if (zk3Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < zk3Var.d; i12++) {
                UUID uuid = zk3Var.a[i12].b;
                if (uuid.equals(h31.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(h31.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(h31.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(h31.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(h31.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sb.append(", drm=[");
            lieVar.a(sb, linkedHashSet.iterator());
            sb.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            a82.t(i9, i8, ", res=", "x", sb);
        }
        if (i7 != -1 && i6 != -1) {
            a82.t(i7, i6, ", decRes=", "x", sb);
        }
        double d = f2;
        int i13 = we3.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            String str8 = a2d.a;
            sb.append(String.format(Locale.US, "%.3f", Float.valueOf(f2)));
        }
        if (gm1Var != null) {
            int i14 = gm1Var.f;
            int i15 = gm1Var.e;
            if ((i15 != -1 && i14 != -1) || gm1Var.d()) {
                sb.append(", color=");
                if (gm1Var.d()) {
                    String b = gm1.b(gm1Var.a);
                    String a = gm1.a(gm1Var.b);
                    String c = gm1.c(gm1Var.c);
                    Locale locale = Locale.US;
                    str2 = b + "/" + a + "/" + c;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i15 != -1 && i14 != -1) {
                    str3 = i15 + "/" + i14;
                } else {
                    str3 = "NA/NA";
                }
                sb.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            sb.append(", fps=");
            sb.append(f);
        }
        if (i5 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i5);
        }
        if (i4 != -1) {
            sb.append(", channels=");
            sb.append(i4);
        }
        if (i3 != -1) {
            sb.append(", sample_rate=");
            sb.append(i3);
        }
        if (str4 != null) {
            sb.append(", language=");
            sb.append(str4);
        }
        if (!qs5Var.isEmpty()) {
            sb.append(", labels=[");
            lieVar.a(sb, uue.F(qs5Var, new uz0(7)).iterator());
            sb.append("]");
        }
        if (i2 != 0) {
            sb.append(", selectionFlags=[");
            String str9 = a2d.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            lieVar.a(sb, arrayList.iterator());
            sb.append("]");
        }
        if (i11 != 0) {
            sb.append(", roleFlags=[");
            String str10 = a2d.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & Token.CASE) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            lieVar.a(sb, arrayList2.iterator());
            sb.append("]");
        } else {
            i = i11;
        }
        if ((32768 & i) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i16 = vq4Var.g;
            String str11 = a2d.a;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                str = "depth metadata";
                            } else {
                                vs.k("Unsupported auxiliary track type");
                                return null;
                            }
                        } else {
                            str = "depth-inverse";
                        }
                    } else {
                        str = "depth-linear";
                    }
                } else {
                    str = "original";
                }
            } else {
                str = "undefined";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [uq4, java.lang.Object] */
    public final uq4 a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        obj.J = this.K;
        obj.K = this.L;
        obj.L = this.M;
        obj.M = this.N;
        obj.N = this.O;
        obj.O = this.P;
        return obj;
    }

    public final boolean b(vq4 vq4Var) {
        List list = this.r;
        if (list.size() != vq4Var.r.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) vq4Var.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final vq4 d(vq4 vq4Var) {
        String str;
        String str2;
        zk3 zk3Var;
        int i;
        int i2;
        if (this == vq4Var) {
            return this;
        }
        int i3 = lc7.i(this.o);
        String str3 = vq4Var.a;
        qs5 qs5Var = vq4Var.c;
        int i4 = vq4Var.N;
        int i5 = vq4Var.O;
        String str4 = vq4Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (qs5Var.isEmpty()) {
            qs5Var = this.c;
        }
        if ((i3 != 3 && i3 != 1) || (str = vq4Var.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = vq4Var.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = vq4Var.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String v = a2d.v(i3, vq4Var.k);
            if (a2d.b0(v).length == 1) {
                str5 = v;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = vq4Var.m;
        }
        tb7 tb7Var = vq4Var.l;
        tb7 tb7Var2 = this.l;
        if (tb7Var2 != null) {
            tb7Var = tb7Var2.b(tb7Var);
        }
        float f = this.z;
        if (f == -1.0f && i3 == 2) {
            f = vq4Var.z;
        }
        int i8 = this.e | vq4Var.e;
        qs5 qs5Var2 = qs5Var;
        int i9 = vq4Var.f | this.f;
        zk3 zk3Var2 = vq4Var.s;
        ArrayList arrayList = new ArrayList();
        if (zk3Var2 != null) {
            String str7 = zk3Var2.c;
            yk3[] yk3VarArr = zk3Var2.a;
            int length = yk3VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                yk3 yk3Var = yk3VarArr[i11];
                int i12 = length;
                if (yk3Var.e != null) {
                    arrayList.add(yk3Var);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        zk3 zk3Var3 = this.s;
        if (zk3Var3 != null) {
            if (str2 == null) {
                str2 = zk3Var3.c;
            }
            int size = arrayList.size();
            yk3[] yk3VarArr2 = zk3Var3.a;
            String str8 = str2;
            int length2 = yk3VarArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                yk3 yk3Var2 = yk3VarArr2[i14];
                int i15 = length2;
                if (yk3Var2.e != null) {
                    UUID uuid = yk3Var2.b;
                    i2 = i4;
                    int i16 = 0;
                    while (true) {
                        if (i16 < size) {
                            i = size;
                            if (((yk3) arrayList.get(i16)).b.equals(uuid)) {
                                break;
                            }
                            i16++;
                            size = i;
                        } else {
                            i = size;
                            arrayList.add(yk3Var2);
                            break;
                        }
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i13 = i14 + 1;
                length2 = i15;
                i4 = i2;
                size = i;
            }
            str2 = str8;
        }
        int i17 = i4;
        if (arrayList.isEmpty()) {
            zk3Var = null;
        } else {
            zk3Var = new zk3(str2, arrayList);
        }
        uq4 a = a();
        a.a = str3;
        a.b = str4;
        a.c = qs5.l(qs5Var2);
        a.d = str;
        a.e = i8;
        a.f = i9;
        a.h = i6;
        a.i = i7;
        a.j = str5;
        a.k = tb7Var;
        a.l = str6;
        a.r = zk3Var;
        a.y = f;
        a.M = i17;
        a.N = i5;
        return new vq4(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && vq4.class == obj.getClass()) {
            vq4 vq4Var = (vq4) obj;
            int i2 = this.Q;
            if ((i2 == 0 || (i = vq4Var.Q) == 0 || i2 == i) && this.e == vq4Var.e && this.f == vq4Var.f && this.g == vq4Var.g && this.h == vq4Var.h && this.i == vq4Var.i && this.p == vq4Var.p && this.t == vq4Var.t && this.v == vq4Var.v && this.w == vq4Var.w && this.x == vq4Var.x && this.y == vq4Var.y && this.A == vq4Var.A && this.D == vq4Var.D && this.F == vq4Var.F && this.G == vq4Var.G && this.H == vq4Var.H && this.I == vq4Var.I && this.J == vq4Var.J && this.K == vq4Var.K && this.L == vq4Var.L && this.N == vq4Var.N && this.O == vq4Var.O && this.P == vq4Var.P && Float.compare(this.z, vq4Var.z) == 0 && Float.compare(this.B, vq4Var.B) == 0 && Objects.equals(this.a, vq4Var.a) && Objects.equals(this.b, vq4Var.b) && this.c.equals(vq4Var.c) && Objects.equals(this.k, vq4Var.k) && Objects.equals(this.m, vq4Var.m) && Objects.equals(this.n, vq4Var.n) && Objects.equals(this.o, vq4Var.o) && Objects.equals(this.d, vq4Var.d) && Arrays.equals(this.C, vq4Var.C) && Objects.equals(this.l, vq4Var.l) && Objects.equals(this.E, vq4Var.E) && Objects.equals(this.s, vq4Var.s) && b(vq4Var)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        if (this.Q == 0) {
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (527 + hashCode) * 31;
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode8 = (this.c.hashCode() + ((i2 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i3 = (((((((((((hashCode8 + hashCode3) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            tb7 tb7Var = this.l;
            if (tb7Var == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = tb7Var.hashCode();
            }
            int i5 = (i4 + hashCode5) * 961;
            String str5 = this.m;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str6 = this.n;
            if (str6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str6.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            String str7 = this.o;
            if (str7 != null) {
                i = str7.hashCode();
            }
            this.Q = ((((((((((((((((((((((Float.floatToIntBits(this.B) + ((((Float.floatToIntBits(this.z) + ((((((((((((((i7 + i) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.N) * 31) + this.O) * 31) + this.P;
        }
        return this.Q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.z);
        sb.append(", ");
        sb.append(this.E);
        sb.append("], [");
        sb.append(this.G);
        sb.append(", ");
        return rs8.g(this.H, "])", sb);
    }
}
