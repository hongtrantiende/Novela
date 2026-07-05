package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q4f  reason: default package */
/* loaded from: classes.dex */
public final class q4f implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ q4f(int i) {
        this.a = i;
    }

    public static void a(g6f g6fVar, Parcel parcel) {
        int i = g6fVar.a;
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(i);
        uue.P(parcel, 2, g6fVar.b);
        long j = g6fVar.c;
        uue.T(parcel, 3, 8);
        parcel.writeLong(j);
        uue.N(parcel, 4, g6fVar.d);
        uue.P(parcel, 6, g6fVar.e);
        uue.P(parcel, 7, g6fVar.f);
        Double d = g6fVar.C;
        if (d != null) {
            uue.T(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        uue.V(parcel, U);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        switch (this.a) {
            case 0:
                int O = sue.O(parcel);
                while (parcel.dataPosition() < O) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                sue.N(parcel, readInt);
                            } else {
                                i = sue.F(parcel, readInt);
                            }
                        } else {
                            j = sue.H(parcel, readInt);
                        }
                    } else {
                        str = sue.s(parcel, readInt);
                    }
                }
                sue.x(parcel, O);
                return new p4f(str, j, i);
            case 1:
                int O2 = sue.O(parcel);
                long j2 = 0;
                long j3 = 0;
                int i2 = 0;
                byte[] bArr = null;
                String str4 = null;
                Bundle bundle = null;
                String str5 = null;
                while (parcel.dataPosition() < O2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            j2 = sue.H(parcel, readInt2);
                            break;
                        case 2:
                            bArr = sue.o(parcel, readInt2);
                            break;
                        case 3:
                            str4 = sue.s(parcel, readInt2);
                            break;
                        case 4:
                            bundle = sue.n(parcel, readInt2);
                            break;
                        case 5:
                            i2 = sue.F(parcel, readInt2);
                            break;
                        case 6:
                            j3 = sue.H(parcel, readInt2);
                            break;
                        case 7:
                            str5 = sue.s(parcel, readInt2);
                            break;
                        default:
                            sue.N(parcel, readInt2);
                            break;
                    }
                }
                sue.x(parcel, O2);
                return new w4f(j2, bArr, str4, bundle, i2, j3, str5);
            case 2:
                int O3 = sue.O(parcel);
                while (true) {
                    ArrayList arrayList3 = null;
                    while (parcel.dataPosition() < O3) {
                        int readInt3 = parcel.readInt();
                        if (((char) readInt3) != 1) {
                            sue.N(parcel, readInt3);
                        } else {
                            int J = sue.J(parcel, readInt3);
                            int dataPosition = parcel.dataPosition();
                            if (J == 0) {
                                break;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int readInt4 = parcel.readInt();
                            for (int i3 = 0; i3 < readInt4; i3++) {
                                arrayList4.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition + J);
                            arrayList3 = arrayList4;
                        }
                    }
                    sue.x(parcel, O3);
                    return new a5f(arrayList3);
                    break;
                }
            case 3:
                int O4 = sue.O(parcel);
                while (parcel.dataPosition() < O4) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        sue.N(parcel, readInt5);
                    } else {
                        arrayList2 = sue.v(parcel, readInt5, w4f.CREATOR);
                    }
                }
                sue.x(parcel, O4);
                return new d5f(arrayList2);
            case 4:
                try {
                    return p41.a(parcel.readInt());
                } catch (o41 e) {
                    fb4.l(e);
                    return null;
                }
            case 5:
                int O5 = sue.O(parcel);
                long j4 = 0;
                int i4 = 0;
                String str6 = null;
                Long l = null;
                Float f = null;
                String str7 = null;
                String str8 = null;
                Double d = null;
                while (parcel.dataPosition() < O5) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i4 = sue.F(parcel, readInt6);
                            break;
                        case 2:
                            str6 = sue.s(parcel, readInt6);
                            break;
                        case 3:
                            j4 = sue.H(parcel, readInt6);
                            break;
                        case 4:
                            l = sue.I(parcel, readInt6);
                            break;
                        case 5:
                            int J2 = sue.J(parcel, readInt6);
                            if (J2 == 0) {
                                f = null;
                                break;
                            } else {
                                sue.Q(parcel, J2, 4);
                                f = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 6:
                            str7 = sue.s(parcel, readInt6);
                            break;
                        case 7:
                            str8 = sue.s(parcel, readInt6);
                            break;
                        case '\b':
                            int J3 = sue.J(parcel, readInt6);
                            if (J3 == 0) {
                                d = null;
                                break;
                            } else {
                                sue.Q(parcel, J3, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            sue.N(parcel, readInt6);
                            break;
                    }
                }
                sue.x(parcel, O5);
                return new g6f(i4, str6, j4, l, f, str7, str8, d);
            case 6:
                int O6 = sue.O(parcel);
                long j5 = 0;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < O6) {
                    int readInt7 = parcel.readInt();
                    char c2 = (char) readInt7;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    sue.N(parcel, readInt7);
                                } else {
                                    bArr4 = sue.o(parcel, readInt7);
                                }
                            } else {
                                bArr3 = sue.o(parcel, readInt7);
                            }
                        } else {
                            bArr2 = sue.o(parcel, readInt7);
                        }
                    } else {
                        j5 = sue.H(parcel, readInt7);
                    }
                }
                sue.x(parcel, O6);
                return new y6f(j5, bArr2, bArr3, bArr4);
            case 7:
                int O7 = sue.O(parcel);
                long j6 = -1;
                int i5 = 0;
                int i6 = 0;
                boolean z2 = false;
                String str9 = null;
                while (parcel.dataPosition() < O7) {
                    int readInt8 = parcel.readInt();
                    char c3 = (char) readInt8;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 != 5) {
                                        sue.N(parcel, readInt8);
                                    } else {
                                        j6 = sue.H(parcel, readInt8);
                                    }
                                } else {
                                    i6 = sue.F(parcel, readInt8);
                                }
                            } else {
                                i5 = sue.F(parcel, readInt8);
                            }
                        } else {
                            str9 = sue.s(parcel, readInt8);
                        }
                    } else {
                        z2 = sue.C(parcel, readInt8);
                    }
                }
                sue.x(parcel, O7);
                return new b8f(i5, i6, j6, str9, z2);
            case 8:
                int O8 = sue.O(parcel);
                String str10 = "";
                String str11 = str10;
                String str12 = str11;
                String str13 = str12;
                int i7 = 100;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                boolean z3 = false;
                int i8 = 0;
                boolean z4 = false;
                boolean z5 = false;
                int i9 = 0;
                int i10 = 0;
                boolean z6 = true;
                boolean z7 = true;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                Boolean bool = null;
                ArrayList arrayList5 = null;
                String str20 = null;
                String str21 = null;
                long j15 = -2147483648L;
                while (parcel.dataPosition() < O8) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str14 = sue.s(parcel, readInt9);
                            break;
                        case 3:
                            str15 = sue.s(parcel, readInt9);
                            break;
                        case 4:
                            str16 = sue.s(parcel, readInt9);
                            break;
                        case 5:
                            str17 = sue.s(parcel, readInt9);
                            break;
                        case 6:
                            j7 = sue.H(parcel, readInt9);
                            break;
                        case 7:
                            j8 = sue.H(parcel, readInt9);
                            break;
                        case '\b':
                            str18 = sue.s(parcel, readInt9);
                            break;
                        case '\t':
                            z6 = sue.C(parcel, readInt9);
                            break;
                        case '\n':
                            z3 = sue.C(parcel, readInt9);
                            break;
                        case 11:
                            j15 = sue.H(parcel, readInt9);
                            break;
                        case '\f':
                            str19 = sue.s(parcel, readInt9);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case Token.GETPROP /* 33 */:
                        default:
                            sue.N(parcel, readInt9);
                            break;
                        case 14:
                            j9 = sue.H(parcel, readInt9);
                            break;
                        case 15:
                            i8 = sue.F(parcel, readInt9);
                            break;
                        case 16:
                            z7 = sue.C(parcel, readInt9);
                            break;
                        case 18:
                            z4 = sue.C(parcel, readInt9);
                            break;
                        case 21:
                            bool = sue.D(parcel, readInt9);
                            break;
                        case 22:
                            j10 = sue.H(parcel, readInt9);
                            break;
                        case 23:
                            arrayList5 = sue.t(parcel, readInt9);
                            break;
                        case 25:
                            str10 = sue.s(parcel, readInt9);
                            break;
                        case 26:
                            str11 = sue.s(parcel, readInt9);
                            break;
                        case 27:
                            str20 = sue.s(parcel, readInt9);
                            break;
                        case 28:
                            z5 = sue.C(parcel, readInt9);
                            break;
                        case 29:
                            j11 = sue.H(parcel, readInt9);
                            break;
                        case 30:
                            i7 = sue.F(parcel, readInt9);
                            break;
                        case 31:
                            str12 = sue.s(parcel, readInt9);
                            break;
                        case ' ':
                            i9 = sue.F(parcel, readInt9);
                            break;
                        case Token.GETPROPNOWARN /* 34 */:
                            j12 = sue.H(parcel, readInt9);
                            break;
                        case Token.GETPROP_SUPER /* 35 */:
                            str21 = sue.s(parcel, readInt9);
                            break;
                        case Token.GETPROPNOWARN_SUPER /* 36 */:
                            str13 = sue.s(parcel, readInt9);
                            break;
                        case Token.SETPROP /* 37 */:
                            j13 = sue.H(parcel, readInt9);
                            break;
                        case Token.SETPROP_SUPER /* 38 */:
                            i10 = sue.F(parcel, readInt9);
                            break;
                        case Token.GETELEM /* 39 */:
                            j14 = sue.H(parcel, readInt9);
                            break;
                    }
                }
                sue.x(parcel, O8);
                return new d8f(str14, str15, str16, str17, j7, j8, str18, z6, z3, j15, str19, j9, i8, z7, z4, bool, j10, arrayList5, str10, str11, str20, z5, j11, i7, str12, i9, j12, str21, str13, j13, i10, j14);
            case 9:
                int O9 = sue.O(parcel);
                while (parcel.dataPosition() < O9) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        sue.N(parcel, readInt10);
                    } else {
                        arrayList = sue.v(parcel, readInt10, y6f.CREATOR);
                    }
                }
                sue.x(parcel, O9);
                return new k9f(arrayList);
            case 10:
                int O10 = sue.O(parcel);
                while (parcel.dataPosition() < O10) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        sue.N(parcel, readInt11);
                    } else {
                        sue.C(parcel, readInt11);
                    }
                }
                sue.x(parcel, O10);
                return new Object();
            case 11:
                try {
                    return jw3.a(parcel.readInt());
                } catch (iw3 e2) {
                    xk5.m(e2);
                    return null;
                }
            case 12:
                int O11 = sue.O(parcel);
                while (parcel.dataPosition() < O11) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        sue.N(parcel, readInt12);
                    } else {
                        str3 = sue.s(parcel, readInt12);
                    }
                }
                sue.x(parcel, O11);
                return new yb4(str3);
            case 13:
                int O12 = sue.O(parcel);
                int i11 = 0;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < O12) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            str22 = sue.s(parcel, readInt13);
                            break;
                        case 2:
                            str23 = sue.s(parcel, readInt13);
                            break;
                        case 3:
                            str24 = sue.s(parcel, readInt13);
                            break;
                        case 4:
                            str25 = sue.s(parcel, readInt13);
                            break;
                        case 5:
                            str26 = sue.s(parcel, readInt13);
                            break;
                        case 6:
                            i11 = sue.F(parcel, readInt13);
                            break;
                        case 7:
                            str27 = sue.s(parcel, readInt13);
                            break;
                        default:
                            sue.N(parcel, readInt13);
                            break;
                    }
                }
                sue.x(parcel, O12);
                return new lm9(str22, str23, str24, str25, str26, i11, str27);
            default:
                int O13 = sue.O(parcel);
                String str28 = null;
                while (parcel.dataPosition() < O13) {
                    int readInt14 = parcel.readInt();
                    char c4 = (char) readInt14;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                sue.N(parcel, readInt14);
                            } else {
                                z = sue.C(parcel, readInt14);
                            }
                        } else {
                            str28 = sue.s(parcel, readInt14);
                        }
                    } else {
                        str2 = sue.s(parcel, readInt14);
                    }
                }
                sue.x(parcel, O13);
                return new tdf(str2, str28, z);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new p4f[i];
            case 1:
                return new w4f[i];
            case 2:
                return new a5f[i];
            case 3:
                return new d5f[i];
            case 4:
                return new p41[i];
            case 5:
                return new g6f[i];
            case 6:
                return new y6f[i];
            case 7:
                return new b8f[i];
            case 8:
                return new d8f[i];
            case 9:
                return new k9f[i];
            case 10:
                return new ncf[i];
            case 11:
                return new jw3[i];
            case 12:
                return new yb4[i];
            case 13:
                return new lm9[i];
            default:
                return new tdf[i];
        }
    }
}
