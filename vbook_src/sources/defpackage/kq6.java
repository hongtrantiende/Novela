package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kq6  reason: default package */
/* loaded from: classes.dex */
public final class kq6 implements fe0 {
    public final qs5 a;
    public final int b;

    public kq6(int i, mm9 mm9Var) {
        this.b = i;
        this.a = mm9Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static kq6 b(int i, km8 km8Var) {
        String str;
        int i2;
        fe0 g1bVar;
        String str2;
        int i3 = 4;
        kue.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = km8Var.c;
        int i5 = -2;
        int i6 = 0;
        while (km8Var.a() > 8) {
            int o = km8Var.o();
            int o2 = km8Var.b + km8Var.o();
            km8Var.L(o2);
            if (o == 1414744396) {
                g1bVar = b(km8Var.o(), km8Var);
            } else {
                je0 je0Var = null;
                switch (o) {
                    case 1718776947:
                        if (i5 == 2) {
                            km8Var.N(i3);
                            int o3 = km8Var.o();
                            int o4 = km8Var.o();
                            km8Var.N(i3);
                            int o5 = km8Var.o();
                            switch (o5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                a82.y("Ignoring track with unsupported compression ", "StreamFormatChunk", o5);
                                g1bVar = je0Var;
                                break;
                            } else {
                                uq4 uq4Var = new uq4();
                                uq4Var.u = o3;
                                uq4Var.v = o4;
                                uq4Var.n = lc7.p(str2);
                                g1bVar = new g1b(new vq4(uq4Var));
                                break;
                            }
                        } else {
                            if (i5 == 1) {
                                int s = km8Var.s();
                                if (s == 1) {
                                    str = "audio/raw";
                                } else if (s != 85) {
                                    if (s == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (s != 8192) {
                                        if (s != 8193) {
                                            str = null;
                                        } else {
                                            str = "audio/vnd.dts";
                                        }
                                    } else {
                                        str = "audio/ac3";
                                    }
                                } else {
                                    str = "audio/mpeg";
                                }
                                if (str == null) {
                                    a82.y("Ignoring track with unsupported format tag ", "StreamFormatChunk", s);
                                } else {
                                    int s2 = km8Var.s();
                                    int o6 = km8Var.o();
                                    km8Var.N(6);
                                    int s3 = km8Var.s();
                                    String str3 = a2d.a;
                                    int C = a2d.C(s3, ByteOrder.LITTLE_ENDIAN);
                                    if (km8Var.a() > 0) {
                                        i2 = km8Var.s();
                                    } else {
                                        i2 = 0;
                                    }
                                    uq4 uq4Var2 = new uq4();
                                    uq4Var2.n = lc7.p(str);
                                    uq4Var2.F = s2;
                                    uq4Var2.G = o6;
                                    if (str.equals("audio/raw") && C != 0) {
                                        uq4Var2.H = C;
                                    }
                                    if (str.equals("audio/mp4a-latm") && i2 > 0) {
                                        byte[] bArr = new byte[i2];
                                        km8Var.k(bArr, 0, i2);
                                        uq4Var2.q = qs5.r(bArr);
                                    }
                                    g1bVar = new g1b(new vq4(uq4Var2));
                                    break;
                                }
                            } else {
                                st0.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(a2d.G(i5)));
                            }
                            g1bVar = je0Var;
                        }
                    case 1751742049:
                        int o7 = km8Var.o();
                        km8Var.N(8);
                        int o8 = km8Var.o();
                        int o9 = km8Var.o();
                        km8Var.N(i3);
                        km8Var.o();
                        km8Var.N(12);
                        g1bVar = new ie0(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = km8Var.o();
                        km8Var.N(12);
                        km8Var.o();
                        int o11 = km8Var.o();
                        int o12 = km8Var.o();
                        km8Var.N(i3);
                        int o13 = km8Var.o();
                        int o14 = km8Var.o();
                        km8Var.N(i3);
                        je0Var = new je0(o10, o11, o12, o13, o14, km8Var.o());
                        g1bVar = je0Var;
                        break;
                    case 1852994675:
                        g1bVar = new i1b(km8Var.x(km8Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        g1bVar = je0Var;
                        break;
                }
            }
            if (g1bVar != null) {
                if (g1bVar.getType() == 1752331379) {
                    i5 = ((je0) g1bVar).a();
                }
                int i7 = i6 + 1;
                int e = hs5.e(objArr.length, i7);
                if (e > objArr.length) {
                    objArr = Arrays.copyOf(objArr, e);
                }
                objArr[i6] = g1bVar;
                i6 = i7;
            }
            km8Var.M(o2);
            km8Var.L(i4);
            i3 = 4;
        }
        return new kq6(i, qs5.h(i6, objArr));
    }

    public final fe0 a(Class cls) {
        ms5 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            fe0 fe0Var = (fe0) listIterator.next();
            if (fe0Var.getClass() == cls) {
                return fe0Var;
            }
        }
        return null;
    }

    @Override // defpackage.fe0
    public final int getType() {
        return this.b;
    }
}
