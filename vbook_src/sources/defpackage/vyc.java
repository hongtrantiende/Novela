package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = azc.class)
/* renamed from: vyc  reason: default package */
/* loaded from: classes3.dex */
public final class vyc implements Serializable {
    public static final uyc Companion = new Object();
    public final String C;
    public final ztc D;
    public final ztc E;
    public final mfb F;
    public final mfb G;
    public final mfb H;
    public final mfb I;
    public final mfb J;
    public final String a;
    public final int b;
    public final tl8 c;
    public final String d;
    public final String e;
    public final boolean f;

    public vyc(ztc ztcVar, String str, int i, ArrayList arrayList, tl8 tl8Var, String str2, String str3, String str4, boolean z, String str5) {
        str.getClass();
        tl8Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = tl8Var;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.C = str5;
        if (i >= 0 && i < 65536) {
            new mfb(new z9a(1, arrayList));
            this.D = ztcVar;
            this.E = ztcVar == null ? ztc.c : ztcVar;
            this.F = new mfb(new a0b(23, arrayList, this));
            this.G = new mfb(new vt4(this) { // from class: tyc
                public final /* synthetic */ vyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.vt4
                public final Object invoke() {
                    int i2 = r2;
                    vyc vycVar = this.b;
                    switch (i2) {
                        case 0:
                            String str6 = vycVar.C;
                            int f0 = k4b.f0(str6, '?', 0, 6) + 1;
                            if (f0 == 0) {
                                return "";
                            }
                            int f02 = k4b.f0(str6, '#', f0, 4);
                            if (f02 == -1) {
                                return str6.substring(f0);
                            }
                            return str6.substring(f0, f02);
                        case 1:
                            String str7 = vycVar.C;
                            int f03 = k4b.f0(str7, '/', vycVar.E.a.length() + 3, 4);
                            if (f03 == -1) {
                                return "";
                            }
                            int f04 = k4b.f0(str7, '#', f03, 4);
                            if (f04 == -1) {
                                return str7.substring(f03);
                            }
                            return str7.substring(f03, f04);
                        case 2:
                            String str8 = vycVar.C;
                            String str9 = vycVar.d;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = vycVar.E.a.length() + 3;
                            return str8.substring(length, k4b.i0(str8, new char[]{':', '@'}, length, 4));
                        case 3:
                            String str10 = vycVar.C;
                            String str11 = vycVar.e;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(k4b.f0(str10, ':', vycVar.E.a.length() + 3, 4) + 1, k4b.f0(str10, '@', 0, 6));
                        default:
                            String str12 = vycVar.C;
                            int f05 = k4b.f0(str12, '#', 0, 6) + 1;
                            if (f05 == 0) {
                                return "";
                            }
                            return str12.substring(f05);
                    }
                }
            });
            new mfb(new vt4(this) { // from class: tyc
                public final /* synthetic */ vyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.vt4
                public final Object invoke() {
                    int i2 = r2;
                    vyc vycVar = this.b;
                    switch (i2) {
                        case 0:
                            String str6 = vycVar.C;
                            int f0 = k4b.f0(str6, '?', 0, 6) + 1;
                            if (f0 == 0) {
                                return "";
                            }
                            int f02 = k4b.f0(str6, '#', f0, 4);
                            if (f02 == -1) {
                                return str6.substring(f0);
                            }
                            return str6.substring(f0, f02);
                        case 1:
                            String str7 = vycVar.C;
                            int f03 = k4b.f0(str7, '/', vycVar.E.a.length() + 3, 4);
                            if (f03 == -1) {
                                return "";
                            }
                            int f04 = k4b.f0(str7, '#', f03, 4);
                            if (f04 == -1) {
                                return str7.substring(f03);
                            }
                            return str7.substring(f03, f04);
                        case 2:
                            String str8 = vycVar.C;
                            String str9 = vycVar.d;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = vycVar.E.a.length() + 3;
                            return str8.substring(length, k4b.i0(str8, new char[]{':', '@'}, length, 4));
                        case 3:
                            String str10 = vycVar.C;
                            String str11 = vycVar.e;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(k4b.f0(str10, ':', vycVar.E.a.length() + 3, 4) + 1, k4b.f0(str10, '@', 0, 6));
                        default:
                            String str12 = vycVar.C;
                            int f05 = k4b.f0(str12, '#', 0, 6) + 1;
                            if (f05 == 0) {
                                return "";
                            }
                            return str12.substring(f05);
                    }
                }
            });
            this.H = new mfb(new vt4(this) { // from class: tyc
                public final /* synthetic */ vyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.vt4
                public final Object invoke() {
                    int i2 = r2;
                    vyc vycVar = this.b;
                    switch (i2) {
                        case 0:
                            String str6 = vycVar.C;
                            int f0 = k4b.f0(str6, '?', 0, 6) + 1;
                            if (f0 == 0) {
                                return "";
                            }
                            int f02 = k4b.f0(str6, '#', f0, 4);
                            if (f02 == -1) {
                                return str6.substring(f0);
                            }
                            return str6.substring(f0, f02);
                        case 1:
                            String str7 = vycVar.C;
                            int f03 = k4b.f0(str7, '/', vycVar.E.a.length() + 3, 4);
                            if (f03 == -1) {
                                return "";
                            }
                            int f04 = k4b.f0(str7, '#', f03, 4);
                            if (f04 == -1) {
                                return str7.substring(f03);
                            }
                            return str7.substring(f03, f04);
                        case 2:
                            String str8 = vycVar.C;
                            String str9 = vycVar.d;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = vycVar.E.a.length() + 3;
                            return str8.substring(length, k4b.i0(str8, new char[]{':', '@'}, length, 4));
                        case 3:
                            String str10 = vycVar.C;
                            String str11 = vycVar.e;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(k4b.f0(str10, ':', vycVar.E.a.length() + 3, 4) + 1, k4b.f0(str10, '@', 0, 6));
                        default:
                            String str12 = vycVar.C;
                            int f05 = k4b.f0(str12, '#', 0, 6) + 1;
                            if (f05 == 0) {
                                return "";
                            }
                            return str12.substring(f05);
                    }
                }
            });
            this.I = new mfb(new vt4(this) { // from class: tyc
                public final /* synthetic */ vyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.vt4
                public final Object invoke() {
                    int i2 = r2;
                    vyc vycVar = this.b;
                    switch (i2) {
                        case 0:
                            String str6 = vycVar.C;
                            int f0 = k4b.f0(str6, '?', 0, 6) + 1;
                            if (f0 == 0) {
                                return "";
                            }
                            int f02 = k4b.f0(str6, '#', f0, 4);
                            if (f02 == -1) {
                                return str6.substring(f0);
                            }
                            return str6.substring(f0, f02);
                        case 1:
                            String str7 = vycVar.C;
                            int f03 = k4b.f0(str7, '/', vycVar.E.a.length() + 3, 4);
                            if (f03 == -1) {
                                return "";
                            }
                            int f04 = k4b.f0(str7, '#', f03, 4);
                            if (f04 == -1) {
                                return str7.substring(f03);
                            }
                            return str7.substring(f03, f04);
                        case 2:
                            String str8 = vycVar.C;
                            String str9 = vycVar.d;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = vycVar.E.a.length() + 3;
                            return str8.substring(length, k4b.i0(str8, new char[]{':', '@'}, length, 4));
                        case 3:
                            String str10 = vycVar.C;
                            String str11 = vycVar.e;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(k4b.f0(str10, ':', vycVar.E.a.length() + 3, 4) + 1, k4b.f0(str10, '@', 0, 6));
                        default:
                            String str12 = vycVar.C;
                            int f05 = k4b.f0(str12, '#', 0, 6) + 1;
                            if (f05 == 0) {
                                return "";
                            }
                            return str12.substring(f05);
                    }
                }
            });
            this.J = new mfb(new vt4(this) { // from class: tyc
                public final /* synthetic */ vyc b;

                {
                    this.b = this;
                }

                @Override // defpackage.vt4
                public final Object invoke() {
                    int i2 = r2;
                    vyc vycVar = this.b;
                    switch (i2) {
                        case 0:
                            String str6 = vycVar.C;
                            int f0 = k4b.f0(str6, '?', 0, 6) + 1;
                            if (f0 == 0) {
                                return "";
                            }
                            int f02 = k4b.f0(str6, '#', f0, 4);
                            if (f02 == -1) {
                                return str6.substring(f0);
                            }
                            return str6.substring(f0, f02);
                        case 1:
                            String str7 = vycVar.C;
                            int f03 = k4b.f0(str7, '/', vycVar.E.a.length() + 3, 4);
                            if (f03 == -1) {
                                return "";
                            }
                            int f04 = k4b.f0(str7, '#', f03, 4);
                            if (f04 == -1) {
                                return str7.substring(f03);
                            }
                            return str7.substring(f03, f04);
                        case 2:
                            String str8 = vycVar.C;
                            String str9 = vycVar.d;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = vycVar.E.a.length() + 3;
                            return str8.substring(length, k4b.i0(str8, new char[]{':', '@'}, length, 4));
                        case 3:
                            String str10 = vycVar.C;
                            String str11 = vycVar.e;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(k4b.f0(str10, ':', vycVar.E.a.length() + 3, 4) + 1, k4b.f0(str10, '@', 0, 6));
                        default:
                            String str12 = vycVar.C;
                            int f05 = k4b.f0(str12, '#', 0, 6) + 1;
                            if (f05 == 0) {
                                return "";
                            }
                            return str12.substring(f05);
                    }
                }
            });
            return;
        }
        p1a.k(a82.j(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vyc.class == obj.getClass()) {
            return this.C.equals(((vyc) obj).C);
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return this.C;
    }
}
