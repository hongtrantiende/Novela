package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: go8  reason: default package */
/* loaded from: classes.dex */
public final class go8 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ go8(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ls9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, fya] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, gya] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, dk5] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        Bundle bundle = null;
        PendingIntent pendingIntent = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        jz1 jz1Var = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Intent intent = null;
        ArrayList arrayList3 = null;
        Bundle bundle2 = null;
        ek5 ek5Var = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                int readInt = parcel.readInt();
                float readFloat = parcel.readFloat();
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList();
                while (i < readInt2) {
                    ho8 createFromParcel = ho8.CREATOR.createFromParcel(parcel);
                    createFromParcel.getClass();
                    arrayList4.add(createFromParcel);
                    i++;
                }
                return new io8(readInt, readFloat, arrayList4);
            case 1:
                parcel.getClass();
                return new ho8(parcel.readFloat(), parcel.readFloat(), parcel.readInt());
            case 2:
                parcel.getClass();
                int readInt3 = parcel.readInt();
                if (readInt3 != 1) {
                    if (readInt3 != 2) {
                        return null;
                    }
                    return d65.CREATOR.createFromParcel(parcel);
                }
                return hya.CREATOR.createFromParcel(parcel);
            case 3:
                parcel.getClass();
                int readInt4 = parcel.readInt();
                if (readInt4 == 1) {
                    return io8.CREATOR.createFromParcel(parcel);
                }
                if (readInt4 != 2) {
                    return null;
                }
                return ro5.CREATOR.createFromParcel(parcel);
            case 4:
                return new PlaybackStateCompat(parcel);
            case 5:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 6:
                int O = sue.O(parcel);
                while (parcel.dataPosition() < O) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        sue.N(parcel, readInt5);
                    } else {
                        bundle = sue.n(parcel, readInt5);
                    }
                }
                sue.x(parcel, O);
                return new in9(bundle);
            case 7:
                parcel.getClass();
                return new yn9(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 8:
                ?? obj = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i2 = ks9.b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(ek5.j);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof ek5)) {
                        ek5Var = (ek5) queryLocalInterface;
                    } else {
                        ?? obj2 = new Object();
                        obj2.a = readStrongBinder;
                        ek5Var = obj2;
                    }
                }
                obj.a = ek5Var;
                return obj;
            case 9:
                ?? obj3 = new Object();
                obj3.a = parcel.readInt();
                obj3.b = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj3.d = z3;
                int readInt6 = parcel.readInt();
                if (readInt6 > 0) {
                    int[] iArr = new int[readInt6];
                    obj3.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj3;
            case 10:
                ?? obj4 = new Object();
                obj4.a = parcel.readInt();
                obj4.b = parcel.readInt();
                int readInt7 = parcel.readInt();
                obj4.c = readInt7;
                if (readInt7 > 0) {
                    int[] iArr2 = new int[readInt7];
                    obj4.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt8 = parcel.readInt();
                obj4.e = readInt8;
                if (readInt8 > 0) {
                    int[] iArr3 = new int[readInt8];
                    obj4.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                if (parcel.readInt() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                obj4.D = z;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj4.E = z2;
                if (parcel.readInt() != 1) {
                    z3 = false;
                }
                obj4.F = z3;
                obj4.C = parcel.readArrayList(fya.class.getClassLoader());
                return obj4;
            case 11:
                parcel.getClass();
                int readInt9 = parcel.readInt();
                RectF rectF = new RectF();
                rectF.readFromParcel(parcel);
                int readInt10 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList();
                while (i < readInt10) {
                    if (parcel.readInt() == 1) {
                        io8 createFromParcel2 = io8.CREATOR.createFromParcel(parcel);
                        createFromParcel2.getClass();
                        arrayList5.add(createFromParcel2);
                    }
                    i++;
                }
                return new hya(readInt9, rectF, arrayList5);
            case 12:
                return new h1b(parcel);
            case 13:
                int O2 = sue.O(parcel);
                int i3 = 0;
                while (parcel.dataPosition() < O2) {
                    int readInt11 = parcel.readInt();
                    char c = (char) readInt11;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                sue.N(parcel, readInt11);
                            } else {
                                bundle2 = sue.n(parcel, readInt11);
                            }
                        } else {
                            i3 = sue.F(parcel, readInt11);
                        }
                    } else {
                        i = sue.F(parcel, readInt11);
                    }
                }
                sue.x(parcel, O2);
                return new u05(i, i3, bundle2);
            case 14:
                int O3 = sue.O(parcel);
                while (parcel.dataPosition() < O3) {
                    int readInt12 = parcel.readInt();
                    char c2 = (char) readInt12;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            sue.N(parcel, readInt12);
                        } else {
                            arrayList3 = sue.v(parcel, readInt12, cc7.CREATOR);
                        }
                    } else {
                        i = sue.F(parcel, readInt12);
                    }
                }
                sue.x(parcel, O3);
                return new elb(i, arrayList3);
            case 15:
                int O4 = sue.O(parcel);
                int i4 = 0;
                while (parcel.dataPosition() < O4) {
                    int readInt13 = parcel.readInt();
                    char c3 = (char) readInt13;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                sue.N(parcel, readInt13);
                            } else {
                                intent = (Intent) sue.r(parcel, readInt13, Intent.CREATOR);
                            }
                        } else {
                            i4 = sue.F(parcel, readInt13);
                        }
                    } else {
                        i = sue.F(parcel, readInt13);
                    }
                }
                sue.x(parcel, O4);
                return new iud(i, i4, intent);
            case 16:
                int O5 = sue.O(parcel);
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList6 = null;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < O5) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            str = sue.s(parcel, readInt14);
                            break;
                        case 3:
                            str2 = sue.s(parcel, readInt14);
                            break;
                        case 4:
                            str3 = sue.s(parcel, readInt14);
                            break;
                        case 5:
                            str4 = sue.s(parcel, readInt14);
                            break;
                        case 6:
                            uri = (Uri) sue.r(parcel, readInt14, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = sue.s(parcel, readInt14);
                            break;
                        case '\b':
                            j = sue.H(parcel, readInt14);
                            break;
                        case '\t':
                            str6 = sue.s(parcel, readInt14);
                            break;
                        case '\n':
                            arrayList6 = sue.v(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = sue.s(parcel, readInt14);
                            break;
                        case '\f':
                            str8 = sue.s(parcel, readInt14);
                            break;
                        default:
                            sue.N(parcel, readInt14);
                            break;
                    }
                }
                sue.x(parcel, O5);
                return new GoogleSignInAccount(str, str2, str3, str4, uri, str5, j, str6, arrayList6, str7, str8);
            case 17:
                int O6 = sue.O(parcel);
                long j2 = 0;
                int i5 = 0;
                int i6 = 0;
                boolean z4 = false;
                String str9 = null;
                while (parcel.dataPosition() < O6) {
                    int readInt15 = parcel.readInt();
                    char c4 = (char) readInt15;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    if (c4 != 5) {
                                        sue.N(parcel, readInt15);
                                    } else {
                                        z4 = sue.C(parcel, readInt15);
                                    }
                                } else {
                                    i6 = sue.F(parcel, readInt15);
                                }
                            } else {
                                j2 = sue.H(parcel, readInt15);
                            }
                        } else {
                            str9 = sue.s(parcel, readInt15);
                        }
                    } else {
                        i5 = sue.F(parcel, readInt15);
                    }
                }
                sue.x(parcel, O6);
                return new kud(i5, i6, j2, str9, z4);
            case 18:
                int O7 = sue.O(parcel);
                int i7 = 0;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                ArrayList arrayList7 = null;
                Account account2 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < O7) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i7 = sue.F(parcel, readInt16);
                            break;
                        case 2:
                            arrayList7 = sue.v(parcel, readInt16, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) sue.r(parcel, readInt16, Account.CREATOR);
                            break;
                        case 4:
                            z5 = sue.C(parcel, readInt16);
                            break;
                        case 5:
                            z6 = sue.C(parcel, readInt16);
                            break;
                        case 6:
                            z7 = sue.C(parcel, readInt16);
                            break;
                        case 7:
                            str10 = sue.s(parcel, readInt16);
                            break;
                        case '\b':
                            str11 = sue.s(parcel, readInt16);
                            break;
                        case '\t':
                            arrayList2 = sue.v(parcel, readInt16, u05.CREATOR);
                            break;
                        case '\n':
                            str12 = sue.s(parcel, readInt16);
                            break;
                        default:
                            sue.N(parcel, readInt16);
                            break;
                    }
                }
                sue.x(parcel, O7);
                return new GoogleSignInOptions(i7, arrayList7, account2, z5, z6, z7, str10, str11, GoogleSignInOptions.d(arrayList2), str12);
            case 19:
                int O8 = sue.O(parcel);
                String str13 = null;
                while (parcel.dataPosition() < O8) {
                    int readInt17 = parcel.readInt();
                    char c5 = (char) readInt17;
                    if (c5 != 1) {
                        if (c5 != 2) {
                            sue.N(parcel, readInt17);
                        } else {
                            str13 = sue.s(parcel, readInt17);
                        }
                    } else {
                        arrayList = sue.t(parcel, readInt17);
                    }
                }
                sue.x(parcel, O8);
                return new gvd(str13, arrayList);
            case 20:
                int O9 = sue.O(parcel);
                svd svdVar = null;
                while (parcel.dataPosition() < O9) {
                    int readInt18 = parcel.readInt();
                    char c6 = (char) readInt18;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                sue.N(parcel, readInt18);
                            } else {
                                svdVar = (svd) sue.r(parcel, readInt18, svd.CREATOR);
                            }
                        } else {
                            jz1Var = (jz1) sue.r(parcel, readInt18, jz1.CREATOR);
                        }
                    } else {
                        i = sue.F(parcel, readInt18);
                    }
                }
                sue.x(parcel, O9);
                return new mvd(i, jz1Var, svdVar);
            case 21:
                int O10 = sue.O(parcel);
                int i8 = -1;
                long j3 = 0;
                long j4 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < O10) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            i9 = sue.F(parcel, readInt19);
                            break;
                        case 2:
                            i10 = sue.F(parcel, readInt19);
                            break;
                        case 3:
                            i11 = sue.F(parcel, readInt19);
                            break;
                        case 4:
                            j3 = sue.H(parcel, readInt19);
                            break;
                        case 5:
                            j4 = sue.H(parcel, readInt19);
                            break;
                        case 6:
                            str14 = sue.s(parcel, readInt19);
                            break;
                        case 7:
                            str15 = sue.s(parcel, readInt19);
                            break;
                        case '\b':
                            i12 = sue.F(parcel, readInt19);
                            break;
                        case '\t':
                            i8 = sue.F(parcel, readInt19);
                            break;
                        default:
                            sue.N(parcel, readInt19);
                            break;
                    }
                }
                sue.x(parcel, O10);
                return new cc7(i9, i10, i11, j3, j4, str14, str15, i12, i8);
            case 22:
                int O11 = sue.O(parcel);
                int i13 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < O11) {
                    int readInt20 = parcel.readInt();
                    char c7 = (char) readInt20;
                    if (c7 != 1) {
                        if (c7 != 2) {
                            if (c7 != 3) {
                                if (c7 != 4) {
                                    sue.N(parcel, readInt20);
                                } else {
                                    googleSignInAccount2 = (GoogleSignInAccount) sue.r(parcel, readInt20, GoogleSignInAccount.CREATOR);
                                }
                            } else {
                                i13 = sue.F(parcel, readInt20);
                            }
                        } else {
                            account = (Account) sue.r(parcel, readInt20, Account.CREATOR);
                        }
                    } else {
                        i = sue.F(parcel, readInt20);
                    }
                }
                sue.x(parcel, O11);
                return new rvd(i, account, i13, googleSignInAccount2);
            case 23:
                int O12 = sue.O(parcel);
                int i14 = 0;
                boolean z8 = false;
                boolean z9 = false;
                IBinder iBinder = null;
                jz1 jz1Var2 = null;
                while (parcel.dataPosition() < O12) {
                    int readInt21 = parcel.readInt();
                    char c8 = (char) readInt21;
                    if (c8 != 1) {
                        if (c8 != 2) {
                            if (c8 != 3) {
                                if (c8 != 4) {
                                    if (c8 != 5) {
                                        sue.N(parcel, readInt21);
                                    } else {
                                        z9 = sue.C(parcel, readInt21);
                                    }
                                } else {
                                    z8 = sue.C(parcel, readInt21);
                                }
                            } else {
                                jz1Var2 = (jz1) sue.r(parcel, readInt21, jz1.CREATOR);
                            }
                        } else {
                            iBinder = sue.E(parcel, readInt21);
                        }
                    } else {
                        i14 = sue.F(parcel, readInt21);
                    }
                }
                sue.x(parcel, O12);
                return new svd(i14, iBinder, jz1Var2, z8, z9);
            case 24:
                int O13 = sue.O(parcel);
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                ArrayList arrayList8 = null;
                String str16 = null;
                Account account3 = null;
                String str17 = null;
                String str18 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < O13) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            arrayList8 = sue.v(parcel, readInt22, Scope.CREATOR);
                            break;
                        case 2:
                            str16 = sue.s(parcel, readInt22);
                            break;
                        case 3:
                            z10 = sue.C(parcel, readInt22);
                            break;
                        case 4:
                            z11 = sue.C(parcel, readInt22);
                            break;
                        case 5:
                            account3 = (Account) sue.r(parcel, readInt22, Account.CREATOR);
                            break;
                        case 6:
                            str17 = sue.s(parcel, readInt22);
                            break;
                        case 7:
                            str18 = sue.s(parcel, readInt22);
                            break;
                        case '\b':
                            z12 = sue.C(parcel, readInt22);
                            break;
                        case '\t':
                            bundle3 = sue.n(parcel, readInt22);
                            break;
                        case '\n':
                            z13 = sue.C(parcel, readInt22);
                            break;
                        default:
                            sue.N(parcel, readInt22);
                            break;
                    }
                }
                sue.x(parcel, O13);
                return new AuthorizationRequest(arrayList8, str16, z10, z11, account3, str17, str18, z12, bundle3, z13);
            case 25:
                int O14 = sue.O(parcel);
                String str19 = null;
                String str20 = null;
                String str21 = null;
                ArrayList arrayList9 = null;
                GoogleSignInAccount googleSignInAccount3 = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < O14) {
                    int readInt23 = parcel.readInt();
                    switch ((char) readInt23) {
                        case 1:
                            str19 = sue.s(parcel, readInt23);
                            break;
                        case 2:
                            str20 = sue.s(parcel, readInt23);
                            break;
                        case 3:
                            str21 = sue.s(parcel, readInt23);
                            break;
                        case 4:
                            arrayList9 = sue.t(parcel, readInt23);
                            break;
                        case 5:
                            googleSignInAccount3 = (GoogleSignInAccount) sue.r(parcel, readInt23, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) sue.r(parcel, readInt23, PendingIntent.CREATOR);
                            break;
                        default:
                            sue.N(parcel, readInt23);
                            break;
                    }
                }
                sue.x(parcel, O14);
                return new q70(str19, str20, str21, arrayList9, googleSignInAccount3, pendingIntent2);
            case 26:
                int O15 = sue.O(parcel);
                String str22 = "";
                String str23 = "";
                while (parcel.dataPosition() < O15) {
                    int readInt24 = parcel.readInt();
                    char c9 = (char) readInt24;
                    if (c9 != 4) {
                        if (c9 != 7) {
                            if (c9 != '\b') {
                                sue.N(parcel, readInt24);
                            } else {
                                str23 = sue.s(parcel, readInt24);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) sue.r(parcel, readInt24, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str22 = sue.s(parcel, readInt24);
                    }
                }
                sue.x(parcel, O15);
                return new SignInAccount(str22, googleSignInAccount, str23);
            case 27:
                int O16 = sue.O(parcel);
                boolean z14 = false;
                int i15 = 0;
                boolean z15 = false;
                ek0 ek0Var = null;
                bk0 bk0Var = null;
                String str24 = null;
                dk0 dk0Var = null;
                ck0 ck0Var = null;
                while (parcel.dataPosition() < O16) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            ek0Var = (ek0) sue.r(parcel, readInt25, ek0.CREATOR);
                            break;
                        case 2:
                            bk0Var = (bk0) sue.r(parcel, readInt25, bk0.CREATOR);
                            break;
                        case 3:
                            str24 = sue.s(parcel, readInt25);
                            break;
                        case 4:
                            z14 = sue.C(parcel, readInt25);
                            break;
                        case 5:
                            i15 = sue.F(parcel, readInt25);
                            break;
                        case 6:
                            dk0Var = (dk0) sue.r(parcel, readInt25, dk0.CREATOR);
                            break;
                        case 7:
                            ck0Var = (ck0) sue.r(parcel, readInt25, ck0.CREATOR);
                            break;
                        case '\b':
                            z15 = sue.C(parcel, readInt25);
                            break;
                        default:
                            sue.N(parcel, readInt25);
                            break;
                    }
                }
                sue.x(parcel, O16);
                return new fk0(ek0Var, bk0Var, str24, z14, i15, dk0Var, ck0Var, z15);
            case 28:
                int O17 = sue.O(parcel);
                while (parcel.dataPosition() < O17) {
                    int readInt26 = parcel.readInt();
                    if (((char) readInt26) != 1) {
                        sue.N(parcel, readInt26);
                    } else {
                        pendingIntent = (PendingIntent) sue.r(parcel, readInt26, PendingIntent.CREATOR);
                    }
                }
                sue.x(parcel, O17);
                return new gk0(pendingIntent);
            default:
                int O18 = sue.O(parcel);
                boolean z16 = false;
                int i16 = 0;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                while (parcel.dataPosition() < O18) {
                    int readInt27 = parcel.readInt();
                    switch ((char) readInt27) {
                        case 1:
                            str25 = sue.s(parcel, readInt27);
                            break;
                        case 2:
                            str26 = sue.s(parcel, readInt27);
                            break;
                        case 3:
                            str27 = sue.s(parcel, readInt27);
                            break;
                        case 4:
                            str28 = sue.s(parcel, readInt27);
                            break;
                        case 5:
                            z16 = sue.C(parcel, readInt27);
                            break;
                        case 6:
                            i16 = sue.F(parcel, readInt27);
                            break;
                        default:
                            sue.N(parcel, readInt27);
                            break;
                    }
                }
                sue.x(parcel, O18);
                return new zx4(str25, str26, z16, str27, i16, str28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new io8[i];
            case 1:
                return new ho8[i];
            case 2:
                return new uo8[i];
            case 3:
                return new zp8[i];
            case 4:
                return new PlaybackStateCompat[i];
            case 5:
                return new RatingCompat[i];
            case 6:
                return new in9[i];
            case 7:
                return new yn9[i];
            case 8:
                return new ls9[i];
            case 9:
                return new fya[i];
            case 10:
                return new gya[i];
            case 11:
                return new hya[i];
            case 12:
                return new h1b[i];
            case 13:
                return new u05[i];
            case 14:
                return new elb[i];
            case 15:
                return new iud[i];
            case 16:
                return new GoogleSignInAccount[i];
            case 17:
                return new kud[i];
            case 18:
                return new GoogleSignInOptions[i];
            case 19:
                return new gvd[i];
            case 20:
                return new mvd[i];
            case 21:
                return new cc7[i];
            case 22:
                return new rvd[i];
            case 23:
                return new svd[i];
            case 24:
                return new AuthorizationRequest[i];
            case 25:
                return new q70[i];
            case 26:
                return new SignInAccount[i];
            case 27:
                return new fk0[i];
            case 28:
                return new gk0[i];
            default:
                return new zx4[i];
        }
    }
}
