package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r95  reason: default package */
/* loaded from: classes.dex */
public final class r95 implements x68, q4d, x0f, i0f, xm3 {
    public static volatile r95 D;
    public final /* synthetic */ int a;
    public int b;
    public static final r95 c = new r95(0, 0);
    public static final r95 d = new r95(2, 0);
    public static final r95 e = new r95(1, 0);
    public static final r95 f = new r95(3, 0);
    public static final Object C = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0062 -> B:16:0x0063). Please submit an issue!!! */
    public r95(String str) {
        List H;
        this.a = 9;
        int i = 3;
        i = 3;
        i = 3;
        int i2 = 3;
        try {
            H = l97.G().H(str);
        } catch (IllegalArgumentException e2) {
            ?? isLoggable = Log.isLoggable("LibraryVersionContainer", i);
            i2 = isLoggable;
            if (isLoggable != 0) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e2));
                i2 = "Version code parsing failed for: %s with exception %s.";
            }
        }
        if (H.size() == 1) {
            str = Integer.parseInt(str);
        } else {
            if (H.size() >= 3) {
                str = Integer.parseInt((String) H.get(2)) + (Integer.parseInt((String) H.get(1)) * 1000) + (Integer.parseInt((String) H.get(0)) * 1000000);
            }
            str = -1;
            i = i2;
        }
        this.b = str;
    }

    public static r95 n() {
        r95 r95Var;
        synchronized (C) {
            try {
                if (D == null) {
                    D = new r95(3, 1);
                }
                r95Var = D;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r95Var;
    }

    public static String r(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static r95 t() {
        String a = gn6.c.a("firebase-auth");
        return new r95((TextUtils.isEmpty(a) || a.equals("UNKNOWN")) ? "-1" : "-1");
    }

    @Override // defpackage.i0f
    public byte[] b(int i, byte[] bArr, byte[] bArr2) {
        if (bArr2.length >= i) {
            if (bArr.length == this.b) {
                SecretKeySpec c2 = spe.c(bArr);
                int i2 = i + 12;
                if (bArr2.length >= i + 28) {
                    AlgorithmParameterSpec a = spe.a(bArr2, i, 12);
                    Cipher b = spe.b();
                    b.init(2, c2, a);
                    return b.doFinal(bArr2, i2, (bArr2.length - i) - 12);
                }
                hfd.j("ciphertext too short");
                return null;
            }
            hfd.j("invalid key size");
            return null;
        }
        hfd.j("ciphertext too short");
        return null;
    }

    public void c(String str, String str2) {
        if (this.b <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // defpackage.xm3
    public int d(Context context, String str, boolean z) {
        return 0;
    }

    public void e(String str, String str2, Throwable th) {
        if (this.b <= 3) {
            Log.d(str, str2, th);
        }
    }

    @Override // defpackage.xm3
    public int f(Context context, String str) {
        return this.b;
    }

    @Override // defpackage.q4d
    public int g() {
        return 0;
    }

    @Override // defpackage.x0f
    public byte[] i(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) {
        if (bArr.length == this.b) {
            if (eub.b(2)) {
                SecretKeySpec c2 = spe.c(bArr);
                if (bArr2.length == 12) {
                    if (bArr3.length >= i + 16) {
                        AlgorithmParameterSpec a = spe.a(bArr2, 0, bArr2.length);
                        Cipher b = spe.b();
                        b.init(2, c2, a);
                        if (bArr4.length != 0) {
                            b.updateAAD(bArr4);
                        }
                        return b.doFinal(bArr3, i, bArr3.length - i);
                    }
                    hfd.j("ciphertext too short");
                    return null;
                }
                hfd.j("iv is wrong size");
                return null;
            }
            hfd.j("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        throw new InvalidAlgorithmParameterException(a82.j(bArr.length, "Unexpected key length: "));
    }

    public void j(String str, String str2) {
        if (this.b <= 6) {
            Log.e(str, str2);
        }
    }

    public void k(String str, String str2, Throwable th) {
        if (this.b <= 6) {
            Log.e(str, str2, th);
        }
    }

    @Override // defpackage.x68
    public String m() {
        switch (this.a) {
            case 4:
                return rs8.g(this.b, " digits", new StringBuilder("expected at least "));
            default:
                return rs8.g(this.b, " digits", new StringBuilder("expected at most "));
        }
    }

    @Override // defpackage.q4d
    public int o() {
        return this.b;
    }

    public void p(String str, String str2) {
        if (this.b <= 4) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [my0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [xl9, java.lang.Object] */
    public uuc q(mj9 mj9Var) {
        Throwable th;
        byte[] bArr;
        int l;
        short s;
        byte[] bArr2;
        ArrayList arrayList;
        ?? obj = new Object();
        try {
            obj.J(mj9Var);
            bArr = obj.p0(obj.b);
            try {
                mj9Var.close();
                obj.o();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                mj9Var.close();
                obj.o();
            } catch (Throwable th4) {
                pye.e(th3, th4);
            }
            th = th3;
            bArr = null;
        }
        if (th == null) {
            int i = 4;
            u01 u01Var = new u01(bArr, 4, (byte) 0);
            uuc uucVar = new uuc();
            if (u01Var.e() == -560292983) {
                if (u01Var.c >= bArr.length) {
                    l = -1;
                } else {
                    l = u01Var.l();
                }
                short s2 = -1;
                while (true) {
                    ArrayList arrayList2 = uucVar.f;
                    ArrayList arrayList3 = uucVar.e;
                    ArrayList arrayList4 = uucVar.g;
                    if (l == 35) {
                        short l2 = (short) (u01Var.l() | (u01Var.l() << 8));
                        u01Var.b();
                        int l3 = u01Var.l() - 5;
                        int i2 = l2 & 65535;
                        if (i2 != 135) {
                            if (i2 != 240) {
                                if (i2 != 241) {
                                    avc avcVar = uucVar.b;
                                    switch (i2) {
                                        case 1:
                                            avcVar.a = u01Var.b();
                                            u01Var.o(2);
                                            break;
                                        case 2:
                                            avcVar.b = u01Var.n(l3);
                                            break;
                                        case 3:
                                            avcVar.c = u01Var.n(l3);
                                            break;
                                        case 4:
                                            avcVar.d = u01Var.n(l3);
                                            break;
                                        case 5:
                                            avcVar.e = u01Var.n(l3);
                                            break;
                                        case 6:
                                            avcVar.f = u01Var.n(l3);
                                            break;
                                        case 7:
                                            avcVar.g = u01Var.n(l3);
                                            break;
                                        case 8:
                                            avcVar.h = u01Var.n(l3);
                                            break;
                                        case 9:
                                            avcVar.i = u01Var.n(l3);
                                            break;
                                        case 10:
                                            u01Var.o(l3);
                                            break;
                                        case 11:
                                            uucVar.d = u01Var.e();
                                            break;
                                        case 12:
                                            u01Var.e();
                                            break;
                                        case 13:
                                            break;
                                        case 14:
                                            u01Var.o(1);
                                            break;
                                        case 15:
                                            u01Var.o(l3);
                                            break;
                                        default:
                                            switch (i2) {
                                                case Token.DEFAULT /* 129 */:
                                                case Token.DO /* 131 */:
                                                case Token.FOR /* 132 */:
                                                    this.b = u01Var.e();
                                                    break;
                                                case 130:
                                                    u01Var.o(1);
                                                    this.b = u01Var.e();
                                                    break;
                                                default:
                                                    if (l3 > 0) {
                                                        u01Var.o(l3);
                                                        break;
                                                    }
                                                    break;
                                            }
                                    }
                                } else {
                                    u01Var.o(l3);
                                }
                            }
                        } else {
                            u01Var.o(1);
                            u01Var.o(1);
                            u01Var.o(i);
                        }
                        if (i2 != 10 && i2 != 241) {
                            s = l2;
                        } else {
                            s = s2;
                        }
                        int i3 = u01Var.c;
                        byte[] bArr3 = u01Var.b;
                        if (i3 >= bArr3.length) {
                            l = -1;
                        } else {
                            l = u01Var.l();
                        }
                        while (l == 36) {
                            int e2 = u01Var.e();
                            int e3 = u01Var.e() - 9;
                            switch (s & 65535) {
                                case Token.DEFAULT /* 129 */:
                                    bArr2 = bArr3;
                                    arrayList = arrayList4;
                                    u01Var.o(e3);
                                    break;
                                case 130:
                                    bArr2 = bArr3;
                                    arrayList = arrayList4;
                                    uucVar.c = u01Var.d(e3);
                                    break;
                                case Token.DO /* 131 */:
                                    bArr2 = bArr3;
                                    arrayList = arrayList4;
                                    int i4 = e3 / 4;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        arrayList2.add(Integer.valueOf(u01Var.e()));
                                        uucVar.a = Math.max(uucVar.a, arrayList2.size());
                                    }
                                    break;
                                case Token.FOR /* 132 */:
                                    if (this.b != e2) {
                                        byte[] d2 = u01Var.d(e3);
                                        if (d2.length != 0) {
                                            mj5 mj5Var = (mj5) lz2.a.getValue();
                                            int max = Math.max(d2.length * i, 32768);
                                            mj5Var.getClass();
                                            b50 b50Var = new b50(max);
                                            arrayList = arrayList4;
                                            bArr2 = bArr3;
                                            je jeVar = new je(mj5Var, q0f.o(d2), q0f.d(b50Var), null, 2);
                                            ?? obj2 = new Object();
                                            ?? obj3 = new Object();
                                            ?? obj4 = new Object();
                                            ?? obj5 = new Object();
                                            nv9 nv9Var = new nv9(obj5, obj4, obj2, obj3);
                                            try {
                                                jsc.u(1, jeVar);
                                                Object invoke = jeVar.invoke(nv9Var);
                                                if (invoke != n82.a) {
                                                    nv9Var.resumeWith(invoke);
                                                }
                                            } catch (Throwable th5) {
                                                nv9Var.resumeWith(new gs9(th5));
                                            }
                                            if (obj2.a) {
                                                Object obj6 = obj4.a;
                                                if (obj6 == null) {
                                                    if (obj3.a != null) {
                                                        arrayList.add(b50Var.d());
                                                        break;
                                                    } else {
                                                        c16.w("rresult");
                                                        throw null;
                                                    }
                                                } else {
                                                    throw ((Throwable) obj6);
                                                }
                                            } else {
                                                p1a.o(obj5.a, "runBlockingNoSuspensions was not completed synchronously! suspendCount=");
                                                return null;
                                            }
                                        }
                                        bArr2 = bArr3;
                                        arrayList = arrayList4;
                                        break;
                                    } else {
                                        bArr2 = bArr3;
                                        arrayList = arrayList4;
                                        int i6 = uucVar.a;
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            arrayList3.add(u01Var.d(u01Var.l()));
                                        }
                                        break;
                                    }
                                default:
                                    u01Var.o(e3);
                                    bArr2 = bArr3;
                                    arrayList = arrayList4;
                                    break;
                            }
                            if (u01Var.c >= bArr2.length) {
                                l = -1;
                            } else {
                                l = u01Var.l();
                            }
                            bArr3 = bArr2;
                            arrayList4 = arrayList;
                            i = 4;
                        }
                        s2 = s;
                    } else {
                        int size = arrayList4.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj7 = arrayList4.get(i9);
                            i9++;
                            i8 += ((byte[]) obj7).length;
                        }
                        uucVar.h = new byte[i8];
                        int size2 = arrayList4.size();
                        int i10 = 0;
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj8 = arrayList4.get(i11);
                            i11++;
                            byte[] bArr4 = (byte[]) obj8;
                            b00.c0(bArr4, i10, 0, uucVar.h, 0, 12);
                            i10 += bArr4.length;
                        }
                        if (uucVar.a == 0) {
                            uucVar.a = Math.max(arrayList3.size(), arrayList2.size());
                        }
                        return uucVar;
                    }
                }
            } else {
                vs.k("Wrong UMD header");
                return null;
            }
        } else {
            throw th;
        }
    }

    public void s(String str, String str2) {
        if (this.b <= 5) {
            Log.w(str, str2);
        }
    }

    @Override // defpackage.o4d
    public js u(long j, js jsVar, js jsVar2, js jsVar3) {
        if (j < this.b * 1000000) {
            return jsVar;
        }
        return jsVar2;
    }

    @Override // defpackage.x0f
    public int zza() {
        switch (this.a) {
            case 10:
                return this.b;
            default:
                return this.b;
        }
    }

    @Override // defpackage.x0f
    public byte[] zzc() {
        int i = this.b;
        if (i != 16) {
            if (i == 32) {
                return t1f.j;
            }
            hfd.j("Could not determine HPKE AEAD ID");
            return null;
        }
        return t1f.i;
    }

    public /* synthetic */ r95(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public r95(gje gjeVar) {
        this.a = 11;
        if (gjeVar.b == 12) {
            if (gjeVar.c == 16) {
                if (gjeVar.d == fje.e) {
                    this.b = gjeVar.a;
                    return;
                } else {
                    hfd.j("invalid variant");
                    throw null;
                }
            }
            hfd.j("invalid tag size");
            throw null;
        }
        hfd.j("invalid IV size");
        throw null;
    }

    public r95(int i) {
        this.a = 10;
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(a82.j(i, "Unsupported key length: "));
        }
        this.b = i;
    }

    public /* synthetic */ r95(int i, byte b) {
        this.a = i;
    }

    @Override // defpackage.o4d
    public js l(long j, js jsVar, js jsVar2, js jsVar3) {
        return jsVar3;
    }
}
